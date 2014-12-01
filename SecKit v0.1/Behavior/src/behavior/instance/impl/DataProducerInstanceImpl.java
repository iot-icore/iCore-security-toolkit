/**
 */
package behavior.instance.impl;

import behavior.instance.DataProducerInstance;
import behavior.instance.InstancePackage;
import data.instance.Data;
import identity.instance.AbstractIdentity;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Producer Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.instance.impl.DataProducerInstanceImpl#getData <em>Data</em>}</li>
 *   <li>{@link behavior.instance.impl.DataProducerInstanceImpl#getIdentities <em>Identities</em>}</li>
 *   <li>{@link behavior.instance.impl.DataProducerInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataProducerInstanceImpl extends MinimalEObjectImpl.Container implements DataProducerInstance {
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
    protected DataProducerInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.DATA_PRODUCER_INSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Data> getData() {
        if (data == null) {
            data = new EObjectResolvingEList<Data>(Data.class, this, InstancePackage.DATA_PRODUCER_INSTANCE__DATA);
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
            identities = new EObjectResolvingEList<AbstractIdentity>(AbstractIdentity.class, this, InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES);
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA_PRODUCER_INSTANCE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case InstancePackage.DATA_PRODUCER_INSTANCE__DATA:
                return getData();
            case InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES:
                return getIdentities();
            case InstancePackage.DATA_PRODUCER_INSTANCE__NAME:
                return getName();
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
            case InstancePackage.DATA_PRODUCER_INSTANCE__DATA:
                getData().clear();
                getData().addAll((Collection<? extends Data>)newValue);
                return;
            case InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES:
                getIdentities().clear();
                getIdentities().addAll((Collection<? extends AbstractIdentity>)newValue);
                return;
            case InstancePackage.DATA_PRODUCER_INSTANCE__NAME:
                setName((String)newValue);
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
            case InstancePackage.DATA_PRODUCER_INSTANCE__DATA:
                getData().clear();
                return;
            case InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES:
                getIdentities().clear();
                return;
            case InstancePackage.DATA_PRODUCER_INSTANCE__NAME:
                setName(NAME_EDEFAULT);
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
            case InstancePackage.DATA_PRODUCER_INSTANCE__DATA:
                return data != null && !data.isEmpty();
            case InstancePackage.DATA_PRODUCER_INSTANCE__IDENTITIES:
                return identities != null && !identities.isEmpty();
            case InstancePackage.DATA_PRODUCER_INSTANCE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //DataProducerInstanceImpl
