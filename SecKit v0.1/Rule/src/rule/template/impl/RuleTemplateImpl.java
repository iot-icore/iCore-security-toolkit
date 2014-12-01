/**
 */
package rule.template.impl;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.action.ActionPackage;
import rule.action.Authorization;
import rule.action.Execute;

import rule.condition.Atom;
import rule.condition.EventPattern;

import rule.template.CombiningAlgorithm;
import rule.template.RuleTemplate;
import rule.template.RuleTemplateConfiguration;
import rule.template.RuleTemplatePackage;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getEvaluationAssignments <em>Evaluation Assignments</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getContainedConfigurations <em>Contained Configurations</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getAuthorize <em>Authorize</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getCombiningAlgorithm <em>Combining Algorithm</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleTemplateImpl extends ElementImpl implements RuleTemplate {
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
     * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvent()
     * @generated
     * @ordered
     */
    protected EventPattern event;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected Atom condition;

    /**
     * The cached value of the '{@link #getEvaluationAssignments() <em>Evaluation Assignments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvaluationAssignments()
     * @generated
     * @ordered
     */
    protected EList<VariableAssignment> evaluationAssignments;

    /**
     * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurations()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplateConfiguration> configurations;

    /**
     * The cached value of the '{@link #getContainedConfigurations() <em>Contained Configurations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedConfigurations()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplateConfiguration> containedConfigurations;

    /**
     * The cached value of the '{@link #getAuthorize() <em>Authorize</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthorize()
     * @generated
     * @ordered
     */
    protected Authorization authorize;

    /**
     * The cached value of the '{@link #getCombiningAlgorithm() <em>Combining Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombiningAlgorithm()
     * @generated
     * @ordered
     */
    protected CombiningAlgorithm combiningAlgorithm;

    /**
     * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecute()
     * @generated
     * @ordered
     */
    protected EList<Execute> execute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleTemplateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_TEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableDeclaration> getVariableDeclarations() {
        if (variableDeclarations == null) {
            variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, TemplatePackage.RULE_TEMPLATE__VARIABLE_DECLARATIONS);
        }
        return variableDeclarations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPattern getEvent() {
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEvent(EventPattern newEvent, NotificationChain msgs) {
        EventPattern oldEvent = event;
        event = newEvent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__EVENT, oldEvent, newEvent);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEvent(EventPattern newEvent) {
        if (newEvent != event) {
            NotificationChain msgs = null;
            if (event != null)
                msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE__EVENT, null, msgs);
            if (newEvent != null)
                msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE__EVENT, null, msgs);
            msgs = basicSetEvent(newEvent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__EVENT, newEvent, newEvent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Atom getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(Atom newCondition, NotificationChain msgs) {
        Atom oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(Atom newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getEvaluationAssignments() {
        if (evaluationAssignments == null) {
            evaluationAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, TemplatePackage.RULE_TEMPLATE__EVALUATION_ASSIGNMENTS);
        }
        return evaluationAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplateConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new EObjectWithInverseResolvingEList<RuleTemplateConfiguration>(RuleTemplateConfiguration.class, this, TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE);
        }
        return configurations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplateConfiguration> getContainedConfigurations() {
        if (containedConfigurations == null) {
            containedConfigurations = new EObjectContainmentWithInverseEList<RuleTemplateConfiguration>(RuleTemplateConfiguration.class, this, TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE);
        }
        return containedConfigurations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Authorization getAuthorize() {
        return authorize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuthorize(Authorization newAuthorize, NotificationChain msgs) {
        Authorization oldAuthorize = authorize;
        authorize = newAuthorize;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__AUTHORIZE, oldAuthorize, newAuthorize);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthorize(Authorization newAuthorize) {
        if (newAuthorize != authorize) {
            NotificationChain msgs = null;
            if (authorize != null)
                msgs = ((InternalEObject)authorize).eInverseRemove(this, ActionPackage.AUTHORIZATION__TEMPLATE, Authorization.class, msgs);
            if (newAuthorize != null)
                msgs = ((InternalEObject)newAuthorize).eInverseAdd(this, ActionPackage.AUTHORIZATION__TEMPLATE, Authorization.class, msgs);
            msgs = basicSetAuthorize(newAuthorize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__AUTHORIZE, newAuthorize, newAuthorize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombiningAlgorithm getCombiningAlgorithm() {
        return combiningAlgorithm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCombiningAlgorithm(CombiningAlgorithm newCombiningAlgorithm, NotificationChain msgs) {
        CombiningAlgorithm oldCombiningAlgorithm = combiningAlgorithm;
        combiningAlgorithm = newCombiningAlgorithm;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM, oldCombiningAlgorithm, newCombiningAlgorithm);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCombiningAlgorithm(CombiningAlgorithm newCombiningAlgorithm) {
        if (newCombiningAlgorithm != combiningAlgorithm) {
            NotificationChain msgs = null;
            if (combiningAlgorithm != null)
                msgs = ((InternalEObject)combiningAlgorithm).eInverseRemove(this, TemplatePackage.COMBINING_ALGORITHM__TEMPLATE, CombiningAlgorithm.class, msgs);
            if (newCombiningAlgorithm != null)
                msgs = ((InternalEObject)newCombiningAlgorithm).eInverseAdd(this, TemplatePackage.COMBINING_ALGORITHM__TEMPLATE, CombiningAlgorithm.class, msgs);
            msgs = basicSetCombiningAlgorithm(newCombiningAlgorithm, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM, newCombiningAlgorithm, newCombiningAlgorithm));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplatePackage getPackage() {
        if (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE__PACKAGE) return null;
        return (RuleTemplatePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(RuleTemplatePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TemplatePackage.RULE_TEMPLATE__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(RuleTemplatePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES, RuleTemplatePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Execute> getExecute() {
        if (execute == null) {
            execute = new EObjectContainmentWithInverseEList<Execute>(Execute.class, this, TemplatePackage.RULE_TEMPLATE__EXECUTE, ActionPackage.EXECUTE__TEMPLATE);
        }
        return execute;
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
            case TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfigurations()).basicAdd(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedConfigurations()).basicAdd(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__AUTHORIZE:
                if (authorize != null)
                    msgs = ((InternalEObject)authorize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE__AUTHORIZE, null, msgs);
                return basicSetAuthorize((Authorization)otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM:
                if (combiningAlgorithm != null)
                    msgs = ((InternalEObject)combiningAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM, null, msgs);
                return basicSetCombiningAlgorithm((CombiningAlgorithm)otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((RuleTemplatePackage)otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__EXECUTE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecute()).basicAdd(otherEnd, msgs);
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
            case TemplatePackage.RULE_TEMPLATE__VARIABLE_DECLARATIONS:
                return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__EVENT:
                return basicSetEvent(null, msgs);
            case TemplatePackage.RULE_TEMPLATE__CONDITION:
                return basicSetCondition(null, msgs);
            case TemplatePackage.RULE_TEMPLATE__EVALUATION_ASSIGNMENTS:
                return ((InternalEList<?>)getEvaluationAssignments()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS:
                return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS:
                return ((InternalEList<?>)getContainedConfigurations()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE__AUTHORIZE:
                return basicSetAuthorize(null, msgs);
            case TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM:
                return basicSetCombiningAlgorithm(null, msgs);
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                return basicSetPackage(null, msgs);
            case TemplatePackage.RULE_TEMPLATE__EXECUTE:
                return ((InternalEList<?>)getExecute()).basicRemove(otherEnd, msgs);
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
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES, RuleTemplatePackage.class, msgs);
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
            case TemplatePackage.RULE_TEMPLATE__VARIABLE_DECLARATIONS:
                return getVariableDeclarations();
            case TemplatePackage.RULE_TEMPLATE__NAME:
                return getName();
            case TemplatePackage.RULE_TEMPLATE__DESCRIPTION:
                return getDescription();
            case TemplatePackage.RULE_TEMPLATE__EVENT:
                return getEvent();
            case TemplatePackage.RULE_TEMPLATE__CONDITION:
                return getCondition();
            case TemplatePackage.RULE_TEMPLATE__EVALUATION_ASSIGNMENTS:
                return getEvaluationAssignments();
            case TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS:
                return getConfigurations();
            case TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS:
                return getContainedConfigurations();
            case TemplatePackage.RULE_TEMPLATE__AUTHORIZE:
                return getAuthorize();
            case TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM:
                return getCombiningAlgorithm();
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                return getPackage();
            case TemplatePackage.RULE_TEMPLATE__EXECUTE:
                return getExecute();
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
            case TemplatePackage.RULE_TEMPLATE__VARIABLE_DECLARATIONS:
                getVariableDeclarations().clear();
                getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__NAME:
                setName((String)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__EVENT:
                setEvent((EventPattern)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__CONDITION:
                setCondition((Atom)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__EVALUATION_ASSIGNMENTS:
                getEvaluationAssignments().clear();
                getEvaluationAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS:
                getConfigurations().clear();
                getConfigurations().addAll((Collection<? extends RuleTemplateConfiguration>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS:
                getContainedConfigurations().clear();
                getContainedConfigurations().addAll((Collection<? extends RuleTemplateConfiguration>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__AUTHORIZE:
                setAuthorize((Authorization)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM:
                setCombiningAlgorithm((CombiningAlgorithm)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                setPackage((RuleTemplatePackage)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE__EXECUTE:
                getExecute().clear();
                getExecute().addAll((Collection<? extends Execute>)newValue);
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
            case TemplatePackage.RULE_TEMPLATE__VARIABLE_DECLARATIONS:
                getVariableDeclarations().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE__EVENT:
                setEvent((EventPattern)null);
                return;
            case TemplatePackage.RULE_TEMPLATE__CONDITION:
                setCondition((Atom)null);
                return;
            case TemplatePackage.RULE_TEMPLATE__EVALUATION_ASSIGNMENTS:
                getEvaluationAssignments().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS:
                getConfigurations().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS:
                getContainedConfigurations().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE__AUTHORIZE:
                setAuthorize((Authorization)null);
                return;
            case TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM:
                setCombiningAlgorithm((CombiningAlgorithm)null);
                return;
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                setPackage((RuleTemplatePackage)null);
                return;
            case TemplatePackage.RULE_TEMPLATE__EXECUTE:
                getExecute().clear();
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
            case TemplatePackage.RULE_TEMPLATE__VARIABLE_DECLARATIONS:
                return variableDeclarations != null && !variableDeclarations.isEmpty();
            case TemplatePackage.RULE_TEMPLATE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TemplatePackage.RULE_TEMPLATE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TemplatePackage.RULE_TEMPLATE__EVENT:
                return event != null;
            case TemplatePackage.RULE_TEMPLATE__CONDITION:
                return condition != null;
            case TemplatePackage.RULE_TEMPLATE__EVALUATION_ASSIGNMENTS:
                return evaluationAssignments != null && !evaluationAssignments.isEmpty();
            case TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS:
                return configurations != null && !configurations.isEmpty();
            case TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS:
                return containedConfigurations != null && !containedConfigurations.isEmpty();
            case TemplatePackage.RULE_TEMPLATE__AUTHORIZE:
                return authorize != null;
            case TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM:
                return combiningAlgorithm != null;
            case TemplatePackage.RULE_TEMPLATE__PACKAGE:
                return getPackage() != null;
            case TemplatePackage.RULE_TEMPLATE__EXECUTE:
                return execute != null && !execute.isEmpty();
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

} //RuleTemplateImpl
