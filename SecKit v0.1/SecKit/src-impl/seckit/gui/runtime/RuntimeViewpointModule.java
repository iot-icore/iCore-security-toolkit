package seckit.gui.runtime;

import seckit.gui.design.DesignViewpointFactory;
import seckit.gui.runtime.controller.BehaviorRuntimeController;
import seckit.gui.runtime.controller.ContextRuntimeController;
import seckit.gui.runtime.controller.DataRuntimeController;
import seckit.gui.runtime.controller.IdentityRuntimeController;
import seckit.gui.runtime.controller.RiskRuntimeController;
import seckit.gui.runtime.controller.RoleRuntimeController;
import seckit.gui.runtime.controller.RuleRuntimeController;
import seckit.gui.runtime.controller.StructuralRuntimeController;
import seckit.gui.runtime.controller.TrustRuntimeController;

public abstract class RuntimeViewpointModule {
    
    public RuntimeViewpointFactory runtime;
    public DesignViewpointFactory design;
    
    public DataRuntimeController data;
    public IdentityRuntimeController identity;
    public RoleRuntimeController role;
    public ContextRuntimeController context;
    public TrustRuntimeController trust;
    public StructuralRuntimeController structure;
    public BehaviorRuntimeController behavior;
    public RiskRuntimeController risk;
    public RuleRuntimeController rule;

    public void configure(RuntimeViewpointFactory runtime) {
        this.runtime = runtime;
        data = runtime.data;
        identity = runtime.identity;
        role = runtime.role;
        context = runtime.context;
        trust = runtime.trust;
        structure = runtime.structure;
        behavior = runtime.behavior;
        risk = runtime.risk;
        rule  = runtime.rule;
    }
    
    public abstract void setupData();
    public abstract void setupIdentity();
    public abstract void setupContext();
    public abstract void setupTrust();
    public abstract void setupRole();
    public abstract void setupStructure();
    public abstract void setupBehavior();
    public abstract void setupRisk();
    public abstract void setupRule();
    
}
