/**
 */
package data.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Addressable Storage Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see data.type.TypePackage#getAddressableStorageUnit()
 * @model
 * @generated
 */
public enum AddressableStorageUnit implements Enumerator {
    /**
     * The '<em><b>Bit</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BIT_VALUE
     * @generated
     * @ordered
     */
    BIT(0, "bit", "bit"),

    /**
     * The '<em><b>Byte</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BYTE_VALUE
     * @generated
     * @ordered
     */
    BYTE(1, "byte", "byte");

    /**
     * The '<em><b>Bit</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bit</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BIT
     * @model name="bit"
     * @generated
     * @ordered
     */
    public static final int BIT_VALUE = 0;

    /**
     * The '<em><b>Byte</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BYTE
     * @model name="byte"
     * @generated
     * @ordered
     */
    public static final int BYTE_VALUE = 1;

    /**
     * An array of all the '<em><b>Addressable Storage Unit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AddressableStorageUnit[] VALUES_ARRAY =
        new AddressableStorageUnit[] {
            BIT,
            BYTE,
        };

    /**
     * A public read-only list of all the '<em><b>Addressable Storage Unit</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AddressableStorageUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Addressable Storage Unit</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AddressableStorageUnit get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AddressableStorageUnit result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Addressable Storage Unit</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AddressableStorageUnit getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AddressableStorageUnit result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Addressable Storage Unit</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AddressableStorageUnit get(int value) {
        switch (value) {
            case BIT_VALUE: return BIT;
            case BYTE_VALUE: return BYTE;
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
    private AddressableStorageUnit(int value, String name, String literal) {
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
    
} //AddressableStorageUnit
