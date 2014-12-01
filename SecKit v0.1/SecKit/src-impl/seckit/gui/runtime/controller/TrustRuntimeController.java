package seckit.gui.runtime.controller;

import identity.instance.AbstractIdentity;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import com.dstc.spectrum.opinion.SubjectiveOpinion;

import seckit.gui.runtime.RuntimeController;
import seckit.gui.runtime.RuntimeViewpointFactory;
import trust.instance.ArbitraryTrust;
import trust.instance.IdentityQuality;
import trust.instance.InstanceFactory;
import trust.instance.PersonalTrust;
import trust.instance.SubjectiveLikelihood;
import trust.instance.TrustAspect;
import trust.instance.LikelihoodMeasurement;
import trust.instance.TrustLevel;
import trust.instance.TrustRelationship;
import trust.instance.TrusteeScope;
import trust.TrustFactory;
import trust.TrustRuntimeModel;
import utils.ecore.ECoreUtils;

/*
 * The Subjective Logic library was designed and implemented under the
 * supervision of Prof. Audun Jøsang by Simon Pope, Shane Hird and Matthew Davey.
 * Details about it can be found in the following website: http://folk.uio.no/josang/sl/ 
 * 
 */

public class TrustRuntimeController extends RuntimeController {

    static Logger logger = Logger.getLogger(TrustRuntimeController.class);

    public TrustRuntimeController(RuntimeViewpointFactory runtime) {
        super("Trust", runtime);
    }

    public TrustRuntimeModel createModel(String desc) {
        TrustRuntimeModel model = TrustFactory.eINSTANCE.createTrustRuntimeModel();
        ECoreUtils.setup(model);
        model.setDescription("Trust Model");
        viewpoint.getTrustRuntimeModels().add(model);
        return model;
    }

    public TrusteeScope addPersonalScope(TrustRelationship trust, String subject) {
        PersonalTrust scope = InstanceFactory.eINSTANCE.createPersonalTrust();
        logger.debug(" - scope = [" + subject + "]");
        scope.setTrustee(runtime.design.identity.pattern.createIdentityPattern(subject));
        trust.setTrusteeScope(scope);
        return scope;
    }

    public TrustRelationship createTrustRelationship(TrustRuntimeModel model, AbstractIdentity trustee, TrustLevel level, TrustAspect aspect) {
        ArbitraryTrust trust = InstanceFactory.eINSTANCE.createArbitraryTrust();
        logger.debug("Creating trust relationship");
        ECoreUtils.setup(trust);
        model.getTrustRelationships().add(trust);
        addPersonalScope(trust, trustee.getSubject());
        addTrustDegree(trust, level);
        logger.debug(" - degree = [" + getLabel(trust.getDegree()) + "]");
        trust.getAspect().add(aspect);
        return trust;
    }

    public SubjectiveLikelihood addTrustDegree(TrustRelationship trust, TrustLevel level) {
        SubjectiveLikelihood degree = InstanceFactory.eINSTANCE.createSubjectiveLikelihood();
        double b = 0.0, d = 0.0, u = 0.0;
        if (level == TrustLevel.VERY_TRUSTWORTHY) {
            b = 0.670D;
            d = 0.165D;
            u = 0.165D;
        }
        if (level == TrustLevel.TRUSTWORTHY) {
            b = 0.300D;
            d = 0.140D;
            u = 0.560D;
        }
        if (level == TrustLevel.UNCERTAIN || level == TrustLevel.UNSPECIFIED) {
            b = 0.0D;
            d = 0.0D;
            u = 1.0D;
        }
        if (level == TrustLevel.UNTRUSTWORTHY) {
            b = 0.140D;
            d = 0.300D;
            u = 0.560D;
        }
        if (level == TrustLevel.VERY_UNTRUSTWORTHY) {
            b = 0.165D;
            d = 0.670D;
            u = 0.165D;
        }
        SubjectiveOpinion op = new SubjectiveOpinion(b, d, u);
        op.setAtomicity(0.5D);
        degree.setOpinion(op);
        trust.setDegree(degree);;
        return degree;
    }

    public Color getColor(SubjectiveOpinion op) {
        Color color = null;
        if (op.getBelief() == op.getDisbelief()) {
            // Uncertain
            color = new Color(200, 200, 200);
        } else {
            if (op.getBelief() > op.getDisbelief()) {
                if (op.getUncertainty() < 0.33) {
                    // Very trustworthy
                    color = new Color(25, 255, 25);
                    // Trustworthy
                    color = new Color(200, 255, 200);
                }
            } else {
                if (op.getUncertainty() < 0.33) {
                    // Very untrustworthy
                    color = new Color(255, 25, 25);
                } else {
                    // Untrustworthy
                    color = new Color(255, 200, 200);
                }
            }
        }
        return color;
    }

    public String getLabel(LikelihoodMeasurement degree) {
        // TODO: for now all degrees are subjective logic opinions...
        if (degree instanceof SubjectiveLikelihood) {        
            SubjectiveOpinion op = ((SubjectiveLikelihood) degree).getOpinion();
            if (op.getBelief() == op.getDisbelief()) {
                return "Uncertain";
            } else {
                if (op.getBelief() > op.getDisbelief()) {
                    if (op.getUncertainty() < 0.33) {
                        return "Very trustworthy";
                    } else {
                        return "Trustworthy";
                    }
                } else {    
                    if (op.getUncertainty() < 0.33) {
                        return "Very untrustworthy";
                    } else {
                        return "Untrustworthy";
                    }
                }
            }
        } else {
            return degree.toString();
        }
    }

    public String getIconFilePath(LikelihoodMeasurement degree) {
        String label = getLabel(degree);
        if (label.equals("Unspecified")) {
            return "trust/unspecified.png";
        } else if (label.equals("Very trustworthy")) {
            return "trust/very-trustworthy.png";
        } else if (label.equals("Trustworthy")) {
            return "trust/trustworthy.png";
        } else if (label.equals("Very untrustworthy")) {
            return "trust/very-untrustworthy.png";
        } if (label.equals("Untrustworthy")) {
            return "trust/untrustworthy.png";
        }
        return "trust/uncertain.png";
    }

    
    public List<TrustRelationship> findTrustRelationships(String subject) {
        List<TrustRelationship> trustRelationships = new ArrayList<TrustRelationship>();
        List<TrustRelationship> temp;
        for (TrustRuntimeModel model : viewpoint.getTrustRuntimeModels()) {
            temp = findTrustRelationships(model, subject);
            trustRelationships.addAll(temp);
        }
        return trustRelationships;
    }
    
    public List<TrustRelationship> findTrustRelationships(TrustRuntimeModel model, String subject) {
        List<TrustRelationship> trustRelationships = new ArrayList<TrustRelationship>();
        for (TrustRelationship trust : model.getTrustRelationships()) {
            TrusteeScope scope = trust.getTrusteeScope();
            if (scope instanceof PersonalTrust) {
                PersonalTrust personalScope = (PersonalTrust) scope;
                if (personalScope.getTrustee().getSubject().equals(subject)) {
                    trustRelationships.add(trust);
                }
            }
        }
        return trustRelationships;
    }

    public List<TrustRelationship> findIdentityProvisioningTrustRelationships(String subject) {
        List<TrustRelationship> trustRelationships = new ArrayList<TrustRelationship>();
        List<TrustRelationship> temp;
        for (TrustRuntimeModel model : viewpoint.getTrustRuntimeModels()) {
            temp = findIdentityProvisioningTrustRelationships(model, subject);
            trustRelationships.addAll(temp);
        }
        return trustRelationships;
    }
    
    public List<TrustRelationship> findIdentityProvisioningTrustRelationships(TrustRuntimeModel model, String subject) {
        List<TrustRelationship> trustRelationships = new ArrayList<TrustRelationship>();
        for (TrustRelationship trust : model.getTrustRelationships()) {
            TrusteeScope scope = trust.getTrusteeScope();
            if (scope instanceof PersonalTrust) {
                PersonalTrust personalScope = (PersonalTrust) scope;
                if (personalScope.getTrustee().getSubject().equals(subject) && 
                    trust.getAspect() instanceof IdentityQuality) {
                    trustRelationships.add(trust);
                }
            }
        }
        return trustRelationships;
    }

    /*
    
                // value = 0 - 100 int value = sliderTrustDegree.getValue();
                
                // 0.34000000000000002D // 0.33000000000000002D 
                // Trustworthy = believe > disbelief // VU U UN T VT // 0 20 40 60 80 100
                
                double b = 0.0D; double d = 0.0D; double u = 0.0D; double scale = 0.0D;
                if (value < 200) { 
                    // Very untrustworthy // B + D from 0 to 0.76 // D from 1 to 0.50 
                    // B from 0 to 0.16888888888888888D (2/5 = 0,4) 
                    // U from 0 to 0.33000000000000002D (3/5 = 0,6) 
                    scale = value / 200D; u = 0.33000000000000002D * scale; 
                    b = 0.16888888888888888D * scale; d = 1.0D - u - b; } else if (value < 400) 
                    { // Untrustworthy // B + D from 0.76 to
                0 // D from 0.51 to 0 // B from 0.27 to 0 // U from 0.34 to 1.0 scale =
                (value - 200D) / 200D; u = 0.33000000000000002D + (0.66888888888888888D *
               scale); b = 0.16888888888888888D - (0.16888888888888888D * scale); d =
                1.0D - u - b; } else if (value < 600) { // Uncertain // scale = (value -
                40D) / 20D; // u = 1.0D * scale; // b = (1.0D - u) / 2D; // d = 1.0D - u
                - b; b = d = 0.0D; u = 1.0D; } else if (value < 800) { // Trustworthy
                scale = (value - 600D) / 200D; u = 1.0D - (0.66000000000000004D * scale);
                b = 0.5D * scale; d = 1.0D - u - b; } else if (value <= 1000) { // Very
                trustworthy scale = (value - 800D) / 200D; u = 0.33000000000000002D -
                (0.33000000000000002D * scale); d = 0.16888888888888888D -
                (0.16888888888888888D * scale); b = 1.0D - u - d; } System.out.println(
                " Belief:" + b + " \n Disbelief: "+ d + " \n Uncertainty "+ u); // sop =
                op.getOpinion(); // sop.set(b, d, u); // op.setOpinion(sop);
     */
    
}
