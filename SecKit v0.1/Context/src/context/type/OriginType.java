/**
 */
package context.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Origin Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see context.type.TypePackage#getOriginType()
 * @model
 * @generated
 */
public enum OriginType implements Enumerator {
    /**
     * The '<em><b>SENSED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SENSED_VALUE
     * @generated
     * @ordered
     */
    SENSED(0, "SENSED", "SENSED"),

    /**
     * The '<em><b>DERIVED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DERIVED_VALUE
     * @generated
     * @ordered
     */
    DERIVED(1, "DERIVED", "DERIVED"),

    /**
     * The '<em><b>PROFILED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROFILED_VALUE
     * @generated
     * @ordered
     */
    PROFILED(2, "PROFILED", "PROFILED");

    /**
     * The '<em><b>SENSED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SENSED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SENSED
     * @model
     * @generated
     * @ordered
     */
    public static final int SENSED_VALUE = 0;

    /**
     * The '<em><b>DERIVED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DERIVED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DERIVED
     * @model
     * @generated
     * @ordered
     */
    public static final int DERIVED_VALUE = 1;

    /**
     * The '<em><b>PROFILED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PROFILED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PROFILED
     * @model
     * @generated
     * @ordered
     */
    public static final int PROFILED_VALUE = 2;

    /**
     * An array of all the '<em><b>Origin Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OriginType[] VALUES_ARRAY =
        new OriginType[] {
            SENSED,
            DERIVED,
            PROFILED,
        };

    /**
     * A public read-only list of all the '<em><b>Origin Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<OriginType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Origin Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OriginType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            OriginType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Origin Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OriginType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            OriginType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Origin Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OriginType get(int value) {
        switch (value) {
            case SENSED_VALUE: return SENSED;
            case DERIVED_VALUE: return DERIVED;
            case PROFILED_VALUE: return PROFILED;
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
    private OriginType(int value, String name, String literal) {
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
    
} //OriginType
