/**
 */
package behavior.constraint.impl;

import behavior.constraint.ConstraintPackage;
import behavior.constraint.IdentityEstablishmentFromVariable;
import behavior.constraint.VariableEstablishment;

import models.variable.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Establishment From Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.constraint.impl.IdentityEstablishmentFromVariableImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityEstablishmentFromVariableImpl extends IdentityEstablishmentImpl implements IdentityEstablishmentFromVariable {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected VariableDeclaration source;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityEstablishmentFromVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConstraintPackage.Literals.IDENTITY_ESTABLISHMENT_FROM_VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableDeclaration getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (VariableDeclaration)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableDeclaration basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(VariableDeclaration newSource) {
        VariableDeclaration oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
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
            case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE:
                setSource((VariableDeclaration)newValue);
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
            case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE:
                setSource((VariableDeclaration)null);
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
            case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE:
                return source != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == VariableEstablishment.class) {
            switch (derivedFeatureID) {
                case ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE: return ConstraintPackage.VARIABLE_ESTABLISHMENT__SOURCE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == VariableEstablishment.class) {
            switch (baseFeatureID) {
                case ConstraintPackage.VARIABLE_ESTABLISHMENT__SOURCE: return ConstraintPackage.IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //IdentityEstablishmentFromVariableImpl
