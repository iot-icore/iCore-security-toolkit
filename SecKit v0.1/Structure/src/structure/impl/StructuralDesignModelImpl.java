/**
 */
package structure.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.StructuralDesignModel;
import structure.StructurePackage;

import structure.instantiation.EntityInstantiation;

import structure.type.EntityTypePackage;
import structure.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Design Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.impl.StructuralDesignModelImpl#getEntityTypePackages <em>Entity Type Packages</em>}</li>
 *   <li>{@link structure.impl.StructuralDesignModelImpl#getAllowedEntityInstantiations <em>Allowed Entity Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralDesignModelImpl extends ModelImpl implements StructuralDesignModel {
    /**
     * The cached value of the '{@link #getEntityTypePackages() <em>Entity Type Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityTypePackages()
     * @generated
     * @ordered
     */
    protected EList<EntityTypePackage> entityTypePackages;

    /**
     * The cached value of the '{@link #getAllowedEntityInstantiations() <em>Allowed Entity Instantiations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllowedEntityInstantiations()
     * @generated
     * @ordered
     */
    protected EList<EntityInstantiation> allowedEntityInstantiations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuralDesignModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StructurePackage.Literals.STRUCTURAL_DESIGN_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityTypePackage> getEntityTypePackages() {
        if (entityTypePackages == null) {
            entityTypePackages = new EObjectContainmentWithInverseEList<EntityTypePackage>(EntityTypePackage.class, this, StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES, TypePackage.ENTITY_TYPE_PACKAGE__MODEL);
        }
        return entityTypePackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityInstantiation> getAllowedEntityInstantiations() {
        if (allowedEntityInstantiations == null) {
            allowedEntityInstantiations = new EObjectContainmentEList<EntityInstantiation>(EntityInstantiation.class, this, StructurePackage.STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS);
        }
        return allowedEntityInstantiations;
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityTypePackages()).basicAdd(otherEnd, msgs);
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES:
                return ((InternalEList<?>)getEntityTypePackages()).basicRemove(otherEnd, msgs);
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS:
                return ((InternalEList<?>)getAllowedEntityInstantiations()).basicRemove(otherEnd, msgs);
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES:
                return getEntityTypePackages();
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS:
                return getAllowedEntityInstantiations();
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES:
                getEntityTypePackages().clear();
                getEntityTypePackages().addAll((Collection<? extends EntityTypePackage>)newValue);
                return;
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS:
                getAllowedEntityInstantiations().clear();
                getAllowedEntityInstantiations().addAll((Collection<? extends EntityInstantiation>)newValue);
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES:
                getEntityTypePackages().clear();
                return;
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS:
                getAllowedEntityInstantiations().clear();
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES:
                return entityTypePackages != null && !entityTypePackages.isEmpty();
            case StructurePackage.STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS:
                return allowedEntityInstantiations != null && !allowedEntityInstantiations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StructuralDesignModelImpl
