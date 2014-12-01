/**
 */
package structure.variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see structure.variable.VariableFactory
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
    String eNS_URI = "http://structure/variable/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-variable";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    VariablePackage eINSTANCE = structure.variable.impl.VariablePackageImpl.init();

    /**
     * The meta object id for the '{@link structure.variable.impl.EntityVariableImpl <em>Entity Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.variable.impl.EntityVariableImpl
     * @see structure.variable.impl.VariablePackageImpl#getEntityVariable()
     * @generated
     */
    int ENTITY_VARIABLE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_VARIABLE__VISUAL_ELEMENTS = models.variable.VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_VARIABLE__ID = models.variable.VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_VARIABLE__NAME = models.variable.VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Entity Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_VARIABLE_FEATURE_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_VARIABLE_OPERATION_COUNT = models.variable.VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.variable.impl.EntityTypeVariableImpl <em>Entity Type Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.variable.impl.EntityTypeVariableImpl
     * @see structure.variable.impl.VariablePackageImpl#getEntityTypeVariable()
     * @generated
     */
    int ENTITY_TYPE_VARIABLE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_VARIABLE__VISUAL_ELEMENTS = ENTITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_VARIABLE__ID = ENTITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_VARIABLE__NAME = ENTITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Entity Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_VARIABLE_FEATURE_COUNT = ENTITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Type Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_VARIABLE_OPERATION_COUNT = ENTITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.variable.impl.EntityInstantiationVariableImpl <em>Entity Instantiation Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.variable.impl.EntityInstantiationVariableImpl
     * @see structure.variable.impl.VariablePackageImpl#getEntityInstantiationVariable()
     * @generated
     */
    int ENTITY_INSTANTIATION_VARIABLE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_VARIABLE__VISUAL_ELEMENTS = ENTITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_VARIABLE__ID = ENTITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_VARIABLE__NAME = ENTITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Entity Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_VARIABLE_FEATURE_COUNT = ENTITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Instantiation Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_VARIABLE_OPERATION_COUNT = ENTITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.variable.impl.EntityInstanceVariableImpl <em>Entity Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.variable.impl.EntityInstanceVariableImpl
     * @see structure.variable.impl.VariablePackageImpl#getEntityInstanceVariable()
     * @generated
     */
    int ENTITY_INSTANCE_VARIABLE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE__VISUAL_ELEMENTS = ENTITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE__ID = ENTITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE__NAME = ENTITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Entity Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE_FEATURE_COUNT = ENTITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANCE_VARIABLE_OPERATION_COUNT = ENTITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.variable.impl.EntityInstantiationHierarchyVariableImpl <em>Entity Instantiation Hierarchy Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.variable.impl.EntityInstantiationHierarchyVariableImpl
     * @see structure.variable.impl.VariablePackageImpl#getEntityInstantiationHierarchyVariable()
     * @generated
     */
    int ENTITY_INSTANTIATION_HIERARCHY_VARIABLE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_VARIABLE__VISUAL_ELEMENTS = ENTITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_VARIABLE__ID = ENTITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_VARIABLE__NAME = ENTITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Entity Instantiation Hierarchy Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_VARIABLE_FEATURE_COUNT = ENTITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Entity Instantiation Hierarchy Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_INSTANTIATION_HIERARCHY_VARIABLE_OPERATION_COUNT = ENTITY_VARIABLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link structure.variable.EntityTypeVariable <em>Entity Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Type Variable</em>'.
     * @see structure.variable.EntityTypeVariable
     * @generated
     */
    EClass getEntityTypeVariable();

    /**
     * Returns the meta object for class '{@link structure.variable.EntityInstantiationVariable <em>Entity Instantiation Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instantiation Variable</em>'.
     * @see structure.variable.EntityInstantiationVariable
     * @generated
     */
    EClass getEntityInstantiationVariable();

    /**
     * Returns the meta object for class '{@link structure.variable.EntityInstanceVariable <em>Entity Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instance Variable</em>'.
     * @see structure.variable.EntityInstanceVariable
     * @generated
     */
    EClass getEntityInstanceVariable();

    /**
     * Returns the meta object for class '{@link structure.variable.EntityVariable <em>Entity Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Variable</em>'.
     * @see structure.variable.EntityVariable
     * @generated
     */
    EClass getEntityVariable();

    /**
     * Returns the meta object for class '{@link structure.variable.EntityInstantiationHierarchyVariable <em>Entity Instantiation Hierarchy Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Instantiation Hierarchy Variable</em>'.
     * @see structure.variable.EntityInstantiationHierarchyVariable
     * @generated
     */
    EClass getEntityInstantiationHierarchyVariable();

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
         * The meta object literal for the '{@link structure.variable.impl.EntityTypeVariableImpl <em>Entity Type Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.variable.impl.EntityTypeVariableImpl
         * @see structure.variable.impl.VariablePackageImpl#getEntityTypeVariable()
         * @generated
         */
        EClass ENTITY_TYPE_VARIABLE = eINSTANCE.getEntityTypeVariable();

        /**
         * The meta object literal for the '{@link structure.variable.impl.EntityInstantiationVariableImpl <em>Entity Instantiation Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.variable.impl.EntityInstantiationVariableImpl
         * @see structure.variable.impl.VariablePackageImpl#getEntityInstantiationVariable()
         * @generated
         */
        EClass ENTITY_INSTANTIATION_VARIABLE = eINSTANCE.getEntityInstantiationVariable();

        /**
         * The meta object literal for the '{@link structure.variable.impl.EntityInstanceVariableImpl <em>Entity Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.variable.impl.EntityInstanceVariableImpl
         * @see structure.variable.impl.VariablePackageImpl#getEntityInstanceVariable()
         * @generated
         */
        EClass ENTITY_INSTANCE_VARIABLE = eINSTANCE.getEntityInstanceVariable();

        /**
         * The meta object literal for the '{@link structure.variable.impl.EntityVariableImpl <em>Entity Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.variable.impl.EntityVariableImpl
         * @see structure.variable.impl.VariablePackageImpl#getEntityVariable()
         * @generated
         */
        EClass ENTITY_VARIABLE = eINSTANCE.getEntityVariable();

        /**
         * The meta object literal for the '{@link structure.variable.impl.EntityInstantiationHierarchyVariableImpl <em>Entity Instantiation Hierarchy Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.variable.impl.EntityInstantiationHierarchyVariableImpl
         * @see structure.variable.impl.VariablePackageImpl#getEntityInstantiationHierarchyVariable()
         * @generated
         */
        EClass ENTITY_INSTANTIATION_HIERARCHY_VARIABLE = eINSTANCE.getEntityInstantiationHierarchyVariable();

    }

} //VariablePackage
