/**
 */
package models.variable;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see models.variable.VariableFactory
 * @model kind="package"
 * @generated
 */
public interface VariablePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "variable";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://models/variable/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "models-variable";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablePackage eINSTANCE = models.variable.impl.VariablePackageImpl.init();

    /**
     * The meta object id for the '{@link models.variable.impl.VariableAssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.VariableAssignmentImpl
     * @see models.variable.impl.VariablePackageImpl#getVariableAssignment()
     * @generated
     */
    int VARIABLE_ASSIGNMENT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ASSIGNMENT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ASSIGNMENT__TARGET = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ASSIGNMENT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ASSIGNMENT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.variable.impl.VariableInstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.VariableInstanceImpl
     * @see models.variable.impl.VariablePackageImpl#getVariableInstance()
     * @generated
     */
    int VARIABLE_INSTANCE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_INSTANCE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_INSTANCE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_INSTANCE__VALUE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_INSTANCE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Instance</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_INSTANCE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.variable.impl.ReferenceVariableAssignmentImpl <em>Reference Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.ReferenceVariableAssignmentImpl
     * @see models.variable.impl.VariablePackageImpl#getReferenceVariableAssignment()
     * @generated
     */
    int REFERENCE_VARIABLE_ASSIGNMENT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_VARIABLE_ASSIGNMENT__ID = VARIABLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS = VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_VARIABLE_ASSIGNMENT__TARGET = VARIABLE_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_VARIABLE_ASSIGNMENT__SOURCE = VARIABLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_VARIABLE_ASSIGNMENT_FEATURE_COUNT = VARIABLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Reference Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_VARIABLE_ASSIGNMENT_OPERATION_COUNT = VARIABLE_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.variable.impl.StaticAssignmentImpl <em>Static Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.StaticAssignmentImpl
     * @see models.variable.impl.VariablePackageImpl#getStaticAssignment()
     * @generated
     */
    int STATIC_ASSIGNMENT = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_ASSIGNMENT__ID = VARIABLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_ASSIGNMENT__VISUAL_ELEMENTS = VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_ASSIGNMENT__TARGET = VARIABLE_ASSIGNMENT__TARGET;

    /**
     * The number of structural features of the '<em>Static Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_ASSIGNMENT_FEATURE_COUNT = VARIABLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Static Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_ASSIGNMENT_OPERATION_COUNT = VARIABLE_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.variable.impl.VariableDeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.VariableDeclarationImpl
     * @see models.variable.impl.VariablePackageImpl#getVariableDeclaration()
     * @generated
     */
    int VARIABLE_DECLARATION = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_DECLARATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.variable.impl.VariableReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.VariableReferenceImpl
     * @see models.variable.impl.VariablePackageImpl#getVariableReference()
     * @generated
     */
    int VARIABLE_REFERENCE = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The number of structural features of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REFERENCE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link models.variable.impl.XPathVariableAssignmentImpl <em>XPath Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.XPathVariableAssignmentImpl
     * @see models.variable.impl.VariablePackageImpl#getXPathVariableAssignment()
     * @generated
     */
    int XPATH_VARIABLE_ASSIGNMENT = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_VARIABLE_ASSIGNMENT__ID = VARIABLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS = VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_VARIABLE_ASSIGNMENT__TARGET = VARIABLE_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_VARIABLE_ASSIGNMENT__EXPRESSION = VARIABLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>XPath Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_VARIABLE_ASSIGNMENT_FEATURE_COUNT = VARIABLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>XPath Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_VARIABLE_ASSIGNMENT_OPERATION_COUNT = VARIABLE_ASSIGNMENT_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link models.variable.impl.StringAssignmentImpl <em>String Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.StringAssignmentImpl
     * @see models.variable.impl.VariablePackageImpl#getStringAssignment()
     * @generated
     */
    int STRING_ASSIGNMENT = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_ASSIGNMENT__ID = STATIC_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_ASSIGNMENT__VISUAL_ELEMENTS = STATIC_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_ASSIGNMENT__TARGET = STATIC_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_ASSIGNMENT__VALUE = STATIC_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_ASSIGNMENT_FEATURE_COUNT = STATIC_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>String Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_ASSIGNMENT_OPERATION_COUNT = STATIC_ASSIGNMENT_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link models.variable.impl.RegExpVariableAssignmentImpl <em>Reg Exp Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see models.variable.impl.RegExpVariableAssignmentImpl
     * @see models.variable.impl.VariablePackageImpl#getRegExpVariableAssignment()
     * @generated
     */
    int REG_EXP_VARIABLE_ASSIGNMENT = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__ID = REFERENCE_VARIABLE_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS = REFERENCE_VARIABLE_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__TARGET = REFERENCE_VARIABLE_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__SOURCE = REFERENCE_VARIABLE_ASSIGNMENT__SOURCE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION = REFERENCE_VARIABLE_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__MATCH = REFERENCE_VARIABLE_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT__GROUP = REFERENCE_VARIABLE_ASSIGNMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Reg Exp Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT_FEATURE_COUNT = REFERENCE_VARIABLE_ASSIGNMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Reg Exp Variable Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_VARIABLE_ASSIGNMENT_OPERATION_COUNT = REFERENCE_VARIABLE_ASSIGNMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link models.variable.VariableAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see models.variable.VariableAssignment
     * @generated
     */
    EClass getVariableAssignment();

    /**
     * Returns the meta object for the reference '{@link models.variable.VariableAssignment#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see models.variable.VariableAssignment#getTarget()
     * @see #getVariableAssignment()
     * @generated
     */
    EReference getVariableAssignment_Target();

    /**
     * Returns the meta object for class '{@link models.variable.VariableInstance <em>Instance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance</em>'.
     * @see models.variable.VariableInstance
     * @generated
     */
    EClass getVariableInstance();

    /**
     * Returns the meta object for the reference '{@link models.variable.VariableInstance#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Value</em>'.
     * @see models.variable.VariableInstance#getValue()
     * @see #getVariableInstance()
     * @generated
     */
    EReference getVariableInstance_Value();

    /**
     * Returns the meta object for class '{@link models.variable.ReferenceVariableAssignment <em>Reference Variable Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Variable Assignment</em>'.
     * @see models.variable.ReferenceVariableAssignment
     * @generated
     */
    EClass getReferenceVariableAssignment();

    /**
     * Returns the meta object for the reference '{@link models.variable.ReferenceVariableAssignment#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see models.variable.ReferenceVariableAssignment#getSource()
     * @see #getReferenceVariableAssignment()
     * @generated
     */
    EReference getReferenceVariableAssignment_Source();

    /**
     * Returns the meta object for class '{@link models.variable.StaticAssignment <em>Static Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Assignment</em>'.
     * @see models.variable.StaticAssignment
     * @generated
     */
    EClass getStaticAssignment();

    /**
     * Returns the meta object for class '{@link models.variable.VariableDeclaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Declaration</em>'.
     * @see models.variable.VariableDeclaration
     * @generated
     */
    EClass getVariableDeclaration();

    /**
     * Returns the meta object for the attribute '{@link models.variable.VariableDeclaration#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see models.variable.VariableDeclaration#getName()
     * @see #getVariableDeclaration()
     * @generated
     */
    EAttribute getVariableDeclaration_Name();

    /**
     * Returns the meta object for class '{@link models.variable.VariableReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference</em>'.
     * @see models.variable.VariableReference
     * @generated
     */
    EClass getVariableReference();

    /**
     * Returns the meta object for class '{@link models.variable.XPathVariableAssignment <em>XPath Variable Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XPath Variable Assignment</em>'.
     * @see models.variable.XPathVariableAssignment
     * @generated
     */
    EClass getXPathVariableAssignment();

    /**
     * Returns the meta object for the attribute '{@link models.variable.XPathVariableAssignment#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see models.variable.XPathVariableAssignment#getExpression()
     * @see #getXPathVariableAssignment()
     * @generated
     */
    EAttribute getXPathVariableAssignment_Expression();

    /**
     * Returns the meta object for class '{@link models.variable.StringAssignment <em>String Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Assignment</em>'.
     * @see models.variable.StringAssignment
     * @generated
     */
    EClass getStringAssignment();

    /**
     * Returns the meta object for the attribute '{@link models.variable.StringAssignment#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see models.variable.StringAssignment#getValue()
     * @see #getStringAssignment()
     * @generated
     */
    EAttribute getStringAssignment_Value();

    /**
     * Returns the meta object for class '{@link models.variable.RegExpVariableAssignment <em>Reg Exp Variable Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reg Exp Variable Assignment</em>'.
     * @see models.variable.RegExpVariableAssignment
     * @generated
     */
    EClass getRegExpVariableAssignment();

    /**
     * Returns the meta object for the attribute '{@link models.variable.RegExpVariableAssignment#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see models.variable.RegExpVariableAssignment#getExpression()
     * @see #getRegExpVariableAssignment()
     * @generated
     */
    EAttribute getRegExpVariableAssignment_Expression();

    /**
     * Returns the meta object for the attribute '{@link models.variable.RegExpVariableAssignment#getMatch <em>Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Match</em>'.
     * @see models.variable.RegExpVariableAssignment#getMatch()
     * @see #getRegExpVariableAssignment()
     * @generated
     */
    EAttribute getRegExpVariableAssignment_Match();

    /**
     * Returns the meta object for the attribute '{@link models.variable.RegExpVariableAssignment#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group</em>'.
     * @see models.variable.RegExpVariableAssignment#getGroup()
     * @see #getRegExpVariableAssignment()
     * @generated
     */
    EAttribute getRegExpVariableAssignment_Group();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    VariableFactory getVariableFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link models.variable.impl.VariableAssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.VariableAssignmentImpl
         * @see models.variable.impl.VariablePackageImpl#getVariableAssignment()
         * @generated
         */
        EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_ASSIGNMENT__TARGET = eINSTANCE.getVariableAssignment_Target();

        /**
         * The meta object literal for the '{@link models.variable.impl.VariableInstanceImpl <em>Instance</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.VariableInstanceImpl
         * @see models.variable.impl.VariablePackageImpl#getVariableInstance()
         * @generated
         */
        EClass VARIABLE_INSTANCE = eINSTANCE.getVariableInstance();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_INSTANCE__VALUE = eINSTANCE.getVariableInstance_Value();

        /**
         * The meta object literal for the '{@link models.variable.impl.ReferenceVariableAssignmentImpl <em>Reference Variable Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.ReferenceVariableAssignmentImpl
         * @see models.variable.impl.VariablePackageImpl#getReferenceVariableAssignment()
         * @generated
         */
        EClass REFERENCE_VARIABLE_ASSIGNMENT = eINSTANCE.getReferenceVariableAssignment();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_VARIABLE_ASSIGNMENT__SOURCE = eINSTANCE.getReferenceVariableAssignment_Source();

        /**
         * The meta object literal for the '{@link models.variable.impl.StaticAssignmentImpl <em>Static Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.StaticAssignmentImpl
         * @see models.variable.impl.VariablePackageImpl#getStaticAssignment()
         * @generated
         */
        EClass STATIC_ASSIGNMENT = eINSTANCE.getStaticAssignment();

        /**
         * The meta object literal for the '{@link models.variable.impl.VariableDeclarationImpl <em>Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.VariableDeclarationImpl
         * @see models.variable.impl.VariablePackageImpl#getVariableDeclaration()
         * @generated
         */
        EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

        /**
         * The meta object literal for the '{@link models.variable.impl.VariableReferenceImpl <em>Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.VariableReferenceImpl
         * @see models.variable.impl.VariablePackageImpl#getVariableReference()
         * @generated
         */
        EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

        /**
         * The meta object literal for the '{@link models.variable.impl.XPathVariableAssignmentImpl <em>XPath Variable Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.XPathVariableAssignmentImpl
         * @see models.variable.impl.VariablePackageImpl#getXPathVariableAssignment()
         * @generated
         */
        EClass XPATH_VARIABLE_ASSIGNMENT = eINSTANCE.getXPathVariableAssignment();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XPATH_VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getXPathVariableAssignment_Expression();

        /**
         * The meta object literal for the '{@link models.variable.impl.StringAssignmentImpl <em>String Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.StringAssignmentImpl
         * @see models.variable.impl.VariablePackageImpl#getStringAssignment()
         * @generated
         */
        EClass STRING_ASSIGNMENT = eINSTANCE.getStringAssignment();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_ASSIGNMENT__VALUE = eINSTANCE.getStringAssignment_Value();

        /**
         * The meta object literal for the '{@link models.variable.impl.RegExpVariableAssignmentImpl <em>Reg Exp Variable Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see models.variable.impl.RegExpVariableAssignmentImpl
         * @see models.variable.impl.VariablePackageImpl#getRegExpVariableAssignment()
         * @generated
         */
        EClass REG_EXP_VARIABLE_ASSIGNMENT = eINSTANCE.getRegExpVariableAssignment();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getRegExpVariableAssignment_Expression();

        /**
         * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REG_EXP_VARIABLE_ASSIGNMENT__MATCH = eINSTANCE.getRegExpVariableAssignment_Match();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REG_EXP_VARIABLE_ASSIGNMENT__GROUP = eINSTANCE.getRegExpVariableAssignment_Group();

    }

} //VariablePackage
