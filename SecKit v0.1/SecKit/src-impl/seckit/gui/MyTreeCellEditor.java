package seckit.gui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventObject;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

public class MyTreeCellEditor extends DefaultTreeCellEditor implements KeyListener {

    public static Icon pencilIcon = Icons.createIcon("pencil-icon.png");;

    private Node node;
    private JPanel panel;
    private JTextField field;

    public MyTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
        super(tree, renderer);
        field = new JTextField(25);
        field.addKeyListener(this);
        JLabel picLabel = new JLabel(pencilIcon);
        panel = new JPanel();
        panel.add(picLabel);
        panel.setOpaque(false);
        panel.setLayout(new FlowLayout(0, 3, 0));
        panel.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel.add(field);
    }

    public Component getTreeCellEditorComponent(final JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
        node = (Node) value;
        //
        Component custom = node.getTreeCellEditorComponent(tree, value, isSelected, expanded, leaf, row);
        // custom = super.getTreeCellEditorComponent(tree, value, isSelected,
        // expanded, leaf, row);
        if (custom != null) {
            return custom;
        }
        //
        field.setText(node.getEditLabel());
        if (node.isEditAllowed()) {
            field.setEditable(true);
        } else {
            field.setEditable(false);
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    // TODO: this is a workaround, maybe it won't work in next
                    // versions.
                    // Is this going to work also in Linux, MacOS, etc.?
                    tree.getCellEditor().cancelCellEditing();
                }
            });
        }
        return panel;
    }

    public Object getCellEditorValue() {
        Object value = null;
        if (node != null)
            value = node.getCellEditorValue();
        if (value != null)
            return value;
        // We can return a more complex structure here, like a String[]
        // return new String[] {field.getText(),
        // combo.getSelectedItem().toString()};
        return field.getText();
        // return super.getCellEditorValue();
    }

    public boolean isCellEditable(EventObject e) {
        /*
         * Node n = null; if (e != null) { if (e instanceof MouseEvent) {
         * MouseEvent me = (MouseEvent)e; TreePath path =
         * modelView.treeEdit.tree.getPathForLocation(me.getX(), me.getY()); n =
         * (Node)path.getLastPathComponent(); } } //
         * System.out.println(e.getSource());
         * System.out.println("Selected node:  "
         * +modelView.treeEdit.selectedNode);
         * System.out.println("Clicked node:  "+n); if (n != null) {
         * this.canEdit = n.getResource().isEditAllowed(); return
         * super.isCellEditable(e); } if (modelView.treeEdit.selectedNode !=
         * null) { this.canEdit =
         * modelView.treeEdit.selectedNode.getResource().isEditAllowed(); return
         * super.isCellEditable(e); }
         */
        return super.isCellEditable(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            stopCellEditing();
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent arg0) {

    }

}
