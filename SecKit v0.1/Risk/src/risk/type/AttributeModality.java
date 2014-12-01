/**
 */
package risk.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Modality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see risk.type.TypePackage#getAttributeModality()
 * @model
 * @generated
 */
public enum AttributeModality implements Enumerator {
    /**
     * The '<em><b>REQUIRED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REQUIRED_VALUE
     * @generated
     * @ordered
     */
    REQUIRED(0, "REQUIRED", "REQUIRED"),

    /**
     * The '<em><b>MISSING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MISSING_VALUE
     * @generated
     * @ordered
     */
    MISSING(1, "MISSING", "MISSING");

    /**
     * The '<em><b>REQUIRED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>REQUIRED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REQUIRED
     * @model
     * @generated
     * @ordered
     */
    public static final int REQUIRED_VALUE = 0;

    /**
     * The '<em><b>MISSING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MISSING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MISSING
     * @model
     * @generated
     * @ordered
     */
    public static final int MISSING_VALUE = 1;

    /**
     * An array of all the '<em><b>Attribute Modality</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AttributeModality[] VALUES_ARRAY =
        new AttributeModality[] {
            REQUIRED,
            MISSING,
        };

    /**
     * A public read-only list of all the '<em><b>Attribute Modality</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AttributeModality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Attribute Modality</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttributeModality get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeModality result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Modality</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttributeModality getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeModality result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Modality</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttributeModality get(int value) {
        switch (value) {
            case REQUIRED_VALUE: return REQUIRED;
            case MISSING_VALUE: return MISSING;
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
    private AttributeModality(int value, String name, String literal) {
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
    
} //AttributeModality
