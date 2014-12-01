package seckit.gui.runtime.view;

import identity.IdentityRuntimeModel;
import identity.impl.IdentityRuntimeModelImpl;
import identity.instance.DigitalIdentity;
import identity.instance.IdentityRealm;
import identity.instance.impl.DigitalIdentityImpl;
import identity.instance.impl.IdentityRealmImpl;

import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

import models.Element;
import models.Model;
import seckit.gui.Icons;
import seckit.gui.Node;
import seckit.gui.runtime.RuntimeView;
import seckit.gui.runtime.RuntimeViewpointFactory;
import seckit.gui.runtime.controller.TrustRuntimeController;
import trust.instance.SubjectiveLikelihood;
import trust.instance.TrustRelationship;
import trust.instance.impl.ArbitraryTrustImpl;

public class IdentityRuntimeView extends RuntimeView {

    public IdentityRuntimeView(JFrame parentFrame, JTabbedPane tabbedPane, RuntimeViewpointFactory runtime) {
        super(parentFrame, tabbedPane, "Identities", runtime, runtime.identity);
    }

    @Override
    public Node invoke(Constructor<?> c, Object[] args) throws Exception {
        return (Node) c.newInstance(args);
    }

    static {
        String p = "identity/";
        Icons.addIcon(IdentityRuntimeView.class, p+"identity-type.png");
        Icons.addIcon(IdentityRuntimeModelImpl.class, "model.png");
        Icons.addIcon(IdentityRealmImpl.class, p+"identity-package.png");
        Icons.addIcon(DigitalIdentityImpl.class, p+"identity-type.png");
        Icons.addIcon(ArbitraryTrustImpl.class, "trust/uncertain.png");
    }

    class SystemRuntimeViewpointImplNode extends SystemRuntimeViewpointInnerNode {

        private static final long serialVersionUID = 1L;

        public SystemRuntimeViewpointImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void load() {
            loadFeatures(viewpoint, "identityRuntimeModels");
        }
        
        @Override
        public String getDisplayLabel() {
            return "Identity Models";
        }
        
        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = super.getPopupMenu();
            addItem(menu, "Add model", Model.class);
            return menu;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Add model")) {
            }
        }
    }    
            
    class IdentityRuntimeModelImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        IdentityRuntimeModel model;

        //
        public IdentityRuntimeModelImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            model = (IdentityRuntimeModel) e;
        }

        @Override
        public void load() {
            loadFeatures(new String[] {
                            "identityRealms",
                            "identities",
                            "verificationMethods"
            });
        }

        @Override
        public String getDisplayLabel() {
            return model.getDescription();
        }
    };

    class IdentityRealmImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        IdentityRealm realm;

        //
        public IdentityRealmImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            realm = (IdentityRealm) e;
        }

        @Override
        public void load() {
            loadFeatures("identities");
        }

        @Override
        public String getDisplayLabel() {
            return realm.getName() + " (" + realm.getIdentities().size() + ")";
        }
    };

    class DigitalIdentityImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        DigitalIdentity id;

        //
        public DigitalIdentityImplNode(Node p, Element e) {
            super(p, e);
        }

        @Override
        public void configure(Element e) {
            id = (DigitalIdentity) e;
        }

        @Override
        public JPopupMenu getPopupMenu() {
            JPopupMenu menu = super.getPopupMenu();
            addItem(menu, "Refresh trust values", Model.class);
            return menu;
        }
        
        @Override
        public void load() {
            loadFeatures("attributes");
            
            TrustRuntimeController c = runtime.trust;            
            // Direct trust relationships
            n(c.findTrustRelationships(id.getSubject()));
            // n(c.findIdentityProvisioningTrustRelationships(id.getSubject()));
            
            // Inherited by identity issuer
            if (id.getIssuer() != null) {
                n(c.findIdentityProvisioningTrustRelationships(id.getIssuer().getSubject()));
            }
            /*
             * TrustRelationship trust = c.createTrustRelationship();
             * c.addPersonalScope(trust, id.getSubject());
             * c.addTrustDegree(trust, c.TRUSTWORTHY); n(trust);
             */
        }

        @Override
        public String getDisplayLabel() {
            return id.getSubject();
        }

        @Override
        public String getStatusLabel() {
            if (id.getIssuer() == null) {
                return id.getSubject() + " (self signed)";
            }
            return id.getSubject() + " (issued by " + id.getIssuer().getSubject() + ")";
        }
    };

    class ArbitraryTrustImplNode extends ElementInnerNode {
        //
        private static final long serialVersionUID = 1L;
        TrustRelationship relationship;

        //
        public ArbitraryTrustImplNode(Node p, Element o) {
            super(p, o);
        }

        @Override
        public void configure(Element e) {
            relationship = (TrustRelationship) e;
        }

        @Override
        public void load() {
            updateIcons();
        }

        public void updateIcons() {
            setIcon(runtime.trust.getIconFilePath(relationship.getDegree()));
        }

        @Override
        public String getDisplayLabel() {
            TrustRuntimeController c = runtime.trust;
            return c.getLabel(relationship.getDegree()) + " " + design.trust.aspect.getLabel(relationship.getAspect().get(0));
            /*
            if (trust.getDegree() instanceof SubjectiveDegree) {
                
                SubjectiveDegree sdegree = (SubjectiveDegree) trust.getDegree();
                Node parent = (Node) getParent();
                DigitalIdentity parentId = (DigitalIdentity) parent.getObject();

                TrustAspect aspect = trust.getAspect();
                
                if (aspect instanceof ProvideIdentity) {
                    TrusteeScope scope = trust.getTrusteeScope();
                    if (scope instanceof PersonalTrust) {
                        PersonalTrust personalScope = (PersonalTrust) scope;
                        if (personalScope.getTrustee().getSubject().equals(parentId.getSubject())) {
                            c.getLabel(aspect)
                            return "Self signed" + " (" + c.getLabel(sdegree) + ")";
                        } else {
                            return personalScope.getTrustee().getSubject() + " (" + c.getLabel(sdegree) + ")";
                        }
                    }
                }
                

            }
            return "?";
            */
        }

        @Override
        public void doubleClicked() {
            if (relationship.getDegree() instanceof SubjectiveLikelihood) {
                TrustRuntimeView.showOpinionTriangle(parentFrame, (SubjectiveLikelihood)relationship.getDegree());
                updateIcons();
                nodeChanged();
            }
        }
    };

}
