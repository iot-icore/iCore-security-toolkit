/**
 */
package behavior.constraint;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see behavior.constraint.ConstraintFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "constraint";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/constraint/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior-constraint";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConstraintPackage eINSTANCE = behavior.constraint.impl.ConstraintPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.ConstraintImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getConstraint()
     * @generated
     */
    int CONSTRAINT = 10;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The number of structural features of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.DataConstraintImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getDataConstraint()
     * @generated
     */
    int DATA_CONSTRAINT = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_CONSTRAINT__VISUAL_ELEMENTS = CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_CONSTRAINT__ID = CONSTRAINT__ID;

    /**
     * The number of structural features of the '<em>Data Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.DataEstablishmentImpl <em>Data Establishment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.DataEstablishmentImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getDataEstablishment()
     * @generated
     */
    int DATA_ESTABLISHMENT = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT__VISUAL_ELEMENTS = DATA_CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT__ID = DATA_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT__TARGET = DATA_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FEATURE_COUNT = DATA_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_OPERATION_COUNT = DATA_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.ReferenceDataEstablishmentImpl <em>Reference Data Establishment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.ReferenceDataEstablishmentImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getReferenceDataEstablishment()
     * @generated
     */
    int REFERENCE_DATA_ESTABLISHMENT = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DATA_ESTABLISHMENT__VISUAL_ELEMENTS = DATA_ESTABLISHMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DATA_ESTABLISHMENT__ID = DATA_ESTABLISHMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DATA_ESTABLISHMENT__TARGET = DATA_ESTABLISHMENT__TARGET;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DATA_ESTABLISHMENT__SOURCE = DATA_ESTABLISHMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference Data Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DATA_ESTABLISHMENT_FEATURE_COUNT = DATA_ESTABLISHMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Reference Data Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_DATA_ESTABLISHMENT_OPERATION_COUNT = DATA_ESTABLISHMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.ValueCheckingConstraintImpl <em>Value Checking Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.ValueCheckingConstraintImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getValueCheckingConstraint()
     * @generated
     */
    int VALUE_CHECKING_CONSTRAINT = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CHECKING_CONSTRAINT__VISUAL_ELEMENTS = DATA_CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CHECKING_CONSTRAINT__ID = DATA_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CHECKING_CONSTRAINT__TYPE = DATA_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Value Checking Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CHECKING_CONSTRAINT_FEATURE_COUNT = DATA_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Value Checking Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_CHECKING_CONSTRAINT_OPERATION_COUNT = DATA_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.RangeOfValuesImpl <em>Range Of Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.RangeOfValuesImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getRangeOfValues()
     * @generated
     */
    int RANGE_OF_VALUES = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES__VISUAL_ELEMENTS = VALUE_CHECKING_CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES__ID = VALUE_CHECKING_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES__TYPE = VALUE_CHECKING_CONSTRAINT__TYPE;

    /**
     * The feature id for the '<em><b>Lower Bound Inclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE = VALUE_CHECKING_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Upper Bound Inclusive</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE = VALUE_CHECKING_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Range Of Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES_FEATURE_COUNT = VALUE_CHECKING_CONSTRAINT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Range Of Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_OF_VALUES_OPERATION_COUNT = VALUE_CHECKING_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.SetOfValuesImpl <em>Set Of Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.SetOfValuesImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getSetOfValues()
     * @generated
     */
    int SET_OF_VALUES = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_OF_VALUES__VISUAL_ELEMENTS = VALUE_CHECKING_CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_OF_VALUES__ID = VALUE_CHECKING_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_OF_VALUES__TYPE = VALUE_CHECKING_CONSTRAINT__TYPE;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_OF_VALUES__VALUES = VALUE_CHECKING_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Set Of Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_OF_VALUES_FEATURE_COUNT = VALUE_CHECKING_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Set Of Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_OF_VALUES_OPERATION_COUNT = VALUE_CHECKING_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.StaticDataEstablishmentImpl <em>Static Data Establishment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.StaticDataEstablishmentImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getStaticDataEstablishment()
     * @generated
     */
    int STATIC_DATA_ESTABLISHMENT = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_ESTABLISHMENT__VISUAL_ELEMENTS = DATA_ESTABLISHMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_ESTABLISHMENT__ID = DATA_ESTABLISHMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_ESTABLISHMENT__TARGET = DATA_ESTABLISHMENT__TARGET;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_ESTABLISHMENT__VALUE = DATA_ESTABLISHMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Static Data Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_ESTABLISHMENT_FEATURE_COUNT = DATA_ESTABLISHMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Static Data Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATIC_DATA_ESTABLISHMENT_OPERATION_COUNT = DATA_ESTABLISHMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.DataEstablishmentFromVariableImpl <em>Data Establishment From Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.DataEstablishmentFromVariableImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getDataEstablishmentFromVariable()
     * @generated
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE = 7;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE__VISUAL_ELEMENTS = DATA_ESTABLISHMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE__ID = DATA_ESTABLISHMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE__TARGET = DATA_ESTABLISHMENT__TARGET;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE__SOURCE = DATA_ESTABLISHMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Establishment From Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE_FEATURE_COUNT = DATA_ESTABLISHMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Establishment From Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ESTABLISHMENT_FROM_VARIABLE_OPERATION_COUNT = DATA_ESTABLISHMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.IdentityConstraintImpl <em>Identity Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.IdentityConstraintImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getIdentityConstraint()
     * @generated
     */
    int IDENTITY_CONSTRAINT = 8;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_CONSTRAINT__VISUAL_ELEMENTS = CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_CONSTRAINT__ID = CONSTRAINT__ID;

    /**
     * The number of structural features of the '<em>Identity Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Identity Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.IdentityEstablishmentImpl <em>Identity Establishment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.IdentityEstablishmentImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getIdentityEstablishment()
     * @generated
     */
    int IDENTITY_ESTABLISHMENT = 9;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT__VISUAL_ELEMENTS = IDENTITY_CONSTRAINT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT__ID = IDENTITY_CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT__TARGET = IDENTITY_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FEATURE_COUNT = IDENTITY_CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_OPERATION_COUNT = IDENTITY_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.IdentityEstablishmentFromVariableImpl <em>Identity Establishment From Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.IdentityEstablishmentFromVariableImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getIdentityEstablishmentFromVariable()
     * @generated
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE = 11;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE__VISUAL_ELEMENTS = IDENTITY_ESTABLISHMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE__ID = IDENTITY_ESTABLISHMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE__TARGET = IDENTITY_ESTABLISHMENT__TARGET;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE__SOURCE = IDENTITY_ESTABLISHMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Establishment From Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE_FEATURE_COUNT = IDENTITY_ESTABLISHMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Establishment From Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ESTABLISHMENT_FROM_VARIABLE_OPERATION_COUNT = IDENTITY_ESTABLISHMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.VariableEstablishmentImpl <em>Variable Establishment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.VariableEstablishmentImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getVariableEstablishment()
     * @generated
     */
    int VARIABLE_ESTABLISHMENT = 12;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ESTABLISHMENT__SOURCE = 0;

    /**
     * The number of structural features of the '<em>Variable Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ESTABLISHMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Variable Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_ESTABLISHMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link behavior.constraint.impl.ReferenceIdentityEstablishmentImpl <em>Reference Identity Establishment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.impl.ReferenceIdentityEstablishmentImpl
     * @see behavior.constraint.impl.ConstraintPackageImpl#getReferenceIdentityEstablishment()
     * @generated
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT = 13;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT__VISUAL_ELEMENTS = IDENTITY_ESTABLISHMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT__ID = IDENTITY_ESTABLISHMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT__TARGET = IDENTITY_ESTABLISHMENT__TARGET;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT__SOURCE = IDENTITY_ESTABLISHMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference Identity Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT_FEATURE_COUNT = IDENTITY_ESTABLISHMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Reference Identity Establishment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_IDENTITY_ESTABLISHMENT_OPERATION_COUNT = IDENTITY_ESTABLISHMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.constraint.ConstraintType <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.ConstraintType
     * @see behavior.constraint.impl.ConstraintPackageImpl#getConstraintType()
     * @generated
     */
    int CONSTRAINT_TYPE = 14;

    /**
     * The meta object id for the '{@link behavior.constraint.AttributeValueEstablishmentTypes <em>Attribute Value Establishment Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.constraint.AttributeValueEstablishmentTypes
     * @see behavior.constraint.impl.ConstraintPackageImpl#getAttributeValueEstablishmentTypes()
     * @generated
     */
    int ATTRIBUTE_VALUE_ESTABLISHMENT_TYPES = 15;


    /**
     * Returns the meta object for class '{@link behavior.constraint.DataConstraint <em>Data Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Constraint</em>'.
     * @see behavior.constraint.DataConstraint
     * @generated
     */
    EClass getDataConstraint();

    /**
     * Returns the meta object for class '{@link behavior.constraint.ReferenceDataEstablishment <em>Reference Data Establishment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Data Establishment</em>'.
     * @see behavior.constraint.ReferenceDataEstablishment
     * @generated
     */
    EClass getReferenceDataEstablishment();

    /**
     * Returns the meta object for the reference '{@link behavior.constraint.ReferenceDataEstablishment#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see behavior.constraint.ReferenceDataEstablishment#getSource()
     * @see #getReferenceDataEstablishment()
     * @generated
     */
    EReference getReferenceDataEstablishment_Source();

    /**
     * Returns the meta object for class '{@link behavior.constraint.DataEstablishment <em>Data Establishment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Establishment</em>'.
     * @see behavior.constraint.DataEstablishment
     * @generated
     */
    EClass getDataEstablishment();

    /**
     * Returns the meta object for the reference '{@link behavior.constraint.DataEstablishment#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see behavior.constraint.DataEstablishment#getTarget()
     * @see #getDataEstablishment()
     * @generated
     */
    EReference getDataEstablishment_Target();

    /**
     * Returns the meta object for class '{@link behavior.constraint.ValueCheckingConstraint <em>Value Checking Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Checking Constraint</em>'.
     * @see behavior.constraint.ValueCheckingConstraint
     * @generated
     */
    EClass getValueCheckingConstraint();

    /**
     * Returns the meta object for the attribute '{@link behavior.constraint.ValueCheckingConstraint#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see behavior.constraint.ValueCheckingConstraint#getType()
     * @see #getValueCheckingConstraint()
     * @generated
     */
    EAttribute getValueCheckingConstraint_Type();

    /**
     * Returns the meta object for class '{@link behavior.constraint.RangeOfValues <em>Range Of Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Range Of Values</em>'.
     * @see behavior.constraint.RangeOfValues
     * @generated
     */
    EClass getRangeOfValues();

    /**
     * Returns the meta object for the containment reference '{@link behavior.constraint.RangeOfValues#getLowerBoundInclusive <em>Lower Bound Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lower Bound Inclusive</em>'.
     * @see behavior.constraint.RangeOfValues#getLowerBoundInclusive()
     * @see #getRangeOfValues()
     * @generated
     */
    EReference getRangeOfValues_LowerBoundInclusive();

    /**
     * Returns the meta object for the containment reference '{@link behavior.constraint.RangeOfValues#getUpperBoundInclusive <em>Upper Bound Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Upper Bound Inclusive</em>'.
     * @see behavior.constraint.RangeOfValues#getUpperBoundInclusive()
     * @see #getRangeOfValues()
     * @generated
     */
    EReference getRangeOfValues_UpperBoundInclusive();

    /**
     * Returns the meta object for class '{@link behavior.constraint.SetOfValues <em>Set Of Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Of Values</em>'.
     * @see behavior.constraint.SetOfValues
     * @generated
     */
    EClass getSetOfValues();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.constraint.SetOfValues#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see behavior.constraint.SetOfValues#getValues()
     * @see #getSetOfValues()
     * @generated
     */
    EReference getSetOfValues_Values();

    /**
     * Returns the meta object for class '{@link behavior.constraint.StaticDataEstablishment <em>Static Data Establishment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Static Data Establishment</em>'.
     * @see behavior.constraint.StaticDataEstablishment
     * @generated
     */
    EClass getStaticDataEstablishment();

    /**
     * Returns the meta object for the containment reference '{@link behavior.constraint.StaticDataEstablishment#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see behavior.constraint.StaticDataEstablishment#getValue()
     * @see #getStaticDataEstablishment()
     * @generated
     */
    EReference getStaticDataEstablishment_Value();

    /**
     * Returns the meta object for class '{@link behavior.constraint.DataEstablishmentFromVariable <em>Data Establishment From Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Establishment From Variable</em>'.
     * @see behavior.constraint.DataEstablishmentFromVariable
     * @generated
     */
    EClass getDataEstablishmentFromVariable();

    /**
     * Returns the meta object for class '{@link behavior.constraint.IdentityConstraint <em>Identity Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Constraint</em>'.
     * @see behavior.constraint.IdentityConstraint
     * @generated
     */
    EClass getIdentityConstraint();

    /**
     * Returns the meta object for class '{@link behavior.constraint.IdentityEstablishment <em>Identity Establishment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Establishment</em>'.
     * @see behavior.constraint.IdentityEstablishment
     * @generated
     */
    EClass getIdentityEstablishment();

    /**
     * Returns the meta object for the reference '{@link behavior.constraint.IdentityEstablishment#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see behavior.constraint.IdentityEstablishment#getTarget()
     * @see #getIdentityEstablishment()
     * @generated
     */
    EReference getIdentityEstablishment_Target();

    /**
     * Returns the meta object for class '{@link behavior.constraint.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraint</em>'.
     * @see behavior.constraint.Constraint
     * @generated
     */
    EClass getConstraint();

    /**
     * Returns the meta object for class '{@link behavior.constraint.IdentityEstablishmentFromVariable <em>Identity Establishment From Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Establishment From Variable</em>'.
     * @see behavior.constraint.IdentityEstablishmentFromVariable
     * @generated
     */
    EClass getIdentityEstablishmentFromVariable();

    /**
     * Returns the meta object for class '{@link behavior.constraint.VariableEstablishment <em>Variable Establishment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Establishment</em>'.
     * @see behavior.constraint.VariableEstablishment
     * @generated
     */
    EClass getVariableEstablishment();

    /**
     * Returns the meta object for the reference '{@link behavior.constraint.VariableEstablishment#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see behavior.constraint.VariableEstablishment#getSource()
     * @see #getVariableEstablishment()
     * @generated
     */
    EReference getVariableEstablishment_Source();

    /**
     * Returns the meta object for class '{@link behavior.constraint.ReferenceIdentityEstablishment <em>Reference Identity Establishment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Identity Establishment</em>'.
     * @see behavior.constraint.ReferenceIdentityEstablishment
     * @generated
     */
    EClass getReferenceIdentityEstablishment();

    /**
     * Returns the meta object for the reference '{@link behavior.constraint.ReferenceIdentityEstablishment#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see behavior.constraint.ReferenceIdentityEstablishment#getSource()
     * @see #getReferenceIdentityEstablishment()
     * @generated
     */
    EReference getReferenceIdentityEstablishment_Source();

    /**
     * Returns the meta object for enum '{@link behavior.constraint.ConstraintType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type</em>'.
     * @see behavior.constraint.ConstraintType
     * @generated
     */
    EEnum getConstraintType();

    /**
     * Returns the meta object for enum '{@link behavior.constraint.AttributeValueEstablishmentTypes <em>Attribute Value Establishment Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Attribute Value Establishment Types</em>'.
     * @see behavior.constraint.AttributeValueEstablishmentTypes
     * @generated
     */
    EEnum getAttributeValueEstablishmentTypes();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ConstraintFactory getConstraintFactory();

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
         * The meta object literal for the '{@link behavior.constraint.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.DataConstraintImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getDataConstraint()
         * @generated
         */
        EClass DATA_CONSTRAINT = eINSTANCE.getDataConstraint();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.ReferenceDataEstablishmentImpl <em>Reference Data Establishment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.ReferenceDataEstablishmentImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getReferenceDataEstablishment()
         * @generated
         */
        EClass REFERENCE_DATA_ESTABLISHMENT = eINSTANCE.getReferenceDataEstablishment();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_DATA_ESTABLISHMENT__SOURCE = eINSTANCE.getReferenceDataEstablishment_Source();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.DataEstablishmentImpl <em>Data Establishment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.DataEstablishmentImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getDataEstablishment()
         * @generated
         */
        EClass DATA_ESTABLISHMENT = eINSTANCE.getDataEstablishment();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ESTABLISHMENT__TARGET = eINSTANCE.getDataEstablishment_Target();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.ValueCheckingConstraintImpl <em>Value Checking Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.ValueCheckingConstraintImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getValueCheckingConstraint()
         * @generated
         */
        EClass VALUE_CHECKING_CONSTRAINT = eINSTANCE.getValueCheckingConstraint();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VALUE_CHECKING_CONSTRAINT__TYPE = eINSTANCE.getValueCheckingConstraint_Type();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.RangeOfValuesImpl <em>Range Of Values</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.RangeOfValuesImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getRangeOfValues()
         * @generated
         */
        EClass RANGE_OF_VALUES = eINSTANCE.getRangeOfValues();

        /**
         * The meta object literal for the '<em><b>Lower Bound Inclusive</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_OF_VALUES__LOWER_BOUND_INCLUSIVE = eINSTANCE.getRangeOfValues_LowerBoundInclusive();

        /**
         * The meta object literal for the '<em><b>Upper Bound Inclusive</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_OF_VALUES__UPPER_BOUND_INCLUSIVE = eINSTANCE.getRangeOfValues_UpperBoundInclusive();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.SetOfValuesImpl <em>Set Of Values</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.SetOfValuesImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getSetOfValues()
         * @generated
         */
        EClass SET_OF_VALUES = eINSTANCE.getSetOfValues();

        /**
         * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET_OF_VALUES__VALUES = eINSTANCE.getSetOfValues_Values();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.StaticDataEstablishmentImpl <em>Static Data Establishment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.StaticDataEstablishmentImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getStaticDataEstablishment()
         * @generated
         */
        EClass STATIC_DATA_ESTABLISHMENT = eINSTANCE.getStaticDataEstablishment();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATIC_DATA_ESTABLISHMENT__VALUE = eINSTANCE.getStaticDataEstablishment_Value();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.DataEstablishmentFromVariableImpl <em>Data Establishment From Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.DataEstablishmentFromVariableImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getDataEstablishmentFromVariable()
         * @generated
         */
        EClass DATA_ESTABLISHMENT_FROM_VARIABLE = eINSTANCE.getDataEstablishmentFromVariable();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.IdentityConstraintImpl <em>Identity Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.IdentityConstraintImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getIdentityConstraint()
         * @generated
         */
        EClass IDENTITY_CONSTRAINT = eINSTANCE.getIdentityConstraint();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.IdentityEstablishmentImpl <em>Identity Establishment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.IdentityEstablishmentImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getIdentityEstablishment()
         * @generated
         */
        EClass IDENTITY_ESTABLISHMENT = eINSTANCE.getIdentityEstablishment();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ESTABLISHMENT__TARGET = eINSTANCE.getIdentityEstablishment_Target();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.ConstraintImpl <em>Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.ConstraintImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getConstraint()
         * @generated
         */
        EClass CONSTRAINT = eINSTANCE.getConstraint();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.IdentityEstablishmentFromVariableImpl <em>Identity Establishment From Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.IdentityEstablishmentFromVariableImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getIdentityEstablishmentFromVariable()
         * @generated
         */
        EClass IDENTITY_ESTABLISHMENT_FROM_VARIABLE = eINSTANCE.getIdentityEstablishmentFromVariable();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.VariableEstablishmentImpl <em>Variable Establishment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.VariableEstablishmentImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getVariableEstablishment()
         * @generated
         */
        EClass VARIABLE_ESTABLISHMENT = eINSTANCE.getVariableEstablishment();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VARIABLE_ESTABLISHMENT__SOURCE = eINSTANCE.getVariableEstablishment_Source();

        /**
         * The meta object literal for the '{@link behavior.constraint.impl.ReferenceIdentityEstablishmentImpl <em>Reference Identity Establishment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.impl.ReferenceIdentityEstablishmentImpl
         * @see behavior.constraint.impl.ConstraintPackageImpl#getReferenceIdentityEstablishment()
         * @generated
         */
        EClass REFERENCE_IDENTITY_ESTABLISHMENT = eINSTANCE.getReferenceIdentityEstablishment();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_IDENTITY_ESTABLISHMENT__SOURCE = eINSTANCE.getReferenceIdentityEstablishment_Source();

        /**
         * The meta object literal for the '{@link behavior.constraint.ConstraintType <em>Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.ConstraintType
         * @see behavior.constraint.impl.ConstraintPackageImpl#getConstraintType()
         * @generated
         */
        EEnum CONSTRAINT_TYPE = eINSTANCE.getConstraintType();

        /**
         * The meta object literal for the '{@link behavior.constraint.AttributeValueEstablishmentTypes <em>Attribute Value Establishment Types</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.constraint.AttributeValueEstablishmentTypes
         * @see behavior.constraint.impl.ConstraintPackageImpl#getAttributeValueEstablishmentTypes()
         * @generated
         */
        EEnum ATTRIBUTE_VALUE_ESTABLISHMENT_TYPES = eINSTANCE.getAttributeValueEstablishmentTypes();

    }

} //ConstraintPackage
