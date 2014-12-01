/**
 */
package data.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Lifecycle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see data.event.EventPackage#getDataLifecycle()
 * @model
 * @generated
 */
public enum DataLifecycle implements Enumerator {
    /**
     * The '<em><b>Created</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CREATED_VALUE
     * @generated
     * @ordered
     */
    CREATED(0, "created", "created"),

    /**
     * The '<em><b>Exists</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXISTS_VALUE
     * @generated
     * @ordered
     */
    EXISTS(1, "exists", "exists"),

    /**
     * The '<em><b>Deleted</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DELETED_VALUE
     * @generated
     * @ordered
     */
    DELETED(2, "deleted", "deleted");

    /**
     * The '<em><b>Created</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Created</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CREATED
     * @model name="created"
     * @generated
     * @ordered
     */
    public static final int CREATED_VALUE = 0;

    /**
     * The '<em><b>Exists</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Exists</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXISTS
     * @model name="exists"
     * @generated
     * @ordered
     */
    public static final int EXISTS_VALUE = 1;

    /**
     * The '<em><b>Deleted</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Deleted</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DELETED
     * @model name="deleted"
     * @generated
     * @ordered
     */
    public static final int DELETED_VALUE = 2;

    /**
     * An array of all the '<em><b>Data Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DataLifecycle[] VALUES_ARRAY =
        new DataLifecycle[] {
            CREATED,
            EXISTS,
            DELETED,
        };

    /**
     * A public read-only list of all the '<em><b>Data Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DataLifecycle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Data Lifecycle</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataLifecycle get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DataLifecycle result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Data Lifecycle</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataLifecycle getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DataLifecycle result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Data Lifecycle</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DataLifecycle get(int value) {
        switch (value) {
            case CREATED_VALUE: return CREATED;
            case EXISTS_VALUE: return EXISTS;
            case DELETED_VALUE: return DELETED;
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
    private DataLifecycle(int value, String name, String literal) {
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
    
} //DataLifecycle
