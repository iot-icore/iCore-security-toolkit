package seckit.gui;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

import org.apache.log4j.Logger;

public class TreeCellRenderer extends DefaultTreeCellRenderer {

    static Logger logger = Logger.getLogger(TreeCellRenderer.class);

    private static final long serialVersionUID = 1L;

    ModelView view;

    private Icon leafIcon;
    private Icon openIcon;
    private Icon closedIcon;

    public TreeCellRenderer(ModelView modelView) {
        super();
        this.view = modelView;
        leafIcon = getLeafIcon();
        openIcon = getOpenIcon();
        closedIcon = getClosedIcon();
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {

        Node node = (Node) value;
        Icon icon = null;

        // TODO: cache the icons!
        icon = node.getIcon();

        // icon = ModelView.getIcon(obj);

        if (icon != null) {
            // set new icons
            setLeafIcon(icon);
            setOpenIcon(icon);
            setClosedIcon(icon);
        } else {
            // set default icons
            setLeafIcon(leafIcon);
            setOpenIcon(openIcon);
            setClosedIcon(closedIcon);
        }
        Component renderer = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        // logger.info(renderer);
        if (node.getToolTipText() != null) {
            setToolTipText(node.getToolTipText());
        }
        return renderer;
    }

}