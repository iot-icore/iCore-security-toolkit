package seckit.gui.runtime.controller;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import identity.IdentityFactory;
import identity.IdentityRuntimeModel;
import identity.instance.AbstractIdentity;
import identity.instance.DigitalIdentity;
import identity.instance.IdentityRealm;
import identity.instance.InstanceFactory;
import identity.type.IdentityType;
import seckit.gui.Node;
import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import utils.ecore.ECoreUtils;

public class IdentityRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(IdentityRuntimeController.class);    

    public IdentityRuntimeController(RuntimeViewpointFactory runtime) {
        super("Identity", runtime);
    }

    public IdentityRuntimeModel createModel(String desc) {
        IdentityRuntimeModel model = IdentityFactory.eINSTANCE.createIdentityRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        viewpoint.getIdentityRuntimeModels().add(model);
        return model;
    }

    public IdentityRealm createIdentityRealm(IdentityRuntimeModel model, String name) {
        IdentityRealm realm = InstanceFactory.eINSTANCE.createIdentityRealm();
        ECoreUtils.setup(realm);
        if (name == null) {
            name = "Realm " + realm.getId();
        }
        realm.setName(name);
        model.getIdentityRealms().add(realm);
        return realm;
    }

    public DigitalIdentity createDigitalIdentity(IdentityRuntimeModel model, IdentityRealm realm, DigitalIdentity issuer, IdentityType type, String subject) {
        logger.trace("Creating digital identity [" + subject + "]");
        DigitalIdentity id = InstanceFactory.eINSTANCE.createDigitalIdentity();
        ECoreUtils.setup(id);
        id.setType(type);
        id.setSubject(subject);
        if (issuer != null) {
            id.setIssuer(issuer);
            logger.trace("Creating digital identity [" + subject + "] issued by [" + issuer.getSubject() + "]");
        } else {
            logger.trace("Creating self signed digital identity [" + subject + "]");
        }
        if (model != null  || realm != null) {
            if (model != null) {
                model.getIdentities().add(id);
            }
            if (realm != null) {
                realm.getIdentities().add(id);
            }
        } else {
          logger.warn("Identity created but not added to model or realm");
        }
        return id;
    }

    public DigitalIdentity findDigitalIdentity(String subject) {
        DigitalIdentity id = null;
        for (IdentityRuntimeModel model : viewpoint.getIdentityRuntimeModels()) {
            id = findDigitalIdentity(model, subject);
            if (id != null) {
                break;
            }
        }
        return id;
    }
    
    public DigitalIdentity findDigitalIdentity(IdentityRuntimeModel model, String subject) {
        // Find in model
        for (AbstractIdentity id : model.getIdentities()) {
            if (id instanceof DigitalIdentity) {
                DigitalIdentity digId = (DigitalIdentity) id;
                if (digId.getSubject().equals(subject)) {
                    return digId;
                }
            }
        }
        // Find in realms
        for (IdentityRealm realm : model.getIdentityRealms()) {
            for (AbstractIdentity id : realm.getIdentities()) {
                if (id instanceof DigitalIdentity) {
                    DigitalIdentity digId = (DigitalIdentity) id;
                    if (digId.getSubject().equals(subject)) {
                        return digId;
                    }
                }
            }
        }
        return null;
    }

    public void debugRealms(IdentityRuntimeModel model) {
        for (IdentityRealm realm : model.getIdentityRealms()) {
            logger.trace("Realm [" + realm.getName() + "]");
            for (AbstractIdentity id : realm.getIdentities()) {
                logger.trace("  - " + id.getSubject());
            }

        }

    }

}
