/**
 */
package rule.condition.impl;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

import rule.condition.ConditionPackage;
import rule.condition.FormulaVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FormulaVariableImpl extends VariableDeclarationImpl implements FormulaVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FormulaVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.FORMULA_VARIABLE;
    }

} //FormulaVariableImpl
