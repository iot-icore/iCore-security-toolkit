/**
 */
package behavior.instance.impl;

import behavior.instance.Activity;
import behavior.instance.Behavior;
import behavior.instance.DataProducerInstance;
import behavior.instance.InstancePackage;
import data.instance.Data;
import identity.instance.AbstractIdentity;
import java.util.Collection;
import models.impl.ElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instance.impl.ActivityImpl#getData <em>Data</em>}</li>
 *   <li>{@link behavior.instance.impl.ActivityImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link behavior.instance.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instance.impl.ActivityImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityImpl extends ElementImpl implements Activity {
    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected EList<Data> data;

    /**
     * The cached value of the '{@link #getIdentities() <em>Identities</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentities()
     * @generated
     * @ordered
     */
    protected EList<AbstractIdentity> identities;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.ACTIVITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Data> getData() {
        if (data == null) {
            data = new EObjectResolvingEList<Data>(Data.class, this, InstancePackage.ACTIVITY__DATA);
        }
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractIdentity> getIdentities() {
        if (identities == null) {
            identities = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstancePackage.ACTIVITY__IDENTITIES);
        }
        return identities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getBehavior() {
        if (eContainerFeatureID() != InstancePackage.ACTIVITY__BEHAVIOR) return null;
        return (Behavior)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newBehavior, InstancePackage.ACTIVITY__BEHAVIOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehavior(Behavior newBehavior) {
        if (newBehavior != eInternalContainer() || (eContainerFeatureID() != InstancePackage.ACTIVITY__BEHAVIOR && newBehavior != null)) {
            if (EcoreUtil.isAncestor(this, newBehavior))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBehavior != null)
                msgs = ((InternalEObject)newBehavior).eInverseAdd(this, InstancePackage.BEHAVIOR__ACTIVITIES, Behavior.class, msgs);
            msgs = basicSetBehavior(newBehavior, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ACTIVITY__BEHAVIOR, newBehavior, newBehavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case InstancePackage.ACTIVITY__BEHAVIOR:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBehavior((Behavior)otherEnd, msgs);
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
            case InstancePackage.ACTIVITY__BEHAVIOR:
                return basicSetBehavior(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case InstancePackage.ACTIVITY__BEHAVIOR:
                return eInternalContainer().eInverseRemove(this, InstancePackage.BEHAVIOR__ACTIVITIES, Behavior.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.ACTIVITY__DATA:
                return getData();
            case InstancePackage.ACTIVITY__IDENTITIES:
                return getIdentities();
            case InstancePackage.ACTIVITY__NAME:
                return getName();
            case InstancePackage.ACTIVITY__BEHAVIOR:
                return getBehavior();
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
            case InstancePackage.ACTIVITY__DATA:
                getData().clear();
                getData().addAll((Collection<? extends Data>)newValue);
                return;
            case InstancePackage.ACTIVITY__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case InstancePackage.ACTIVITY__NAME:
                setName((String)newValue);
                return;
            case InstancePackage.ACTIVITY__BEHAVIOR:
                setBehavior((Behavior)newValue);
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
            case InstancePackage.ACTIVITY__DATA:
                getData().clear();
                return;
            case InstancePackage.ACTIVITY__IDENTITIES:
                getIdentities().clear();
                return;
            case InstancePackage.ACTIVITY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstancePackage.ACTIVITY__BEHAVIOR:
                setBehavior((Behavior)null);
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
            case InstancePackage.ACTIVITY__DATA:
                return data != null && !data.isEmpty();
            case InstancePackage.ACTIVITY__IDENTITIES:
                return identities != null && !identities.isEmpty();
            case InstancePackage.ACTIVITY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstancePackage.ACTIVITY__BEHAVIOR:
                return getBehavior() != null;
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
        if (baseClass == DataProducerInstance.class) {
            switch (derivedFeatureID) {
                case InstancePackage.ACTIVITY__DATA: return InstancePackage.DATA_PRODUCER_INSTANCE__DATA;
                case InstancePackage.ACTIVITY__IDENTITIES: return InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES;
                case InstancePackage.ACTIVITY__NAME: return InstancePackage.DATA_PRODUCER_INSTANCE__NAME;
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
        if (baseClass == DataProducerInstance.class) {
            switch (baseFeatureID) {
                case InstancePackage.DATA_PRODUCER_INSTANCE__DATA: return InstancePackage.ACTIVITY__DATA;
                case InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES: return InstancePackage.ACTIVITY__IDENTITIES;
                case InstancePackage.DATA_PRODUCER_INSTANCE__NAME: return InstancePackage.ACTIVITY__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ActivityImpl
