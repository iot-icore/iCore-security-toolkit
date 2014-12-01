package seckit.gui.design.controller;

import java.util.ArrayList;
import java.util.List;

import identity.IdentityInstanceVariable;
import identity.instance.DigitalIdentity;
import identity.pattern.IdentityPattern;
import models.Model;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import rule.template.RuleTemplate;
import seckit.gui.ModelController.ElementController;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import structure.StructuralDesignModel;
import time.TimeDuration;
import time.TimeFactory;
import time.TimeUnit;
import time.TimestampPrecision;
import utils.ecore.ECoreUtils;
import context.ContextDesignModel;
import context.ContextFactory;
import context.event.ContextSituationEventPattern;
import context.event.ContextSituationLifecycle;
import context.instance.InstanceFactory;
import context.instance.QualityOfContext;
import context.instance.NumericPrecision;
import context.pattern.ContextInformationPattern;
import context.pattern.ContextSituationPattern;
import context.pattern.EntityRolePattern;
import context.pattern.PatternFactory;
import context.type.ContextInformationType;
import context.type.ContextSituationType;
import context.type.ContextTypePackage;
import context.type.EntityRoleType;
import context.type.TypeFactory;

public class ContextDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(ContextDesignController.class);

    public ModelController model;
    public TypePackageController pkg;
    public SituationTypeController situationType;
    public EntityRoleTypeController roleType;
    public ContextInformationTypeController contextType;
    public QualityOfContextController qoc;
    public EventPatternController event;
    
    public ContextDesignController(DesignViewpointFactory design) {
        super("Context", design);
        //
        model = new ModelController();
        pkg = new TypePackageController();
        situationType = new SituationTypeController();
        roleType = new EntityRoleTypeController();
        contextType = new ContextInformationTypeController();
        qoc = new QualityOfContextController();
        event = new EventPatternController();
    }

   
    public class ModelController extends ElementController {
        
        public ContextDesignModel create(String description) {
            ContextDesignModel model = ContextFactory.eINSTANCE.createContextDesignModel();
            ECoreUtils.setup(model);
            if (description == null) {
                description = "Context model " + model.getId();
            }
            model.setDescription(description);
            design.viewpoint.getContextDesignModels().add(model);
            logger.debug("- Creating context design model [" + description + "]");
            return model;
        }
        
        public void update(ContextDesignModel model, String newDescription) {
            model.setDescription(newDescription);
        }
        
        public boolean delete(ContextDesignModel model) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(model.getPackages(), msgs, "package");
            //
            if (msgs.size() > 0) {
                logger.debug("- Can't delete model [" + model.getDescription() + "], it has:");
                printMessages(logger, msgs);
                return false;
            }
            //
            logger.debug("- Deleting model: [" + model.getDescription() + "]");
            design.viewpoint.getContextDesignModels().remove(model);
            EcoreUtil.delete(model);
            return true;
        }
        
        
    }
    
    public class TypePackageController extends ElementController {
        
        public ContextTypePackage create(ContextDesignModel model, String name) {
            ContextTypePackage pkg = TypeFactory.eINSTANCE.createContextTypePackage();
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);
            model.getPackages().add(pkg);
            logger.debug("- Creating context package ["+name+"]");
            return pkg;
        }

        public boolean delete(ContextTypePackage pkg) {
            if (pkg.getContextInformationTypes().size() == 0 && pkg.getSituationTypes().size() == 0) {
                // TODO: remove from model!
                // model.getPackages().remove(pkg);
                EcoreUtil.delete(pkg);
                return true;
            }
            return false;
        }
        
    }

    public class SituationTypeController extends ElementController {

        public ContextSituationType create(ContextTypePackage pkg, String name) {
            return create(pkg, name, new String[] {});
        }
        
        public ContextSituationType create(ContextTypePackage pkg, String name, String[] roleNames) {
            ContextSituationType situationType = TypeFactory.eINSTANCE.createContextSituationType();
            ECoreUtils.setup(situationType);
            if (name == null) {
                name = "Context situation type " + situationType.getId();
            }
            situationType.setName(name);
            if (roleNames != null) {
                for (String roleName : roleNames) {
                    roleType.create(situationType, roleName);
                }
            }
            pkg.getSituationTypes().add(situationType);
            logger.debug("- Creating situation type ["+name+"]");
            return situationType;
        }
    
        public boolean delete(ContextSituationType situationType) {
            situationType.setPackage(null);
            EcoreUtil.delete(situationType);
            return true;
        }
        
        public ContextSituationType find(String name) {
            ContextSituationType sType = null;
            for (ContextDesignModel model : viewpoint.getContextDesignModels()) {
                sType = find(model, name);
                if (sType != null) {
                    break;
                }
            }
            return sType;
        }
        
        public ContextSituationType find(ContextDesignModel model, String name) {
            for (ContextTypePackage pkg : model.getPackages()) {
                ContextSituationType type = situationType.find(pkg, name);
                if (type != null)
                    return type;
            }
            logger.warn("Context situation type [" + name + "] not found!");
            return null;
        }

        public ContextSituationType find(ContextTypePackage pkg, String name) {
            for (ContextSituationType type : pkg.getSituationTypes()) {
                if (type.getName().equals(name)) {
                    return type;
                }
            }
            return null;
        }

        public ContextSituationPattern createPattern(ContextSituationType type, ContextSituationLifecycle lifecycle) {
            // Context Situation Pattern
            ContextSituationPattern situationPattern = PatternFactory.eINSTANCE.createContextSituationPattern();
            ECoreUtils.setup(situationPattern);

            // TODO: Where does the lifecycle goes?
            // situationPattern.setLifecycle(lifecycle);

            if (type != null) {
                situationPattern.setType(type);
            }
            return situationPattern;
        }


        public EntityRolePattern createEntityRolePattern(ContextSituationPattern situationPattern, EntityRoleType roleType, IdentityPattern[] identityPatterns) {
            // Entity Role Pattern
            EntityRolePattern rolePattern = PatternFactory.eINSTANCE.createEntityRolePattern();
            ECoreUtils.setup(rolePattern);
            rolePattern.setEntityRoleType(roleType);
            for (IdentityPattern identityPattern : identityPatterns) {
                rolePattern.getIdentityPattern().add(identityPattern);
            }
            situationPattern.getEntityRolePatterns().add(rolePattern);
            return rolePattern;
        }

        public EntityRolePattern createEntityRolePattern(ContextSituationPattern situationPattern, EntityRoleType roleType, IdentityPattern identityPattern) {
            // Entity Role Pattern
            EntityRolePattern rolePattern = PatternFactory.eINSTANCE.createEntityRolePattern();
            ECoreUtils.setup(rolePattern);
            rolePattern.setEntityRoleType(roleType);
            if (identityPattern != null) {
                rolePattern.getIdentityPattern().add(identityPattern);
            }
            situationPattern.getEntityRolePatterns().add(rolePattern);
            return rolePattern;
        }
        
        
    }


    public class EntityRoleTypeController extends ElementController {
        
        public EntityRoleType create(ContextSituationType situationType, String roleName) {
            EntityRoleType roleType = TypeFactory.eINSTANCE.createEntityRoleType();
            ECoreUtils.setup(roleType);
            if (roleName == null) {
                roleName = "Role " + roleType.getId();
            }
            roleType.setName(roleName);
            situationType.getEntityRoleTypes().add(roleType);
            return roleType;
        }

        public boolean delete(EntityRoleType roleType) {
            roleType.setContextSituationType(null);
            EcoreUtil.delete(roleType);
            return true;
        }        

        public EntityRoleType findEntityRoleType(String situationTypeName, String roleTypeName) {
            return findEntityRoleType(situationType.find(situationTypeName), roleTypeName);
        }

        public EntityRoleType findEntityRoleType(ContextSituationType type, String roleTypeName) {
            if (type == null) {
                logger.warn("Trying to find entity role type in null context situation type, ignoring");
                return null;
            }
            for (EntityRoleType roleType : type.getEntityRoleTypes()) {
                if (roleType.getName().equals(roleTypeName)) {
                    return roleType;
                }
            }
            logger.warn("Entity role type [" + roleTypeName + "] not found!");
            return null;
        }
        
    }
    
    public class ContextInformationTypeController extends ElementController {

        public ContextInformationType create(ContextTypePackage pkg, String name) {
            ContextInformationType contextInformation = TypeFactory.eINSTANCE.createContextInformationType();
            ECoreUtils.setup(contextInformation);
            if (name == null) {
                name = "Context information type " + contextInformation.getId();
            }
            contextInformation.setName(name);
            pkg.getContextInformationTypes().add(contextInformation);
            logger.debug("- Creating context type ["+name+"]");
            return contextInformation;
        }

        public boolean delete(ContextInformationType contextType) {
            contextType.setPackage(null);
            EcoreUtil.delete(contextType);
            return true;
        }

        public ContextInformationType find(String name) {
            ContextInformationType cType = null;
            for (ContextDesignModel model : viewpoint.getContextDesignModels()) {
                cType = find(model, name);
                if (cType != null) {
                    break;
                }
            }
            if (cType == null) {
                logger.warn("Context information type [" + name + "] not found!");
            } else {
                logger.trace("Found context information type [" + name + "]");
            }
            return cType;
        }
        
        public ContextInformationType find(ContextDesignModel model, String name) {
            for (ContextTypePackage pkg : model.getPackages()) {
                ContextInformationType type = find(pkg, name);
                if (type != null) {
                    return type;
                }
            }
            return null;
        }

        public ContextInformationType find(ContextTypePackage pkg, String name) {
            for (ContextInformationType type : pkg.getContextInformationTypes()) {
                if (type.getName().equals(name)) {
                    return type;
                }
            }
            return null;
        }
        
        public ContextInformationPattern createPattern(DigitalIdentity contextOwner, ContextInformationType contextType, QualityOfContext qoc) {
            ContextInformationPattern pattern = PatternFactory.eINSTANCE.createContextInformationPattern();
            ECoreUtils.setup(pattern);
            if (contextType != null) {
                pattern.setType(contextType);
            }
            /*
             * if (contextOwner != null) {
             * pattern.setContextOwner(createIdentityPattern
             * (contextOwner.getSubject())); }
             */
            pattern.setQualityOfContext(qoc);
            return pattern;
        }
        
    }


    public class QualityOfContextController extends ElementController {

        public QualityOfContext create(String unit, long plusMinusDelta, TimeUnit timeResolution, long refreshRate) {
            QualityOfContext qoc = InstanceFactory.eINSTANCE.createQualityOfContext();
            NumericPrecision precision = InstanceFactory.eINSTANCE.createNumericPrecision();
            precision.setUnit(unit);
            precision.setPlusMinusDelta(plusMinusDelta);
            qoc.setDeclaredPrecision(precision);

            TimeDuration duration = TimeFactory.eINSTANCE.createTimeDuration();
            duration.setUnit(TimeUnit.SECOND);
            duration.setAmount(refreshRate);
            qoc.setRefreshRate(duration);

            TimestampPrecision timePrecision = TimeFactory.eINSTANCE.createTimestampPrecision();
            timePrecision.setLeastSignificantUnit(timeResolution);
            qoc.setTimestampPrecision(timePrecision);

            return qoc;
        }
        
    }


    public class EventPatternController extends ElementController {
        public ContextSituationEventPattern createContextSituationEvent(RuleTemplate template, ContextSituationPattern situationPattern,
                        EntityRoleType roleType, IdentityPattern identityPattern) {
            // Context Situation Event Pattern
            ContextSituationEventPattern pattern = context.event.EventFactory.eINSTANCE.createContextSituationEventPattern();
            // TODO: It is never a trigger!? It may be a trigger?
            // We have activities that produce context information and we want to
            // protect?
            // Or we have an abstract context information data being created
            // anywhere?
            //
            design.rule.setup(pattern, template, false);
            pattern.setContextSituationPattern(situationPattern);
            design.context.situationType.createEntityRolePattern(situationPattern, roleType, identityPattern);
            return pattern;
        }

        public void addEntityRolePattern(ContextSituationEventPattern pattern, EntityRoleType roleType, IdentityInstanceVariable var) {
            addEntityRolePattern(pattern, roleType, design.identity.pattern.createIdentityPattern(var));
        }
        
        public void addEntityRolePattern(ContextSituationEventPattern pattern, EntityRoleType roleType, IdentityPattern identityPattern) {
            ContextSituationPattern situationPattern = pattern.getContextSituationPattern();
            design.context.situationType.createEntityRolePattern(situationPattern, roleType, identityPattern);
        }

        public void addEntityRolePattern(ContextSituationEventPattern pattern, EntityRoleType roleType, IdentityPattern[] identityPatterns) {
            ContextSituationPattern situationPattern = pattern.getContextSituationPattern();
            design.context.situationType.createEntityRolePattern(situationPattern, roleType, identityPatterns);
        }
        
        public ContextSituationEventPattern createContextSituationEvent(ContextSituationPattern situationPattern) {
            ContextSituationEventPattern pattern = context.event.EventFactory.eINSTANCE.createContextSituationEventPattern();
            design.rule.setup(pattern, null, false);
            pattern.setContextSituationPattern(situationPattern);
            return pattern;
        }         
        
    }
    
}
