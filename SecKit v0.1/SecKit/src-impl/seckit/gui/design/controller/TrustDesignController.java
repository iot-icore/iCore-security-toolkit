package seckit.gui.design.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import behavior.trust.AdaptServiceToContext;
import behavior.trust.CompleteServiceAsAgreed;
import behavior.trust.EmployeeTheft;
import behavior.trust.PrivacyProtection;
import behavior.trust.ProvideSecureFirmware;
import behavior.trust.QualityOfProtection;
import identity.instance.DigitalIdentity;
import identity.pattern.IdentityPattern;
import context.instance.NumericPrecision;
import context.instance.QualityOfContext;
import context.pattern.ContextInformationPattern;
import context.type.ContextInformationType;
import models.Model;
import trust.pattern.ArbitraryTrustPattern;
import trust.pattern.ExperienceTrustPattern;
import trust.pattern.PatternFactory;
import trust.pattern.PersonalScopePattern;
import trust.pattern.TrustDegreePattern;
import trust.pattern.TrustLevelPattern;
import trust.pattern.TrustPattern;
import trust.pattern.TrustRecommendationPattern;
import trust.pattern.TrustRelationshipPattern;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.design.controller.BehaviorDesignController.BehaviorTypePackageController;
import trust.TrustDesignModel;
import trust.TrustFactory;
import trust.instance.AtLeast;
import trust.instance.AtMost;
import trust.instance.ContextProvisioning;
import trust.instance.ContextSituationEventsProvisioning;
import trust.instance.Exactly;
import trust.instance.IdentityQuality;
import trust.instance.InstanceFactory;
import trust.instance.RecommendationQuality;
import trust.instance.SubjectiveLogicConsensus;
import trust.instance.TrustAspect;
import trust.instance.TrustFusionOperator;
import trust.instance.TrustLevel;
import utils.ecore.ECoreUtils;

public class TrustDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(TrustDesignController.class);
    private Map<String, TrustAspect> aspects;

    
    public TrustAspectController aspect;
    
    public TrustDesignController(DesignViewpointFactory design) {
        super("Trust", design);
        aspect = new TrustAspectController();
    }

    public void loadModel() {
        aspects = new HashMap<String, TrustAspect>();
        for (TrustDesignModel model : design.viewpoint.getTrustDesignModels()) {
            for (TrustAspect aspect : model.getTrustAspects()) {
                aspects.put(aspect.getName(), aspect);
            }
        }
    }
    
    public TrustDesignModel createModel(String desc) {
        TrustDesignModel model = TrustFactory.eINSTANCE.createTrustDesignModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        design.viewpoint.getTrustDesignModels().add(model);
        return model;
    }
    
    public PersonalScopePattern createPersonalScopePattern(TrustRelationshipPattern relPattern, IdentityPattern trustee) {
        PersonalScopePattern pattern = PatternFactory.eINSTANCE.createPersonalScopePattern();
        ECoreUtils.setup(pattern);
        if (trustee != null) {
            pattern.setTrustee(trustee);
        }
        if (relPattern != null) {
            relPattern.setTrusteeScope(pattern);
        }
        return pattern;
    }
    
    public TrustLevelPattern createTrustLevelPattern(TrustRelationshipPattern relPattern, TrustLevel level) {
        TrustLevelPattern pattern = PatternFactory.eINSTANCE.createTrustLevelPattern();
        ECoreUtils.setup(pattern);
        if (level != null) {
            pattern.setLevel(level);
        }
        if (relPattern != null) {
            relPattern.setDegree(pattern);
        }
        return pattern;
    }
    
    public SubjectiveLogicConsensus createSubjectiveLogicConsensus(TrustPattern trustPattern) {
        SubjectiveLogicConsensus op = InstanceFactory.eINSTANCE.createSubjectiveLogicConsensus();
        if (trustPattern != null) {
            op.setTrustPattern(trustPattern);
        }
        return op;
    }
   
    public TrustRecommendationPattern createTrustRecommendationPattern(TrustRelationshipPattern trustPattern) {
        TrustRecommendationPattern pattern = PatternFactory.eINSTANCE.createTrustRecommendationPattern();
        ECoreUtils.setup(pattern);
        if (trustPattern != null) {
            pattern.setTrustRelationship(trustPattern);
        }
        return pattern;
    }
    
    public ArbitraryTrustPattern createArbitraryTrustPattern(TrustLevel level) {
        ArbitraryTrustPattern pattern = PatternFactory.eINSTANCE.createArbitraryTrustPattern();
        ECoreUtils.setup(pattern);
        createTrustLevelPattern(pattern, level);
        return pattern;
    }
    
    public ExperienceTrustPattern createExperienceTrustPattern(TrustLevel level) {
        ExperienceTrustPattern pattern = PatternFactory.eINSTANCE.createExperienceTrustPattern();
        ECoreUtils.setup(pattern);
        createTrustLevelPattern(pattern, level);
        return pattern;
    }
    
    
    public class TrustAspectController extends ElementController {
        public String getLabel(TrustAspect aspect) {

            if (aspect == null) {
                return "everything";
            }            
            
            if (aspect instanceof ProvideSecureFirmware) {
                return "provide secure firmware";
            }
            
            if (aspect instanceof CompleteServiceAsAgreed) {
                return "complete service as agreed";
            }
            
            if (aspect instanceof EmployeeTheft) {
                return "employee theft";
            }
            
            if (aspect instanceof IdentityQuality) {
                return "identity quality";
            }
            
            if (aspect instanceof ContextProvisioning) {
                
                ContextProvisioning cip = (ContextProvisioning) aspect;

                StringBuffer s = new StringBuffer();
                boolean isFirst = true;
                //
                //
                if (cip.getContextInformationPattern() != null) {
                    ContextInformationPattern pattern = cip.getContextInformationPattern();
                    if (pattern.getType() != null) {
                        if (!isFirst)
                            s.append(", ");
                        s.append(pattern.getType().getName()); 
                        isFirst = false;
                    }
                    /*
                     * if (pattern.getContextOwner() != null) { IdentityPattern
                     * contextOwner = pattern.getContextOwner(); if
                     * (contextOwner.getSubject()!=null &&
                     * !contextOwner.getSubject().equals("")) { if (!isFirst)
                     * s.append(", "); s.append(contextOwner.getSubject()); isFirst
                     * = false; } }
                     */
                    if (pattern.getQualityOfContext() != null) {
                        QualityOfContext qoc = pattern.getQualityOfContext();
                        NumericPrecision precision = (NumericPrecision) qoc.getDeclaredPrecision();
                        if (precision != null) {
                            if (!isFirst)
                                s.append(", ");
                            s.append("+-" + precision.getPlusMinusDelta() + " " + precision.getUnit());
                            isFirst = false;
                        }
                    }
                }
                if (!isFirst) {
                    return "provide context information (" + s.toString() + ")";
                }
                return "provide context information";
            }
            
            if (aspect instanceof ContextSituationEventsProvisioning)
                return "provide context situation events";
            
           
            if (aspect instanceof PrivacyProtection) {
                /*
                ProtectPrivacy pe = (ProtectPrivacy)aspect;
                StringBuffer s = new StringBuffer();
                boolean isFirst = true;
                //
                if (pe.isIsAdministrator()) {
                    if (!isFirst)
                        s.append(", ");
                    s.append("Admin");
                    isFirst = false;
                }
                if (pe.isIsPepEnabled()) {
                    if (!isFirst)
                        s.append(", ");
                    s.append("PEP enabled");
                    isFirst = false;
                }
                if (pe.isIsTpmEnabled()) {
                    if (!isFirst)
                        s.append(", ");
                    s.append("TPM enabled");
                    isFirst = false;
                }
                //
                if (!isFirst) {
                    return "enforce privacy preferences (" + s.toString() + ")";
                }
                */
                return "enforce privacy preferences";            
            }

            if (aspect instanceof AdaptServiceToContext) {
                return "adapt to context";
            }
            
            // TODO: description not supported?
            return aspect.getClass().getSimpleName();
                
            // TODO: trust in description + quality property also possible!
            //       for now we consider or description or quality property
            /*
            QualityProperty quality = sp.getQualityProperty();
            if (quality != null) {
            }

            if (aspect instanceof RecommendationProvisioning)
                return "recommendation provisioning";
            return "?";
            */
        }    

        public void setup(TrustDesignModel model, TrustAspect aspect, String name) {
            ECoreUtils.setup(aspect);
            if (name == null) {
                getLabel(aspect);
            }
            aspect.setName(name);
            model.getTrustAspects().add(aspect);
            logger.debug("- Creating trust aspect ["+aspect.getName()+"]");
            //aspects.put(name, aspect);
        }

        
        public TrustAspect create(TrustDesignModel model, String name) {
            TrustAspect aspect = InstanceFactory.eINSTANCE.createTrustAspect();
            setup(model, aspect, name);
            return aspect;
        }
        
        public CompleteServiceAsAgreed createCompleteServiceAsAgreed(TrustDesignModel model, String name) {
            CompleteServiceAsAgreed aspect = behavior.trust.TrustFactory.eINSTANCE.createCompleteServiceAsAgreed();
            setup(model, aspect, name);
            return aspect;
        }
        
        public ProvideSecureFirmware createProvideSecureFirmware(TrustDesignModel model, String name) {
            ProvideSecureFirmware aspect = behavior.trust.TrustFactory.eINSTANCE.createProvideSecureFirmware();
            setup(model, aspect, name);
            return aspect;
        } 
        
        public EmployeeTheft createEmployeeTheft(TrustDesignModel model, String name) {
            EmployeeTheft aspect = behavior.trust.TrustFactory.eINSTANCE.createEmployeeTheft();
            setup(model, aspect, name);
            return aspect;
        }
        
        
        public IdentityQuality createProvideIdentity(TrustDesignModel model, String name) {
            IdentityQuality aspect = InstanceFactory.eINSTANCE.createIdentityQuality();
            setup(model, aspect, name);
            return aspect;
        }

        public ContextSituationEventsProvisioning createProvideSituationEvents(TrustDesignModel model, String name) {
            ContextSituationEventsProvisioning aspect = InstanceFactory.eINSTANCE.createContextSituationEventsProvisioning();
            setup(model, aspect, name);
            return aspect;
        }
        
        public PrivacyProtection createProtectPrivacy(TrustDesignModel model, String name, boolean isTpmEnabled, boolean isAdministrator, boolean isPepEnabled) {
            PrivacyProtection aspect = behavior.trust.TrustFactory.eINSTANCE.createPrivacyProtection();
            setup(model, aspect, name);
            aspect.setIsAdministrator(isAdministrator);
            aspect.setIsPepEnabled(isPepEnabled);
            return aspect;
        }
        
        public RecommendationQuality createProvideRecommendation(TrustDesignModel model, String name) {
            RecommendationQuality aspect = InstanceFactory.eINSTANCE.createRecommendationQuality();
            setup(model, aspect, name);
            return aspect;
        }
        
        public AdaptServiceToContext createAdaptServiceToContext(TrustDesignModel model, String name) {
            //
            // TODO: Adapt Service To Context is an enabled capability, as a result of receiving high quality context information?
            //
            AdaptServiceToContext aspect = behavior.trust.TrustFactory.eINSTANCE.createAdaptServiceToContext();
            setup(model, aspect, name);
            return aspect;
        }
        

        public ContextProvisioning createProvideContext(TrustDesignModel model, String name, DigitalIdentity contextOwner, ContextInformationType contextType, QualityOfContext qoc) {
            //
            ContextProvisioning aspect = InstanceFactory.eINSTANCE.createContextProvisioning();
            setup(model, aspect, name);
            aspect.setContextInformationPattern(design.context.contextType.createPattern(contextOwner, contextType, qoc));
            return aspect;
        }    
        
    }
   
    public AtLeast createAtLeast(TrustLevel level, TrustPattern pattern) {
        AtLeast op = InstanceFactory.eINSTANCE.createAtLeast();
        ECoreUtils.setup(op);
        op.setTrustPattern(pattern);
        //
        TrustLevelPattern lPattern = PatternFactory.eINSTANCE.createTrustLevelPattern();
        ECoreUtils.setup(lPattern);
        if (level != null) {
            lPattern.setLevel(level);
            op.setDegree(lPattern);
        }
        //
        return op;
    }

    public AtLeast createAtLeast(TrustLevel level, TrustFusionOperator tfop) {
        AtLeast op = InstanceFactory.eINSTANCE.createAtLeast();
        ECoreUtils.setup(op);
        op.setTrustFusionOperator(tfop);
        //
        TrustLevelPattern lPattern = PatternFactory.eINSTANCE.createTrustLevelPattern();
        ECoreUtils.setup(lPattern);
        if (level != null) {
            lPattern.setLevel(level);
            op.setDegree(lPattern);
        }
        //
        return op;
    }
    
    public AtMost createAtMost(TrustLevel level, TrustFusionOperator tfop) {
        AtMost op = InstanceFactory.eINSTANCE.createAtMost();
        ECoreUtils.setup(op);
        op.setTrustFusionOperator(tfop);
        //
        TrustLevelPattern lPattern = PatternFactory.eINSTANCE.createTrustLevelPattern();
        ECoreUtils.setup(lPattern);
        if (level != null) {
            lPattern.setLevel(level);
            op.setDegree(lPattern);
        }
        //
        return op;
    }
    
    public AtMost createAtMost(TrustLevel level, TrustPattern pattern) {
        AtMost op = InstanceFactory.eINSTANCE.createAtMost();
        ECoreUtils.setup(op);
        op.setTrustPattern(pattern);
        //
        TrustLevelPattern lPattern = PatternFactory.eINSTANCE.createTrustLevelPattern();
        ECoreUtils.setup(lPattern);
        if (level != null) {
            lPattern.setLevel(level);
            op.setDegree(lPattern);
        }
        //
        return op;
    }

    public Exactly createExactly(TrustLevel level, TrustPattern pattern) {
        Exactly op = InstanceFactory.eINSTANCE.createExactly();
        ECoreUtils.setup(op);
        op.setTrustPattern(pattern);
        //
        TrustLevelPattern lPattern = PatternFactory.eINSTANCE.createTrustLevelPattern();
        ECoreUtils.setup(lPattern);
        if (level != null) {
            lPattern.setLevel(level);
            op.setDegree(lPattern);
        }
        //
        return op;
    }

    
}
