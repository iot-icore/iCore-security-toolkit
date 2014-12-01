/**
 */
package behavior.causality;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behavior.causality.CausalityPackage
 * @generated
 */
public interface CausalityFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CausalityFactory eINSTANCE = behavior.causality.impl.CausalityFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Exit Point Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit Point Condition</em>'.
     * @generated
     */
    ExitPointCondition createExitPointCondition();

    /**
     * Returns a new object of class '<em>Entry Point Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry Point Condition</em>'.
     * @generated
     */
    EntryPointCondition createEntryPointCondition();

    /**
     * Returns a new object of class '<em>Or Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Or Condition</em>'.
     * @generated
     */
    OrCondition createOrCondition();

    /**
     * Returns a new object of class '<em>And Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>And Condition</em>'.
     * @generated
     */
    AndCondition createAndCondition();

    /**
     * Returns a new object of class '<em>Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Condition</em>'.
     * @generated
     */
    CausalityCondition createCausalityCondition();

    /**
     * Returns a new object of class '<em>Relation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relation</em>'.
     * @generated
     */
    CausalityRelation createCausalityRelation();

    /**
     * Returns a new object of class '<em>Start Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Condition</em>'.
     * @generated
     */
    StartCondition createStartCondition();

    /**
     * Returns a new object of class '<em>Disabling Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disabling Condition</em>'.
     * @generated
     */
    DisablingCondition createDisablingCondition();

    /**
     * Returns a new object of class '<em>Enabling Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enabling Condition</em>'.
     * @generated
     */
    EnablingCondition createEnablingCondition();

    /**
     * Returns a new object of class '<em>Synchronization Condition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Synchronization Condition</em>'.
     * @generated
     */
    SynchronizationCondition createSynchronizationCondition();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CausalityPackage getCausalityPackage();

} //CausalityFactory
