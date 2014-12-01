/**
 */
package trust.instance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Likelihood Level CORAS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage#getLikelihoodLevelCORAS()
 * @model
 * @generated
 */
public enum LikelihoodLevelCORAS implements Enumerator {
  /**
   * The '<em><b>Rarely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RARELY_VALUE
   * @generated
   * @ordered
   */
  RARELY(0, "Rarely", "Rarely"),

  /**
   * The '<em><b>Sometimes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOMETIMES_VALUE
   * @generated
   * @ordered
   */
  SOMETIMES(1, "Sometimes", "Sometimes"),

  /**
   * The '<em><b>Regularly</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REGULARLY_VALUE
   * @generated
   * @ordered
   */
  REGULARLY(2, "Regularly", "Regularly"),

  /**
   * The '<em><b>Often</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OFTEN_VALUE
   * @generated
   * @ordered
   */
  OFTEN(3, "Often", "Often");

  /**
   * The '<em><b>Rarely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rarely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RARELY
   * @model name="Rarely"
   * @generated
   * @ordered
   */
  public static final int RARELY_VALUE = 0;

  /**
   * The '<em><b>Sometimes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sometimes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOMETIMES
   * @model name="Sometimes"
   * @generated
   * @ordered
   */
  public static final int SOMETIMES_VALUE = 1;

  /**
   * The '<em><b>Regularly</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Regularly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGULARLY
   * @model name="Regularly"
   * @generated
   * @ordered
   */
  public static final int REGULARLY_VALUE = 2;

  /**
   * The '<em><b>Often</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Often</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OFTEN
   * @model name="Often"
   * @generated
   * @ordered
   */
  public static final int OFTEN_VALUE = 3;

  /**
   * An array of all the '<em><b>Likelihood Level CORAS</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LikelihoodLevelCORAS[] VALUES_ARRAY =
    new LikelihoodLevelCORAS[] {
      RARELY,
      SOMETIMES,
      REGULARLY,
      OFTEN,
    };

  /**
   * A public read-only list of all the '<em><b>Likelihood Level CORAS</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LikelihoodLevelCORAS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Likelihood Level CORAS</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevelCORAS get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LikelihoodLevelCORAS result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Likelihood Level CORAS</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevelCORAS getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LikelihoodLevelCORAS result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Likelihood Level CORAS</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevelCORAS get(int value) {
    switch (value) {
      case RARELY_VALUE: return RARELY;
      case SOMETIMES_VALUE: return SOMETIMES;
      case REGULARLY_VALUE: return REGULARLY;
      case OFTEN_VALUE: return OFTEN;
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
  private LikelihoodLevelCORAS(int value, String name, String literal) {
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
  
} //LikelihoodLevelCORAS
