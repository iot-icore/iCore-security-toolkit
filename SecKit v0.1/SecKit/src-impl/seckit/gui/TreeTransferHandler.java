package seckit.gui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;

import org.apache.log4j.Logger;

public class TreeTransferHandler extends TransferHandler {

    private static final long serialVersionUID = 1L;

    private static Logger logger = Logger.getLogger(TreeTransferHandler.class);

    DataFlavor nodesFlavor;
    DataFlavor[] flavors = new DataFlavor[1];
    Node[] nodesToRemove;

    public TreeTransferHandler() {
        try {
            String mimeType = DataFlavor.javaJVMLocalObjectMimeType + ";class=\"" + Node[].class.getName() + "\"";
            nodesFlavor = new DataFlavor(mimeType);
            flavors[0] = nodesFlavor;
        } catch (ClassNotFoundException e) {
            logger.warn("ClassNotFound: " + e.getMessage());
        }
    }

    public boolean canImport(TransferHandler.TransferSupport support) {
        return true;
        /*
         * if (!support.isDrop()) { return false; }
         * 
         * support.setShowDropLocation(true);
         * 
         * if (!support.isDataFlavorSupported(nodesFlavor)) { return false; }
         * 
         * // Do not allow a drop on the drag source selections
         * JTree.DropLocation dl = (JTree.DropLocation)
         * support.getDropLocation(); JTree tree = (JTree)
         * support.getComponent(); int dropRow =
         * tree.getRowForPath(dl.getPath()); int[] selRows =
         * tree.getSelectionRows(); for (int i = 0; i < selRows.length; i++) {
         * if (selRows[i] == dropRow) { return false; } }
         * 
         * // Do not allow a non-leaf node to be copied to a level // which is
         * less than its source level. TreePath dest = dl.getPath(); Node target
         * = (Node) dest.getLastPathComponent(); TreePath path =
         * tree.getPathForRow(selRows[0]);
         * 
         * Node firstNode = (Node) path.getLastPathComponent(); if
         * (firstNode.getChildCount() > 0 && target.getLevel() <
         * firstNode.getLevel()) { return false; }
         * 
         * return true;
         */
    }

    protected Transferable createTransferable(JComponent c) {
        // logger.trace("creating transferable");
        JTree tree = (JTree) c;
        TreePath path = tree.getSelectionPath();
        if (path != null) {
            return new NodeTransferable((Node) path.getLastPathComponent());
        }
        return null;
    }

    protected void exportDone(JComponent source, Transferable data, int action) {
        // Invoke target node delete? depends...
        /*
         * if ((action & MOVE) == MOVE) { JTree tree = (JTree) source; //
         * logger.info("Export done"); DefaultTreeModel model =
         * (DefaultTreeModel) tree.getModel(); // Remove nodes saved in
         * nodesToRemove in createTransferable. for (int i = 0; i <
         * nodesToRemove.length; i++) {
         * model.removeNodeFromParent(nodesToRemove[i]); } }
         */
    }

    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }

    public boolean importData(TransferHandler.TransferSupport support) {
        if (!canImport(support)) {
            return false;
        }

        Node source = null;
        try {
            Transferable t = support.getTransferable();
            source = (Node) t.getTransferData(nodesFlavor);
        } catch (UnsupportedFlavorException ufe) {
            System.out.println("UnsupportedFlavor: " + ufe.getMessage());
        } catch (java.io.IOException ioe) {
            System.out.println("I/O error: " + ioe.getMessage());
        }

        // Get drop location info.
        JTree.DropLocation dl = (JTree.DropLocation) support.getDropLocation();
        // int childIndex = dl.getChildIndex();
        TreePath dest = dl.getPath();
        Node target = (Node) dest.getLastPathComponent();
        target.drop(source);
        return true;
    }

    public String toString() {
        return getClass().getName();
    }

    public class NodeTransferable implements Transferable {

        Node node;

        public NodeTransferable(Node node) {
            this.node = node;
        }

        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException {
            if (!isDataFlavorSupported(flavor))
                throw new UnsupportedFlavorException(flavor);
            return node;
        }

        public DataFlavor[] getTransferDataFlavors() {
            return flavors;
        }

        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return nodesFlavor.equals(flavor);
        }
    }

}