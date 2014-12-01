/**
 */
package role.impl;

import java.util.Collection;
import models.impl.ModelImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import role.RoleDesignModel;
import role.RolePackage;
import role.RoleTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link role.impl.RoleDesignModelImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleDesignModelImpl extends ModelImpl implements RoleDesignModel {
    /**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
    protected EList<RoleTypePackage> packages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleDesignModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RolePackage.Literals.ROLE_DESIGN_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RoleTypePackage> getPackages() {
        if (packages == null) {
            packages = new EObjectContainmentWithInverseEList<RoleTypePackage>(RoleTypePackage.class, this, RolePackage.ROLE_DESIGN_MODEL__PACKAGES, RolePackage.ROLE_TYPE_PACKAGE__MODEL);
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
            case RolePackage.ROLE_DESIGN_MODEL__PACKAGES:
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
            case RolePackage.ROLE_DESIGN_MODEL__PACKAGES:
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
            case RolePackage.ROLE_DESIGN_MODEL__PACKAGES:
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
            case RolePackage.ROLE_DESIGN_MODEL__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends RoleTypePackage>)newValue);
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
            case RolePackage.ROLE_DESIGN_MODEL__PACKAGES:
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
            case RolePackage.ROLE_DESIGN_MODEL__PACKAGES:
                return packages != null && !packages.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RoleDesignModelImpl
