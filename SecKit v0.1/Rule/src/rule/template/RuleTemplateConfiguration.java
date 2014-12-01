/**
 */
package rule.template;

import models.Element;

import models.variable.VariableAssignment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Template Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getDescription <em>Description</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getInstantiationStrategy <em>Instantiation Strategy</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getDisposalStrategy <em>Disposal Strategy</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getEvaluationAssignments <em>Evaluation Assignments</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getConfigurationAssignments <em>Configuration Assignments</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getTemplate <em>Template</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getContainerTemplate <em>Container Template</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getDisposalConfiguration <em>Disposal Configuration</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getPackage <em>Package</em>}</li>
 *   <li>{@link rule.template.RuleTemplateConfiguration#getTimeStepSize <em>Time Step Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleTemplateConfiguration()
 * @model
 * @generated
 */
public interface RuleTemplateConfiguration extends Element {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Instantiation Strategy</b></em>' attribute.
     * The literals are from the enumeration {@link rule.template.InstantiationStrategy}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation Strategy</em>' attribute.
     * @see rule.template.InstantiationStrategy
     * @see #setInstantiationStrategy(InstantiationStrategy)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_InstantiationStrategy()
     * @model
     * @generated
     */
    InstantiationStrategy getInstantiationStrategy();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getInstantiationStrategy <em>Instantiation Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation Strategy</em>' attribute.
     * @see rule.template.InstantiationStrategy
     * @see #getInstantiationStrategy()
     * @generated
     */
    void setInstantiationStrategy(InstantiationStrategy value);

    /**
     * Returns the value of the '<em><b>Disposal Strategy</b></em>' attribute.
     * The literals are from the enumeration {@link rule.template.DisposalStrategy}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disposal Strategy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disposal Strategy</em>' attribute.
     * @see rule.template.DisposalStrategy
     * @see #setDisposalStrategy(DisposalStrategy)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_DisposalStrategy()
     * @model
     * @generated
     */
    DisposalStrategy getDisposalStrategy();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getDisposalStrategy <em>Disposal Strategy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disposal Strategy</em>' attribute.
     * @see rule.template.DisposalStrategy
     * @see #getDisposalStrategy()
     * @generated
     */
    void setDisposalStrategy(DisposalStrategy value);

    /**
     * Returns the value of the '<em><b>Evaluation Assignments</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableAssignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Evaluation Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Evaluation Assignments</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_EvaluationAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getEvaluationAssignments();

    /**
     * Returns the value of the '<em><b>Configuration Assignments</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableAssignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration Assignments</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_ConfigurationAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getConfigurationAssignments();

    /**
     * Returns the value of the '<em><b>Template</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplate#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Template</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template</em>' reference.
     * @see #setTemplate(RuleTemplate)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_Template()
     * @see rule.template.RuleTemplate#getConfigurations
     * @model opposite="configurations" required="true"
     * @generated
     */
    RuleTemplate getTemplate();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getTemplate <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(RuleTemplate value);

    /**
     * Returns the value of the '<em><b>Container Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplate#getContainedConfigurations <em>Contained Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Template</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Template</em>' container reference.
     * @see #setContainerTemplate(RuleTemplate)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_ContainerTemplate()
     * @see rule.template.RuleTemplate#getContainedConfigurations
     * @model opposite="containedConfigurations" transient="false"
     * @generated
     */
    RuleTemplate getContainerTemplate();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getContainerTemplate <em>Container Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Template</em>' container reference.
     * @see #getContainerTemplate()
     * @generated
     */
    void setContainerTemplate(RuleTemplate value);

    /**
     * Returns the value of the '<em><b>Disposal Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disposal Configuration</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Disposal Configuration</em>' containment reference.
     * @see #setDisposalConfiguration(RuleTemplateConfiguration)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_DisposalConfiguration()
     * @model containment="true"
     * @generated
     */
    RuleTemplateConfiguration getDisposalConfiguration();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getDisposalConfiguration <em>Disposal Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Disposal Configuration</em>' containment reference.
     * @see #getDisposalConfiguration()
     * @generated
     */
    void setDisposalConfiguration(RuleTemplateConfiguration value);

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplatePackage#getConfigurations <em>Configurations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(RuleTemplatePackage)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_Package()
     * @see rule.template.RuleTemplatePackage#getConfigurations
     * @model opposite="configurations" transient="false"
     * @generated
     */
    RuleTemplatePackage getPackage();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(RuleTemplatePackage value);

    /**
     * Returns the value of the '<em><b>Time Step Size</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step Size</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step Size</em>' reference.
     * @see #setTimeStepSize(TimeStepSize)
     * @see rule.template.TemplatePackage#getRuleTemplateConfiguration_TimeStepSize()
     * @model
     * @generated
     */
    TimeStepSize getTimeStepSize();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplateConfiguration#getTimeStepSize <em>Time Step Size</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step Size</em>' reference.
     * @see #getTimeStepSize()
     * @generated
     */
    void setTimeStepSize(TimeStepSize value);

} // RuleTemplateConfiguration
