/**
 */
package identity.pattern.impl;

import data.pattern.impl.DataPatternImpl;

import identity.IdentityAttributeVariable;

import identity.pattern.IdentityAttributePattern;
import identity.pattern.PatternPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Attribute Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.pattern.impl.IdentityAttributePatternImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityAttributePatternImpl extends DataPatternImpl implements IdentityAttributePattern {
    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected IdentityAttributeVariable variable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityAttributePatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.IDENTITY_ATTRIBUTE_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAttributeVariable getVariable() {
        if (variable != null && variable.eIsProxy()) {
            InternalEObject oldVariable = (InternalEObject)variable;
            variable = (IdentityAttributeVariable)eResolveProxy(oldVariable);
            if (variable != oldVariable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.IDENTITY_ATTRIBUTE_PATTERN__VARIABLE, oldVariable, variable));
            }
        }
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityAttributeVariable basicGetVariable() {
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVariable(IdentityAttributeVariable newVariable) {
        IdentityAttributeVariable oldVariable = variable;
        variable = newVariable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_ATTRIBUTE_PATTERN__VARIABLE, oldVariable, variable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PatternPackage.IDENTITY_ATTRIBUTE_PATTERN__VARIABLE:
                if (resolve) return getVariable();
                return basicGetVariable();
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
            case PatternPackage.IDENTITY_ATTRIBUTE_PATTERN__VARIABLE:
                setVariable((IdentityAttributeVariable)newValue);
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
            case PatternPackage.IDENTITY_ATTRIBUTE_PATTERN__VARIABLE:
                setVariable((IdentityAttributeVariable)null);
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
            case PatternPackage.IDENTITY_ATTRIBUTE_PATTERN__VARIABLE:
                return variable != null;
        }
        return super.eIsSet(featureID);
    }

} //IdentityAttributePatternImpl
