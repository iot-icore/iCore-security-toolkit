/**
 */
package behavior.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interaction Pattern Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see behavior.type.TypePackage#getInteractionPatternType()
 * @model
 * @generated
 */
public enum InteractionPatternType implements Enumerator {
    /**
     * The '<em><b>MESSAGE PASSING</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MESSAGE_PASSING_VALUE
     * @generated
     * @ordered
     */
    MESSAGE_PASSING(2, "MESSAGE_PASSING", "MESSAGE_PASSING"),

    /**
     * The '<em><b>REQUEST RESPONSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REQUEST_RESPONSE_VALUE
     * @generated
     * @ordered
     */
    REQUEST_RESPONSE(0, "REQUEST_RESPONSE", "REQUEST_RESPONSE"),

    /**
     * The '<em><b>SUBSCRIBE NOTIFY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSCRIBE_NOTIFY_VALUE
     * @generated
     * @ordered
     */
    SUBSCRIBE_NOTIFY(3, "SUBSCRIBE_NOTIFY", "SUBSCRIBE_NOTIFY"),

    /**
     * The '<em><b>PUBLISH SUBSCRIBE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUBLISH_SUBSCRIBE_VALUE
     * @generated
     * @ordered
     */
    PUBLISH_SUBSCRIBE(1, "PUBLISH_SUBSCRIBE", "PUBLISH_SUBSCRIBE"),

    /**
     * The '<em><b>SOLICIT RESPONSE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLICIT_RESPONSE_VALUE
     * @generated
     * @ordered
     */
    SOLICIT_RESPONSE(1, "SOLICIT_RESPONSE", "SOLICIT_RESPONSE"),

    /**
     * The '<em><b>ONE WAY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONE_WAY_VALUE
     * @generated
     * @ordered
     */
    ONE_WAY(2, "ONE_WAY", "ONE_WAY"),

    /**
     * The '<em><b>NOTIFICATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOTIFICATION_VALUE
     * @generated
     * @ordered
     */
    NOTIFICATION(3, "NOTIFICATION", "NOTIFICATION");

    /**
     * The '<em><b>MESSAGE PASSING</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MESSAGE PASSING</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MESSAGE_PASSING
     * @model
     * @generated
     * @ordered
     */
    public static final int MESSAGE_PASSING_VALUE = 2;

    /**
     * The '<em><b>REQUEST RESPONSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>REQUEST RESPONSE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REQUEST_RESPONSE
     * @model
     * @generated
     * @ordered
     */
    public static final int REQUEST_RESPONSE_VALUE = 0;

    /**
     * The '<em><b>SUBSCRIBE NOTIFY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SUBSCRIBE NOTIFY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSCRIBE_NOTIFY
     * @model
     * @generated
     * @ordered
     */
    public static final int SUBSCRIBE_NOTIFY_VALUE = 3;

    /**
     * The '<em><b>PUBLISH SUBSCRIBE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PUBLISH SUBSCRIBE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUBLISH_SUBSCRIBE
     * @model
     * @generated
     * @ordered
     */
    public static final int PUBLISH_SUBSCRIBE_VALUE = 1;

    /**
     * The '<em><b>SOLICIT RESPONSE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SOLICIT RESPONSE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLICIT_RESPONSE
     * @model
     * @generated
     * @ordered
     */
    public static final int SOLICIT_RESPONSE_VALUE = 1;

    /**
     * The '<em><b>ONE WAY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>ONE WAY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONE_WAY
     * @model
     * @generated
     * @ordered
     */
    public static final int ONE_WAY_VALUE = 2;

    /**
     * The '<em><b>NOTIFICATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOTIFICATION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOTIFICATION
     * @model
     * @generated
     * @ordered
     */
    public static final int NOTIFICATION_VALUE = 3;

    /**
     * An array of all the '<em><b>Interaction Pattern Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InteractionPatternType[] VALUES_ARRAY =
        new InteractionPatternType[] {
            MESSAGE_PASSING,
            REQUEST_RESPONSE,
            SUBSCRIBE_NOTIFY,
            PUBLISH_SUBSCRIBE,
            SOLICIT_RESPONSE,
            ONE_WAY,
            NOTIFICATION,
        };

    /**
     * A public read-only list of all the '<em><b>Interaction Pattern Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<InteractionPatternType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Interaction Pattern Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InteractionPatternType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InteractionPatternType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interaction Pattern Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InteractionPatternType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InteractionPatternType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Interaction Pattern Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InteractionPatternType get(int value) {
        switch (value) {
            case MESSAGE_PASSING_VALUE: return MESSAGE_PASSING;
            case REQUEST_RESPONSE_VALUE: return REQUEST_RESPONSE;
            case SUBSCRIBE_NOTIFY_VALUE: return SUBSCRIBE_NOTIFY;
            case PUBLISH_SUBSCRIBE_VALUE: return PUBLISH_SUBSCRIBE;
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
    private InteractionPatternType(int value, String name, String literal) {
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
    
} //InteractionPatternType
