package seckit.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.plaf.IconUIResource;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import models.Element;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import seckit.SystemDesignViewpoint;
import seckit.SystemRuntimeViewpoint;

public abstract class ModelView extends View {

    static {
        // new NodeIcon('+')
        UIManager.put("Tree.collapsedIcon", new IconUIResource(Icons.createIcon("toggle-expand.png")));
        // new NodeIcon('-')
        UIManager.put("Tree.expandedIcon", new IconUIResource(Icons.createIcon("toggle.png")));
    }

    protected static Logger logger = Logger.getLogger(ModelView.class);
    
    private ModelController controller;

    protected String name;
    protected JTabbedPane tabbedPane;
    protected JFrame parentFrame;
    protected JPanel panel;
    public JTree tree;
    private DefaultTreeModel treeModel;
    private Node selectedNode = null;
    public LegendContainer legend;
    //
    JScrollPane scrollPane;
    private JLabel label = new JLabel(" ", JLabel.CENTER);
    private static boolean showLegend = true;

    public ModelView(JFrame parentFrame, JTabbedPane tabbedPane, String name, ModelController controller) {
        this.parentFrame = parentFrame;
        this.tabbedPane = tabbedPane;
        this.name = name;
        //
        this.controller = controller;
        controller.addView(this);
        //
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        //
        legend = new LegendContainer();
        //
        configureTab();
        //
        logger.info("+ "+name);
    }
    
    //public Node createRootNode(EList<?> models) {
        // return new ModelListInnerNode(models);
    //}

    public void loadTree() {
        try {
            newTreePanel(n(null, controller.getViewpoint()));
            panel.setPreferredSize(new Dimension(750, 500));
            updateView();
        } catch (Exception e) {
            logger.warn(e);
            e.printStackTrace();
        }
    }

    public void reloadTree() {
        panel.remove(scrollPane);
        // TODO: is this necessary for Garbage Collection!?
        scrollPane = null;
        loadTree();
        panel.updateUI();
    }
    
    private void newTreePanel(Node root) {
        // MyDefaultTreeCellEditor editor = new MyDefaultTreeCellEditor(tree, renderer); // , modelView
        TreeCellRenderer renderer = new TreeCellRenderer(this);
        MyTreeCellEditor editor = new MyTreeCellEditor(tree, renderer);
        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
        tree.setEditable(true);
        tree.addMouseListener(new InnerMouseListener());
        tree.setCellEditor(editor);
        tree.setCellRenderer(renderer);
        // tree.addFocusListener(this);
        tree.setInvokesStopCellEditing(false);
        //
        tree.setDragEnabled(true);
        tree.setTransferHandler(new TreeTransferHandler());
        //
        ToolTipManager.sharedInstance().registerComponent(tree);
        //
        // tree.putClientProperty("JTree.lineStyle", "Horizontal");
        tree.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "startEditing");
        tree.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "startEditing");
        tree.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "actionPerformed");
        tree.addTreeSelectionListener(new InnerTreeSelectionListener());
        tree.addKeyListener(new InnerKeyListener());
        scrollPane = new JScrollPane(tree); 
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);
    }

    public void configureTab() {
        tabbedPane.addTab(name, Icons.getIcon(this.getClass()), panel, name);
    }
   
    public void selectNode(Node node) {
        if (node != null) {
            tree.makeVisible(new TreePath(node.getPath()));
            tree.setSelectionPath(new TreePath(node.getPath()));
            tree.updateUI();
        }
    }

    public void makeVisible(TreeNode[] path) {
        tree.makeVisible(new TreePath(path));
    }
    
    public void nodeChanged(Node node) {
        logger.trace("Node changed (id="+node.id+")");
        // TODO: treePane changes should be with notify later
        treeModel.nodeChanged(node);
    }
    
    public void removeFromParent(Node node) {
        treeModel.removeNodeFromParent(node);    }
    
    public void structureChanged(Node node) {      
        // TODO: treePane changes should be with notify later
        logger.trace("Node structure changed (id="+node.id+")");
        treeModel.nodeStructureChanged(node);        
    }    

    public void updateUI() {
        tree.updateUI();
    }

    public void updateView() {        
        tree.updateUI();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getModel().getRoot();
        if (root != null) {
            tree.expandPath(new TreePath(root.getPath()));
        }
    }
    
    public void stopEditing() {
        tree.stopEditing();    
    }

    public class LegendContainer extends JPanel {

        private static final long serialVersionUID = 1L;
        
        protected JList<JLabel> list;
        protected Insets ins1 = new Insets(1, 8, 1, 8), 
                         ins2 = new Insets(4, 1, 1, 8);
        protected int legend = 0;

        public LegendContainer() {
            super(new BorderLayout());
            DefaultListModel<JLabel> model = new DefaultListModel<JLabel>();
            list = new JList<JLabel>(model);
            list.setCellRenderer(new MyListRenderer());
            add(new JScrollPane(list), BorderLayout.CENTER);
            JLabel l = new JLabel("Legend:");
            l.setBorder(new EmptyBorder(ins2));
            add(l, BorderLayout.NORTH);
        }

        public void add() {
            if (legend > 0 && ModelView.showLegend) {
                panel.add(this, BorderLayout.WEST);
            }
        }

        public void add(Class<?> iconClass, String label) {
            add(Icons.getIcon(iconClass), label);
        }

        public void add(String label) {
            JLabel l = new JLabel(label);
            l.setBorder(new EmptyBorder(ins2));
            l.setFont(new Font("Dialog", Font.BOLD, 12));
            l.setBackground(Color.WHITE);
            //
            //
            DefaultListModel<JLabel> model = (DefaultListModel<JLabel>) list.getModel();
            model.addElement(l);
            legend++;
        }

        public void add(Icon icon, String label) {
            JLabel l = new JLabel(label);
            l.setBorder(new EmptyBorder(ins1));
            l.setFont(new Font("Dialog", Font.PLAIN, 12));
            l.setIcon(icon);
            l.setBackground(Color.WHITE);
            //
            //
            DefaultListModel<JLabel> model = (DefaultListModel<JLabel>) list.getModel();
            model.addElement(l);
            legend++;
        }
        
    }

    public class GridBagLayoutManager {

        private GridBagLayout layout;
        private GridBagConstraints c = new GridBagConstraints();
        private int x, y = 0;
        private JComponent container;

        public GridBagLayoutManager(JComponent container) {
            layout = new GridBagLayout();
            c = new GridBagConstraints();
            c.insets = new Insets(3, 3, 3, 3);
            container.setLayout(layout);
            this.container = container;
        }

        public void addRow(JComponent c1, JComponent c2) {
            x = 0;
            c.gridx = x++;
            c.gridy = y;
            c.anchor = GridBagConstraints.EAST;
            container.add(c1, c);

            c.gridx = x++;
            c.gridy = y;
            c.anchor = GridBagConstraints.WEST;
            container.add(c2, c);
            y++;
        }

    }    

    class MyListRenderer extends JLabel implements ListCellRenderer<Object> {
        private static final long serialVersionUID = 1L;
        public MyListRenderer() {
            setOpaque(true);
            // setHorizontalAlignment(CENTER);
            // setVerticalAlignment(CENTER);
        }
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            return (Component) value;
        }
    }

    /*
     * Sub-classes must implement this method to allow creation of inner node sub-classes 
     */
    public abstract Node invoke(Constructor<?> c, Object[] args) throws Exception;
    // { return (Node) c.newInstance(args); }

    public Node n(Node parent, Element obj) {
        if (obj == null)
            return null;
        //
        String eSimpleClassName = obj.getClass().getSimpleName();
        String viewClassName = getClass().getName();
        Node node = null;
        //
        String nodeClassName = viewClassName + "$" +eSimpleClassName + "Node";
        node = n(nodeClassName, parent, obj);
        //
        if (node == null) {
            logger.warn("Using default Node for [" + eSimpleClassName + "]");
            node = new Node(ModelView.this, parent, obj);
        }
        //
        return node; 
    }
    
    Map<String, Class<?>> nodeClasses = new HashMap<String, Class<?>>();
    
    // TODO: inner and outer classes should be supported
    
    public Node n(String nodeClassName, DefaultMutableTreeNode parent, Element e) {
        if (e == null)
            return null;
        //
        Class<?> c = null;
        //
        try {
            c = nodeClasses.get(nodeClassName);
            if (c == null) {
                // TODO: Is Class.forName(...) expensive? can we use a hash map?
                c = Class.forName(nodeClassName);
                nodeClasses.put(nodeClassName, c);
            }
        } catch (ClassNotFoundException ex) {
            logger.warn("Custom node class [" + nodeClassName + "] not found");
            // ex.printStackTrace();
        }
        return n(c, parent, e);
    }
    
    public Node n(Class<?> c, DefaultMutableTreeNode parent, Element e) {
        if (e == null)
            return null;
        //
        if (c == null) {
            return null;
        }
        String nodeClassName = c.getSimpleName();        
        Node node = null;
        //
        if (c != null) {
            try {
                // TODO: Constructor is Element.class? But should be Object?
                Class<?>[] argTypes = { this.getClass(), Node.class, Element.class };
                Constructor<?> constructor = c.getDeclaredConstructor(argTypes);
                if (constructor != null) {
                    Object[] arguments = {this, parent, e};
                    node = invoke(constructor, arguments);
                } else {
                    logger.warn("Constructor in custom node class [" + nodeClassName + "] not found for");
                }
            } catch (Exception ex) {
                logger.warn("Error invoking constructor in custom node class [" + nodeClassName + "]");
                 logger.error(ex);
                 ex.printStackTrace();
            }
        }
        // if (node != null) { makeVisible(node.getPath()); }
        return node;
    }

    class InnerTreeSelectionListener implements TreeSelectionListener {
    
        @Override
        public void valueChanged(TreeSelectionEvent e) {
            TreePath path = e.getNewLeadSelectionPath();
            if (path != null) {
                if (selectedNode != null) {
                    logger.trace("Unselecting node (id="+selectedNode.id+")");
                    selectedNode.isSelected = false;
                }
                selectedNode = (Node) path.getLastPathComponent();
                logger.trace("Selecting node (id="+selectedNode.id+")");
                label.setText(selectedNode.getStatusLabel());
                selectedNode.isSelected = true;
            }
        }
        
    }

    
    class InnerCellEditorListener implements CellEditorListener {
        
        @Override
        public void editingCanceled(ChangeEvent e) {
            logger.info("Editing canceled");
        }
    
        @Override
        public void editingStopped(ChangeEvent e) {
            logger.info("Editing stopped");
            label.setText(tree.getCellEditor().toString());
            label.updateUI();
        }
    }
    
    
    class InnerMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (SwingUtilities.isRightMouseButton(e)) {
                int row = tree.getClosestRowForLocation(e.getX(), e.getY());
                tree.setSelectionRow(row);
                JPopupMenu menu = selectedNode.getPopupMenu();
                if (menu != null) {
                    menu.show(tree, e.getX(), e.getY());
                }
            }
            /*
             * if (SwingUtilities.isLeftMouseButton(e)) { int row =
             * tree.getClosestRowForLocation(e.getX(), e.getY());
             * tree.setSelectionRow(row); tree.cancelEditing(); }
             */
        }
    
        @Override
        public void mouseEntered(MouseEvent e) {}
    
        @Override
        public void mouseExited(MouseEvent e) {}
    
        @Override
        public void mousePressed(MouseEvent e) {
            int selRow = tree.getRowForLocation(e.getX(), e.getY());
            TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
            if (selRow != -1) {
                if (e.getClickCount() == 1) {
                    Node n = (Node) selPath.getLastPathComponent();
                    n.singleClicked();
                } else if (e.getClickCount() == 2) {
                    Node n = (Node) selPath.getLastPathComponent();
                    n.doubleClicked();
                }
            }
        }
    
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        
    }

    
    class InnerActionListener implements ActionListener {    

        @Override
        public void actionPerformed(ActionEvent e) {
            logger.info("Action performed [" + e.getActionCommand() + "]");
        }
        
    }

    class InnerKeyListener implements KeyListener {
    
        @Override
        public void keyTyped(KeyEvent e) {}
    
        @Override
        public void keyPressed(KeyEvent e) {
            
            if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                if (selectedNode != null) {
                    if (selectedNode.deleteObject()) {
                        logger.trace("Deleting selected node");
                    } else {
                        logger.trace("Selected node can't be deleted");
                    }
                }
                
            } else if (e.getKeyCode() == KeyEvent.VK_ENTER && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                selectedNode.addDefaultChild();
                
            } else if (e.getKeyCode() == KeyEvent.VK_UP && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                // Ctrl + Up, move node up
                if (selectedNode != null && selectedNode.getPreviousSibling() != null) {
                    Node parent = (Node) selectedNode.getParent();
                    if (parent != null) {
                        DefaultTreeModel treeModel = (DefaultTreeModel) tree.getModel();
                        int newIndex = treeModel.getIndexOfChild(parent, selectedNode) - 1;
                        treeModel.removeNodeFromParent(selectedNode);
                        treeModel.insertNodeInto(selectedNode, parent, newIndex);
                        selectNode(selectedNode);
                    }
                }
                e.consume();
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN && ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
                // Ctrl + Down, move node up
                if (selectedNode != null && selectedNode.getNextSibling() != null) {
                    Node parent = (Node) selectedNode.getParent();
                    if (parent != null) {
                        DefaultTreeModel treeModel = (DefaultTreeModel) tree.getModel();
                        int newIndex = treeModel.getIndexOfChild(parent, selectedNode) + 1;
                        treeModel.removeNodeFromParent(selectedNode);
                        treeModel.insertNodeInto(selectedNode, parent, newIndex);
                        selectNode(selectedNode);
                    }
                }
                e.consume();
            }
        }
    
        @Override
        public void keyReleased(KeyEvent e) {}
        
    }

    public class ElementInnerNode extends Node {

        private static final long serialVersionUID = 1L;

        public ElementInnerNode(Node parent, Element element) {
            super(ModelView.this, parent, element);
        }

        @Override
        public void configure(Element element) {
            super.configure(element);
        }

    }
    
    public class SystemDesignViewpointInnerNode extends ElementInnerNode {

        private static final long serialVersionUID = 1L;
        protected SystemDesignViewpoint viewpoint;

        public SystemDesignViewpointInnerNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            viewpoint = (SystemDesignViewpoint)e;
        }

        @Override
        public String getDisplayLabel() {
            return "Models";
        }
        
    }

    public class SystemRuntimeViewpointInnerNode extends ElementInnerNode {

        private static final long serialVersionUID = 1L;
        protected SystemRuntimeViewpoint viewpoint;

        public SystemRuntimeViewpointInnerNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            viewpoint = (SystemRuntimeViewpoint)e;
        }

        @Override
        public String getDisplayLabel() {
            return "Models";
        }
        
    }
    
}
