/**
 */
package data.variable.impl;

import data.variable.DataTypeAssignment;
import data.variable.VariablePackage;

import models.variable.impl.StaticAssignmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.variable.impl.DataTypeAssignmentImpl#getEType <em>EType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeAssignmentImpl extends StaticAssignmentImpl implements DataTypeAssignment {
    /**
     * The cached value of the '{@link #getEType() <em>EType</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEType()
     * @generated
     * @ordered
     */
    protected EClassifier eType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypeAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.DATA_TYPE_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassifier getEType() {
        if (eType != null && eType.eIsProxy()) {
            InternalEObject oldEType = (InternalEObject)eType;
            eType = (EClassifier)eResolveProxy(oldEType);
            if (eType != oldEType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariablePackage.DATA_TYPE_ASSIGNMENT__ETYPE, oldEType, eType));
            }
        }
        return eType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassifier basicGetEType() {
        return eType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEType(EClassifier newEType) {
        EClassifier oldEType = eType;
        eType = newEType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.DATA_TYPE_ASSIGNMENT__ETYPE, oldEType, eType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VariablePackage.DATA_TYPE_ASSIGNMENT__ETYPE:
                if (resolve) return getEType();
                return basicGetEType();
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
            case VariablePackage.DATA_TYPE_ASSIGNMENT__ETYPE:
                setEType((EClassifier)newValue);
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
            case VariablePackage.DATA_TYPE_ASSIGNMENT__ETYPE:
                setEType((EClassifier)null);
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
            case VariablePackage.DATA_TYPE_ASSIGNMENT__ETYPE:
                return eType != null;
        }
        return super.eIsSet(featureID);
    }

} //DataTypeAssignmentImpl
