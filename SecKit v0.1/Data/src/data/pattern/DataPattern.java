/**
 */
package data.pattern;

import data.instantiation.DataInstantiation;

import data.type.DataType;

import data.variable.DataVariable;

import models.Pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.pattern.DataPattern#getType <em>Type</em>}</li>
 *   <li>{@link data.pattern.DataPattern#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link data.pattern.DataPattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link data.pattern.DataPattern#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.pattern.PatternPackage#getDataPattern()
 * @model
 * @generated
 */
public interface DataPattern extends Pattern {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(DataType)
     * @see data.pattern.PatternPackage#getDataPattern_Type()
     * @model
     * @generated
     */
    DataType getType();

    /**
     * Sets the value of the '{@link data.pattern.DataPattern#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(DataType value);

    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link data.instantiation.DataInstantiation#getPatterns <em>Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(DataInstantiation)
     * @see data.pattern.PatternPackage#getDataPattern_Instantiation()
     * @see data.instantiation.DataInstantiation#getPatterns
     * @model opposite="patterns"
     * @generated
     */
    DataInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link data.pattern.DataPattern#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(DataInstantiation value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' reference list.
     * The list contents are of type {@link data.variable.DataVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' reference list.
     * @see data.pattern.PatternPackage#getDataPattern_Variables()
     * @model
     * @generated
     */
    EList<DataVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see data.pattern.PatternPackage#getDataPattern_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link data.pattern.DataPattern#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // DataPattern
