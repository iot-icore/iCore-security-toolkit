/**
 */
package data.action;

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
 * @see data.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "action";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://data/action/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-action";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionPackage eINSTANCE = data.action.impl.ActionPackageImpl.init();

    /**
     * The meta object id for the '{@link data.action.impl.ModifyDataImpl <em>Modify Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.action.impl.ModifyDataImpl
     * @see data.action.impl.ActionPackageImpl#getModifyData()
     * @generated
     */
    int MODIFY_DATA = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA__VISUAL_ELEMENTS = rule.action.ActionPackage.MODIFY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA__ID = rule.action.ActionPackage.MODIFY__ID;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA__AUTHORIZATION = rule.action.ActionPackage.MODIFY__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA__TARGET = rule.action.ActionPackage.MODIFY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA__NEW_VALUE = rule.action.ActionPackage.MODIFY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Modify Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA_FEATURE_COUNT = rule.action.ActionPackage.MODIFY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Modify Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_DATA_OPERATION_COUNT = rule.action.ActionPackage.MODIFY_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link data.action.ModifyData <em>Modify Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modify Data</em>'.
     * @see data.action.ModifyData
     * @generated
     */
    EClass getModifyData();

    /**
     * Returns the meta object for the containment reference '{@link data.action.ModifyData#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Target</em>'.
     * @see data.action.ModifyData#getTarget()
     * @see #getModifyData()
     * @generated
     */
    EReference getModifyData_Target();

    /**
     * Returns the meta object for the attribute '{@link data.action.ModifyData#getNewValue <em>New Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>New Value</em>'.
     * @see data.action.ModifyData#getNewValue()
     * @see #getModifyData()
     * @generated
     */
    EAttribute getModifyData_NewValue();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ActionFactory getActionFactory();

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
         * The meta object literal for the '{@link data.action.impl.ModifyDataImpl <em>Modify Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.action.impl.ModifyDataImpl
         * @see data.action.impl.ActionPackageImpl#getModifyData()
         * @generated
         */
        EClass MODIFY_DATA = eINSTANCE.getModifyData();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODIFY_DATA__TARGET = eINSTANCE.getModifyData_Target();

        /**
         * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODIFY_DATA__NEW_VALUE = eINSTANCE.getModifyData_NewValue();

    }

} //ActionPackage
