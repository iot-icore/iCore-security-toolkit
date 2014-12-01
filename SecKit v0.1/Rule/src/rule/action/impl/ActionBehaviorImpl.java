/**
 */
package rule.action.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.ecore.EClass;

import rule.action.ActionBehavior;
import rule.action.ActionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ActionBehaviorImpl extends ElementImpl implements ActionBehavior {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionBehaviorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.ACTION_BEHAVIOR;
    }

} //ActionBehaviorImpl
