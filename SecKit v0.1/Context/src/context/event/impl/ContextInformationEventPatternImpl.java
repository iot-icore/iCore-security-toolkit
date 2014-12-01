/**
 */
package context.event.impl;

import context.event.ContextInformationEventPattern;
import context.event.EventPackage;

import context.pattern.ContextInformationPattern;

import data.event.impl.AbstractDataEventPatternImpl;

import java.util.Collection;

import models.Element;
import models.ModelsPackage;
import models.Pattern;
import models.VisualElement;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 * An implementation of the model object '<em><b>Context Information Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getId <em>Id</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventPatternImpl#getContextInformationPattern <em>Context Information Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextInformationEventPatternImpl extends AbstractDataEventPatternImpl implements ContextInformationEventPattern {
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
     * The cached value of the '{@link #getContextInformationPattern() <em>Context Information Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContextInformationPattern()
     * @generated
     * @ordered
     */
    protected ContextInformationPattern contextInformationPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextInformationEventPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.CONTEXT_INFORMATION_EVENT_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VisualElement> getVisualElements() {
        if (visualElements == null) {
            visualElements = new EObjectWithInverseResolvingEList<VisualElement>(VisualElement.class, this, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS, ModelsPackage.VISUAL_ELEMENT__ELEMENT);
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getVariableAssignments() {
        if (variableAssignments == null) {
            variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS);
        }
        return variableAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operator getOperator() {
        if (eContainerFeatureID() != EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR) return null;
        return (Operator)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOperator, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(Operator newOperator) {
        if (newOperator != eInternalContainer() || (eContainerFeatureID() != EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR && newOperator != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR, newOperator, newOperator));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE, oldTemplate, template));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE, oldTemplate, template));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY, oldModality, modality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationPattern getContextInformationPattern() {
        return contextInformationPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContextInformationPattern(ContextInformationPattern newContextInformationPattern, NotificationChain msgs) {
        ContextInformationPattern oldContextInformationPattern = contextInformationPattern;
        contextInformationPattern = newContextInformationPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN, oldContextInformationPattern, newContextInformationPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContextInformationPattern(ContextInformationPattern newContextInformationPattern) {
        if (newContextInformationPattern != contextInformationPattern) {
            NotificationChain msgs = null;
            if (contextInformationPattern != null)
                msgs = ((InternalEObject)contextInformationPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN, null, msgs);
            if (newContextInformationPattern != null)
                msgs = ((InternalEObject)newContextInformationPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN, null, msgs);
            msgs = basicSetContextInformationPattern(newContextInformationPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN, newContextInformationPattern, newContextInformationPattern));
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisualElements()).basicAdd(otherEnd, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS:
                return ((InternalEList<?>)getVisualElements()).basicRemove(otherEnd, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
                return basicSetOperator(null, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN:
                return basicSetContextInformationPattern(null, msgs);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS:
                return getVisualElements();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID:
                return getId();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                return getVariableAssignments();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
                return getOperator();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE:
                if (resolve) return getTemplate();
                return basicGetTemplate();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY:
                return getModality();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN:
                return getContextInformationPattern();
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS:
                getVisualElements().clear();
                getVisualElements().addAll((Collection<? extends VisualElement>)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID:
                setId((String)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
                setOperator((Operator)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE:
                setTemplate((Template)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY:
                setModality((EventModality)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN:
                setContextInformationPattern((ContextInformationPattern)newValue);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS:
                getVisualElements().clear();
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID:
                setId(ID_EDEFAULT);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                getVariableAssignments().clear();
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
                setOperator((Operator)null);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE:
                setTemplate((Template)null);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY:
                setModality(MODALITY_EDEFAULT);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN:
                setContextInformationPattern((ContextInformationPattern)null);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS:
                return visualElements != null && !visualElements.isEmpty();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS:
                return variableAssignments != null && !variableAssignments.isEmpty();
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR:
                return getOperator() != null;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE:
                return template != null;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY:
                return modality != MODALITY_EDEFAULT;
            case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__CONTEXT_INFORMATION_PATTERN:
                return contextInformationPattern != null;
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
                case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS: return ModelsPackage.ELEMENT__VISUAL_ELEMENTS;
                case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID: return ModelsPackage.ELEMENT__ID;
                default: return -1;
            }
        }
        if (baseClass == Pattern.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
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
                case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS: return ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS;
                case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR: return ConditionPackage.ATOM__OPERATOR;
                case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE: return ConditionPackage.ATOM__TEMPLATE;
                default: return -1;
            }
        }
        if (baseClass == EventPattern.class) {
            switch (derivedFeatureID) {
                case EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY: return ConditionPackage.EVENT_PATTERN__MODALITY;
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
                case ModelsPackage.ELEMENT__VISUAL_ELEMENTS: return EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VISUAL_ELEMENTS;
                case ModelsPackage.ELEMENT__ID: return EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__ID;
                default: return -1;
            }
        }
        if (baseClass == Pattern.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
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
                case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS: return EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__VARIABLE_ASSIGNMENTS;
                case ConditionPackage.ATOM__OPERATOR: return EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__OPERATOR;
                case ConditionPackage.ATOM__TEMPLATE: return EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__TEMPLATE;
                default: return -1;
            }
        }
        if (baseClass == EventPattern.class) {
            switch (baseFeatureID) {
                case ConditionPackage.EVENT_PATTERN__MODALITY: return EventPackage.CONTEXT_INFORMATION_EVENT_PATTERN__MODALITY;
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
        result.append(", modality: ");
        result.append(modality);
        result.append(')');
        return result.toString();
    }

} //ContextInformationEventPatternImpl
