/**
 */
package context.type.impl;

import context.type.CompositeContextSituationType;
import context.type.SituationRoleType;
import context.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Context Situation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.type.impl.CompositeContextSituationTypeImpl#getSituationRoleTypes <em>Situation Role Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeContextSituationTypeImpl extends ContextSituationTypeImpl implements CompositeContextSituationType {
    /**
     * The cached value of the '{@link #getSituationRoleTypes() <em>Situation Role Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituationRoleTypes()
     * @generated
     * @ordered
     */
    protected EList<SituationRoleType> situationRoleTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompositeContextSituationTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.COMPOSITE_CONTEXT_SITUATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SituationRoleType> getSituationRoleTypes() {
        if (situationRoleTypes == null) {
            situationRoleTypes = new EObjectContainmentEList<SituationRoleType>(SituationRoleType.class, this, TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES);
        }
        return situationRoleTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES:
                return ((InternalEList<?>)getSituationRoleTypes()).basicRemove(otherEnd, msgs);
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
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES:
                return getSituationRoleTypes();
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
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES:
                getSituationRoleTypes().clear();
                getSituationRoleTypes().addAll((Collection<? extends SituationRoleType>)newValue);
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
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES:
                getSituationRoleTypes().clear();
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
            case TypePackage.COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES:
                return situationRoleTypes != null && !situationRoleTypes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CompositeContextSituationTypeImpl
