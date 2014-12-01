/**
 */
package context.type.impl;

import context.type.ContextInformationType;
import context.type.ContextSituationType;
import context.type.ContextTypePackage;
import context.type.TypePackage;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.type.impl.ContextTypePackageImpl#getSituationTypes <em>Situation Types</em>}</li>
 *   <li>{@link context.type.impl.ContextTypePackageImpl#getContextInformationTypes <em>Context Information Types</em>}</li>
 *   <li>{@link context.type.impl.ContextTypePackageImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextTypePackageImpl extends ElementImpl implements ContextTypePackage {
    /**
     * The cached value of the '{@link #getSituationTypes() <em>Situation Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSituationTypes()
     * @generated
     * @ordered
     */
    protected EList<ContextSituationType> situationTypes;

    /**
     * The cached value of the '{@link #getContextInformationTypes() <em>Context Information Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextInformationTypes()
     * @generated
     * @ordered
     */
    protected EList<ContextInformationType> contextInformationTypes;

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
    protected ContextTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.CONTEXT_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextSituationType> getSituationTypes() {
        if (situationTypes == null) {
            situationTypes = new EObjectContainmentWithInverseEList<ContextSituationType>(ContextSituationType.class, this, TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES, TypePackage.CONTEXT_SITUATION_TYPE__PACKAGE);
        }
        return situationTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ContextInformationType> getContextInformationTypes() {
        if (contextInformationTypes == null) {
            contextInformationTypes = new EObjectContainmentWithInverseEList<ContextInformationType>(ContextInformationType.class, this, TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES, TypePackage.CONTEXT_INFORMATION_TYPE__PACKAGE);
        }
        return contextInformationTypes;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.CONTEXT_TYPE_PACKAGE__NAME, oldName, name));
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
            case TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSituationTypes()).basicAdd(otherEnd, msgs);
            case TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContextInformationTypes()).basicAdd(otherEnd, msgs);
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
            case TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES:
                return ((InternalEList<?>)getSituationTypes()).basicRemove(otherEnd, msgs);
            case TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES:
                return ((InternalEList<?>)getContextInformationTypes()).basicRemove(otherEnd, msgs);
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
            case TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES:
                return getSituationTypes();
            case TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES:
                return getContextInformationTypes();
            case TypePackage.CONTEXT_TYPE_PACKAGE__NAME:
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
            case TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES:
                getSituationTypes().clear();
                getSituationTypes().addAll((Collection<? extends ContextSituationType>)newValue);
                return;
            case TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES:
                getContextInformationTypes().clear();
                getContextInformationTypes().addAll((Collection<? extends ContextInformationType>)newValue);
                return;
            case TypePackage.CONTEXT_TYPE_PACKAGE__NAME:
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
            case TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES:
                getSituationTypes().clear();
                return;
            case TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES:
                getContextInformationTypes().clear();
                return;
            case TypePackage.CONTEXT_TYPE_PACKAGE__NAME:
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
            case TypePackage.CONTEXT_TYPE_PACKAGE__SITUATION_TYPES:
                return situationTypes != null && !situationTypes.isEmpty();
            case TypePackage.CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES:
                return contextInformationTypes != null && !contextInformationTypes.isEmpty();
            case TypePackage.CONTEXT_TYPE_PACKAGE__NAME:
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

} //ContextTypePackageImpl
