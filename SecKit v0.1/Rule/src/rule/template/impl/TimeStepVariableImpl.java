/**
 */
package rule.template.impl;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

import rule.template.TemplatePackage;
import rule.template.TimeStepVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Step Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TimeStepVariableImpl extends VariableDeclarationImpl implements TimeStepVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeStepVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.TIME_STEP_VARIABLE;
    }

} //TimeStepVariableImpl
