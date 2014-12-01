package seckit.gui.runtime.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import data.DataRuntimeModel;
import data.impl.DataRuntimeModelImpl;
import data.instance.Data;
import data.instance.impl.DataImpl;
import models.Element;
import models.Model;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.ModelView.SystemRuntimeViewpointInnerNode;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;

public class DataRuntimeView extends RuntimeView {

    public DataRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Data", runtime, runtime.data);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    static {
        String p = "data/";
        //
        Icons.addIcon(DataRuntimeView.class, p+"data-type.png");
        Icons.addIcon(DataRuntimeModelImpl.class, "model.png");
        Icons.addIcon(DataImpl.class, p+"data-instance.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "dataRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Data Models";
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            addItem(menu, "Add model", Model.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add model")) {
            }
        }
    }    
            
    class DataRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DataRuntimeModel model;
        //
        public DataRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (DataRuntimeModel) e;
        }
        
        @Override
        public void load() {
            loadFeatures("data");
        }
        
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
        
        @Override
        public void addDefaultChild() {
            // actionPerformed("Add ...");
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = new JPopupMenu();
            // addItem(menu, "Add ...", ...Impl.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add ...")) {
            }
        }
    };    

    class DataImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        Data d;
        //
        public DataImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
           d = (Data)e;
        }
        
        @Override
        public String getDisplayLabel() {
            return "[" + d.getStringValue() + "] (id = " + d.getDataId() + ")";
        }
        
    };    
    
    
    

}
