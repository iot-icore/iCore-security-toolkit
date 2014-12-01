package seckit.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

import models.Element;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EContentsEList;

public class Node extends DefaultMutableTreeNode implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static int nodeIds = 1;
    
    protected static Logger logger = Logger.getLogger(Node.class);
    
    //
    // Association of one element with a list of observer nodes that structurally depend on the element
    // Existency dependency: delete element implies delete node
    // Content dependency: delete element implies update node
    
    // element delete -> node structure changed
    // element update -> node changed??
    // public static Map<String, String> structuralObservers = new HashMap<String, String>();
    
    // Association of an element with a list of observer nodes which context depend on the element
    // element delete || update -> node changed
    // public static Map<String, String> contentObservers = new HashMap<String, String>();
    

    protected ModelView view;
    protected int id;
    protected boolean editAllowed = false;
    protected Icon icon = null;
    public boolean isSelected = false;
    Element element;
    
    Map<String, Adapter> featureToObserver = new HashMap<String, Adapter>();

    Map<String, Node> elementToChildNodes = new HashMap<String, Node>();
    
    public Node(ModelView view, Node parent, Element e) {
        super(e);
        this.element = e;
        this.view = view;
        id = nodeIds++;
        icon = Icons.getIcon(e);        
        addToParent(parent);
        configure(e);
        load();
        //
        if (parent != null) {
            // Subscribe by default for changes in the parent feature,
            // additional dependencies must be hard coded in the configure method
            parent.addReloadChildrenObserver(e.eContainingFeature().getName());
        }
        if (e!=null && parent!=null) {            
            parent.elementToChildNodes.put(e.getId(), this);
        }
    }
    
    public void configure(Element element) {        
    }
    
    Map<String, Class<?>> featureToNodeClass = new HashMap<String, Class<?>>();
    
    public boolean canAddFeature(Element e) {
        return true;
    }

    public void loadFeatures(String[] names) {
        for (String name : names) {
            loadFeatures(name);
        }
    }
    
    public void loadFeatures(String name) {
        loadFeatures(name, null);
    }
    
    public void loadFeatures(String name, Class <?>c) {
        Element e = (Element)this.getUserObject();
        loadFeatures(e, name, c);
    }


    public void loadFeatures(Element e, String name) {
        loadFeatures(e, name, null);
    }

    public void loadFeatures(Element e, String name, Class <?>c) {

        if (c != null) {
            featureToNodeClass.put(name, c);
        }
        
        // logger.info("Element: "+e);
        // Features may be contained features
        for (EObject o : e.eContents()) {
            if (o.eContainingFeature().getName().equals(name)) {
                if (o instanceof Element) {
                    final Element ne = (Element)o;
                    if (canAddFeature(ne)) {
                        if (c != null) {
                            n(c, ne);
                        } else {
                            n(ne);
                        }
                    }
                }
            }
        }
        // ... or reference features
        EContentsEList.FeatureIterator<EObject> featureIterator = (EContentsEList.FeatureIterator<EObject>)e.eCrossReferences().iterator();        
        while (featureIterator.hasNext()) {
            EObject o = (EObject)featureIterator.next();
            EReference ref = (EReference)featureIterator.feature();
            if (ref.getName().equals(name)) {
                if (o instanceof Element) {
                    final Element ne = (Element)o;
                    if (canAddFeature(ne)) {
                        if (c != null) {
                            n(c, ne);
                        } else {
                            n(ne);
                        }
                    }
                }
            }
        }
        // TODO: observers for reference feature?
        addReloadChildrenObserver(name);
    }

    public void load() {}
    
    public void cascadeRemoveAllChildren() {
        if (children != null) {
            if (children.size() > 0) {
                for (Object child : children) {
                    Node node = (Node) child;                    
                    node.featureToObserver.clear();
                    node.cascadeRemoveAllChildren();
                }
            }
            removeAllChildren();
        }
    }
    
    public void reload() {
        logger.trace("Reloading node ["+id+"]");
        cascadeRemoveAllChildren();
        load();
        structuredChanged();
    }
    
    public void addChangedObserver(final Element e, final String featureName) {
        if (featureToObserver.get(featureName) != null) {
            logger.trace("Observer already configured, ignoring");
            return;
        }
        /*
        logger.info("Adding change observer");
        logger.info(" + ["+featureName+"] of element "+e);
        logger.info(" + Node element "+element);
        */
        //
        Adapter adapter = new AdapterImpl() {
            public void notifyChanged(Notification notification) {                
                super.notifyChanged(notification);
                /*
                logger.info(notification);
                logger.info(" + Node element "+element);
                logger.info(" + Notify changed ");
                */
                //
                if (notification.getFeature() instanceof EStructuralFeature) {
                    EStructuralFeature ref = (EStructuralFeature)notification.getFeature();
                    if (ref.getName().equals(featureName)) {
                        if (notification.getEventType() == Notification.SET) {                            
                            nodeChanged();
                        }
                    }
                }
            }
        };
        featureToObserver.put(featureName, adapter);
        e.eAdapters().add(adapter);
    }
    
    public void addReloadChildrenObserver(final String featureName) {
        if (featureToObserver.get(featureName) != null) {
            // logger.trace("Observer for ["+featureName+"] already configured, ignoring");
            return;
        }
        //
        Element e = (Element)getUserObject();
        Adapter adapter = new AdapterImpl() {
            public void notifyChanged(final Notification notification) {
                super.notifyChanged(notification);
                //
                if (notification.getFeature() instanceof EStructuralFeature) {
                    EStructuralFeature ref = (EStructuralFeature)notification.getFeature();
                    if (ref.getName().equals(featureName)) {

                        logger.trace(notification);
                        
                        if ((notification.getEventType() == Notification.REMOVE) ||
                            (notification.getEventType() == Notification.SET && notification.getNewValue() == null)) {
                            // remove or set to null
                            // reload();
                            
                            Node node = elementToChildNodes.get(((Element)notification.getOldValue()).getId());
                            if (node != null) {
                                view.removeFromParent(node);
                            }
                            
                        }
                        
                        if ((notification.getEventType() == Notification.ADD) ||
                            (notification.getEventType() == Notification.SET && notification.getOldValue() == null)) {
                            // remove or set a new value from null

                            // Feature may be a list or a single element
                            if (notification.getNewValue() instanceof Element) {
                                
                                final Object co = featureToNodeClass.get(ref.getName());
                                
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                
                                        Node node;
                                if (co != null) {
                                    node = n((Class<?>)co, (Element)notification.getNewValue());
                                } else {
                                    node = n((Element)notification.getNewValue());
                                }
                                view.selectNode(node);
                                //view.structureChanged(Node.this);                                
                                
                                
                                    }
                                    });        
                                
                            }
                        }
                    }
                }
            }
        };
        featureToObserver.put(featureName, adapter);
        e.eAdapters().add(adapter);
    }
    
    public void addObserver(EObject eobj) {
        logger.debug("Adding observer ["+getUserObject().getClass().getSimpleName()+"] to ["+eobj.getClass().getSimpleName()+"]");
        Adapter adapter = new AdapterImpl() {
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
            }
        };
        eobj.eAdapters().add(adapter);
    }
    
    public void addContentObserver(EObject eobj) {
        logger.debug("Adding content observer ["+getUserObject().getClass().getSimpleName()+"] to ["+eobj.getClass().getSimpleName()+"]");
        EContentAdapter adapter = new EContentAdapter() {
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
            }
        };
        eobj.eAdapters().add(adapter);
    }
    
    public void deleteNode() {
        //
        // Better strategy to select parent node when deleted
        // Node previousNode = (Node) selectedNode.getPreviousNode();
        Node nodeToSelect = (Node)getPreviousSibling();
        if (nodeToSelect == null) {
            nodeToSelect =  (Node) getParent();
        }
        //
        if (nodeToSelect != null) {
            // Select previous node after deleting
            view.selectNode(nodeToSelect);
        }
        removeFromParent();        
        //view.updateUI();
    }
    
    
    public boolean deleteObject() {
        return false;
    }
    
    public void structuredChanged() {
        view.structureChanged(this);
    }
    
    public void nodeChanged() {
        view.nodeChanged(Node.this);
        /*
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            }
          });
        */        
    }

    /*
     * Sub-classes must overwrite this method to handle the drag-and-drop
     * of nodes.
     */
    public void drop(Node node) {
        logger.trace("Node dropped source:[" + node + "] target:[" + this + "]");
    }

    public void addToParent(DefaultMutableTreeNode parent) {
        if (parent != null) {
            parent.add(this);
        }
    }

    public void addToParent(DefaultMutableTreeNode parent, Class<?> afterClass, boolean addToStart) {
        boolean found = false;
        if (parent != null) {
            int k = parent.getChildCount();
            for (int i = 0; i < parent.getChildCount(); i++) {
                Node n = (Node) parent.getChildAt(i);
                if (afterClass.isAssignableFrom(n.getUserObject().getClass())) {
                    k = i;
                    found = true;
                }
            }
            if (found) {
                if (k < parent.getChildCount())
                    k++;
                parent.insert(this, k);
            } else {
                if (addToStart) {
                    parent.insert(this, 0);
                }
            }
        }
    }

    public String getEditLabel() {
        return getDisplayLabel();
    }

    public String getStatusLabel() {
        return getDisplayLabel();
    }

    public String getDisplayLabel() {
        if (getUserObject() != null) {
            return getUserObject().toString();
        }
        return "null";
    }

    public String toString() {
        return getDisplayLabel();
    }

    public Icon getIcon() {
        return icon;
    }

    public boolean isEditAllowed() {
        return editAllowed;
    }

    public void setEditAllowed(boolean value) {
        editAllowed = value;
    }

    public void setUserObject(Object newValue) {
        // Do nothing, sub-classes must override this method if edit is allowed
        logger.warn("missing custom setUserObject() in node subclass, it should be implemented if edit is allowed");
    }
    
    public void addItem(JPopupMenu menu, String label) {
        addItem(menu, label, null, null);
    }

    public void addItem(JPopupMenu menu, String label, Class<?> c) {
        addItem(menu, label, c, null);
    }

    public void addItem(JPopupMenu menu, String label, Class<?> c, String actionCommandPrefix) {
        JMenuItem item = new JMenuItem(label);
        if (c != null) {
            item.setIcon(Icons.getIcon(c));
        }
        if (actionCommandPrefix != null) {
            item.setActionCommand(actionCommandPrefix + label);
        }
        item.addActionListener(this);
        menu.add(item);
    }

    public void addItem(JMenu menu, String label, Class<?> c) {
        addItem(menu, label, c, null);
    }

    public void addItem(JMenu menu, String label, Class<?> c, String actionCommandPrefix) {
        JMenuItem item = new JMenuItem(label);
        if (c != null) {
            item.setIcon(Icons.getIcon(c));
        }
        if (actionCommandPrefix != null) {
            item.setActionCommand(actionCommandPrefix + label);
        }
        item.addActionListener(this);
        menu.add(item);
    }

    public void addDefaultChild() {
    }
    
    public JPopupMenu getPopupMenu() {
        JPopupMenu menu = new JPopupMenu();
        addItem(menu, "Reload");
        return menu;
    }

    public void actionPerformed(String actionName) {
        actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, actionName));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reload")) {
            reload();
        }
    }

    // Override to customize cell editor
    public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
        // logger.info("Getting cell editor component");
        return null;
    }

    // Override to customize cell editor
    public Object getCellEditorValue() {
        // logger.info("Getting cell editor value");
        return null;
    }

    public void setIcon(Class<?> c) {
        this.icon = Icons.getIcon(c); 
    }
    
    public void setIcon(Icon icon) {
        this.icon = icon; 
    }
    
    public void setIcon(String filepath) {
        Icon newIcon = null;
        if (filepath != null) {
            newIcon = Icons.createIcon(filepath);
            if (newIcon == null) {
                logger.warn("Icon not found for node [" + filepath + "][" + getUserObject() + "]");
            } else {
                logger.trace("Setting icon for node [" + filepath + "][" + getUserObject() + "]");
                // Only change icon if new icon exists
                icon = newIcon;
            }
        }
    }

    public void singleClicked() {
    }

    public void doubleClicked() {
    }

    public String getToolTipText() {
        // You can also use <html></html> text with <br> to break lines...
        return null;
    }

    public Node n(Class<?> c, Element obj) {
        return view.n(c, this, obj);
    }
    
    public Node n(Element obj) {
        return view.n(this, obj);
    }
    
    public void n(String nodeClassName, EList<? extends Element> list) {
        if (list != null)
            for (Element e : list) {
                view.n(nodeClassName, this, e);
            }
    }

    public void n(EList<? extends Element> list) {
        if (list != null)
            for (Element e : list) {
                view.n(this, e);            
            }
    }
    
    public void n(Class<?> c, EList<? extends Element> list) {
        if (list != null)
            for (Element e: list) {
                view.n(c, this, (Element)e);                
            }
    }

    public void n(Class<?> c, List<? extends Element> list) {
        if (list != null)
            for (Element e : list) {
                view.n(c, this, e);
            }
    }
    
    public void n(List<? extends Element> list) {
        if (list != null)
            for (Element e : list) {
                    view.n(this, e);                
            }
    }

    public void n(String nodeClassName, List<? extends Element> list) {
        if (list != null)
            for (Element e : list) {
                view.n(nodeClassName, this, e);
            }
    }

 
/*   
    class ElementManagerHelper {
        
        // Nodes that somehow make reference to this object,
        // and need to be updated when the object is updated.
        
        Node node;
        Element element;        
        
        public ElementManagerHelper(Node node, Element element) {
            this.node = node;
            this.element = element;
            if (element.getId() == null || element.getId().equals("")) {
                logger.warn("Missing id in element " + element);
            }
            addToMap();
        }
        
        
        public void removeFromMap() {
            // Remove children nodes from index
            logger.trace("Removing node from map (element=" + element.getId() + ", node="+id+")");
            List<Node> nodes = objectToNodes.get(element.getId());
            nodes.remove(this);
            //
        }
        
        public void reloadReferences(Element e) {
            List<Node> nodes = objectToNodes.get(e.getId());
            for (Node node : nodes) {
                reload();
            }
        }        

        
        public void reloadAll(Element e) {
            List<Node> nodes = objectToNodes.get(e.getId());
            if (nodes != null) {
                for (Node node : nodes) {
                    reload();
                }
            }
        }
        
        public  void deleteAll(Element e) {
            // TODO: the list of nodes per element is global to all views,
            // so maybe we should add this method to the Node class?
            List<Node> nodes = new ArrayList<Node>();
            // Create a copy to prevent concurrent modification
            nodes.addAll(objectToNodes.get(e.getId()));
            for (Node node : nodes) {
                node.deleteNode();
            }
        }   
        
        public void reload() {
            logger.trace("Node reload, element (id="+element.getId()+")");
            // TreePath path = new TreePath(this.getPath()); boolean expanded =
            // view.treePanel.tree.isExpanded(path);
            cascadeRemoveChildren();
        
            logger.trace("- Loading children");
            load();
            structuredChanged();
            // if (!expanded) { view.treePanel.tree.collapsePath(path); }
        }


        public void changedAll(Element e) {
            List<Node> nodes = objectToNodes.get(e.getId());
            for (final Node node : nodes) {
                node.nodeChanged();
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    }
                });
            }
        }
        
    }

*/   
    
}