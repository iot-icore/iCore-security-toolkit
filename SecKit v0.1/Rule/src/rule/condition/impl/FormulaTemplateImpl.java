/**
 */
package rule.condition.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.condition.Atom;
import rule.condition.ConditionPackage;
import rule.condition.FormulaTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.condition.impl.FormulaTemplateImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link rule.condition.impl.FormulaTemplateImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link rule.condition.impl.FormulaTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link rule.condition.impl.FormulaTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rule.condition.impl.FormulaTemplateImpl#getRootAtom <em>Root Atom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaTemplateImpl extends ElementImpl implements FormulaTemplate {
    /**
     * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableDeclarations()
     * @generated
     * @ordered
     */
    protected EList<VariableDeclaration> variableDeclarations;

    /**
     * The cached value of the '{@link #getVariableAssignments() <em>Variable Assignments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableAssignments()
     * @generated
     * @ordered
     */
    protected EList<VariableAssignment> variableAssignments;

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
     * The cached value of the '{@link #getRootAtom() <em>Root Atom</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootAtom()
     * @generated
     * @ordered
     */
    protected Atom rootAtom;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FormulaTemplateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.FORMULA_TEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableDeclaration> getVariableDeclarations() {
        if (variableDeclarations == null) {
            variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, ConditionPackage.FORMULA_TEMPLATE__VARIABLE_DECLARATIONS);
        }
        return variableDeclarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getVariableAssignments() {
        if (variableAssignments == null) {
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, ConditionPackage.FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.FORMULA_TEMPLATE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.FORMULA_TEMPLATE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Atom getRootAtom() {
        return rootAtom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootAtom(Atom newRootAtom, NotificationChain msgs) {
        Atom oldRootAtom = rootAtom;
        rootAtom = newRootAtom;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM, oldRootAtom, newRootAtom);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootAtom(Atom newRootAtom) {
        if (newRootAtom != rootAtom) {
            NotificationChain msgs = null;
            if (rootAtom != null)
                msgs = ((InternalEObject)rootAtom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM, null, msgs);
            if (newRootAtom != null)
                msgs = ((InternalEObject)newRootAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM, null, msgs);
            msgs = basicSetRootAtom(newRootAtom, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM, newRootAtom, newRootAtom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_DECLARATIONS:
                return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
            case ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM:
                return basicSetRootAtom(null, msgs);
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
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_DECLARATIONS:
                return getVariableDeclarations();
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
            case ConditionPackage.FORMULA_TEMPLATE__NAME:
                return getName();
            case ConditionPackage.FORMULA_TEMPLATE__DESCRIPTION:
                return getDescription();
            case ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM:
                return getRootAtom();
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
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_DECLARATIONS:
                getVariableDeclarations().clear();
                getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
                return;
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case ConditionPackage.FORMULA_TEMPLATE__NAME:
                setName((String)newValue);
                return;
            case ConditionPackage.FORMULA_TEMPLATE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM:
                setRootAtom((Atom)newValue);
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
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_DECLARATIONS:
                getVariableDeclarations().clear();
                return;
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
            case ConditionPackage.FORMULA_TEMPLATE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ConditionPackage.FORMULA_TEMPLATE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM:
                setRootAtom((Atom)null);
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
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_DECLARATIONS:
                return variableDeclarations != null && !variableDeclarations.isEmpty();
            case ConditionPackage.FORMULA_TEMPLATE__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
            case ConditionPackage.FORMULA_TEMPLATE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ConditionPackage.FORMULA_TEMPLATE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ConditionPackage.FORMULA_TEMPLATE__ROOT_ATOM:
                return rootAtom != null;
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
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //FormulaTemplateImpl
