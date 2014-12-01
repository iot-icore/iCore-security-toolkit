/**
 */
package trust.instance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Likelihood Level SL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trust.instance.InstancePackage#getLikelihoodLevelSL()
 * @model
 * @generated
 */
public enum LikelihoodLevelSL implements Enumerator {
  /**
   * The '<em><b>Absolutely Not</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSOLUTELY_NOT_VALUE
   * @generated
   * @ordered
   */
  ABSOLUTELY_NOT(0, "AbsolutelyNot", "AbsolutelyNot"),

  /**
   * The '<em><b>Very Unlikely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_UNLIKELY_VALUE
   * @generated
   * @ordered
   */
  VERY_UNLIKELY(1, "VeryUnlikely", "VeryUnlikely"),

  /**
   * The '<em><b>Unlikely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNLIKELY_VALUE
   * @generated
   * @ordered
   */
  UNLIKELY(2, "Unlikely", "Unlikely"),

  /**
   * The '<em><b>Somewhat Unlikely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOMEWHAT_UNLIKELY_VALUE
   * @generated
   * @ordered
   */
  SOMEWHAT_UNLIKELY(3, "SomewhatUnlikely", "SomewhatUnlikely"),

  /**
   * The '<em><b>Chances About Even</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHANCES_ABOUT_EVEN_VALUE
   * @generated
   * @ordered
   */
  CHANCES_ABOUT_EVEN(4, "ChancesAboutEven", "ChancesAboutEven"),

  /**
   * The '<em><b>Somewhat Likely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOMEWHAT_LIKELY_VALUE
   * @generated
   * @ordered
   */
  SOMEWHAT_LIKELY(5, "SomewhatLikely", "SomewhatLikely"),

  /**
   * The '<em><b>Likely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIKELY_VALUE
   * @generated
   * @ordered
   */
  LIKELY(6, "Likely", "Likely"),

  /**
   * The '<em><b>Very Likely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERY_LIKELY_VALUE
   * @generated
   * @ordered
   */
  VERY_LIKELY(7, "VeryLikely", "VeryLikely"),

  /**
   * The '<em><b>Absolutely</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSOLUTELY_VALUE
   * @generated
   * @ordered
   */
  ABSOLUTELY(8, "Absolutely", "Absolutely");

  /**
   * The '<em><b>Absolutely Not</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Absolutely Not</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSOLUTELY_NOT
   * @model name="AbsolutelyNot"
   * @generated
   * @ordered
   */
  public static final int ABSOLUTELY_NOT_VALUE = 0;

  /**
   * The '<em><b>Very Unlikely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Very Unlikely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_UNLIKELY
   * @model name="VeryUnlikely"
   * @generated
   * @ordered
   */
  public static final int VERY_UNLIKELY_VALUE = 1;

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
  public static final int UNLIKELY_VALUE = 2;

  /**
   * The '<em><b>Somewhat Unlikely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Somewhat Unlikely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOMEWHAT_UNLIKELY
   * @model name="SomewhatUnlikely"
   * @generated
   * @ordered
   */
  public static final int SOMEWHAT_UNLIKELY_VALUE = 3;

  /**
   * The '<em><b>Chances About Even</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Chances About Even</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHANCES_ABOUT_EVEN
   * @model name="ChancesAboutEven"
   * @generated
   * @ordered
   */
  public static final int CHANCES_ABOUT_EVEN_VALUE = 4;

  /**
   * The '<em><b>Somewhat Likely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Somewhat Likely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOMEWHAT_LIKELY
   * @model name="SomewhatLikely"
   * @generated
   * @ordered
   */
  public static final int SOMEWHAT_LIKELY_VALUE = 5;

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
  public static final int LIKELY_VALUE = 6;

  /**
   * The '<em><b>Very Likely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Very Likely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERY_LIKELY
   * @model name="VeryLikely"
   * @generated
   * @ordered
   */
  public static final int VERY_LIKELY_VALUE = 7;

  /**
   * The '<em><b>Absolutely</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Absolutely</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSOLUTELY
   * @model name="Absolutely"
   * @generated
   * @ordered
   */
  public static final int ABSOLUTELY_VALUE = 8;

  /**
   * An array of all the '<em><b>Likelihood Level SL</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LikelihoodLevelSL[] VALUES_ARRAY =
    new LikelihoodLevelSL[] {
      ABSOLUTELY_NOT,
      VERY_UNLIKELY,
      UNLIKELY,
      SOMEWHAT_UNLIKELY,
      CHANCES_ABOUT_EVEN,
      SOMEWHAT_LIKELY,
      LIKELY,
      VERY_LIKELY,
      ABSOLUTELY,
    };

  /**
   * A public read-only list of all the '<em><b>Likelihood Level SL</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LikelihoodLevelSL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Likelihood Level SL</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevelSL get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LikelihoodLevelSL result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Likelihood Level SL</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevelSL getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LikelihoodLevelSL result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Likelihood Level SL</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LikelihoodLevelSL get(int value) {
    switch (value) {
      case ABSOLUTELY_NOT_VALUE: return ABSOLUTELY_NOT;
      case VERY_UNLIKELY_VALUE: return VERY_UNLIKELY;
      case UNLIKELY_VALUE: return UNLIKELY;
      case SOMEWHAT_UNLIKELY_VALUE: return SOMEWHAT_UNLIKELY;
      case CHANCES_ABOUT_EVEN_VALUE: return CHANCES_ABOUT_EVEN;
      case SOMEWHAT_LIKELY_VALUE: return SOMEWHAT_LIKELY;
      case LIKELY_VALUE: return LIKELY;
      case VERY_LIKELY_VALUE: return VERY_LIKELY;
      case ABSOLUTELY_VALUE: return ABSOLUTELY;
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
  private LikelihoodLevelSL(int value, String name, String literal) {
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
  
} //LikelihoodLevelSL
