/**
 */
package rule.template.impl;

import models.variable.impl.VariableDeclarationImpl;

import org.eclipse.emf.ecore.EClass;

import rule.template.RuleVariable;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class RuleVariableImpl extends VariableDeclarationImpl implements RuleVariable {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_VARIABLE;
    }

} //RuleVariableImpl
