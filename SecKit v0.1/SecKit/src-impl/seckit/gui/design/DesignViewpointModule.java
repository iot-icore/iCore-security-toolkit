package seckit.gui.design;

import org.apache.log4j.Logger;

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

public abstract class DesignViewpointModule {
    
    protected static Logger logger = Logger.getLogger(DesignViewpointModule.class);
    
    DesignViewpointFactory design;
    
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

    public void configure(DesignViewpointFactory design) {
        this.design = design;
        time = design.time;
        data = design.data;
        identity = design.identity;
        role = design.role;
        context = design.context;
        trust = design.trust;
        structure = design.structure;
        behavior = design.behavior;
        rule  = design.rule;
        risk = design.risk;
    }
 
    public abstract void setupData();
    public abstract void setupIdentity();
    public abstract void setupContext();
    public abstract void setupTrust();
    public abstract void setupRole();
    public abstract void setupStructure();
    public abstract void setupBehavior();
    public abstract void setupRule();
    public abstract void setupRisk();
    
}
