/**
 */
package rule.condition.impl;

import java.util.Collection;

import models.impl.PatternImpl;

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

import rule.condition.Arity;
import rule.condition.Atom;
import rule.condition.ConditionPackage;
import rule.condition.EventPattern;
import rule.condition.Nullary;
import rule.condition.Operator;

import rule.event.EventModality;

import rule.template.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.condition.impl.EventPatternImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link rule.condition.impl.EventPatternImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link rule.condition.impl.EventPatternImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link rule.condition.impl.EventPatternImpl#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventPatternImpl extends PatternImpl implements EventPattern {
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
     * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModality()
     * @generated
     * @ordered
     */
    protected static final EventModality MODALITY_EDEFAULT = EventModality.TENTATIVE;

    /**
     * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModality()
     * @generated
     * @ordered
     */
    protected EventModality modality = MODALITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getVariableAssignments() {
        if (variableAssignments == null) {
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operator getOperator() {
        if (eContainerFeatureID() != ConditionPackage.EVENT_PATTERN__OPERATOR) return null;
        return (Operator)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOperator, ConditionPackage.EVENT_PATTERN__OPERATOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(Operator newOperator) {
        if (newOperator != eInternalContainer() || (eContainerFeatureID() != ConditionPackage.EVENT_PATTERN__OPERATOR && newOperator != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.EVENT_PATTERN__OPERATOR, newOperator, newOperator));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConditionPackage.EVENT_PATTERN__TEMPLATE, oldTemplate, template));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.EVENT_PATTERN__TEMPLATE, oldTemplate, template));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventModality getModality() {
        return modality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModality(EventModality newModality) {
        EventModality oldModality = modality;
        modality = newModality == null ? MODALITY_EDEFAULT : newModality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.EVENT_PATTERN__MODALITY, oldModality, modality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
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
            case ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
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
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
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
            case ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
                return getOperator();
            case ConditionPackage.EVENT_PATTERN__TEMPLATE:
                if (resolve) return getTemplate();
                return basicGetTemplate();
            case ConditionPackage.EVENT_PATTERN__MODALITY:
                return getModality();
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
            case ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
                setOperator((Operator)newValue);
                return;
            case ConditionPackage.EVENT_PATTERN__TEMPLATE:
                setTemplate((Template)newValue);
                return;
            case ConditionPackage.EVENT_PATTERN__MODALITY:
                setModality((EventModality)newValue);
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
            case ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
                setOperator((Operator)null);
                return;
            case ConditionPackage.EVENT_PATTERN__TEMPLATE:
                setTemplate((Template)null);
                return;
            case ConditionPackage.EVENT_PATTERN__MODALITY:
                setModality(MODALITY_EDEFAULT);
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
            case ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
            case ConditionPackage.EVENT_PATTERN__OPERATOR:
                return getOperator() != null;
            case ConditionPackage.EVENT_PATTERN__TEMPLATE:
                return template != null;
            case ConditionPackage.EVENT_PATTERN__MODALITY:
                return modality != MODALITY_EDEFAULT;
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
        if (baseClass == Arity.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Nullary.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Atom.class) {
            switch (derivedFeatureID) {
                case ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS: return ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS;
                case ConditionPackage.EVENT_PATTERN__OPERATOR: return ConditionPackage.ATOM__OPERATOR;
                case ConditionPackage.EVENT_PATTERN__TEMPLATE: return ConditionPackage.ATOM__TEMPLATE;
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
        if (baseClass == Arity.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Nullary.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == Atom.class) {
            switch (baseFeatureID) {
                case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS: return ConditionPackage.EVENT_PATTERN__VARIABLE_ASSIGNMENTS;
                case ConditionPackage.ATOM__OPERATOR: return ConditionPackage.EVENT_PATTERN__OPERATOR;
                case ConditionPackage.ATOM__TEMPLATE: return ConditionPackage.EVENT_PATTERN__TEMPLATE;
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
        result.append(" (modality: ");
        result.append(modality);
        result.append(')');
        return result.toString();
    }

} //EventPatternImpl
