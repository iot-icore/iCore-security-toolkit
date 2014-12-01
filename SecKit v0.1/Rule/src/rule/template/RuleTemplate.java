/**
 */
package rule.template;

import models.Element;

import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

import rule.action.Authorization;
import rule.action.Execute;

import rule.condition.Atom;
import rule.condition.EventPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleTemplate#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getName <em>Name</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getEvent <em>Event</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getCondition <em>Condition</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getEvaluationAssignments <em>Evaluation Assignments</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getContainedConfigurations <em>Contained Configurations</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getAuthorize <em>Authorize</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getCombiningAlgorithm <em>Combining Algorithm</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getPackage <em>Package</em>}</li>
 *   <li>{@link rule.template.RuleTemplate#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleTemplate()
 * @model
 * @generated
 */
public interface RuleTemplate extends Element, Template {
    /**
     * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
     * The list contents are of type {@link models.variable.VariableDeclaration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Declarations</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplate_VariableDeclarations()
     * @model containment="true"
     * @generated
     */
    EList<VariableDeclaration> getVariableDeclarations();

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
     * @see rule.template.TemplatePackage#getRuleTemplate_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getName <em>Name</em>}' attribute.
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
     * @see rule.template.TemplatePackage#getRuleTemplate_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Event</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event</em>' containment reference.
     * @see #setEvent(EventPattern)
     * @see rule.template.TemplatePackage#getRuleTemplate_Event()
     * @model containment="true"
     * @generated
     */
    EventPattern getEvent();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getEvent <em>Event</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event</em>' containment reference.
     * @see #getEvent()
     * @generated
     */
    void setEvent(EventPattern value);

    /**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Atom)
     * @see rule.template.TemplatePackage#getRuleTemplate_Condition()
     * @model containment="true" required="true"
     * @generated
     */
    Atom getCondition();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
    void setCondition(Atom value);

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
     * @see rule.template.TemplatePackage#getRuleTemplate_EvaluationAssignments()
     * @model containment="true"
     * @generated
     */
    EList<VariableAssignment> getEvaluationAssignments();

    /**
     * Returns the value of the '<em><b>Configurations</b></em>' reference list.
     * The list contents are of type {@link rule.template.RuleTemplateConfiguration}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplateConfiguration#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' reference list.
     * @see rule.template.TemplatePackage#getRuleTemplate_Configurations()
     * @see rule.template.RuleTemplateConfiguration#getTemplate
     * @model opposite="template"
     * @generated
     */
    EList<RuleTemplateConfiguration> getConfigurations();

    /**
     * Returns the value of the '<em><b>Contained Configurations</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleTemplateConfiguration}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplateConfiguration#getContainerTemplate <em>Container Template</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Configurations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Configurations</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplate_ContainedConfigurations()
     * @see rule.template.RuleTemplateConfiguration#getContainerTemplate
     * @model opposite="containerTemplate" containment="true"
     * @generated
     */
    EList<RuleTemplateConfiguration> getContainedConfigurations();

    /**
     * Returns the value of the '<em><b>Authorize</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link rule.action.Authorization#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authorize</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authorize</em>' containment reference.
     * @see #setAuthorize(Authorization)
     * @see rule.template.TemplatePackage#getRuleTemplate_Authorize()
     * @see rule.action.Authorization#getTemplate
     * @model opposite="template" containment="true"
     * @generated
     */
    Authorization getAuthorize();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getAuthorize <em>Authorize</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authorize</em>' containment reference.
     * @see #getAuthorize()
     * @generated
     */
    void setAuthorize(Authorization value);

    /**
     * Returns the value of the '<em><b>Combining Algorithm</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link rule.template.CombiningAlgorithm#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combining Algorithm</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combining Algorithm</em>' containment reference.
     * @see #setCombiningAlgorithm(CombiningAlgorithm)
     * @see rule.template.TemplatePackage#getRuleTemplate_CombiningAlgorithm()
     * @see rule.template.CombiningAlgorithm#getTemplate
     * @model opposite="template" containment="true" required="true"
     * @generated
     */
    CombiningAlgorithm getCombiningAlgorithm();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getCombiningAlgorithm <em>Combining Algorithm</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combining Algorithm</em>' containment reference.
     * @see #getCombiningAlgorithm()
     * @generated
     */
    void setCombiningAlgorithm(CombiningAlgorithm value);

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplatePackage#getTemplates <em>Templates</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(RuleTemplatePackage)
     * @see rule.template.TemplatePackage#getRuleTemplate_Package()
     * @see rule.template.RuleTemplatePackage#getTemplates
     * @model opposite="templates" required="true" transient="false"
     * @generated
     */
    RuleTemplatePackage getPackage();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplate#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(RuleTemplatePackage value);

    /**
     * Returns the value of the '<em><b>Execute</b></em>' containment reference list.
     * The list contents are of type {@link rule.action.Execute}.
     * It is bidirectional and its opposite is '{@link rule.action.Execute#getTemplate <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Execute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execute</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplate_Execute()
     * @see rule.action.Execute#getTemplate
     * @model opposite="template" containment="true"
     * @generated
     */
    EList<Execute> getExecute();

} // RuleTemplate
