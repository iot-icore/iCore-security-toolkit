/**
 */
package behavior.instantiation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Point Of Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.FlowPointOfInstantiation#getFlowPointOfType <em>Flow Point Of Type</em>}</li>
 *   <li>{@link behavior.instantiation.FlowPointOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getFlowPointOfInstantiation()
 * @model abstract="true"
 * @generated
 */
public interface FlowPointOfInstantiation extends FlowPointInstantiation {
    /**
     * Returns the value of the '<em><b>Flow Point Of Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.FlowPointOfType#getFlowPointsOfInstantiation <em>Flow Points Of Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow Point Of Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow Point Of Type</em>' reference.
     * @see #setFlowPointOfType(FlowPointOfType)
     * @see behavior.instantiation.InstantiationPackage#getFlowPointOfInstantiation_FlowPointOfType()
     * @see behavior.instantiation.FlowPointOfType#getFlowPointsOfInstantiation
     * @model opposite="flowPointsOfInstantiation" required="true"
     * @generated
     */
    FlowPointOfType getFlowPointOfType();

    /**
     * Sets the value of the '{@link behavior.instantiation.FlowPointOfInstantiation#getFlowPointOfType <em>Flow Point Of Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flow Point Of Type</em>' reference.
     * @see #getFlowPointOfType()
     * @generated
     */
    void setFlowPointOfType(FlowPointOfType value);

    /**
     * Returns the value of the '<em><b>Behavior Instantiation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.BehaviorInstantiation#getFlowPoints <em>Flow Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Instantiation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Instantiation</em>' container reference.
     * @see #setBehaviorInstantiation(BehaviorInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getFlowPointOfInstantiation_BehaviorInstantiation()
     * @see behavior.instantiation.BehaviorInstantiation#getFlowPoints
     * @model opposite="flowPoints" required="true" transient="false"
     * @generated
     */
    BehaviorInstantiation getBehaviorInstantiation();

    /**
     * Sets the value of the '{@link behavior.instantiation.FlowPointOfInstantiation#getBehaviorInstantiation <em>Behavior Instantiation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Instantiation</em>' container reference.
     * @see #getBehaviorInstantiation()
     * @generated
     */
    void setBehaviorInstantiation(BehaviorInstantiation value);

} // FlowPointOfInstantiation
