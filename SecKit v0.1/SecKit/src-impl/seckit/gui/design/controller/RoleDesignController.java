package seckit.gui.design.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import models.Model;
import identity.pattern.IdentityPattern;
import role.IdentityRolePattern;
import role.RoleDesignModel;
import role.RoleFactory;
import role.RolePattern;
import role.RoleType;
import role.RoleTypePackage;
import seckit.gui.Node;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import utils.ecore.ECoreUtils;

public class RoleDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(RoleDesignController.class);    

    public RoleTypePackageController pkg;
    public RoleTypeController type;
    public PatternController pattern;
    
    public RoleDesignController(DesignViewpointFactory design) {
        super("Role", design);
        //
        pkg = new RoleTypePackageController();
        type = new RoleTypeController();
        pattern = new PatternController();
    }

    public RoleDesignModel createModel(String desc) {
        RoleDesignModel model = RoleFactory.eINSTANCE.createRoleDesignModel();
        ECoreUtils.setup(model);
        model.setDescription(desc);
        design.viewpoint.getRoleDesignModels().add(model);
        return model;
    }

    public class RoleTypePackageController extends ElementController {
    
        public RoleTypePackage create(RoleDesignModel model, String name) {
            RoleTypePackage pkg = RoleFactory.eINSTANCE.createRoleTypePackage();
            ECoreUtils.setup(pkg);
            if (name == null) {
                name = "Package " + pkg.getId();
            }
            pkg.setName(name);
            model.getPackages().add(pkg);
            return pkg;
        }
        
        public boolean delete(RoleTypePackage pkg) {
            RoleDesignModel model = pkg.getModel();
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(pkg.getSubPackages(), msgs, "sub package");
            addMessage(pkg.getRoleTypes(), msgs, "role type");
            //
            if (msgs.size() > 0) {
                logger.debug("Can't delete package [" + pkg.getName() + "], it contains elements:");
                printMessages(logger, msgs);
                return false;
            }
            
            if (pkg.getSuperPackage() == null) {
                model.getPackages().remove(pkg);
            } else {
                pkg.getSuperPackage().getSubPackages().remove(pkg);
            }
            EcoreUtil.delete(pkg);
            return true;
        }
        
    }

    public class RoleTypeController extends ElementController {
        
        public RoleType create(RoleTypePackage pkg, String name, String[] superNames) {
            RoleType roleType = RoleFactory.eINSTANCE.createRoleType();
            ECoreUtils.setup(roleType);
            if (name == null) {
                name = "Role type " + roleType.getId();
            }
            roleType.setName(name);
            if (superNames != null) {
                for (String parentName : superNames) {
                    RoleType parentRole = find(pkg, parentName);
                    if (parentRole != null) {
                        roleType.getSuperRoles().add(parentRole);
                    }
                }
            }
            pkg.getRoleTypes().add(roleType);
            logger.debug("- Creating role type ["+name+"]");
            return roleType;
        }

        public void updateName(RoleType type, String newName) {
            if (newName != null) {
                logger.debug("- Updating role type name ["+type.getName()+"] to ["+newName+"]");
                type.setName(newName);
                // TODO: ?
                // reloadAllReferences(type);
            }
        }

        public boolean delete(RoleType type) {
            List<String> msgs = new ArrayList<String>();
            //
            addMessage(type.getSubRoles(), msgs, "sub role");
            //
            if (msgs.size() > 0) {
                logger.debug("Can't delete role type [" + type.getName() + "], is contains");
                printMessages(logger, msgs);
                return false;
            }
            //type.getSuperRoles().clear();'
            EcoreUtil.delete(type);
            return true;
        }
        
        public void addSubRole(RoleType superRole, RoleType subRole) {
            if (superRole != null && subRole != null) {
                logger.debug("- Adding sub role ["+subRole.getName()+"] to ["+superRole.getName()+"]");
                superRole.getSubRoles().add(subRole);
                
                // TODO: reload references?
            }
        }
        
        public boolean deleteSubRole(RoleType superRole, RoleType subRole) {
            if (superRole != null && subRole != null) {
                logger.debug("- Removing sub role ["+subRole.getName()+"] from ["+superRole.getName()+"]");
                superRole.getSubRoles().remove(subRole);
                return true;
            }
            return false;
        }
        
        public RoleType find(String name) {
            RoleType type = null;
            for (RoleDesignModel model : design.viewpoint.getRoleDesignModels()) {
                type = find(model, name);
                if (type != null) {
                    break;
                }
            }
            return type;
        }

        public RoleType find(RoleDesignModel model, String name) {
            RoleType type = null;
            for (RoleTypePackage pkg : model.getPackages()) {
                type = find(pkg, name);
                if (type != null)
                    return type;
            }
            return null;
        }

        public RoleType find(RoleTypePackage pkg, String name) {
            for (RoleType roleType : pkg.getRoleTypes()) {
                if (roleType.getName().equals(name)) {
                    return roleType;
                }
            }
            for (RoleTypePackage pkg2 : pkg.getSubPackages()) {
                RoleType roleType = find(pkg2, name);
                if (roleType != null) {
                    return roleType;
                }
            }
            logger.debug("Role type: [" + name + "] not found!");
            return null;
        }

        public boolean aIsAncestorOfb(RoleType a, RoleType b) {
            if (b.getSuperRoles().contains(a))
                return true;
            for (RoleType s : b.getSuperRoles()) {
                return aIsAncestorOfb(a, s);
            }
            return false;
        }
        
    }
    
    public class PatternController extends ElementController {

        public RolePattern createRolePattern(RoleType roleType) {
            RolePattern pattern = RoleFactory.eINSTANCE.createRolePattern();
            ECoreUtils.setup(pattern);
            pattern.setRoleType(roleType);
            return pattern;
        }

        public IdentityRolePattern createRoleIdentityPattern(RoleType roleType, IdentityPattern idPattern) {
            IdentityRolePattern pattern = RoleFactory.eINSTANCE.createIdentityRolePattern();
            ECoreUtils.setup(pattern);
            pattern.setRoleType(roleType);
            pattern.setIdentityPattern(idPattern);
            return pattern;
        }
        
    }
    
}
