/**
 */
package risk.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Severity Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see risk.type.TypePackage#getSeverityLevel()
 * @model
 * @generated
 */
public enum SeverityLevel implements Enumerator {
    /**
     * The '<em><b>Negligible</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NEGLIGIBLE_VALUE
     * @generated
     * @ordered
     */
    NEGLIGIBLE(0, "Negligible", "Negligible"),

    /**
     * The '<em><b>Marginal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MARGINAL_VALUE
     * @generated
     * @ordered
     */
    MARGINAL(1, "Marginal", "Marginal"),

    /**
     * The '<em><b>Critical</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CRITICAL_VALUE
     * @generated
     * @ordered
     */
    CRITICAL(2, "Critical", "Critical"),

    /**
     * The '<em><b>Catastrophic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CATASTROPHIC_VALUE
     * @generated
     * @ordered
     */
    CATASTROPHIC(3, "Catastrophic", "Catastrophic");

    /**
     * The '<em><b>Negligible</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Negligible</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NEGLIGIBLE
     * @model name="Negligible"
     * @generated
     * @ordered
     */
    public static final int NEGLIGIBLE_VALUE = 0;

    /**
     * The '<em><b>Marginal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Marginal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MARGINAL
     * @model name="Marginal"
     * @generated
     * @ordered
     */
    public static final int MARGINAL_VALUE = 1;

    /**
     * The '<em><b>Critical</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CRITICAL
     * @model name="Critical"
     * @generated
     * @ordered
     */
    public static final int CRITICAL_VALUE = 2;

    /**
     * The '<em><b>Catastrophic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Catastrophic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CATASTROPHIC
     * @model name="Catastrophic"
     * @generated
     * @ordered
     */
    public static final int CATASTROPHIC_VALUE = 3;

    /**
     * An array of all the '<em><b>Severity Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SeverityLevel[] VALUES_ARRAY =
        new SeverityLevel[] {
            NEGLIGIBLE,
            MARGINAL,
            CRITICAL,
            CATASTROPHIC,
        };

    /**
     * A public read-only list of all the '<em><b>Severity Level</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SeverityLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Severity Level</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeverityLevel get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SeverityLevel result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Severity Level</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeverityLevel getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SeverityLevel result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Severity Level</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeverityLevel get(int value) {
        switch (value) {
            case NEGLIGIBLE_VALUE: return NEGLIGIBLE;
            case MARGINAL_VALUE: return MARGINAL;
            case CRITICAL_VALUE: return CRITICAL;
            case CATASTROPHIC_VALUE: return CATASTROPHIC;
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
    private SeverityLevel(int value, String name, String literal) {
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
    
} //SeverityLevel
