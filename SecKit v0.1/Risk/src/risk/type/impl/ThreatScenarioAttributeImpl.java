/**
 */
package risk.type.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import risk.type.AttributeModality;
import risk.type.ThreatScenarioAttribute;
import risk.type.TypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Scenario Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.ThreatScenarioAttributeImpl#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreatScenarioAttributeImpl extends MinimalEObjectImpl.Container implements ThreatScenarioAttribute {
    /**
     * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModality()
     * @generated
     * @ordered
     */
    protected static final AttributeModality MODALITY_EDEFAULT = AttributeModality.REQUIRED;

    /**
     * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModality()
     * @generated
     * @ordered
     */
    protected AttributeModality modality = MODALITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThreatScenarioAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.THREAT_SCENARIO_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeModality getModality() {
        return modality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModality(AttributeModality newModality) {
        AttributeModality oldModality = modality;
        modality = newModality == null ? MODALITY_EDEFAULT : newModality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO_ATTRIBUTE__MODALITY, oldModality, modality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.THREAT_SCENARIO_ATTRIBUTE__MODALITY:
                return getModality();
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
            case TypePackage.THREAT_SCENARIO_ATTRIBUTE__MODALITY:
                setModality((AttributeModality)newValue);
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
            case TypePackage.THREAT_SCENARIO_ATTRIBUTE__MODALITY:
                setModality(MODALITY_EDEFAULT);
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
            case TypePackage.THREAT_SCENARIO_ATTRIBUTE__MODALITY:
                return modality != MODALITY_EDEFAULT;
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
        result.append(" (modality: ");
        result.append(modality);
        result.append(')');
        return result.toString();
    }

} //ThreatScenarioAttributeImpl
