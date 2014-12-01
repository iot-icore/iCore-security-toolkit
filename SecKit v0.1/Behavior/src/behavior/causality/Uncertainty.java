/**
 */
package behavior.causality;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Uncertainty</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see behavior.causality.CausalityPackage#getUncertainty()
 * @model
 * @generated
 */
public enum Uncertainty implements Enumerator {
    /**
     * The '<em><b>May</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAY_VALUE
     * @generated
     * @ordered
     */
    MAY(0, "may", "may"),

    /**
     * The '<em><b>Must</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MUST_VALUE
     * @generated
     * @ordered
     */
    MUST(1, "must", "must");

    /**
     * The '<em><b>May</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>May</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAY
     * @model name="may"
     * @generated
     * @ordered
     */
    public static final int MAY_VALUE = 0;

    /**
     * The '<em><b>Must</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Must</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MUST
     * @model name="must"
     * @generated
     * @ordered
     */
    public static final int MUST_VALUE = 1;

    /**
     * An array of all the '<em><b>Uncertainty</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Uncertainty[] VALUES_ARRAY =
        new Uncertainty[] {
            MAY,
            MUST,
        };

    /**
     * A public read-only list of all the '<em><b>Uncertainty</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Uncertainty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Uncertainty</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Uncertainty get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Uncertainty result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Uncertainty</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Uncertainty getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Uncertainty result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Uncertainty</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Uncertainty get(int value) {
        switch (value) {
            case MAY_VALUE: return MAY;
            case MUST_VALUE: return MUST;
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
    private Uncertainty(int value, String name, String literal) {
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
    
} //Uncertainty
