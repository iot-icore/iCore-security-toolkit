/**
 */
package rule.template.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.template.RuleInstance;
import rule.template.RuleInstanceVariable;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Instance Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleInstanceVariableImpl#getMechanismInstance <em>Mechanism Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleInstanceVariableImpl extends RuleVariableImpl implements RuleInstanceVariable {
    /**
     * The cached value of the '{@link #getMechanismInstance() <em>Mechanism Instance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechanismInstance()
     * @generated
     * @ordered
     */
    protected RuleInstance mechanismInstance;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleInstanceVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_INSTANCE_VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance getMechanismInstance() {
        if (mechanismInstance != null && mechanismInstance.eIsProxy()) {
            InternalEObject oldMechanismInstance = (InternalEObject)mechanismInstance;
            mechanismInstance = (RuleInstance)eResolveProxy(oldMechanismInstance);
            if (mechanismInstance != oldMechanismInstance) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE, oldMechanismInstance, mechanismInstance));
            }
        }
        return mechanismInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance basicGetMechanismInstance() {
        return mechanismInstance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMechanismInstance(RuleInstance newMechanismInstance) {
        RuleInstance oldMechanismInstance = mechanismInstance;
        mechanismInstance = newMechanismInstance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE, oldMechanismInstance, mechanismInstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE:
                if (resolve) return getMechanismInstance();
                return basicGetMechanismInstance();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE:
                setMechanismInstance((RuleInstance)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE:
                setMechanismInstance((RuleInstance)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TemplatePackage.RULE_INSTANCE_VARIABLE__MECHANISM_INSTANCE:
                return mechanismInstance != null;
        }
        return super.eIsSet(featureID);
    }

} //RuleInstanceVariableImpl
