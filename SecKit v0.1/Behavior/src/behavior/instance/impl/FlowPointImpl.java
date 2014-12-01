/**
 */
package behavior.instance.impl;

import behavior.instance.DataProducerInstance;
import behavior.instance.FlowPoint;
import behavior.instance.InstancePackage;
import behavior.instantiation.FlowPointOfInstantiation;
import data.instance.Data;
import identity.instance.AbstractIdentity;
import java.util.Collection;
import models.impl.ElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instance.impl.FlowPointImpl#getData <em>Data</em>}</li>
 *   <li>{@link behavior.instance.impl.FlowPointImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link behavior.instance.impl.FlowPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link behavior.instance.impl.FlowPointImpl#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowPointImpl extends ElementImpl implements FlowPoint {
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
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected FlowPointOfInstantiation instantiation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FlowPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.FLOW_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Data> getData() {
        if (data == null) {
            data = new EObjectResolvingEList<Data>(Data.class, this, InstancePackage.FLOW_POINT__DATA);
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
            identities = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstancePackage.FLOW_POINT__IDENTITIES);
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_POINT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointOfInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (FlowPointOfInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.FLOW_POINT__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowPointOfInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(FlowPointOfInstantiation newInstantiation) {
        FlowPointOfInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.FLOW_POINT__INSTANTIATION, oldInstantiation, instantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.FLOW_POINT__DATA:
                return getData();
            case InstancePackage.FLOW_POINT__IDENTITIES:
                return getIdentities();
            case InstancePackage.FLOW_POINT__NAME:
                return getName();
            case InstancePackage.FLOW_POINT__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
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
            case InstancePackage.FLOW_POINT__DATA:
                getData().clear();
                getData().addAll((Collection<? extends Data>)newValue);
                return;
            case InstancePackage.FLOW_POINT__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case InstancePackage.FLOW_POINT__NAME:
                setName((String)newValue);
                return;
            case InstancePackage.FLOW_POINT__INSTANTIATION:
                setInstantiation((FlowPointOfInstantiation)newValue);
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
            case InstancePackage.FLOW_POINT__DATA:
                getData().clear();
                return;
            case InstancePackage.FLOW_POINT__IDENTITIES:
                getIdentities().clear();
                return;
            case InstancePackage.FLOW_POINT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstancePackage.FLOW_POINT__INSTANTIATION:
                setInstantiation((FlowPointOfInstantiation)null);
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
            case InstancePackage.FLOW_POINT__DATA:
                return data != null && !data.isEmpty();
            case InstancePackage.FLOW_POINT__IDENTITIES:
                return identities != null && !identities.isEmpty();
            case InstancePackage.FLOW_POINT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstancePackage.FLOW_POINT__INSTANTIATION:
                return instantiation != null;
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
                case InstancePackage.FLOW_POINT__DATA: return InstancePackage.DATA_PRODUCER_INSTANCE__DATA;
                case InstancePackage.FLOW_POINT__IDENTITIES: return InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES;
                case InstancePackage.FLOW_POINT__NAME: return InstancePackage.DATA_PRODUCER_INSTANCE__NAME;
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
                case InstancePackage.DATA_PRODUCER_INSTANCE__DATA: return InstancePackage.FLOW_POINT__DATA;
                case InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES: return InstancePackage.FLOW_POINT__IDENTITIES;
                case InstancePackage.DATA_PRODUCER_INSTANCE__NAME: return InstancePackage.FLOW_POINT__NAME;
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

} //FlowPointImpl
