/**
 */
package behavior.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behavior Lifecycle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see behavior.event.EventPackage#getBehaviorLifecycle()
 * @model
 * @generated
 */
public enum BehaviorLifecycle implements Enumerator {
    /**
     * The '<em><b>Instantiated</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSTANTIATED_VALUE
     * @generated
     * @ordered
     */
    INSTANTIATED(0, "instantiated", "instantiated"),

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
     * The '<em><b>Instantiated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Instantiated</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSTANTIATED
     * @model name="instantiated"
     * @generated
     * @ordered
     */
    public static final int INSTANTIATED_VALUE = 0;

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
     * An array of all the '<em><b>Behavior Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BehaviorLifecycle[] VALUES_ARRAY =
        new BehaviorLifecycle[] {
            INSTANTIATED,
            EXISTS,
            DISPOSED,
        };

    /**
     * A public read-only list of all the '<em><b>Behavior Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<BehaviorLifecycle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Behavior Lifecycle</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BehaviorLifecycle get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BehaviorLifecycle result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Behavior Lifecycle</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BehaviorLifecycle getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BehaviorLifecycle result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Behavior Lifecycle</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BehaviorLifecycle get(int value) {
        switch (value) {
            case INSTANTIATED_VALUE: return INSTANTIATED;
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
    private BehaviorLifecycle(int value, String name, String literal) {
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
    
} //BehaviorLifecycle
