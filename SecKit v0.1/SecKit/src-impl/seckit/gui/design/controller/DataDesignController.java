package seckit.gui.design.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import models.variable.VariableDeclaration;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import data.instantiation.DataInstantiation;
import data.instantiation.DataInstantiationHierarchy;
import data.instantiation.DataInstantiationReference;
import data.instantiation.InstantiationFactory;
import data.variable.DataInstanceVariable;
import data.variable.DataInstantiationAssignment;
import data.variable.VariableFactory;
import behavior.pattern.ActivityPattern;
import seckit.gui.ModelController.ElementController;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import utils.ecore.ECoreUtils;
import data.pattern.DataPattern;
import data.pattern.LiteralPattern;
import data.pattern.PatternFactory;
import data.pattern.RegExpPattern;
import data.pattern.XPathPattern;
import data.type.CompositeType;
import data.DataDesignModel;
import data.DataFactory;
import data.type.DataType;
import data.type.DataTypePackage;
import data.type.PrimitiveType;
import data.type.TypeFactory;

public class DataDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(DataDesignController.class);
    public Map<String, DataType> typesMap;

    public DataPatternController pattern;
    
    public DataDesignController(DesignViewpointFactory design) {
        super("Data", design);
        //
        typesMap = new HashMap<String, DataType>();
        pattern = new DataPatternController();
    }

    /*
    @Override
    public void load() {
        for (DataDesignModel model : viewpoint.getDataDesignModels()) {
            load(model.getPackages());
        }
    }
    
    public void load(EList<DataTypePackage> pkgs) {
        for (DataTypePackage pkg : pkgs) {
            for (DataType type : pkg.getDataTypes()) {
                if (typesMap.get(type.getName()) != null) {
                   logger.warn("Duplicate type name ["+type.getName()+"], ignoring");
                } else { 
                    typesMap.put(type.getName(), type);
                }
            }
            load(pkg.getSuPackages());
        }
    }
    */
    
    public DataDesignModel createModelFromECore(String desc, String dataModelFilepath) {
        //DataDesignModel model;        
        if (dataModelFilepath == null) {
            logger.warn("Data design model not loaded, null filename");
            return null;
        }

        File f = new File(dataModelFilepath);
        if (!f.isFile()) {
            logger.warn("Data design model not loaded, invalid file");
            return null;
        }
        
        String canonicalPath = null;
        try {
            canonicalPath = f.getCanonicalPath();
        } catch (IOException e1) {
            logger.warn("Data design model not loaded, invalid file path");
            return null;
        }
        
        
        for (DataDesignModel model : design.viewpoint.getDataDesignModels()) {
            if (model.getUri().equals(canonicalPath)) {
                logger.warn("Data design model already loaded, aborting");
                return null;
            }
        }
        
        DataDesignModel model = DataFactory.eINSTANCE.createDataDesignModel();
        ECoreUtils.setup(model);

        if (desc == null) {
            desc = "Data model "+model.getId();
        }
        model.setDescription(desc);
        
        logger.info("Loading data design model ["+desc+"]");
        
        model.setUri(canonicalPath);
        model.setFilename(f.getName());
        design.viewpoint.getDataDesignModels().add(model);        
        
        //
        DataTypePackage pkg = TypeFactory.eINSTANCE.createDataTypePackage();
        ECoreUtils.setup(pkg);
        logger.debug("- Adding data package [" + dataModelFilepath + "]");
        EPackage ePkg = (EPackage) ECoreUtils.xmlFileToEObject(dataModelFilepath);
        //
        if (ePkg != null) {            
            pkg.setEPackage(ePkg);
            // First round, create the data types
            for (EClassifier c : ePkg.getEClassifiers()) {
                DataType dt = null;
                if (c instanceof EDataType) {
                    PrimitiveType pt = TypeFactory.eINSTANCE.createPrimitiveType();
                    ECoreUtils.setup(pt);
                    pt.setName(c.getName());
                    pt.setEType(c);
                    pkg.getDataTypes().add(pt);
                    dt = pt;
                } else if (c instanceof EClass) {
                    CompositeType ct = TypeFactory.eINSTANCE.createCompositeType();
                    ECoreUtils.setup(ct);
                    ct.setEType(c);
                    ct.setName(c.getName());
                    pkg.getDataTypes().add(ct);
                    dt = ct;
                }
                if (dt != null) {
                    typesMap.put(dt.getName(), dt);
                }
                logger.debug("- Adding data type [" + dt.getName() + "]");
            }

            // Second round, create composite instantiations
            // This has to be done after to avoid missing type references
            // due to wrong order of types in the package
            for (EClassifier c : ePkg.getEClassifiers()) {
                if (c instanceof EClass) {
                    EClass cl = (EClass) c;
                    CompositeType ct = (CompositeType) typesMap.get(c.getName());
                    logger.debug("- Adding attributes to [" + ct.getName() + "]");
                    for (EAttribute eAtt : cl.getEAttributes()) {
                        if (eAtt.getEType() != null) {
                            DataType eDt = typesMap.get(eAtt.getEType().getName());
                            if (eDt != null) {
                                DataInstantiation att = InstantiationFactory.eINSTANCE.createDataInstantiation();
                                ECoreUtils.setup(att);
                                att.setName(eAtt.getName());
                                att.setType(eDt);
                                ct.getAttributes().add(att);
                                logger.debug("  [" + att.getName() + "] of type [" + eDt.getName() + "]");
                            }
                        }
                    }
                }
            }
        }
        model.getPackages().add(pkg);

        // Not a good idea, better to require explicit definition
        /*
         * EDataType[] primitiveTypes = new EDataType[] {
         * EcorePackage.eINSTANCE.getEBoolean(),
         * EcorePackage.eINSTANCE.getEInt(), EcorePackage.eINSTANCE.getELong(),
         * EcorePackage.eINSTANCE.getEFloat(),
         * EcorePackage.eINSTANCE.getEDouble(),
         * EcorePackage.eINSTANCE.getEString(), }; for (EDataType c :
         * primitiveTypes) { defaultPkg.getEClassifiers().add(c); }
         */
        return model;
    }

    public DataType findDataType(String name) {
        DataType d = typesMap.get(name);
        if (d == null) {
            logger.info("Data type [" + name + "] not found!");
        }
        return d;
    }

    public DataInstanceVariable createDataInstanceVariable(String name) {
        DataInstanceVariable variable = VariableFactory.eINSTANCE.createDataInstanceVariable();
        ECoreUtils.setup(variable);
        variable.setName(name);
        return variable;
    }

    public class DataPatternController extends ElementController {
        
        public DataPattern setupDataPattern(ActivityPattern aPattern, DataPattern pattern, DataInstantiation instantiation, String value) {
            ECoreUtils.setup(pattern);
            pattern.setInstantiation(instantiation);
            pattern.setValue(value);
            if (aPattern != null) {
                aPattern.getDataPatterns().add(pattern);
            }
            logger.info(pattern);
            return pattern;
        }
        
        public XPathPattern createXPathPattern(ActivityPattern aPattern, DataInstantiation instantiation, String value) {
            XPathPattern pattern = PatternFactory.eINSTANCE.createXPathPattern();
            setupDataPattern(aPattern, pattern, instantiation, value);
            return pattern;
        }

        public LiteralPattern createLiteralPattern(ActivityPattern aPattern, DataInstantiation instantiation, String value) {
            LiteralPattern pattern = PatternFactory.eINSTANCE.createLiteralPattern();
            setupDataPattern(aPattern, pattern, instantiation, value);
            return pattern;
        }

        public RegExpPattern createRegExpPattern(ActivityPattern aPattern, DataInstantiation instantiation, String value, int match, int group) {
            RegExpPattern pattern = PatternFactory.eINSTANCE.createRegExpPattern();
            setupDataPattern(aPattern, pattern, instantiation, value);
            pattern.setMatch(match);
            pattern.setGroup(group);
            return pattern;
        }

    }
    
    public DataInstantiationHierarchy createDataInstantiationHierarchy(DataInstantiation instantiation) {
        DataInstantiationHierarchy hierarchy = InstantiationFactory.eINSTANCE.createDataInstantiationHierarchy();
        ECoreUtils.setup(hierarchy);
        //
        DataInstantiationReference reference = InstantiationFactory.eINSTANCE.createDataInstantiationReference();
        ECoreUtils.setup(reference);
        reference.setInstantiation(instantiation);
        //
        hierarchy.setRoot(reference);
        return hierarchy;
    }
    
}
