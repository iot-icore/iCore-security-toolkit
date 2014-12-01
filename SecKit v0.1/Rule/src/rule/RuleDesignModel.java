/**
 */
package rule;

import models.Model;

import org.eclipse.emf.common.util.EList;

import rule.template.RuleTemplatePackage;
import rule.template.TimeStepSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.RuleDesignModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link rule.RuleDesignModel#getTimeStepSizes <em>Time Step Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.RulePackage#getRuleDesignModel()
 * @model
 * @generated
 */
public interface RuleDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.RuleTemplatePackage}.
     * It is bidirectional and its opposite is '{@link rule.template.RuleTemplatePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see rule.RulePackage#getRuleDesignModel_Packages()
     * @see rule.template.RuleTemplatePackage#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<RuleTemplatePackage> getPackages();

    /**
     * Returns the value of the '<em><b>Time Step Sizes</b></em>' containment reference list.
     * The list contents are of type {@link rule.template.TimeStepSize}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step Sizes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step Sizes</em>' containment reference list.
     * @see rule.RulePackage#getRuleDesignModel_TimeStepSizes()
     * @model containment="true"
     * @generated
     */
    EList<TimeStepSize> getTimeStepSizes();

} // RuleDesignModel
