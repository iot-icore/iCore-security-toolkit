/**
 */
package rule.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rule.event.EventPackage#getEventModality()
 * @model
 * @generated
 */
public enum EventModality implements Enumerator {
    /**
     * The '<em><b>Tentative</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TENTATIVE_VALUE
     * @generated
     * @ordered
     */
    TENTATIVE(0, "tentative", "tentative"),

    /**
     * The '<em><b>Actual</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ACTUAL_VALUE
     * @generated
     * @ordered
     */
    ACTUAL(1, "actual", "actual");

    /**
     * The '<em><b>Tentative</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tentative</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TENTATIVE
     * @model name="tentative"
     * @generated
     * @ordered
     */
    public static final int TENTATIVE_VALUE = 0;

    /**
     * The '<em><b>Actual</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Actual</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ACTUAL
     * @model name="actual"
     * @generated
     * @ordered
     */
    public static final int ACTUAL_VALUE = 1;

    /**
     * An array of all the '<em><b>Modality</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EventModality[] VALUES_ARRAY =
        new EventModality[] {
            TENTATIVE,
            ACTUAL,
        };

    /**
     * A public read-only list of all the '<em><b>Modality</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EventModality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Modality</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventModality get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EventModality result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Modality</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventModality getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EventModality result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Modality</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EventModality get(int value) {
        switch (value) {
            case TENTATIVE_VALUE: return TENTATIVE;
            case ACTUAL_VALUE: return ACTUAL;
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
    private EventModality(int value, String name, String literal) {
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
    
} //EventModality
