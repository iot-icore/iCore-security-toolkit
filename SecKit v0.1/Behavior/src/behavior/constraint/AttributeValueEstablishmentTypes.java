/**
 */
package behavior.constraint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Value Establishment Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see behavior.constraint.ConstraintPackage#getAttributeValueEstablishmentTypes()
 * @model
 * @generated
 */
public enum AttributeValueEstablishmentTypes implements Enumerator {
    /**
     * The '<em><b>VALUE CHECKING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VALUE_CHECKING_VALUE
     * @generated
     * @ordered
     */
    VALUE_CHECKING(0, "VALUE_CHECKING", "VALUE_CHECKING"),

    /**
     * The '<em><b>VALUE PASSING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VALUE_PASSING_VALUE
     * @generated
     * @ordered
     */
    VALUE_PASSING(1, "VALUE_PASSING", "VALUE_PASSING"),

    /**
     * The '<em><b>VALUE GENERATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VALUE_GENERATION_VALUE
     * @generated
     * @ordered
     */
    VALUE_GENERATION(2, "VALUE_GENERATION", "VALUE_GENERATION");

    /**
     * The '<em><b>VALUE CHECKING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VALUE CHECKING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VALUE_CHECKING
     * @model
     * @generated
     * @ordered
     */
    public static final int VALUE_CHECKING_VALUE = 0;

    /**
     * The '<em><b>VALUE PASSING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VALUE PASSING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VALUE_PASSING
     * @model
     * @generated
     * @ordered
     */
    public static final int VALUE_PASSING_VALUE = 1;

    /**
     * The '<em><b>VALUE GENERATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VALUE GENERATION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VALUE_GENERATION
     * @model
     * @generated
     * @ordered
     */
    public static final int VALUE_GENERATION_VALUE = 2;

    /**
     * An array of all the '<em><b>Attribute Value Establishment Types</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AttributeValueEstablishmentTypes[] VALUES_ARRAY =
        new AttributeValueEstablishmentTypes[] {
            VALUE_CHECKING,
            VALUE_PASSING,
            VALUE_GENERATION,
        };

    /**
     * A public read-only list of all the '<em><b>Attribute Value Establishment Types</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AttributeValueEstablishmentTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Attribute Value Establishment Types</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttributeValueEstablishmentTypes get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeValueEstablishmentTypes result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Value Establishment Types</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttributeValueEstablishmentTypes getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AttributeValueEstablishmentTypes result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Attribute Value Establishment Types</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AttributeValueEstablishmentTypes get(int value) {
        switch (value) {
            case VALUE_CHECKING_VALUE: return VALUE_CHECKING;
            case VALUE_PASSING_VALUE: return VALUE_PASSING;
            case VALUE_GENERATION_VALUE: return VALUE_GENERATION;
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
    private AttributeValueEstablishmentTypes(int value, String name, String literal) {
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
    
} //AttributeValueEstablishmentTypes
