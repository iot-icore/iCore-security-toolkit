package seckit.gui.design.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import models.Model;
import identity.IdentityAttributeVariable;
import identity.IdentityDesignModel;
import identity.IdentityFactory;
import identity.IdentityInstanceVariable;
import identity.IdentityVariable;
import identity.instantiation.IdentityInstantiation;
import identity.instantiation.InstantiationFactory;
import identity.pattern.IdentityAttributePattern;
import identity.pattern.IdentityPattern;
import identity.pattern.PatternFactory;
import identity.type.DigitalIdentityType;
import identity.type.IdentityAttributeInstantiation;
import identity.type.IdentityType;
import identity.type.IdentityTypePackage;
import identity.type.TypeFactory;
import behavior.type.DataProducerType;
import data.type.DataType;
import rule.template.RuleTemplate;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import structure.type.EntityTypePackage;
import utils.ecore.ECoreUtils;

public class IdentityDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(IdentityDesignController.class);

    static String DEFAULT_DATA_TYPE = "EString";

    public IdentityModelController model;
    public IdentityTypePackageController pkg;
    public IdentityTypeController type;
    public IdentityAttributeController att;
    public IdentityInstantiationController inst;
    public PatternController pattern;
    public VariableController var;
    
    public IdentityDesignController(DesignViewpointFactory design) {
        super("Identity", design);
        //
        model = new IdentityModelController();
        pkg = new IdentityTypePackageController();
        type = new IdentityTypeController();
        att = new IdentityAttributeController();
        inst = new IdentityInstantiationController();
        pattern = new PatternController();
        var = new VariableController();
    }

    public class IdentityModelController extends ElementController {

        public IdentityDesignModel create(String description) {
            IdentityDesignModel model = IdentityFactory.eINSTANCE.createIdentityDesignModel();
            ECoreUtils.setup(model);
            if (description == null) {
                description = "Identity model " + model.getId();
            }
            model.setDescription(description);
            design.viewpoint.getIdentityDesignModels().add(model);        
            logger.debug("- Creating model [" + description + "]");
            return model;
        }
        
        public void update(IdentityDesignModel model, String newDescription) {
            if (newDescription == null || newDescription.equals("")) {
                logger.warn("- Updating model description ["+model.getDescription()+"] to null or empty value, aborting");
                return;
            }
            logger.debug("- Updating model description ["+model.getDescription()+"] to [" + newDescription + "]");
            model.setDescription(newDescription);
        }
        
        public boolean delete(IdentityDesignModel model) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(model.getPackages(), msgs, "package");
            //
            if (msgs.size() > 0) {
                logger.debug("Can't delete model [" + model.getDescription() + "], it contains elements:");
                printMessages(logger, msgs);
                return false;
            }
            logger.debug("- Deleting model [" + model.getDescription() + "]");
            design.viewpoint.getIdentityDesignModels().remove(model);
            EcoreUtil.delete(model);
            return true;
        }
        
    }
    
     
    public class IdentityTypePackageController extends ElementController {
        
        public IdentityTypePackage create(IdentityDesignModel model, String name) {
            IdentityTypePackage pkg = TypeFactory.eINSTANCE.createIdentityTypePackage();
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);
            model.getPackages().add(pkg);
            logger.debug("- Creating identity package ["+name+"]");
            return pkg;
        }
        
        public void updateName(IdentityTypePackage pkg, String newName) {
            if (newName == null || newName.equals("")) {
                logger.warn("- Updating package name ["+pkg.getName()+"] to null or empty value, aborting");
                return;
            }
            logger.debug("- Updating package name ["+pkg.getName()+"] to [" + newName + "]");
            pkg.setName(newName);
        }
        
        public boolean delete(IdentityTypePackage pkg) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(pkg.getIdentityTypes(), msgs, "identity type");
            //
            if (msgs.size() > 0) {
                logger.debug("Can't delete package [" + pkg.getName() + "], it contains elements:");
                printMessages(logger, msgs);
                return false;
            }
            logger.debug("- Deleting identity package: [" + pkg.getName() + "]");
            pkg.getModel().getPackages().remove(pkg);
            EcoreUtil.remove(pkg);
            return true;
        }
        
    }

    public class IdentityTypeController extends ElementController {

        private Map<String, IdentityType> typesMap;

        public IdentityTypeController() {
           resetMap();
        }
        
        public void resetMap() {
            typesMap = new HashMap<String, IdentityType>();
        }
        
        public void load() {
            for (IdentityDesignModel model :  design.viewpoint.getIdentityDesignModels()) {
                for (IdentityTypePackage pkg : model.getPackages()) {
                    for (IdentityType type : pkg.getIdentityTypes()) {
                        typesMap.put(type.getName(), type);
                    }
                }
            }
        }
        
        public DigitalIdentityType create(IdentityTypePackage pkg, String name) {
            return create(pkg, name, null);
        }
        
        public DigitalIdentityType create(IdentityTypePackage pkg, String name, String description) {
            if (name!=null && typesMap.containsKey(name)) {
                logger.warn("- Type with same name ["+name+"] already defined, aborting");
                return null;
            }
            DigitalIdentityType idType = TypeFactory.eINSTANCE.createDigitalIdentityType();
            ECoreUtils.setup(idType);        
            if (name == null) {
                idType.setName("Identity type " + idType.getId());
            } else {
                idType.setName(name);        
            }
            if (description != null) {
              idType.setDescription(description);   
            }            
            pkg.getIdentityTypes().add(idType);
            typesMap.put(name, idType);
            logger.debug("- Creating identity type [" + idType.getName() + "]");
            return idType;
        }
        
        public void update(IdentityType type, String newName) {
            if (newName == null || newName.equals("")) {
                logger.warn("- Updating type ["+type.getName()+"] to null or empty value, aborting");
                return;
            }            
            if (typesMap.containsKey(newName)) {
                logger.warn("- Type with same name ["+newName+"] already defined, aborting");
                return;
            }
            typesMap.remove(type.getName());
            //
            logger.debug("- Updating type ["+type.getName()+"] to [" + newName + "]");
            type.setName(newName);
            //
            typesMap.put(type.getName(), type);
        }
        
        public IdentityType find(String name) {
            return typesMap.get(name);
        }
     
        public boolean delete(DigitalIdentityType type) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(type.getInstantiations(), msgs, "instantiation");
            addMessage(type.getAttributeInstantiations(), msgs, "attribute");
            //
            if (msgs.size() > 0) {
                logger.debug("- Can't delete identity type [" + type.getName() + "], it has:");
                printMessages(logger, msgs);
                return false;
            }
            //
            logger.debug("- Deleting identity type: [" + type.getName() + "]");
            type.getPackage().getIdentityTypes().remove(type);
            type.setPackage(null);
            EcoreUtil.delete(type);
            return true;
        }
        
    }


    public class IdentityAttributeController extends ElementController {

        public IdentityAttributeInstantiation create(DigitalIdentityType idType, String name) {
            return create(idType, name, null);
        }

        public IdentityAttributeInstantiation create(DigitalIdentityType idType, String name, DataType dataType) {
            return create(idType, name, dataType, null);
        }

        public IdentityAttributeInstantiation create(DigitalIdentityType idType, String name, DataType dataType, String description) {
            for (IdentityAttributeInstantiation attInst : idType.getAttributeInstantiations()) {
                if (attInst.getName().equals(name)) {
                    logger.warn("- Identity attribute with same name [" + name + "] already defined, aborting");
                    return null;
                }
            }
            IdentityAttributeInstantiation attInst = TypeFactory.eINSTANCE.createIdentityAttributeInstantiation();
            ECoreUtils.setup(attInst);
            if (name == null) {
                name = "Attribute " + attInst.getId();
            }
            attInst.setName(name);
            if (dataType == null) {
                // default string type
                dataType = design.data.findDataType(DEFAULT_DATA_TYPE);
                if (dataType == null) {
                    logger.warn("- Default identity attribute data type not found! [" + DEFAULT_DATA_TYPE + "]");
                    return null;
                }
            }            
            attInst.setType(dataType);
            if (description != null) {
                attInst.setDescription(description);
            }
            idType.getAttributeInstantiations().add(attInst);
            logger.debug("- Creating identity attribute [" + name + "][" + dataType.getName() + "]");
            return attInst;
        }
        
        public void update(IdentityAttributeInstantiation attInst, String newName, DataType newType) {
            if (newName == null || newName.equals("")) {
                logger.warn("- Trying to update attribute name ["+attInst.getName()+"] to null or empty value, aborting");
                return;
            }
            if (newType == null) {
                logger.warn("- Trying to update attribute data type ["+attInst.getName()+"] to null or empty value, aborting");
                return;
            }
            for (IdentityAttributeInstantiation attInst2 : attInst.getIdentityType().getAttributeInstantiations()) {
                if (attInst2.getName().equals(newName)) {
                    logger.warn("- Identity attribute with same name [" + newName + "] already defined, aborting");
                    return;
                }
            }
            //
            attInst.setName(newName);
            attInst.setType(newType);            
        }
        
        public boolean delete(IdentityAttributeInstantiation attInst) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(attInst.getPatterns(), msgs, "pattern");
            addMessage(attInst.getInstances(), msgs, "instance");
            //
            if (msgs.size() > 0) {
                logger.debug("- Can't delete attribute instantiation [" + attInst.getName() + "], it has:");
                printMessages(logger, msgs);
                return false;
            }
            //
            logger.debug("- Deleting attribute instantiation: [" + attInst.getName() + "]");
            attInst.getIdentityType().getAttributeInstantiations().remove(attInst);
            attInst.setIdentityType(null);
            EcoreUtil.delete(attInst);
            return true;
        }
        
    }

    public class IdentityInstantiationController extends ElementController {
        
        public IdentityInstantiation create(DataProducerType producer, IdentityType type, String name) {
            IdentityInstantiation inst = InstantiationFactory.eINSTANCE.createIdentityInstantiation();
            ECoreUtils.setup(inst);
            inst.setName(name);
            inst.setType(type);
            producer.getIdentityInstantiations().add(inst);
            return inst;
        }
        
    }

    public class PatternController extends ElementController {
        
        public IdentityPattern createIdentityPattern() {
            IdentityPattern pattern = PatternFactory.eINSTANCE.createIdentityPattern();
            ECoreUtils.setup(pattern);
            return pattern;
        }
        
        public IdentityPattern createIdentityPattern(String subject) {
            IdentityPattern pattern = PatternFactory.eINSTANCE.createIdentityPattern();
            ECoreUtils.setup(pattern);
            pattern.setSubject(subject);
            return pattern;
        }

        public IdentityPattern createIdentityPattern(IdentityVariable variable) {
            IdentityPattern pattern = PatternFactory.eINSTANCE.createIdentityPattern();
            ECoreUtils.setup(pattern);
            pattern.getVariables().add(variable);
            return pattern;
        }

        public IdentityPattern createIdentityPattern(IdentityVariable[] variables) {
            IdentityPattern pattern = PatternFactory.eINSTANCE.createIdentityPattern();
            ECoreUtils.setup(pattern);
            for (IdentityVariable variable : variables) {
                pattern.getVariables().add(variable);
            }
            return pattern;
        }
        
        public IdentityPattern createIdentityPattern(IdentityInstantiation inst) {
            IdentityPattern pattern = PatternFactory.eINSTANCE.createIdentityPattern();
            ECoreUtils.setup(pattern);
            pattern.setInstantiation(inst);
            return pattern;            
        }
        

        public IdentityAttributePattern createIdentityAttributePattern(IdentityPattern idPattern, IdentityAttributeInstantiation attInst, IdentityAttributeVariable variable) {
            IdentityAttributePattern attPattern = PatternFactory.eINSTANCE.createIdentityAttributePattern();
            ECoreUtils.setup(attPattern);
            attPattern.setVariable(variable);
            attPattern.setInstantiation(attInst);
            idPattern.getAttributePatterns().add(attPattern);            
            return attPattern;
        }
        
        
    }

    public class VariableController extends ElementController {

        public IdentityInstanceVariable createIdentityInstanceVariable(String name) {
            return createIdentityInstanceVariable(null, name);
        }
        
        public IdentityInstanceVariable createIdentityInstanceVariable(RuleTemplate template, String name) {
            IdentityInstanceVariable variable = IdentityFactory.eINSTANCE.createIdentityInstanceVariable();
            ECoreUtils.setup(variable);
            variable.setName(name);
            if (template != null) {
                template.getVariableDeclarations().add(variable);
            }
            return variable;
        }

        public IdentityAttributeVariable createIdentityAttributeVariable(RuleTemplate template, String name) {
            IdentityAttributeVariable variable = IdentityFactory.eINSTANCE.createIdentityAttributeVariable();
            ECoreUtils.setup(variable);
            variable.setName(name);
            if (template != null) {
                template.getVariableDeclarations().add(variable);
            }
            return variable;
        }
        
    }



}
