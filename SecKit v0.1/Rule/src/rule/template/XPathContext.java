/**
 */
package rule.template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XPath Context</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rule.template.TemplatePackage#getXPathContext()
 * @model
 * @generated
 */
public enum XPathContext implements Enumerator {
    /**
     * The '<em><b>Trigger Event</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRIGGER_EVENT_VALUE
     * @generated
     * @ordered
     */
    TRIGGER_EVENT(0, "triggerEvent", "triggerEvent"),

    /**
     * The '<em><b>Time Step Event Trace</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TIME_STEP_EVENT_TRACE_VALUE
     * @generated
     * @ordered
     */
    TIME_STEP_EVENT_TRACE(1, "timeStepEventTrace", "timeStepEventTrace");

    /**
     * The '<em><b>Trigger Event</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Trigger Event</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRIGGER_EVENT
     * @model name="triggerEvent"
     * @generated
     * @ordered
     */
    public static final int TRIGGER_EVENT_VALUE = 0;

    /**
     * The '<em><b>Time Step Event Trace</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Time Step Event Trace</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TIME_STEP_EVENT_TRACE
     * @model name="timeStepEventTrace"
     * @generated
     * @ordered
     */
    public static final int TIME_STEP_EVENT_TRACE_VALUE = 1;

    /**
     * An array of all the '<em><b>XPath Context</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final XPathContext[] VALUES_ARRAY =
        new XPathContext[] {
            TRIGGER_EVENT,
            TIME_STEP_EVENT_TRACE,
        };

    /**
     * A public read-only list of all the '<em><b>XPath Context</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<XPathContext> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>XPath Context</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XPathContext get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            XPathContext result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>XPath Context</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XPathContext getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            XPathContext result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>XPath Context</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XPathContext get(int value) {
        switch (value) {
            case TRIGGER_EVENT_VALUE: return TRIGGER_EVENT;
            case TIME_STEP_EVENT_TRACE_VALUE: return TIME_STEP_EVENT_TRACE;
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
    private XPathContext(int value, String name, String literal) {
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
    
} //XPathContext
