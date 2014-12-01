/**
 */
package risk.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Severity Level CORAS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see risk.type.TypePackage#getSeverityLevelCORAS()
 * @model
 * @generated
 */
public enum SeverityLevelCORAS implements Enumerator {
    /**
     * The '<em><b>Harmless</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HARMLESS_VALUE
     * @generated
     * @ordered
     */
    HARMLESS(0, "Harmless", "Harmless"),

    /**
     * The '<em><b>Moderata</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MODERATA_VALUE
     * @generated
     * @ordered
     */
    MODERATA(1, "Moderata", "Moderata"),

    /**
     * The '<em><b>Serious</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SERIOUS_VALUE
     * @generated
     * @ordered
     */
    SERIOUS(2, "Serious", "Serious"),

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
     * The '<em><b>Harmless</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Harmless</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HARMLESS
     * @model name="Harmless"
     * @generated
     * @ordered
     */
    public static final int HARMLESS_VALUE = 0;

    /**
     * The '<em><b>Moderata</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Moderata</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MODERATA
     * @model name="Moderata"
     * @generated
     * @ordered
     */
    public static final int MODERATA_VALUE = 1;

    /**
     * The '<em><b>Serious</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Serious</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SERIOUS
     * @model name="Serious"
     * @generated
     * @ordered
     */
    public static final int SERIOUS_VALUE = 2;

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
     * An array of all the '<em><b>Severity Level CORAS</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SeverityLevelCORAS[] VALUES_ARRAY =
        new SeverityLevelCORAS[] {
            HARMLESS,
            MODERATA,
            SERIOUS,
            CATASTROPHIC,
        };

    /**
     * A public read-only list of all the '<em><b>Severity Level CORAS</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SeverityLevelCORAS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Severity Level CORAS</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeverityLevelCORAS get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SeverityLevelCORAS result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Severity Level CORAS</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeverityLevelCORAS getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SeverityLevelCORAS result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Severity Level CORAS</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SeverityLevelCORAS get(int value) {
        switch (value) {
            case HARMLESS_VALUE: return HARMLESS;
            case MODERATA_VALUE: return MODERATA;
            case SERIOUS_VALUE: return SERIOUS;
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
    private SeverityLevelCORAS(int value, String name, String literal) {
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
    
} //SeverityLevelCORAS
