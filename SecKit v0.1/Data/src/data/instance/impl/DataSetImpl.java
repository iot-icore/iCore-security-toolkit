/**
 */
package data.instance.impl;

import data.instance.Data;
import data.instance.DataQuantity;
import data.instance.DataSet;
import data.instance.InstancePackage;

import java.util.Collection;

import models.Element;
import models.ModelsPackage;
import models.VisualElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.instance.impl.DataSetImpl#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link data.instance.impl.DataSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link data.instance.impl.DataSetImpl#getContainedData <em>Contained Data</em>}</li>
 *   <li>{@link data.instance.impl.DataSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link data.instance.impl.DataSetImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataSetImpl extends TaintTagImpl implements DataSet {
    /**
     * The cached value of the '{@link #getVisualElements() <em>Visual Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisualElements()
     * @generated
     * @ordered
     */
    protected EList<VisualElement> visualElements;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getContainedData() <em>Contained Data</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedData()
     * @generated
     * @ordered
     */
    protected EList<DataQuantity> containedData;

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
    protected DataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InstancePackage.Literals.DATA_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VisualElement> getVisualElements() {
        if (visualElements == null) {
            visualElements = new EObjectWithInverseResolvingEList<VisualElement>(VisualElement.class, this, InstancePackage.DATA_SET__VISUAL_ELEMENTS, ModelsPackage.VISUAL_ELEMENT__ELEMENT);
        }
        return visualElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA_SET__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataQuantity> getContainedData() {
        if (containedData == null) {
            containedData = new EObjectContainmentWithInverseEList<DataQuantity>(DataQuantity.class, this, InstancePackage.DATA_SET__CONTAINED_DATA, InstancePackage.DATA_QUANTITY__DATA_SET);
        }
        return containedData;
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
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA_SET__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Data getInstances() {
        if (eContainerFeatureID() != InstancePackage.DATA_SET__INSTANCES) return null;
        return (Data)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstances(Data newInstances, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInstances, InstancePackage.DATA_SET__INSTANCES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstances(Data newInstances) {
        if (newInstances != eInternalContainer() || (eContainerFeatureID() != InstancePackage.DATA_SET__INSTANCES && newInstances != null)) {
            if (EcoreUtil.isAncestor(this, newInstances))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInstances != null)
                msgs = ((InternalEObject)newInstances).eInverseAdd(this, InstancePackage.DATA__DATA_SET, Data.class, msgs);
            msgs = basicSetInstances(newInstances, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DATA_SET__INSTANCES, newInstances, newInstances));
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
            case InstancePackage.DATA_SET__VISUAL_ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisualElements()).basicAdd(otherEnd, msgs);
            case InstancePackage.DATA_SET__CONTAINED_DATA:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedData()).basicAdd(otherEnd, msgs);
            case InstancePackage.DATA_SET__INSTANCES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInstances((Data)otherEnd, msgs);
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
            case InstancePackage.DATA_SET__VISUAL_ELEMENTS:
                return ((InternalEList<?>)getVisualElements()).basicRemove(otherEnd, msgs);
            case InstancePackage.DATA_SET__CONTAINED_DATA:
                return ((InternalEList<?>)getContainedData()).basicRemove(otherEnd, msgs);
            case InstancePackage.DATA_SET__INSTANCES:
                return basicSetInstances(null, msgs);
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
            case InstancePackage.DATA_SET__INSTANCES:
                return eInternalContainer().eInverseRemove(this, InstancePackage.DATA__DATA_SET, Data.class, msgs);
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
            case InstancePackage.DATA_SET__VISUAL_ELEMENTS:
                return getVisualElements();
            case InstancePackage.DATA_SET__ID:
                return getId();
            case InstancePackage.DATA_SET__CONTAINED_DATA:
                return getContainedData();
            case InstancePackage.DATA_SET__NAME:
                return getName();
            case InstancePackage.DATA_SET__INSTANCES:
                return getInstances();
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
            case InstancePackage.DATA_SET__VISUAL_ELEMENTS:
                getVisualElements().clear();
                getVisualElements().addAll((Collection<? extends VisualElement>)newValue);
                return;
            case InstancePackage.DATA_SET__ID:
                setId((String)newValue);
                return;
            case InstancePackage.DATA_SET__CONTAINED_DATA:
                getContainedData().clear();
                getContainedData().addAll((Collection<? extends DataQuantity>)newValue);
                return;
            case InstancePackage.DATA_SET__NAME:
                setName((String)newValue);
                return;
            case InstancePackage.DATA_SET__INSTANCES:
                setInstances((Data)newValue);
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
            case InstancePackage.DATA_SET__VISUAL_ELEMENTS:
                getVisualElements().clear();
                return;
            case InstancePackage.DATA_SET__ID:
                setId(ID_EDEFAULT);
                return;
            case InstancePackage.DATA_SET__CONTAINED_DATA:
                getContainedData().clear();
                return;
            case InstancePackage.DATA_SET__NAME:
                setName(NAME_EDEFAULT);
                return;
            case InstancePackage.DATA_SET__INSTANCES:
                setInstances((Data)null);
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
            case InstancePackage.DATA_SET__VISUAL_ELEMENTS:
                return visualElements != null && !visualElements.isEmpty();
            case InstancePackage.DATA_SET__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case InstancePackage.DATA_SET__CONTAINED_DATA:
                return containedData != null && !containedData.isEmpty();
            case InstancePackage.DATA_SET__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case InstancePackage.DATA_SET__INSTANCES:
                return getInstances() != null;
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
        if (baseClass == Element.class) {
            switch (derivedFeatureID) {
                case InstancePackage.DATA_SET__VISUAL_ELEMENTS: return ModelsPackage.ELEMENT__VISUAL_ELEMENTS;
                case InstancePackage.DATA_SET__ID: return ModelsPackage.ELEMENT__ID;
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
        if (baseClass == Element.class) {
            switch (baseFeatureID) {
                case ModelsPackage.ELEMENT__VISUAL_ELEMENTS: return InstancePackage.DATA_SET__VISUAL_ELEMENTS;
                case ModelsPackage.ELEMENT__ID: return InstancePackage.DATA_SET__ID;
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //DataSetImpl
