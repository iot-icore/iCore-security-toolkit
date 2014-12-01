/**
 */
package behavior.type.impl;

import behavior.constraint.Constraint;

import behavior.type.AbstractDataProducerType;
import behavior.type.TypePackage;

import data.instantiation.DataInstantiation;

import identity.instantiation.IdentityInstantiation;

import java.util.Collection;

import models.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Abstract Data Producer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.type.impl.AbstractDataProducerTypeImpl#getDataInstantiations <em>Data Instantiations</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractDataProducerTypeImpl#getIdentityInstantiations <em>Identity Instantiations</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractDataProducerTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.type.impl.AbstractDataProducerTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDataProducerTypeImpl extends ElementImpl implements AbstractDataProducerType {
    /**
     * The cached value of the '{@link #getDataInstantiations() <em>Data Instantiations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataInstantiations()
     * @generated
     * @ordered
     */
    protected EList<DataInstantiation> dataInstantiations;

    /**
     * The cached value of the '{@link #getIdentityInstantiations() <em>Identity Instantiations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdentityInstantiations()
     * @generated
     * @ordered
     */
    protected EList<IdentityInstantiation> identityInstantiations;

    /**
     * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstraints()
     * @generated
     * @ordered
     */
    protected EList<Constraint> constraints;

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
    protected AbstractDataProducerTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ABSTRACT_DATA_PRODUCER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataInstantiation> getDataInstantiations() {
        if (dataInstantiations == null) {
            dataInstantiations = new EObjectContainmentEList<DataInstantiation>(DataInstantiation.class, this, TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS);
        }
        return dataInstantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityInstantiation> getIdentityInstantiations() {
        if (identityInstantiations == null) {
            identityInstantiations = new EObjectContainmentEList<IdentityInstantiation>(IdentityInstantiation.class, this, TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS);
        }
        return identityInstantiations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS);
        }
        return constraints;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS:
                return ((InternalEList<?>)getDataInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS:
                return ((InternalEList<?>)getIdentityInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS:
                return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS:
                return getDataInstantiations();
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS:
                return getIdentityInstantiations();
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS:
                return getConstraints();
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__NAME:
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
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS:
                getDataInstantiations().clear();
                getDataInstantiations().addAll((Collection<? extends DataInstantiation>)newValue);
                return;
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS:
                getIdentityInstantiations().clear();
                getIdentityInstantiations().addAll((Collection<? extends IdentityInstantiation>)newValue);
                return;
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS:
                getConstraints().clear();
                getConstraints().addAll((Collection<? extends Constraint>)newValue);
                return;
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__NAME:
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
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS:
                getDataInstantiations().clear();
                return;
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS:
                getIdentityInstantiations().clear();
                return;
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS:
                getConstraints().clear();
                return;
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__NAME:
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
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__DATA_INSTANTIATIONS:
                return dataInstantiations != null && !dataInstantiations.isEmpty();
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__IDENTITY_INSTANTIATIONS:
                return identityInstantiations != null && !identityInstantiations.isEmpty();
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__CONSTRAINTS:
                return constraints != null && !constraints.isEmpty();
            case TypePackage.ABSTRACT_DATA_PRODUCER_TYPE__NAME:
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

} //AbstractDataProducerTypeImpl
