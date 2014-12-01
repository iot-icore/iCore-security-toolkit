/**
 */
package rule.template;

import models.Element;

import org.eclipse.emf.common.util.EList;

import rule.RuleDesignModel;

import rule.condition.FormulaTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Template Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.template.RuleTemplatePackage#getName <em>Name</em>}</li>
 *   <li>{@link rule.template.RuleTemplatePackage#getTemplates <em>Templates</em>}</li>
 *   <li>{@link rule.template.RuleTemplatePackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link rule.template.RuleTemplatePackage#getFormulaTemplates <em>Formula Templates</em>}</li>
 *   <li>{@link rule.template.RuleTemplatePackage#getModel <em>Model</em>}</li>
 *   <li>{@link rule.template.RuleTemplatePackage#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.template.TemplatePackage#getRuleTemplatePackage()
 * @model
 * @generated
 */
public interface RuleTemplatePackage extends Element {
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
     * @see rule.template.TemplatePackage#getRuleTemplatePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplatePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleTemplate}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplate#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Templates</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplatePackage_Templates()
     * @see rule.template.RuleTemplate#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<RuleTemplate> getTemplates();

    /**
     * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleTemplatePackage}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Packages</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplatePackage_SubPackages()
     * @model containment="true"
     * @generated
     */
    EList<RuleTemplatePackage> getSubPackages();

    /**
     * Returns the value of the '<em><b>Formula Templates</b></em>' containment reference list.
     * The list contents are of type {@link rule.condition.FormulaTemplate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formula Templates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formula Templates</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplatePackage_FormulaTemplates()
     * @model containment="true"
     * @generated
     */
    EList<FormulaTemplate> getFormulaTemplates();

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.RuleDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(RuleDesignModel)
     * @see rule.template.TemplatePackage#getRuleTemplatePackage_Model()
     * @see rule.RuleDesignModel#getPackages
     * @model opposite="packages" transient="false"
     * @generated
     */
    RuleDesignModel getModel();

    /**
     * Sets the value of the '{@link rule.template.RuleTemplatePackage#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(RuleDesignModel value);

    /**
     * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleTemplateConfiguration}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplateConfiguration#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' containment reference list.
     * @see rule.template.TemplatePackage#getRuleTemplatePackage_Configurations()
     * @see rule.template.RuleTemplateConfiguration#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<RuleTemplateConfiguration> getConfigurations();

} // RuleTemplatePackage
