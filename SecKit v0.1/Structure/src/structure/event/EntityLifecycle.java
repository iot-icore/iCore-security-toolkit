/**
 */
package structure.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Lifecycle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structure.event.EventPackage#getEntityLifecycle()
 * @model
 * @generated
 */
public enum EntityLifecycle implements Enumerator {
    /**
     * The '<em><b>Instantiatiated</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSTANTIATIATED_VALUE
     * @generated
     * @ordered
     */
    INSTANTIATIATED(0, "instantiatiated", "instantiatiated"),

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
     * The '<em><b>Disposed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISPOSED_VALUE
     * @generated
     * @ordered
     */
    DISPOSED(2, "disposed", "disposed");

    /**
     * The '<em><b>Instantiatiated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Instantiatiated</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSTANTIATIATED
     * @model name="instantiatiated"
     * @generated
     * @ordered
     */
    public static final int INSTANTIATIATED_VALUE = 0;

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
     * The '<em><b>Disposed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Disposed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISPOSED
     * @model name="disposed"
     * @generated
     * @ordered
     */
    public static final int DISPOSED_VALUE = 2;

    /**
     * An array of all the '<em><b>Entity Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EntityLifecycle[] VALUES_ARRAY =
        new EntityLifecycle[] {
            INSTANTIATIATED,
            EXISTS,
            DISPOSED,
        };

    /**
     * A public read-only list of all the '<em><b>Entity Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EntityLifecycle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Entity Lifecycle</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EntityLifecycle get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EntityLifecycle result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Entity Lifecycle</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EntityLifecycle getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EntityLifecycle result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Entity Lifecycle</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EntityLifecycle get(int value) {
        switch (value) {
            case INSTANTIATIATED_VALUE: return INSTANTIATIATED;
            case EXISTS_VALUE: return EXISTS;
            case DISPOSED_VALUE: return DISPOSED;
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
    private EntityLifecycle(int value, String name, String literal) {
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
    
} //EntityLifecycle
