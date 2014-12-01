/**
 */
package rule.condition.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.condition.Atom;
import rule.condition.ConditionPackage;
import rule.condition.Operator;

import rule.template.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.condition.impl.AtomImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link rule.condition.impl.AtomImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link rule.condition.impl.AtomImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AtomImpl extends ElementImpl implements Atom {
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
     * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplate()
     * @generated
     * @ordered
     */
    protected Template template;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AtomImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.ATOM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getVariableAssignments() {
        if (variableAssignments == null) {
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operator getOperator() {
        if (eContainerFeatureID() != ConditionPackage.ATOM__OPERATOR) return null;
        return (Operator)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOperator, ConditionPackage.ATOM__OPERATOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(Operator newOperator) {
        if (newOperator != eInternalContainer() || (eContainerFeatureID() != ConditionPackage.ATOM__OPERATOR && newOperator != null)) {
            if (EcoreUtil.isAncestor(this, newOperator))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOperator != null)
                msgs = ((InternalEObject)newOperator).eInverseAdd(this, ConditionPackage.OPERATOR__OPERANDS, Operator.class, msgs);
            msgs = basicSetOperator(newOperator, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.ATOM__OPERATOR, newOperator, newOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Template getTemplate() {
        if (template != null && template.eIsProxy()) {
            InternalEObject oldTemplate = (InternalEObject)template;
            template = (Template)eResolveProxy(oldTemplate);
            if (template != oldTemplate) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConditionPackage.ATOM__TEMPLATE, oldTemplate, template));
            }
        }
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Template basicGetTemplate() {
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(Template newTemplate) {
        Template oldTemplate = template;
        template = newTemplate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.ATOM__TEMPLATE, oldTemplate, template));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ConditionPackage.ATOM__OPERATOR:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOperator((Operator)otherEnd, msgs);
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
            case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
            case ConditionPackage.ATOM__OPERATOR:
                return basicSetOperator(null, msgs);
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
            case ConditionPackage.ATOM__OPERATOR:
                return eInternalContainer().eInverseRemove(this, ConditionPackage.OPERATOR__OPERANDS, Operator.class, msgs);
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
            case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
            case ConditionPackage.ATOM__OPERATOR:
                return getOperator();
            case ConditionPackage.ATOM__TEMPLATE:
                if (resolve) return getTemplate();
                return basicGetTemplate();
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
            case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case ConditionPackage.ATOM__OPERATOR:
                setOperator((Operator)newValue);
                return;
            case ConditionPackage.ATOM__TEMPLATE:
                setTemplate((Template)newValue);
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
            case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
            case ConditionPackage.ATOM__OPERATOR:
                setOperator((Operator)null);
                return;
            case ConditionPackage.ATOM__TEMPLATE:
                setTemplate((Template)null);
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
            case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
            case ConditionPackage.ATOM__OPERATOR:
                return getOperator() != null;
            case ConditionPackage.ATOM__TEMPLATE:
                return template != null;
        }
        return super.eIsSet(featureID);
    }

} //AtomImpl
