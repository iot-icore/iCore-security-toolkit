/**
 */
package identity.type.impl;

import identity.instantiation.IdentityInstantiation;
import identity.instantiation.InstantiationPackage;

import identity.type.DigitalIdentityType;
import identity.type.IdentityAttributeInstantiation;
import identity.type.IdentityType;
import identity.type.IdentityTypePackage;
import identity.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

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
 * An implementation of the model object '<em><b>Digital Identity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.type.impl.DigitalIdentityTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link identity.type.impl.DigitalIdentityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link identity.type.impl.DigitalIdentityTypeImpl#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link identity.type.impl.DigitalIdentityTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link identity.type.impl.DigitalIdentityTypeImpl#getAttributeInstantiations <em>Attribute Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DigitalIdentityTypeImpl extends ElementImpl implements DigitalIdentityType {
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
     * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiations()
     * @generated
     * @ordered
     */
    protected EList<IdentityInstantiation> instantiations;

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
     * The cached value of the '{@link #getAttributeInstantiations() <em>Attribute Instantiations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeInstantiations()
     * @generated
     * @ordered
     */
    protected EList<IdentityAttributeInstantiation> attributeInstantiations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DigitalIdentityTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.DIGITAL_IDENTITY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityTypePackage getPackage() {
        if (eContainerFeatureID() != TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE) return null;
        return (IdentityTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(IdentityTypePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(IdentityTypePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES, IdentityTypePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE, newPackage, newPackage));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DIGITAL_IDENTITY_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityInstantiation> getInstantiations() {
        if (instantiations == null) {
            instantiations = new EObjectWithInverseResolvingEList<IdentityInstantiation>(IdentityInstantiation.class, this, TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS, InstantiationPackage.IDENTITY_INSTANTIATION__TYPE);
        }
        return instantiations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityAttributeInstantiation> getAttributeInstantiations() {
        if (attributeInstantiations == null) {
            attributeInstantiations = new EObjectContainmentWithInverseEList<IdentityAttributeInstantiation>(IdentityAttributeInstantiation.class, this, TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS, TypePackage.IDENTITY_ATTRIBUTE_INSTANTIATION__IDENTITY_TYPE);
        }
        return attributeInstantiations;
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((IdentityTypePackage)otherEnd, msgs);
            case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstantiations()).basicAdd(otherEnd, msgs);
            case TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeInstantiations()).basicAdd(otherEnd, msgs);
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                return basicSetPackage(null, msgs);
            case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS:
                return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
            case TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS:
                return ((InternalEList<?>)getAttributeInstantiations()).basicRemove(otherEnd, msgs);
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.IDENTITY_TYPE_PACKAGE__IDENTITY_TYPES, IdentityTypePackage.class, msgs);
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                return getPackage();
            case TypePackage.DIGITAL_IDENTITY_TYPE__NAME:
                return getName();
            case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS:
                return getInstantiations();
            case TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION:
                return getDescription();
            case TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS:
                return getAttributeInstantiations();
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                setPackage((IdentityTypePackage)newValue);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                getInstantiations().addAll((Collection<? extends IdentityInstantiation>)newValue);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS:
                getAttributeInstantiations().clear();
                getAttributeInstantiations().addAll((Collection<? extends IdentityAttributeInstantiation>)newValue);
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                setPackage((IdentityTypePackage)null);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS:
                getInstantiations().clear();
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS:
                getAttributeInstantiations().clear();
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
            case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE:
                return getPackage() != null;
            case TypePackage.DIGITAL_IDENTITY_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS:
                return instantiations != null && !instantiations.isEmpty();
            case TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TypePackage.DIGITAL_IDENTITY_TYPE__ATTRIBUTE_INSTANTIATIONS:
                return attributeInstantiations != null && !attributeInstantiations.isEmpty();
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
        if (baseClass == IdentityType.class) {
            switch (derivedFeatureID) {
                case TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE: return TypePackage.IDENTITY_TYPE__PACKAGE;
                case TypePackage.DIGITAL_IDENTITY_TYPE__NAME: return TypePackage.IDENTITY_TYPE__NAME;
                case TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS: return TypePackage.IDENTITY_TYPE__INSTANTIATIONS;
                case TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION: return TypePackage.IDENTITY_TYPE__DESCRIPTION;
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
        if (baseClass == IdentityType.class) {
            switch (baseFeatureID) {
                case TypePackage.IDENTITY_TYPE__PACKAGE: return TypePackage.DIGITAL_IDENTITY_TYPE__PACKAGE;
                case TypePackage.IDENTITY_TYPE__NAME: return TypePackage.DIGITAL_IDENTITY_TYPE__NAME;
                case TypePackage.IDENTITY_TYPE__INSTANTIATIONS: return TypePackage.DIGITAL_IDENTITY_TYPE__INSTANTIATIONS;
                case TypePackage.IDENTITY_TYPE__DESCRIPTION: return TypePackage.DIGITAL_IDENTITY_TYPE__DESCRIPTION;
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
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //DigitalIdentityTypeImpl
