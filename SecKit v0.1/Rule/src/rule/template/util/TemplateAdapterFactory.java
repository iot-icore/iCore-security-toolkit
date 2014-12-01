/**
 */
package rule.template.util;

import models.Element;

import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.XPathVariableAssignment;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.template.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rule.template.TemplatePackage
 * @generated
 */
public class TemplateAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TemplatePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TemplatePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TemplateSwitch<Adapter> modelSwitch =
        new TemplateSwitch<Adapter>() {
            @Override
            public Adapter caseRuleTemplate(RuleTemplate object) {
                return createRuleTemplateAdapter();
            }
            @Override
            public Adapter caseRuleTemplateConfiguration(RuleTemplateConfiguration object) {
                return createRuleTemplateConfigurationAdapter();
            }
            @Override
            public Adapter caseRuleInstance(RuleInstance object) {
                return createRuleInstanceAdapter();
            }
            @Override
            public Adapter caseRuleVariable(RuleVariable object) {
                return createRuleVariableAdapter();
            }
            @Override
            public Adapter caseRuleTemplateVariable(RuleTemplateVariable object) {
                return createRuleTemplateVariableAdapter();
            }
            @Override
            public Adapter caseRuleInstanceVariable(RuleInstanceVariable object) {
                return createRuleInstanceVariableAdapter();
            }
            @Override
            public Adapter caseRuleXPathVariableAssignment(RuleXPathVariableAssignment object) {
                return createRuleXPathVariableAssignmentAdapter();
            }
            @Override
            public Adapter caseRuleTemplatePackage(RuleTemplatePackage object) {
                return createRuleTemplatePackageAdapter();
            }
            @Override
            public Adapter caseCombiningAlgorithm(CombiningAlgorithm object) {
                return createCombiningAlgorithmAdapter();
            }
            @Override
            public Adapter caseFirstApplicable(FirstApplicable object) {
                return createFirstApplicableAdapter();
            }
            @Override
            public Adapter caseAllowOverrides(AllowOverrides object) {
                return createAllowOverridesAdapter();
            }
            @Override
            public Adapter caseDenyOverrides(DenyOverrides object) {
                return createDenyOverridesAdapter();
            }
            @Override
            public Adapter caseTimeStepSize(TimeStepSize object) {
                return createTimeStepSizeAdapter();
            }
            @Override
            public Adapter caseTimeStepRuleSet(TimeStepRuleSet object) {
                return createTimeStepRuleSetAdapter();
            }
            @Override
            public Adapter caseTemplate(Template object) {
                return createTemplateAdapter();
            }
            @Override
            public Adapter caseTimeStepVariable(TimeStepVariable object) {
                return createTimeStepVariableAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseVariableDeclaration(VariableDeclaration object) {
                return createVariableDeclarationAdapter();
            }
            @Override
            public Adapter caseVariableAssignment(VariableAssignment object) {
                return createVariableAssignmentAdapter();
            }
            @Override
            public Adapter caseXPathVariableAssignment(XPathVariableAssignment object) {
                return createXPathVariableAssignmentAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleTemplate <em>Rule Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleTemplate
     * @generated
     */
    public Adapter createRuleTemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleTemplateConfiguration <em>Rule Template Configuration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleTemplateConfiguration
     * @generated
     */
    public Adapter createRuleTemplateConfigurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleInstance <em>Rule Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleInstance
     * @generated
     */
    public Adapter createRuleInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleVariable <em>Rule Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleVariable
     * @generated
     */
    public Adapter createRuleVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleTemplateVariable <em>Rule Template Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleTemplateVariable
     * @generated
     */
    public Adapter createRuleTemplateVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleInstanceVariable <em>Rule Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleInstanceVariable
     * @generated
     */
    public Adapter createRuleInstanceVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleXPathVariableAssignment <em>Rule XPath Variable Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleXPathVariableAssignment
     * @generated
     */
    public Adapter createRuleXPathVariableAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.RuleTemplatePackage <em>Rule Template Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.RuleTemplatePackage
     * @generated
     */
    public Adapter createRuleTemplatePackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.CombiningAlgorithm <em>Combining Algorithm</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.CombiningAlgorithm
     * @generated
     */
    public Adapter createCombiningAlgorithmAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.FirstApplicable <em>First Applicable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.FirstApplicable
     * @generated
     */
    public Adapter createFirstApplicableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.AllowOverrides <em>Allow Overrides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.AllowOverrides
     * @generated
     */
    public Adapter createAllowOverridesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.DenyOverrides <em>Deny Overrides</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.DenyOverrides
     * @generated
     */
    public Adapter createDenyOverridesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.TimeStepSize <em>Time Step Size</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.TimeStepSize
     * @generated
     */
    public Adapter createTimeStepSizeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.TimeStepRuleSet <em>Time Step Rule Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.TimeStepRuleSet
     * @generated
     */
    public Adapter createTimeStepRuleSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.Template <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.Template
     * @generated
     */
    public Adapter createTemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.template.TimeStepVariable <em>Time Step Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.template.TimeStepVariable
     * @generated
     */
    public Adapter createTimeStepVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.variable.VariableDeclaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.VariableDeclaration
     * @generated
     */
    public Adapter createVariableDeclarationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.variable.VariableAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.VariableAssignment
     * @generated
     */
    public Adapter createVariableAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.variable.XPathVariableAssignment <em>XPath Variable Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.XPathVariableAssignment
     * @generated
     */
    public Adapter createXPathVariableAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TemplateAdapterFactory
