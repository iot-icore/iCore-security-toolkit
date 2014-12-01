/**
 */
package data.type.impl;

import data.type.LeadUnit;
import data.type.TextEncoding;
import data.type.TypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Encoding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.type.impl.TextEncodingImpl#getSingletons <em>Singletons</em>}</li>
 *   <li>{@link data.type.impl.TextEncodingImpl#getLeadUnits <em>Lead Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextEncodingImpl extends EncodingImpl implements TextEncoding {
    /**
     * The default value of the '{@link #getSingletons() <em>Singletons</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSingletons()
     * @generated
     * @ordered
     */
    protected static final byte[] SINGLETONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSingletons() <em>Singletons</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSingletons()
     * @generated
     * @ordered
     */
    protected byte[] singletons = SINGLETONS_EDEFAULT;

    /**
     * The cached value of the '{@link #getLeadUnits() <em>Lead Units</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeadUnits()
     * @generated
     * @ordered
     */
    protected EList<LeadUnit> leadUnits;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextEncodingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.TEXT_ENCODING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public byte[] getSingletons() {
        return singletons;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSingletons(byte[] newSingletons) {
        byte[] oldSingletons = singletons;
        singletons = newSingletons;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.TEXT_ENCODING__SINGLETONS, oldSingletons, singletons));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LeadUnit> getLeadUnits() {
        if (leadUnits == null) {
            leadUnits = new EObjectContainmentEList<LeadUnit>(LeadUnit.class, this, TypePackage.TEXT_ENCODING__LEAD_UNITS);
        }
        return leadUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.TEXT_ENCODING__LEAD_UNITS:
                return ((InternalEList<?>)getLeadUnits()).basicRemove(otherEnd, msgs);
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
            case TypePackage.TEXT_ENCODING__SINGLETONS:
                return getSingletons();
            case TypePackage.TEXT_ENCODING__LEAD_UNITS:
                return getLeadUnits();
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
            case TypePackage.TEXT_ENCODING__SINGLETONS:
                setSingletons((byte[])newValue);
                return;
            case TypePackage.TEXT_ENCODING__LEAD_UNITS:
                getLeadUnits().clear();
                getLeadUnits().addAll((Collection<? extends LeadUnit>)newValue);
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
            case TypePackage.TEXT_ENCODING__SINGLETONS:
                setSingletons(SINGLETONS_EDEFAULT);
                return;
            case TypePackage.TEXT_ENCODING__LEAD_UNITS:
                getLeadUnits().clear();
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
            case TypePackage.TEXT_ENCODING__SINGLETONS:
                return SINGLETONS_EDEFAULT == null ? singletons != null : !SINGLETONS_EDEFAULT.equals(singletons);
            case TypePackage.TEXT_ENCODING__LEAD_UNITS:
                return leadUnits != null && !leadUnits.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (singletons: ");
        result.append(singletons);
        result.append(')');
        return result.toString();
    }

} //TextEncodingImpl
