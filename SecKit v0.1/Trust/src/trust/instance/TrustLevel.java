/**
 */
package trust.instance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trust Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage#getTrustLevel()
 * @model
 * @generated
 */
public enum TrustLevel implements Enumerator {
  /**
   * The '<em><b>UNSPECIFIED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSPECIFIED_VALUE
   * @generated
   * @ordered
   */
  UNSPECIFIED(0, "UNSPECIFIED", "Unspecified"),

  /**
   * The '<em><b>VERY UNTRUSTWORTHY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_UNTRUSTWORTHY_VALUE
   * @generated
   * @ordered
   */
  VERY_UNTRUSTWORTHY(1, "VERY_UNTRUSTWORTHY", "Very untrustworthy"),

  /**
   * The '<em><b>UNTRUSTWORTHY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNTRUSTWORTHY_VALUE
   * @generated
   * @ordered
   */
  UNTRUSTWORTHY(2, "UNTRUSTWORTHY", "Untrustworthy"),

  /**
   * The '<em><b>UNCERTAIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNCERTAIN_VALUE
   * @generated
   * @ordered
   */
  UNCERTAIN(3, "UNCERTAIN", "UNCERTAIN"),

  /**
   * The '<em><b>TRUSTWORTHY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRUSTWORTHY_VALUE
   * @generated
   * @ordered
   */
  TRUSTWORTHY(4, "TRUSTWORTHY", "Trustworthy"),

  /**
   * The '<em><b>VERY TRUSTWORTHY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_TRUSTWORTHY_VALUE
   * @generated
   * @ordered
   */
  VERY_TRUSTWORTHY(5, "VERY_TRUSTWORTHY", "Very trustworthy");

  /**
   * The '<em><b>UNSPECIFIED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNSPECIFIED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNSPECIFIED
   * @model literal="Unspecified"
   * @generated
   * @ordered
   */
  public static final int UNSPECIFIED_VALUE = 0;

  /**
   * The '<em><b>VERY UNTRUSTWORTHY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERY UNTRUSTWORTHY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_UNTRUSTWORTHY
   * @model literal="Very untrustworthy"
   * @generated
   * @ordered
   */
  public static final int VERY_UNTRUSTWORTHY_VALUE = 1;

  /**
   * The '<em><b>UNTRUSTWORTHY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNTRUSTWORTHY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNTRUSTWORTHY
   * @model literal="Untrustworthy"
   * @generated
   * @ordered
   */
  public static final int UNTRUSTWORTHY_VALUE = 2;

  /**
   * The '<em><b>UNCERTAIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNCERTAIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNCERTAIN
   * @model
   * @generated
   * @ordered
   */
  public static final int UNCERTAIN_VALUE = 3;

  /**
   * The '<em><b>TRUSTWORTHY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRUSTWORTHY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRUSTWORTHY
   * @model literal="Trustworthy"
   * @generated
   * @ordered
   */
  public static final int TRUSTWORTHY_VALUE = 4;

  /**
   * The '<em><b>VERY TRUSTWORTHY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERY TRUSTWORTHY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_TRUSTWORTHY
   * @model literal="Very trustworthy"
   * @generated
   * @ordered
   */
  public static final int VERY_TRUSTWORTHY_VALUE = 5;

  /**
   * An array of all the '<em><b>Trust Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TrustLevel[] VALUES_ARRAY =
    new TrustLevel[] {
      UNSPECIFIED,
      VERY_UNTRUSTWORTHY,
      UNTRUSTWORTHY,
      UNCERTAIN,
      TRUSTWORTHY,
      VERY_TRUSTWORTHY,
    };

  /**
   * A public read-only list of all the '<em><b>Trust Level</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TrustLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Trust Level</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TrustLevel get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TrustLevel result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Trust Level</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TrustLevel getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TrustLevel result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Trust Level</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TrustLevel get(int value) {
    switch (value) {
      case UNSPECIFIED_VALUE: return UNSPECIFIED;
      case VERY_UNTRUSTWORTHY_VALUE: return VERY_UNTRUSTWORTHY;
      case UNTRUSTWORTHY_VALUE: return UNTRUSTWORTHY;
      case UNCERTAIN_VALUE: return UNCERTAIN;
      case TRUSTWORTHY_VALUE: return TRUSTWORTHY;
      case VERY_TRUSTWORTHY_VALUE: return VERY_TRUSTWORTHY;
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
  private TrustLevel(int value, String name, String literal) {
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
  
} //TrustLevel
