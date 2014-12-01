/**
 */
package context.event;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Context Situation Lifecycle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see context.event.EventPackage#getContextSituationLifecycle()
 * @model
 * @generated
 */
public enum ContextSituationLifecycle implements Enumerator {
    /**
     * The '<em><b>Started</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STARTED_VALUE
     * @generated
     * @ordered
     */
    STARTED(0, "started", "started"),

    /**
     * The '<em><b>Ongoing</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONGOING_VALUE
     * @generated
     * @ordered
     */
    ONGOING(1, "ongoing", "ongoing"),

    /**
     * The '<em><b>Finished</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FINISHED_VALUE
     * @generated
     * @ordered
     */
    FINISHED(2, "finished", "finished");

    /**
     * The '<em><b>Started</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Started</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STARTED
     * @model name="started"
     * @generated
     * @ordered
     */
    public static final int STARTED_VALUE = 0;

    /**
     * The '<em><b>Ongoing</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ongoing</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONGOING
     * @model name="ongoing"
     * @generated
     * @ordered
     */
    public static final int ONGOING_VALUE = 1;

    /**
     * The '<em><b>Finished</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Finished</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FINISHED
     * @model name="finished"
     * @generated
     * @ordered
     */
    public static final int FINISHED_VALUE = 2;

    /**
     * An array of all the '<em><b>Context Situation Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ContextSituationLifecycle[] VALUES_ARRAY =
        new ContextSituationLifecycle[] {
            STARTED,
            ONGOING,
            FINISHED,
        };

    /**
     * A public read-only list of all the '<em><b>Context Situation Lifecycle</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ContextSituationLifecycle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Context Situation Lifecycle</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContextSituationLifecycle get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ContextSituationLifecycle result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Context Situation Lifecycle</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContextSituationLifecycle getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ContextSituationLifecycle result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Context Situation Lifecycle</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContextSituationLifecycle get(int value) {
        switch (value) {
            case STARTED_VALUE: return STARTED;
            case ONGOING_VALUE: return ONGOING;
            case FINISHED_VALUE: return FINISHED;
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
    private ContextSituationLifecycle(int value, String name, String literal) {
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
    
} //ContextSituationLifecycle
