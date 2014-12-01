/**
 */
package trust.instance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Likelihood Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage#getLikelihoodLevel()
 * @model
 * @generated
 */
public enum LikelihoodLevel implements Enumerator {
  /**
   * The '<em><b>Rare</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RARE_VALUE
   * @generated
   * @ordered
   */
  RARE(0, "Rare", "Rare"),

  /**
   * The '<em><b>Unlikely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNLIKELY_VALUE
   * @generated
   * @ordered
   */
  UNLIKELY(1, "Unlikely", "Unlikely"),

  /**
   * The '<em><b>Possible</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSSIBLE_VALUE
   * @generated
   * @ordered
   */
  POSSIBLE(2, "Possible", "Possible"),

  /**
   * The '<em><b>Likely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIKELY_VALUE
   * @generated
   * @ordered
   */
  LIKELY(3, "Likely", "Likely"),

  /**
   * The '<em><b>Certain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CERTAIN_VALUE
   * @generated
   * @ordered
   */
  CERTAIN(4, "Certain", "Certain");

  /**
   * The '<em><b>Rare</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rare</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RARE
   * @model name="Rare"
   * @generated
   * @ordered
   */
  public static final int RARE_VALUE = 0;

  /**
   * The '<em><b>Unlikely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unlikely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNLIKELY
   * @model name="Unlikely"
   * @generated
   * @ordered
   */
  public static final int UNLIKELY_VALUE = 1;

  /**
   * The '<em><b>Possible</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Possible</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSSIBLE
   * @model name="Possible"
   * @generated
   * @ordered
   */
  public static final int POSSIBLE_VALUE = 2;

  /**
   * The '<em><b>Likely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Likely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIKELY
   * @model name="Likely"
   * @generated
   * @ordered
   */
  public static final int LIKELY_VALUE = 3;

  /**
   * The '<em><b>Certain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Certain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CERTAIN
   * @model name="Certain"
   * @generated
   * @ordered
   */
  public static final int CERTAIN_VALUE = 4;

  /**
   * An array of all the '<em><b>Likelihood Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LikelihoodLevel[] VALUES_ARRAY =
    new LikelihoodLevel[] {
      RARE,
      UNLIKELY,
      POSSIBLE,
      LIKELY,
      CERTAIN,
    };

  /**
   * A public read-only list of all the '<em><b>Likelihood Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LikelihoodLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Likelihood Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevel get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LikelihoodLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Likelihood Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevel getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LikelihoodLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Likelihood Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevel get(int value) {
    switch (value) {
      case RARE_VALUE: return RARE;
      case UNLIKELY_VALUE: return UNLIKELY;
      case POSSIBLE_VALUE: return POSSIBLE;
      case LIKELY_VALUE: return LIKELY;
      case CERTAIN_VALUE: return CERTAIN;
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
  private LikelihoodLevel(int value, String name, String literal) {
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
  
} //LikelihoodLevel
