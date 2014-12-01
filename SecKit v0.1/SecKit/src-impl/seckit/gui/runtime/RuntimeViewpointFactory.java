package seckit.gui.runtime;

import org.apache.log4j.Logger;

import seckit.SeckitFactory;
import seckit.SystemRuntimeViewpoint;
import seckit.ViewpointFactory;
import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.runtime.controller.BehaviorRuntimeController;
import seckit.gui.runtime.controller.ContextRuntimeController;
import seckit.gui.runtime.controller.DataRuntimeController;
import seckit.gui.runtime.controller.IdentityRuntimeController;
import seckit.gui.runtime.controller.RiskRuntimeController;
import seckit.gui.runtime.controller.RoleRuntimeController;
import seckit.gui.runtime.controller.RuleRuntimeController;
import seckit.gui.runtime.controller.RuleHttpAdaptor;
import seckit.gui.runtime.controller.StructuralRuntimeController;
import seckit.gui.runtime.controller.TrustRuntimeController;

public class RuntimeViewpointFactory extends ViewpointFactory {

    protected static Logger logger = Logger.getLogger(RuntimeViewpointFactory.class);

    public DesignViewpointFactory design;
    public SystemRuntimeViewpoint viewpoint;

    // time
    public DataRuntimeController data;
    public IdentityRuntimeController identity;
    public RoleRuntimeController role;
    public ContextRuntimeController context;
    public TrustRuntimeController trust;
    public StructuralRuntimeController structure;
    public BehaviorRuntimeController behavior;
    public RiskRuntimeController risk;
    public RuleRuntimeController rule;
    //

    RuleHttpAdaptor adaptor;
    
    public RuntimeViewpointFactory(DesignViewpointFactory design) {
        // Runtime viewpoint
        logger.info("Creating RUNTIME viewpoint and controllers");
        this.design = design;
        viewpoint = SeckitFactory.eINSTANCE.createSystemRuntimeViewpoint();
        createControllers();
    }
    
    public void createControllers() {

        // Assignments
        // Runtime controllers
        // The order here is important ?? because there are dependencies between
        // the models
        // THIS IS NOT A GOOD IDEA! System Factory constructor should create all
        // controllers,
        // to prevent controller dependency null pointer...
        //
        
        // time = new TimeRuntimeController(this);
        data = new DataRuntimeController(this);
        identity = new IdentityRuntimeController(this);
        context = new ContextRuntimeController(this);
        trust = new TrustRuntimeController(this);
        role = new RoleRuntimeController(this);
        structure = new StructuralRuntimeController(this);
        behavior = new BehaviorRuntimeController(this);
        risk = new RiskRuntimeController(this);
        rule = new RuleRuntimeController(this);
    }
    
    public void setupModule(RuntimeViewpointModule module) {
        module.configure(this);
        module.setupData();
        module.setupIdentity();
        module.setupContext();
        module.setupTrust();
        module.setupRole();
        module.setupStructure();
        module.setupBehavior();
        module.setupRisk();
        module.setupRule();
    }
    
    public void startRuleHttpAdaptor() {
        // TODO: mechanism to dynamically register and load runtime components/extensions?
        adaptor = new RuleHttpAdaptor(this);
        adaptor.start();
    }
    
}
