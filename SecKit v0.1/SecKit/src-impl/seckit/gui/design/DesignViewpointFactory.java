package seckit.gui.design;

import org.apache.log4j.Logger;

import models.ModelsFactory;
import models.Multiplicity;
import seckit.SeckitFactory;
import seckit.SystemDesignViewpoint;
import seckit.ViewpointFactory;
import seckit.gui.design.controller.BehaviorDesignController;
import seckit.gui.design.controller.ContextDesignController;
import seckit.gui.design.controller.DataDesignController;
import seckit.gui.design.controller.IdentityDesignController;
import seckit.gui.design.controller.RiskDesignController;
import seckit.gui.design.controller.RoleDesignController;
import seckit.gui.design.controller.RuleDesignController;
import seckit.gui.design.controller.StructuralDesignController;
import seckit.gui.design.controller.TimeDesignController;
import seckit.gui.design.controller.TrustDesignController;

public class DesignViewpointFactory extends ViewpointFactory {

    protected static Logger logger = Logger.getLogger(DesignViewpointFactory.class);

    public SystemDesignViewpoint viewpoint;

    public TimeDesignController time;
    public DataDesignController data;
    public IdentityDesignController identity;
    public RoleDesignController role;
    public ContextDesignController context;
    public TrustDesignController trust;
    public StructuralDesignController structure;
    public BehaviorDesignController behavior;
    public RiskDesignController risk;
    public RuleDesignController rule;
    
    public DesignViewpointFactory() {
        // Create viewpoint
        logger.info("Creating DESIGN viewpoint and controllers");
        viewpoint = SeckitFactory.eINSTANCE.createSystemDesignViewpoint();
        createControllers();
    }
    
    public void createControllers() {
        
        //
        // Create models, controllers, and load model in controller
        // The order here is important because there are dependencies between
        // the models
        //        
        time = new TimeDesignController(this);
        data = new DataDesignController(this);
        identity = new IdentityDesignController(this);
        context = new ContextDesignController(this);
        role = new RoleDesignController(this);
        structure = new StructuralDesignController(this);
        behavior = new BehaviorDesignController(this);
        trust = new TrustDesignController(this);
        rule = new RuleDesignController(this);
        risk = new RiskDesignController(this);
    }
    
    public void setupModule(DesignViewpointModule module) {
        // setupTime()?
        module.configure(this);        
        module.setupData();
        module.setupIdentity();
        module.setupContext();
        module.setupRole();
        module.setupStructure();
        module.setupBehavior();
        module.setupTrust();
        module.setupRule();
        module.setupRisk();
    }
    
    public static Multiplicity ZERO_OR_ONE() {
        return createMultiplicity(0, 1);
    }

    public static Multiplicity ZERO_OR_MORE() {
        return createMultiplicity(0, -1);
    }

    public static Multiplicity EXACTLY_ONE() {
        return createMultiplicity(1, 1);
    }

    public static Multiplicity ONE_OR_MORE() {
        return createMultiplicity(1, -1);
    }

    public static Multiplicity createMultiplicity(int lower, int upper) {
        Multiplicity m = ModelsFactory.eINSTANCE.createMultiplicity();
        m.setLowerBound(lower);
        m.setUpperBound(upper);
        return m;
    }

    public static String[] multiplicities = new String[] { "0..1", "0..*", "1", "1..*" };

    public static void updateMultiplicity(String s, Multiplicity m) {
        if (s.equals("0..1")) {
            m.setLowerBound(0);
            m.setUpperBound(1);
        } else if (s.equals("0..*")) {
            m.setLowerBound(0);
            m.setUpperBound(-1);
        } else if (s.equals("1")) {
            m.setLowerBound(1);
            m.setUpperBound(1);
        } else if (s.equals("1..*")) {
            m.setLowerBound(1);
            m.setUpperBound(-1);
        } else {
            logger.warn("Invalid multiplicity [" + s + "]");
        }
    }

    public static String toString(Multiplicity m) {
        if (m == null)
            return "null";

        if (m.getUpperBound() == m.getLowerBound()) {
            return m.getLowerBound() + "";
        }

        if (m.getUpperBound() == -1) {
            return m.getLowerBound() + "..*";
        }
        return m.getLowerBound() + ".." + m.getUpperBound();
    }

}
