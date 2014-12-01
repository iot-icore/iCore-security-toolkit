/**
 */
package risk.type.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import risk.type.Threat;
import risk.type.TypePackage;

import structure.instantiation.EntityInstantiationReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.ThreatImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.impl.ThreatImpl#getEntityInstantiation <em>Entity Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreatImpl extends ElementImpl implements Threat {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getEntityInstantiation() <em>Entity Instantiation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityInstantiation()
     * @generated
     * @ordered
     */
    protected EntityInstantiationReference entityInstantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ThreatImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.THREAT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationReference getEntityInstantiation() {
        return entityInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntityInstantiation(EntityInstantiationReference newEntityInstantiation, NotificationChain msgs) {
        EntityInstantiationReference oldEntityInstantiation = entityInstantiation;
        entityInstantiation = newEntityInstantiation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.THREAT__ENTITY_INSTANTIATION, oldEntityInstantiation, newEntityInstantiation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityInstantiation(EntityInstantiationReference newEntityInstantiation) {
        if (newEntityInstantiation != entityInstantiation) {
            NotificationChain msgs = null;
            if (entityInstantiation != null)
                msgs = ((InternalEObject)entityInstantiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.THREAT__ENTITY_INSTANTIATION, null, msgs);
            if (newEntityInstantiation != null)
                msgs = ((InternalEObject)newEntityInstantiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.THREAT__ENTITY_INSTANTIATION, null, msgs);
            msgs = basicSetEntityInstantiation(newEntityInstantiation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT__ENTITY_INSTANTIATION, newEntityInstantiation, newEntityInstantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.THREAT__ENTITY_INSTANTIATION:
                return basicSetEntityInstantiation(null, msgs);
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
            case TypePackage.THREAT__DESCRIPTION:
                return getDescription();
            case TypePackage.THREAT__ENTITY_INSTANTIATION:
                return getEntityInstantiation();
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
            case TypePackage.THREAT__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TypePackage.THREAT__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiationReference)newValue);
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
            case TypePackage.THREAT__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TypePackage.THREAT__ENTITY_INSTANTIATION:
                setEntityInstantiation((EntityInstantiationReference)null);
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
            case TypePackage.THREAT__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TypePackage.THREAT__ENTITY_INSTANTIATION:
                return entityInstantiation != null;
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
        result.append(" (description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //ThreatImpl
