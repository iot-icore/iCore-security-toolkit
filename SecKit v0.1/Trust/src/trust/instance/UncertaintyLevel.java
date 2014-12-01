/**
 */
package trust.instance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Uncertainty Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage#getUncertaintyLevel()
 * @model
 * @generated
 */
public enum UncertaintyLevel implements Enumerator {
  /**
   * The '<em><b>Completely Uncertain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPLETELY_UNCERTAIN_VALUE
   * @generated
   * @ordered
   */
  COMPLETELY_UNCERTAIN(0, "CompletelyUncertain", "CompletelyUncertain"),

  /**
   * The '<em><b>Very Uncertain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_UNCERTAIN_VALUE
   * @generated
   * @ordered
   */
  VERY_UNCERTAIN(1, "VeryUncertain", "VeryUncertain"),

  /**
   * The '<em><b>Uncertain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNCERTAIN_VALUE
   * @generated
   * @ordered
   */
  UNCERTAIN(2, "Uncertain", "Uncertain"),

  /**
   * The '<em><b>Slightly Uncertain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLIGHTLY_UNCERTAIN_VALUE
   * @generated
   * @ordered
   */
  SLIGHTLY_UNCERTAIN(3, "SlightlyUncertain", "SlightlyUncertain"),

  /**
   * The '<em><b>Completely Certain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPLETELY_CERTAIN_VALUE
   * @generated
   * @ordered
   */
  COMPLETELY_CERTAIN(4, "CompletelyCertain", "CompletelyCertain");

  /**
   * The '<em><b>Completely Uncertain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Completely Uncertain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPLETELY_UNCERTAIN
   * @model name="CompletelyUncertain"
   * @generated
   * @ordered
   */
  public static final int COMPLETELY_UNCERTAIN_VALUE = 0;

  /**
   * The '<em><b>Very Uncertain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Very Uncertain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_UNCERTAIN
   * @model name="VeryUncertain"
   * @generated
   * @ordered
   */
  public static final int VERY_UNCERTAIN_VALUE = 1;

  /**
   * The '<em><b>Uncertain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Uncertain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNCERTAIN
   * @model name="Uncertain"
   * @generated
   * @ordered
   */
  public static final int UNCERTAIN_VALUE = 2;

  /**
   * The '<em><b>Slightly Uncertain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Slightly Uncertain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SLIGHTLY_UNCERTAIN
   * @model name="SlightlyUncertain"
   * @generated
   * @ordered
   */
  public static final int SLIGHTLY_UNCERTAIN_VALUE = 3;

  /**
   * The '<em><b>Completely Certain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Completely Certain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPLETELY_CERTAIN
   * @model name="CompletelyCertain"
   * @generated
   * @ordered
   */
  public static final int COMPLETELY_CERTAIN_VALUE = 4;

  /**
   * An array of all the '<em><b>Uncertainty Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UncertaintyLevel[] VALUES_ARRAY =
    new UncertaintyLevel[] {
      COMPLETELY_UNCERTAIN,
      VERY_UNCERTAIN,
      UNCERTAIN,
      SLIGHTLY_UNCERTAIN,
      COMPLETELY_CERTAIN,
    };

  /**
   * A public read-only list of all the '<em><b>Uncertainty Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UncertaintyLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Uncertainty Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UncertaintyLevel get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UncertaintyLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Uncertainty Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UncertaintyLevel getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UncertaintyLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Uncertainty Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UncertaintyLevel get(int value) {
    switch (value) {
      case COMPLETELY_UNCERTAIN_VALUE: return COMPLETELY_UNCERTAIN;
      case VERY_UNCERTAIN_VALUE: return VERY_UNCERTAIN;
      case UNCERTAIN_VALUE: return UNCERTAIN;
      case SLIGHTLY_UNCERTAIN_VALUE: return SLIGHTLY_UNCERTAIN;
      case COMPLETELY_CERTAIN_VALUE: return COMPLETELY_CERTAIN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private UncertaintyLevel(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }
  
} //UncertaintyLevel
