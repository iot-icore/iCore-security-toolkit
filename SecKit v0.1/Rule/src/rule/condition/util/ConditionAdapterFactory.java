/**
 */
package rule.condition.util;

import models.Element;
import models.Pattern;

import models.variable.StaticAssignment;
import models.variable.VariableAssignment;
import models.variable.VariableDeclaration;
import models.variable.VariableReference;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rule.condition.*;

import rule.template.Template;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rule.condition.ConditionPackage
 * @generated
 */
public class ConditionAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ConditionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ConditionPackage.eINSTANCE;
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
    protected ConditionSwitch<Adapter> modelSwitch =
        new ConditionSwitch<Adapter>() {
            @Override
            public Adapter caseAtom(Atom object) {
                return createAtomAdapter();
            }
            @Override
            public Adapter caseOperator(Operator object) {
                return createOperatorAdapter();
            }
            @Override
            public Adapter caseConstant(Constant object) {
                return createConstantAdapter();
            }
            @Override
            public Adapter caseFormulaTemplate(FormulaTemplate object) {
                return createFormulaTemplateAdapter();
            }
            @Override
            public Adapter caseFormulaInstantiation(FormulaInstantiation object) {
                return createFormulaInstantiationAdapter();
            }
            @Override
            public Adapter caseEventPattern(EventPattern object) {
                return createEventPatternAdapter();
            }
            @Override
            public Adapter caseTimeStepEventPattern(TimeStepEventPattern object) {
                return createTimeStepEventPatternAdapter();
            }
            @Override
            public Adapter caseFormulaVariableReference(FormulaVariableReference object) {
                return createFormulaVariableReferenceAdapter();
            }
            @Override
            public Adapter caseFormulaAssignment(FormulaAssignment object) {
                return createFormulaAssignmentAdapter();
            }
            @Override
            public Adapter caseFormulaVariable(FormulaVariable object) {
                return createFormulaVariableAdapter();
            }
            @Override
            public Adapter caseUnary(Unary object) {
                return createUnaryAdapter();
            }
            @Override
            public Adapter caseBinary(Binary object) {
                return createBinaryAdapter();
            }
            @Override
            public Adapter caseMultiary(Multiary object) {
                return createMultiaryAdapter();
            }
            @Override
            public Adapter caseNullary(Nullary object) {
                return createNullaryAdapter();
            }
            @Override
            public Adapter caseArity(Arity object) {
                return createArityAdapter();
            }
            @Override
            public Adapter casePatternOperator(PatternOperator object) {
                return createPatternOperatorAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseTemplate(Template object) {
                return createTemplateAdapter();
            }
            @Override
            public Adapter casePattern(Pattern object) {
                return createPatternAdapter();
            }
            @Override
            public Adapter caseVariableReference(VariableReference object) {
                return createVariableReferenceAdapter();
            }
            @Override
            public Adapter caseVariableAssignment(VariableAssignment object) {
                return createVariableAssignmentAdapter();
            }
            @Override
            public Adapter caseStaticAssignment(StaticAssignment object) {
                return createStaticAssignmentAdapter();
            }
            @Override
            public Adapter caseVariableDeclaration(VariableDeclaration object) {
                return createVariableDeclarationAdapter();
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
     * Creates a new adapter for an object of class '{@link rule.condition.Atom <em>Atom</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Atom
     * @generated
     */
    public Adapter createAtomAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Operator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Operator
     * @generated
     */
    public Adapter createOperatorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Constant <em>Constant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Constant
     * @generated
     */
    public Adapter createConstantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.FormulaTemplate <em>Formula Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.FormulaTemplate
     * @generated
     */
    public Adapter createFormulaTemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.FormulaInstantiation <em>Formula Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.FormulaInstantiation
     * @generated
     */
    public Adapter createFormulaInstantiationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.EventPattern <em>Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.EventPattern
     * @generated
     */
    public Adapter createEventPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.TimeStepEventPattern <em>Time Step Event Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.TimeStepEventPattern
     * @generated
     */
    public Adapter createTimeStepEventPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.FormulaVariableReference <em>Formula Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.FormulaVariableReference
     * @generated
     */
    public Adapter createFormulaVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.FormulaAssignment <em>Formula Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.FormulaAssignment
     * @generated
     */
    public Adapter createFormulaAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.FormulaVariable <em>Formula Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.FormulaVariable
     * @generated
     */
    public Adapter createFormulaVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Unary <em>Unary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Unary
     * @generated
     */
    public Adapter createUnaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Binary <em>Binary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Binary
     * @generated
     */
    public Adapter createBinaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Multiary <em>Multiary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Multiary
     * @generated
     */
    public Adapter createMultiaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Nullary <em>Nullary</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Nullary
     * @generated
     */
    public Adapter createNullaryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.Arity <em>Arity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.Arity
     * @generated
     */
    public Adapter createArityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link rule.condition.PatternOperator <em>Pattern Operator</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see rule.condition.PatternOperator
     * @generated
     */
    public Adapter createPatternOperatorAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Pattern
     * @generated
     */
    public Adapter createPatternAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.variable.VariableReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.VariableReference
     * @generated
     */
    public Adapter createVariableReferenceAdapter() {
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
     * Creates a new adapter for an object of class '{@link models.variable.StaticAssignment <em>Static Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.variable.StaticAssignment
     * @generated
     */
    public Adapter createStaticAssignmentAdapter() {
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

} //ConditionAdapterFactory
