/**
 */
package data.variable;

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
 * @see data.variable.VariableFactory
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
    String eNS_URI = "http://data/variable/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-variable";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablePackage eINSTANCE = data.variable.impl.VariablePackageImpl.init();

    /**
     * The meta object id for the '{@link data.variable.impl.DataVariableImpl <em>Data Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataVariableImpl
     * @see data.variable.impl.VariablePackageImpl#getDataVariable()
     * @generated
     */
    int DATA_VARIABLE = 6;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_VARIABLE__VISUAL_ELEMENTS = models.variable.VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_VARIABLE__ID = models.variable.VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_VARIABLE__NAME = models.variable.VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Data Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_VARIABLE_FEATURE_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_VARIABLE_OPERATION_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.variable.impl.DataTypeVariableImpl <em>Data Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataTypeVariableImpl
     * @see data.variable.impl.VariablePackageImpl#getDataTypeVariable()
     * @generated
     */
    int DATA_TYPE_VARIABLE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_VARIABLE__VISUAL_ELEMENTS = DATA_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_VARIABLE__ID = DATA_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_VARIABLE__NAME = DATA_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Data Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_VARIABLE_FEATURE_COUNT = DATA_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_VARIABLE_OPERATION_COUNT = DATA_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.variable.impl.DataInstantiationVariableImpl <em>Data Instantiation Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataInstantiationVariableImpl
     * @see data.variable.impl.VariablePackageImpl#getDataInstantiationVariable()
     * @generated
     */
    int DATA_INSTANTIATION_VARIABLE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_VARIABLE__VISUAL_ELEMENTS = DATA_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_VARIABLE__ID = DATA_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_VARIABLE__NAME = DATA_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Data Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_VARIABLE_FEATURE_COUNT = DATA_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_VARIABLE_OPERATION_COUNT = DATA_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.variable.impl.DataInstanceVariableImpl <em>Data Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataInstanceVariableImpl
     * @see data.variable.impl.VariablePackageImpl#getDataInstanceVariable()
     * @generated
     */
    int DATA_INSTANCE_VARIABLE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_VARIABLE__VISUAL_ELEMENTS = DATA_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_VARIABLE__ID = DATA_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_VARIABLE__NAME = DATA_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Data Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_VARIABLE_FEATURE_COUNT = DATA_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_VARIABLE_OPERATION_COUNT = DATA_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.variable.impl.DataInstanceAssignmentImpl <em>Data Instance Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataInstanceAssignmentImpl
     * @see data.variable.impl.VariablePackageImpl#getDataInstanceAssignment()
     * @generated
     */
    int DATA_INSTANCE_ASSIGNMENT = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_ASSIGNMENT__VISUAL_ELEMENTS = models.variable.VariablePackage.STATIC_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_ASSIGNMENT__ID = models.variable.VariablePackage.STATIC_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_ASSIGNMENT__TARGET = models.variable.VariablePackage.STATIC_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_ASSIGNMENT__VALUE = models.variable.VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Instance Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_ASSIGNMENT_FEATURE_COUNT = models.variable.VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Instance Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANCE_ASSIGNMENT_OPERATION_COUNT = models.variable.VariablePackage.STATIC_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.variable.impl.DataInstantiationAssignmentImpl <em>Data Instantiation Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataInstantiationAssignmentImpl
     * @see data.variable.impl.VariablePackageImpl#getDataInstantiationAssignment()
     * @generated
     */
    int DATA_INSTANTIATION_ASSIGNMENT = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_ASSIGNMENT__VISUAL_ELEMENTS = models.variable.VariablePackage.STATIC_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_ASSIGNMENT__ID = models.variable.VariablePackage.STATIC_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_ASSIGNMENT__TARGET = models.variable.VariablePackage.STATIC_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_ASSIGNMENT__INSTANTIATION = models.variable.VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Instantiation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_ASSIGNMENT_FEATURE_COUNT = models.variable.VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Instantiation Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_INSTANTIATION_ASSIGNMENT_OPERATION_COUNT = models.variable.VariablePackage.STATIC_ASSIGNMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.variable.impl.DataTypeAssignmentImpl <em>Data Type Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.variable.impl.DataTypeAssignmentImpl
     * @see data.variable.impl.VariablePackageImpl#getDataTypeAssignment()
     * @generated
     */
    int DATA_TYPE_ASSIGNMENT = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_ASSIGNMENT__VISUAL_ELEMENTS = models.variable.VariablePackage.STATIC_ASSIGNMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_ASSIGNMENT__ID = models.variable.VariablePackage.STATIC_ASSIGNMENT__ID;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_ASSIGNMENT__TARGET = models.variable.VariablePackage.STATIC_ASSIGNMENT__TARGET;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_ASSIGNMENT__ETYPE = models.variable.VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Type Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_ASSIGNMENT_FEATURE_COUNT = models.variable.VariablePackage.STATIC_ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Type Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_ASSIGNMENT_OPERATION_COUNT = models.variable.VariablePackage.STATIC_ASSIGNMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link data.variable.DataTypeVariable <em>Data Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type Variable</em>'.
     * @see data.variable.DataTypeVariable
     * @generated
     */
    EClass getDataTypeVariable();

    /**
     * Returns the meta object for class '{@link data.variable.DataInstantiationVariable <em>Data Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instantiation Variable</em>'.
     * @see data.variable.DataInstantiationVariable
     * @generated
     */
    EClass getDataInstantiationVariable();

    /**
     * Returns the meta object for class '{@link data.variable.DataInstanceVariable <em>Data Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instance Variable</em>'.
     * @see data.variable.DataInstanceVariable
     * @generated
     */
    EClass getDataInstanceVariable();

    /**
     * Returns the meta object for class '{@link data.variable.DataInstanceAssignment <em>Data Instance Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instance Assignment</em>'.
     * @see data.variable.DataInstanceAssignment
     * @generated
     */
    EClass getDataInstanceAssignment();

    /**
     * Returns the meta object for the attribute '{@link data.variable.DataInstanceAssignment#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see data.variable.DataInstanceAssignment#getValue()
     * @see #getDataInstanceAssignment()
     * @generated
     */
    EAttribute getDataInstanceAssignment_Value();

    /**
     * Returns the meta object for class '{@link data.variable.DataInstantiationAssignment <em>Data Instantiation Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Instantiation Assignment</em>'.
     * @see data.variable.DataInstantiationAssignment
     * @generated
     */
    EClass getDataInstantiationAssignment();

    /**
     * Returns the meta object for the reference '{@link data.variable.DataInstantiationAssignment#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see data.variable.DataInstantiationAssignment#getInstantiation()
     * @see #getDataInstantiationAssignment()
     * @generated
     */
    EReference getDataInstantiationAssignment_Instantiation();

    /**
     * Returns the meta object for class '{@link data.variable.DataTypeAssignment <em>Data Type Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type Assignment</em>'.
     * @see data.variable.DataTypeAssignment
     * @generated
     */
    EClass getDataTypeAssignment();

    /**
     * Returns the meta object for the reference '{@link data.variable.DataTypeAssignment#getEType <em>EType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EType</em>'.
     * @see data.variable.DataTypeAssignment#getEType()
     * @see #getDataTypeAssignment()
     * @generated
     */
    EReference getDataTypeAssignment_EType();

    /**
     * Returns the meta object for class '{@link data.variable.DataVariable <em>Data Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Variable</em>'.
     * @see data.variable.DataVariable
     * @generated
     */
    EClass getDataVariable();

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
         * The meta object literal for the '{@link data.variable.impl.DataTypeVariableImpl <em>Data Type Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataTypeVariableImpl
         * @see data.variable.impl.VariablePackageImpl#getDataTypeVariable()
         * @generated
         */
        EClass DATA_TYPE_VARIABLE = eINSTANCE.getDataTypeVariable();

        /**
         * The meta object literal for the '{@link data.variable.impl.DataInstantiationVariableImpl <em>Data Instantiation Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataInstantiationVariableImpl
         * @see data.variable.impl.VariablePackageImpl#getDataInstantiationVariable()
         * @generated
         */
        EClass DATA_INSTANTIATION_VARIABLE = eINSTANCE.getDataInstantiationVariable();

        /**
         * The meta object literal for the '{@link data.variable.impl.DataInstanceVariableImpl <em>Data Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataInstanceVariableImpl
         * @see data.variable.impl.VariablePackageImpl#getDataInstanceVariable()
         * @generated
         */
        EClass DATA_INSTANCE_VARIABLE = eINSTANCE.getDataInstanceVariable();

        /**
         * The meta object literal for the '{@link data.variable.impl.DataInstanceAssignmentImpl <em>Data Instance Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataInstanceAssignmentImpl
         * @see data.variable.impl.VariablePackageImpl#getDataInstanceAssignment()
         * @generated
         */
        EClass DATA_INSTANCE_ASSIGNMENT = eINSTANCE.getDataInstanceAssignment();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_INSTANCE_ASSIGNMENT__VALUE = eINSTANCE.getDataInstanceAssignment_Value();

        /**
         * The meta object literal for the '{@link data.variable.impl.DataInstantiationAssignmentImpl <em>Data Instantiation Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataInstantiationAssignmentImpl
         * @see data.variable.impl.VariablePackageImpl#getDataInstantiationAssignment()
         * @generated
         */
        EClass DATA_INSTANTIATION_ASSIGNMENT = eINSTANCE.getDataInstantiationAssignment();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_INSTANTIATION_ASSIGNMENT__INSTANTIATION = eINSTANCE.getDataInstantiationAssignment_Instantiation();

        /**
         * The meta object literal for the '{@link data.variable.impl.DataTypeAssignmentImpl <em>Data Type Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataTypeAssignmentImpl
         * @see data.variable.impl.VariablePackageImpl#getDataTypeAssignment()
         * @generated
         */
        EClass DATA_TYPE_ASSIGNMENT = eINSTANCE.getDataTypeAssignment();

        /**
         * The meta object literal for the '<em><b>EType</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE_ASSIGNMENT__ETYPE = eINSTANCE.getDataTypeAssignment_EType();

        /**
         * The meta object literal for the '{@link data.variable.impl.DataVariableImpl <em>Data Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.variable.impl.DataVariableImpl
         * @see data.variable.impl.VariablePackageImpl#getDataVariable()
         * @generated
         */
        EClass DATA_VARIABLE = eINSTANCE.getDataVariable();

    }

} //VariablePackage
