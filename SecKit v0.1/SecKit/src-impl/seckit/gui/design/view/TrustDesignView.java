package seckit.gui.design.view;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import behavior.trust.impl.AdaptServiceToContextImpl;
import behavior.trust.impl.CompleteServiceAsAgreedImpl;
import behavior.trust.impl.EmployeeTheftImpl;
import behavior.trust.impl.PrivacyProtectionImpl;
import behavior.trust.impl.ProvideSecureFirmwareImpl;
import models.Element;
import models.Model;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.design.DesignView;
import seckit.gui.design.DesignViewpointFactory;
import trust.TrustDesignModel;
import trust.impl.TrustDesignModelImpl;
import trust.instance.TrustAspect;
import trust.instance.impl.ContextProvisioningImpl;
import trust.instance.impl.IdentityQualityImpl;
import trust.instance.impl.TrustAspectImpl;

public class TrustDesignView extends DesignView {

    public TrustDesignView(JFrame parentFrame, JTabbedPane tabbedPane, DesignViewpointFactory design) {
        super(parentFrame, tabbedPane, "Trust", design, design.trust);
        legend.add(TrustAspectImpl.class, "Trust Aspect");
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }
    
    static {
        Icons.addIcon(TrustDesignView.class, "trust/trust-relationship.png");
        Icons.addIcon(TrustDesignModelImpl.class, "model.png");
        
        Icons.addIcon(TrustAspectImpl.class, "trust/trust-aspect.png");
        Icons.addIcon(PrivacyProtectionImpl.class, "trust/trust-aspect.png");
        Icons.addIcon(IdentityQualityImpl.class, "trust/trust-aspect.png");
        Icons.addIcon(AdaptServiceToContextImpl.class, "trust/trust-aspect.png");
        Icons.addIcon(ContextProvisioningImpl.class, "trust/trust-aspect.png");        
        Icons.addIcon(EmployeeTheftImpl.class, "trust/trust-aspect.png");
        Icons.addIcon(ProvideSecureFirmwareImpl.class, "trust/trust-aspect.png");
        Icons.addIcon(CompleteServiceAsAgreedImpl.class, "trust/trust-aspect.png");
    }

    class SystemDesignViewpointImplNode extends SystemDesignViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemDesignViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "trustDesignModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Trust Models";
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
                // node = ...;
            }
        }
    }    
    
    class TrustDesignModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustDesignModel model;
        //
        public TrustDesignModelImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            model = (TrustDesignModel) e;
        }
        @Override
        public void load() {
            loadFeatures("trustAspects");
        }
        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
    };
    
    class TrustAspectImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustAspect aspect;
        //
        public TrustAspectImplNode(Node p, Element e) {
            super(p, e);
        }
        @Override
        public void configure(Element e) {
            aspect = (TrustAspect)e;
        }
        @Override
        public void load() {
        }
        @Override
        public String getDisplayLabel() {
            return design.trust.aspect.getLabel(aspect);
        }
    };
    
    class IdentityQualityImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public IdentityQualityImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class PrivacyProtectionImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public PrivacyProtectionImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class AdaptServiceToContextImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public AdaptServiceToContextImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class ContextProvisioningImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public ContextProvisioningImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class EmployeeTheftImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public EmployeeTheftImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class CompleteServiceAsAgreedImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public CompleteServiceAsAgreedImplNode(Node p, Element e) {
            super(p, e);
        }
    }

    class ProvideSecureFirmwareImplNode extends TrustAspectImplNode {
        private static final long serialVersionUID = 1L;
        public ProvideSecureFirmwareImplNode(Node p, Element e) {
            super(p, e);
        }
    }    

}
