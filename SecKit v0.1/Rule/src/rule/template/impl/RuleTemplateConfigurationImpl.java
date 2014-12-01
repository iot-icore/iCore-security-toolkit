/**
 */
package rule.template.impl;

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

import rule.template.DisposalStrategy;
import rule.template.InstantiationStrategy;
import rule.template.RuleTemplate;
import rule.template.RuleTemplateConfiguration;
import rule.template.RuleTemplatePackage;
import rule.template.TemplatePackage;
import rule.template.TimeStepSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Template Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getInstantiationStrategy <em>Instantiation Strategy</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getDisposalStrategy <em>Disposal Strategy</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getEvaluationAssignments <em>Evaluation Assignments</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getConfigurationAssignments <em>Configuration Assignments</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getContainerTemplate <em>Container Template</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getDisposalConfiguration <em>Disposal Configuration</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplateConfigurationImpl#getTimeStepSize <em>Time Step Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleTemplateConfigurationImpl extends ElementImpl implements RuleTemplateConfiguration {
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
     * The default value of the '{@link #getInstantiationStrategy() <em>Instantiation Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiationStrategy()
     * @generated
     * @ordered
     */
    protected static final InstantiationStrategy INSTANTIATION_STRATEGY_EDEFAULT = InstantiationStrategy.NOT_APPLICABLE;

    /**
     * The cached value of the '{@link #getInstantiationStrategy() <em>Instantiation Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiationStrategy()
     * @generated
     * @ordered
     */
    protected InstantiationStrategy instantiationStrategy = INSTANTIATION_STRATEGY_EDEFAULT;

    /**
     * The default value of the '{@link #getDisposalStrategy() <em>Disposal Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisposalStrategy()
     * @generated
     * @ordered
     */
    protected static final DisposalStrategy DISPOSAL_STRATEGY_EDEFAULT = DisposalStrategy.NEVER;

    /**
     * The cached value of the '{@link #getDisposalStrategy() <em>Disposal Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisposalStrategy()
     * @generated
     * @ordered
     */
    protected DisposalStrategy disposalStrategy = DISPOSAL_STRATEGY_EDEFAULT;

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
     * The cached value of the '{@link #getConfigurationAssignments() <em>Configuration Assignments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationAssignments()
     * @generated
     * @ordered
     */
    protected EList<VariableAssignment> configurationAssignments;

    /**
     * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplate()
     * @generated
     * @ordered
     */
    protected RuleTemplate template;

    /**
     * The cached value of the '{@link #getDisposalConfiguration() <em>Disposal Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDisposalConfiguration()
     * @generated
     * @ordered
     */
    protected RuleTemplateConfiguration disposalConfiguration;

    /**
     * The cached value of the '{@link #getTimeStepSize() <em>Time Step Size</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStepSize()
     * @generated
     * @ordered
     */
    protected TimeStepSize timeStepSize;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleTemplateConfigurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_TEMPLATE_CONFIGURATION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiationStrategy(InstantiationStrategy newInstantiationStrategy) {
        InstantiationStrategy oldInstantiationStrategy = instantiationStrategy;
        instantiationStrategy = newInstantiationStrategy == null ? INSTANTIATION_STRATEGY_EDEFAULT : newInstantiationStrategy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY, oldInstantiationStrategy, instantiationStrategy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisposalStrategy getDisposalStrategy() {
        return disposalStrategy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisposalStrategy(DisposalStrategy newDisposalStrategy) {
        DisposalStrategy oldDisposalStrategy = disposalStrategy;
        disposalStrategy = newDisposalStrategy == null ? DISPOSAL_STRATEGY_EDEFAULT : newDisposalStrategy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY, oldDisposalStrategy, disposalStrategy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getEvaluationAssignments() {
        if (evaluationAssignments == null) {
            evaluationAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS);
        }
        return evaluationAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VariableAssignment> getConfigurationAssignments() {
        if (configurationAssignments == null) {
            configurationAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS);
        }
        return configurationAssignments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate getTemplate() {
        if (template != null && template.eIsProxy()) {
            InternalEObject oldTemplate = (InternalEObject)template;
            template = (RuleTemplate)eResolveProxy(oldTemplate);
            if (template != oldTemplate) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE, oldTemplate, template));
            }
        }
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate basicGetTemplate() {
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplate(RuleTemplate newTemplate, NotificationChain msgs) {
        RuleTemplate oldTemplate = template;
        template = newTemplate;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE, oldTemplate, newTemplate);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(RuleTemplate newTemplate) {
        if (newTemplate != template) {
            NotificationChain msgs = null;
            if (template != null)
                msgs = ((InternalEObject)template).eInverseRemove(this, TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS, RuleTemplate.class, msgs);
            if (newTemplate != null)
                msgs = ((InternalEObject)newTemplate).eInverseAdd(this, TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS, RuleTemplate.class, msgs);
            msgs = basicSetTemplate(newTemplate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE, newTemplate, newTemplate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate getContainerTemplate() {
        if (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE) return null;
        return (RuleTemplate)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainerTemplate(RuleTemplate newContainerTemplate, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainerTemplate, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerTemplate(RuleTemplate newContainerTemplate) {
        if (newContainerTemplate != eInternalContainer() || (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE && newContainerTemplate != null)) {
            if (EcoreUtil.isAncestor(this, newContainerTemplate))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainerTemplate != null)
                msgs = ((InternalEObject)newContainerTemplate).eInverseAdd(this, TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS, RuleTemplate.class, msgs);
            msgs = basicSetContainerTemplate(newContainerTemplate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE, newContainerTemplate, newContainerTemplate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplateConfiguration getDisposalConfiguration() {
        return disposalConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDisposalConfiguration(RuleTemplateConfiguration newDisposalConfiguration, NotificationChain msgs) {
        RuleTemplateConfiguration oldDisposalConfiguration = disposalConfiguration;
        disposalConfiguration = newDisposalConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION, oldDisposalConfiguration, newDisposalConfiguration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDisposalConfiguration(RuleTemplateConfiguration newDisposalConfiguration) {
        if (newDisposalConfiguration != disposalConfiguration) {
            NotificationChain msgs = null;
            if (disposalConfiguration != null)
                msgs = ((InternalEObject)disposalConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION, null, msgs);
            if (newDisposalConfiguration != null)
                msgs = ((InternalEObject)newDisposalConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION, null, msgs);
            msgs = basicSetDisposalConfiguration(newDisposalConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION, newDisposalConfiguration, newDisposalConfiguration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplatePackage getPackage() {
        if (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE) return null;
        return (RuleTemplatePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(RuleTemplatePackage newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(RuleTemplatePackage newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS, RuleTemplatePackage.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize getTimeStepSize() {
        if (timeStepSize != null && timeStepSize.eIsProxy()) {
            InternalEObject oldTimeStepSize = (InternalEObject)timeStepSize;
            timeStepSize = (TimeStepSize)eResolveProxy(oldTimeStepSize);
            if (timeStepSize != oldTimeStepSize) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE, oldTimeStepSize, timeStepSize));
            }
        }
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepSize basicGetTimeStepSize() {
        return timeStepSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeStepSize(TimeStepSize newTimeStepSize) {
        TimeStepSize oldTimeStepSize = timeStepSize;
        timeStepSize = newTimeStepSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE, oldTimeStepSize, timeStepSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE:
                if (template != null)
                    msgs = ((InternalEObject)template).eInverseRemove(this, TemplatePackage.RULE_TEMPLATE__CONFIGURATIONS, RuleTemplate.class, msgs);
                return basicSetTemplate((RuleTemplate)otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainerTemplate((RuleTemplate)otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((RuleTemplatePackage)otherEnd, msgs);
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
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS:
                return ((InternalEList<?>)getEvaluationAssignments()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS:
                return ((InternalEList<?>)getConfigurationAssignments()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE:
                return basicSetTemplate(null, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                return basicSetContainerTemplate(null, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION:
                return basicSetDisposalConfiguration(null, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                return basicSetPackage(null, msgs);
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
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                return eInternalContainer().eInverseRemove(this, TemplatePackage.RULE_TEMPLATE__CONTAINED_CONFIGURATIONS, RuleTemplate.class, msgs);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                return eInternalContainer().eInverseRemove(this, TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS, RuleTemplatePackage.class, msgs);
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
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__NAME:
                return getName();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DESCRIPTION:
                return getDescription();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY:
                return getInstantiationStrategy();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY:
                return getDisposalStrategy();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS:
                return getEvaluationAssignments();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS:
                return getConfigurationAssignments();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE:
                if (resolve) return getTemplate();
                return basicGetTemplate();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                return getContainerTemplate();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION:
                return getDisposalConfiguration();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                return getPackage();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE:
                if (resolve) return getTimeStepSize();
                return basicGetTimeStepSize();
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
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__NAME:
                setName((String)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY:
                setInstantiationStrategy((InstantiationStrategy)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY:
                setDisposalStrategy((DisposalStrategy)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS:
                getEvaluationAssignments().clear();
                getEvaluationAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS:
                getConfigurationAssignments().clear();
                getConfigurationAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE:
                setTemplate((RuleTemplate)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                setContainerTemplate((RuleTemplate)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION:
                setDisposalConfiguration((RuleTemplateConfiguration)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                setPackage((RuleTemplatePackage)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE:
                setTimeStepSize((TimeStepSize)newValue);
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
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY:
                setInstantiationStrategy(INSTANTIATION_STRATEGY_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY:
                setDisposalStrategy(DISPOSAL_STRATEGY_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS:
                getEvaluationAssignments().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS:
                getConfigurationAssignments().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE:
                setTemplate((RuleTemplate)null);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                setContainerTemplate((RuleTemplate)null);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION:
                setDisposalConfiguration((RuleTemplateConfiguration)null);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                setPackage((RuleTemplatePackage)null);
                return;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE:
                setTimeStepSize((TimeStepSize)null);
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
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__INSTANTIATION_STRATEGY:
                return instantiationStrategy != INSTANTIATION_STRATEGY_EDEFAULT;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_STRATEGY:
                return disposalStrategy != DISPOSAL_STRATEGY_EDEFAULT;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__EVALUATION_ASSIGNMENTS:
                return evaluationAssignments != null && !evaluationAssignments.isEmpty();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONFIGURATION_ASSIGNMENTS:
                return configurationAssignments != null && !configurationAssignments.isEmpty();
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TEMPLATE:
                return template != null;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__CONTAINER_TEMPLATE:
                return getContainerTemplate() != null;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__DISPOSAL_CONFIGURATION:
                return disposalConfiguration != null;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE:
                return getPackage() != null;
            case TemplatePackage.RULE_TEMPLATE_CONFIGURATION__TIME_STEP_SIZE:
                return timeStepSize != null;
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
        result.append(", instantiationStrategy: ");
        result.append(instantiationStrategy);
        result.append(", disposalStrategy: ");
        result.append(disposalStrategy);
        result.append(')');
        return result.toString();
    }

} //RuleTemplateConfigurationImpl
