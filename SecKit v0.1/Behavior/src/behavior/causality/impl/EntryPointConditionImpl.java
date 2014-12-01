/**
 */
package behavior.causality.impl;

import behavior.causality.CausalityPackage;
import behavior.causality.EntryPointCondition;

import behavior.instantiation.EntryPointOfInstantiation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.causality.impl.EntryPointConditionImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryPointConditionImpl extends PointConditionImpl implements EntryPointCondition {
    /**
     * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntry()
     * @generated
     * @ordered
     */
    protected EntryPointOfInstantiation entry;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntryPointConditionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CausalityPackage.Literals.ENTRY_POINT_CONDITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryPointOfInstantiation getEntry() {
        if (entry != null && entry.eIsProxy()) {
            InternalEObject oldEntry = (InternalEObject)entry;
            entry = (EntryPointOfInstantiation)eResolveProxy(oldEntry);
            if (entry != oldEntry) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, CausalityPackage.ENTRY_POINT_CONDITION__ENTRY, oldEntry, entry));
            }
        }
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryPointOfInstantiation basicGetEntry() {
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntry(EntryPointOfInstantiation newEntry) {
        EntryPointOfInstantiation oldEntry = entry;
        entry = newEntry;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CausalityPackage.ENTRY_POINT_CONDITION__ENTRY, oldEntry, entry));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CausalityPackage.ENTRY_POINT_CONDITION__ENTRY:
                if (resolve) return getEntry();
                return basicGetEntry();
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
            case CausalityPackage.ENTRY_POINT_CONDITION__ENTRY:
                setEntry((EntryPointOfInstantiation)newValue);
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
            case CausalityPackage.ENTRY_POINT_CONDITION__ENTRY:
                setEntry((EntryPointOfInstantiation)null);
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
            case CausalityPackage.ENTRY_POINT_CONDITION__ENTRY:
                return entry != null;
        }
        return super.eIsSet(featureID);
    }

} //EntryPointConditionImpl
