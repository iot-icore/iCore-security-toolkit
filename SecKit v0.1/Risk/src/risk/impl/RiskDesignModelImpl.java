/**
 */
package risk.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.RiskDesignModel;
import risk.RiskPackage;

import risk.type.RiskTypePackage;
import risk.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.impl.RiskDesignModelImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskDesignModelImpl extends ModelImpl implements RiskDesignModel {
    /**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
    protected EList<RiskTypePackage> packages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RiskDesignModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RiskPackage.Literals.RISK_DESIGN_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiskTypePackage> getPackages() {
        if (packages == null) {
            packages = new EObjectContainmentWithInverseEList<RiskTypePackage>(RiskTypePackage.class, this, RiskPackage.RISK_DESIGN_MODEL__PACKAGES, TypePackage.RISK_TYPE_PACKAGE__MODEL);
        }
        return packages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RiskPackage.RISK_DESIGN_MODEL__PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RiskPackage.RISK_DESIGN_MODEL__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RiskPackage.RISK_DESIGN_MODEL__PACKAGES:
                return getPackages();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RiskPackage.RISK_DESIGN_MODEL__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends RiskTypePackage>)newValue);
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
            case RiskPackage.RISK_DESIGN_MODEL__PACKAGES:
                getPackages().clear();
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
            case RiskPackage.RISK_DESIGN_MODEL__PACKAGES:
                return packages != null && !packages.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RiskDesignModelImpl
