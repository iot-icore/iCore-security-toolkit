/**
 */
package rule.state;

import org.eclipse.emf.common.util.EList;

import rule.condition.Atom;
import rule.condition.TruthValue;

import rule.template.RuleInstance;

import utils.StateHandler;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rule.state.State#getParent <em>Parent</em>}</li>
 *   <li>{@link rule.state.State#getChildren <em>Children</em>}</li>
 *   <li>{@link rule.state.State#getAtom <em>Atom</em>}</li>
 *   <li>{@link rule.state.State#getValue <em>Value</em>}</li>
 *   <li>{@link rule.state.State#getPreviousValue <em>Previous Value</em>}</li>
 *   <li>{@link rule.state.State#getRuleInstance <em>Rule Instance</em>}</li>
 *   <li>{@link rule.state.State#getHandler <em>Handler</em>}</li>
 *   <li>{@link rule.state.State#isImmutable <em>Immutable</em>}</li>
 * </ul>
 * </p>
 *
 * @see rule.state.StatePackage#getState()
 * @model
 * @generated
 */
public interface State extends AbstractState {
    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * It is bidirectional and its opposite is '{@link rule.state.State#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(State)
     * @see rule.state.StatePackage#getState_Parent()
     * @see rule.state.State#getChildren
     * @model opposite="children"
     * @generated
     */
    State getParent();

    /**
     * Sets the value of the '{@link rule.state.State#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(State value);

    /**
     * Returns the value of the '<em><b>Children</b></em>' reference list.
     * The list contents are of type {@link rule.state.State}.
     * It is bidirectional and its opposite is '{@link rule.state.State#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Children</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' reference list.
     * @see rule.state.StatePackage#getState_Children()
     * @see rule.state.State#getParent
     * @model opposite="parent"
     * @generated
     */
    EList<State> getChildren();

    /**
     * Returns the value of the '<em><b>Atom</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Atom</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Atom</em>' reference.
     * @see #setAtom(Atom)
     * @see rule.state.StatePackage#getState_Atom()
     * @model required="true"
     * @generated
     */
    Atom getAtom();

    /**
     * Sets the value of the '{@link rule.state.State#getAtom <em>Atom</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Atom</em>' reference.
     * @see #getAtom()
     * @generated
     */
    void setAtom(Atom value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>"FALSE"</code>.
     * The literals are from the enumeration {@link rule.condition.TruthValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #setValue(TruthValue)
     * @see rule.state.StatePackage#getState_Value()
     * @model default="FALSE"
     * @generated
     */
    TruthValue getValue();

    /**
     * Sets the value of the '{@link rule.state.State#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #getValue()
     * @generated
     */
    void setValue(TruthValue value);

    /**
     * Returns the value of the '<em><b>Previous Value</b></em>' attribute.
     * The default value is <code>"TRUE"</code>.
     * The literals are from the enumeration {@link rule.condition.TruthValue}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Previous Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Previous Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #setPreviousValue(TruthValue)
     * @see rule.state.StatePackage#getState_PreviousValue()
     * @model default="TRUE"
     * @generated
     */
    TruthValue getPreviousValue();

    /**
     * Sets the value of the '{@link rule.state.State#getPreviousValue <em>Previous Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Previous Value</em>' attribute.
     * @see rule.condition.TruthValue
     * @see #getPreviousValue()
     * @generated
     */
    void setPreviousValue(TruthValue value);

    /**
     * Returns the value of the '<em><b>Rule Instance</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link rule.template.RuleInstance#getStates <em>States</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Instance</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Instance</em>' container reference.
     * @see #setRuleInstance(RuleInstance)
     * @see rule.state.StatePackage#getState_RuleInstance()
     * @see rule.template.RuleInstance#getStates
     * @model opposite="states" transient="false"
     * @generated
     */
    RuleInstance getRuleInstance();

    /**
     * Sets the value of the '{@link rule.state.State#getRuleInstance <em>Rule Instance</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rule Instance</em>' container reference.
     * @see #getRuleInstance()
     * @generated
     */
    void setRuleInstance(RuleInstance value);

    /**
     * Returns the value of the '<em><b>Handler</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Handler</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Handler</em>' attribute.
     * @see #setHandler(StateHandler)
     * @see rule.state.StatePackage#getState_Handler()
     * @model dataType="rule.state.StateHandler"
     * @generated
     */
    StateHandler getHandler();

    /**
     * Sets the value of the '{@link rule.state.State#getHandler <em>Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handler</em>' attribute.
     * @see #getHandler()
     * @generated
     */
    void setHandler(StateHandler value);

    /**
     * Returns the value of the '<em><b>Immutable</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Immutable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Immutable</em>' attribute.
     * @see #setImmutable(boolean)
     * @see rule.state.StatePackage#getState_Immutable()
     * @model default="false"
     * @generated
     */
    boolean isImmutable();

    /**
     * Sets the value of the '{@link rule.state.State#isImmutable <em>Immutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Immutable</em>' attribute.
     * @see #isImmutable()
     * @generated
     */
    void setImmutable(boolean value);

} // State
