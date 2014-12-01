/**
 */
package identity.action;

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
 * @see identity.action.ActionFactory
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
    String eNS_URI = "http://identity/action/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity-action";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionPackage eINSTANCE = identity.action.impl.ActionPackageImpl.init();

    /**
     * The meta object id for the '{@link identity.action.impl.ModifyIdentityImpl <em>Modify Identity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.action.impl.ModifyIdentityImpl
     * @see identity.action.impl.ActionPackageImpl#getModifyIdentity()
     * @generated
     */
    int MODIFY_IDENTITY = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY__VISUAL_ELEMENTS = rule.action.ActionPackage.MODIFY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY__ID = rule.action.ActionPackage.MODIFY__ID;

    /**
     * The feature id for the '<em><b>Authorization</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY__AUTHORIZATION = rule.action.ActionPackage.MODIFY__AUTHORIZATION;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY__TARGET = rule.action.ActionPackage.MODIFY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Modify Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY__MODIFY_DATA = rule.action.ActionPackage.MODIFY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Modify Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY_FEATURE_COUNT = rule.action.ActionPackage.MODIFY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Modify Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODIFY_IDENTITY_OPERATION_COUNT = rule.action.ActionPackage.MODIFY_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link identity.action.ModifyIdentity <em>Modify Identity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Modify Identity</em>'.
     * @see identity.action.ModifyIdentity
     * @generated
     */
    EClass getModifyIdentity();

    /**
     * Returns the meta object for the reference '{@link identity.action.ModifyIdentity#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see identity.action.ModifyIdentity#getTarget()
     * @see #getModifyIdentity()
     * @generated
     */
    EReference getModifyIdentity_Target();

    /**
     * Returns the meta object for the containment reference list '{@link identity.action.ModifyIdentity#getModifyData <em>Modify Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modify Data</em>'.
     * @see identity.action.ModifyIdentity#getModifyData()
     * @see #getModifyIdentity()
     * @generated
     */
    EReference getModifyIdentity_ModifyData();

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
         * The meta object literal for the '{@link identity.action.impl.ModifyIdentityImpl <em>Modify Identity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.action.impl.ModifyIdentityImpl
         * @see identity.action.impl.ActionPackageImpl#getModifyIdentity()
         * @generated
         */
        EClass MODIFY_IDENTITY = eINSTANCE.getModifyIdentity();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODIFY_IDENTITY__TARGET = eINSTANCE.getModifyIdentity_Target();

        /**
         * The meta object literal for the '<em><b>Modify Data</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODIFY_IDENTITY__MODIFY_DATA = eINSTANCE.getModifyIdentity_ModifyData();

    }

} //ActionPackage
