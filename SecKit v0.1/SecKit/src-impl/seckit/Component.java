package seckit;

import identity.IdentityPackage;
import models.ModelsPackage;

import org.apache.log4j.Logger;

import role.RolePackage;
import rule.RulePackage;
import time.TimePackage;
import trust.TrustPackage;
import utils.ecore.ECoreUtils;
import behavior.BehaviorPackage;
import data.DataPackage;
import seckit.SeckitPackage;
import structure.StructurePackage;

public class Component {

    protected static Logger logger = Logger.getLogger(Component.class.getName());

    static {
        ECoreUtils.register(ModelsPackage.eINSTANCE);
        ECoreUtils.register(TimePackage.eINSTANCE);
        ECoreUtils.register(DataPackage.eINSTANCE);
        ECoreUtils.register(BehaviorPackage.eINSTANCE);
        ECoreUtils.register(StructurePackage.eINSTANCE);
        ECoreUtils.register(IdentityPackage.eINSTANCE);
        ECoreUtils.register(RolePackage.eINSTANCE);
        ECoreUtils.register(RulePackage.eINSTANCE);
        ECoreUtils.register(TrustPackage.eINSTANCE);
        ECoreUtils.register(SeckitPackage.eINSTANCE);
    }

}
