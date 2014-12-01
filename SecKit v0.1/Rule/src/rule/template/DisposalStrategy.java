/**
 */
package rule.template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Disposal Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rule.template.TemplatePackage#getDisposalStrategy()
 * @model
 * @generated
 */
public enum DisposalStrategy implements Enumerator {
    /**
     * The '<em><b>NEVER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NEVER_VALUE
     * @generated
     * @ordered
     */
    NEVER(0, "NEVER", "NEVER"),

    /**
     * The '<em><b>AFTER TRIGGERED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AFTER_TRIGGERED_VALUE
     * @generated
     * @ordered
     */
    AFTER_TRIGGERED(1, "AFTER_TRIGGERED", "AFTER_TRIGGERED"),

    /**
     * The '<em><b>WITH PARENT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WITH_PARENT_VALUE
     * @generated
     * @ordered
     */
    WITH_PARENT(2, "WITH_PARENT", "WITH_PARENT"),

    /**
     * The '<em><b>CUSTOM RULE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CUSTOM_RULE_VALUE
     * @generated
     * @ordered
     */
    CUSTOM_RULE(3, "CUSTOM_RULE", "CUSTOM_RULE");

    /**
     * The '<em><b>NEVER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NEVER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NEVER
     * @model
     * @generated
     * @ordered
     */
    public static final int NEVER_VALUE = 0;

    /**
     * The '<em><b>AFTER TRIGGERED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>AFTER TRIGGERED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AFTER_TRIGGERED
     * @model
     * @generated
     * @ordered
     */
    public static final int AFTER_TRIGGERED_VALUE = 1;

    /**
     * The '<em><b>WITH PARENT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WITH PARENT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WITH_PARENT
     * @model
     * @generated
     * @ordered
     */
    public static final int WITH_PARENT_VALUE = 2;

    /**
     * The '<em><b>CUSTOM RULE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CUSTOM RULE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CUSTOM_RULE
     * @model
     * @generated
     * @ordered
     */
    public static final int CUSTOM_RULE_VALUE = 3;

    /**
     * An array of all the '<em><b>Disposal Strategy</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DisposalStrategy[] VALUES_ARRAY =
        new DisposalStrategy[] {
            NEVER,
            AFTER_TRIGGERED,
            WITH_PARENT,
            CUSTOM_RULE,
        };

    /**
     * A public read-only list of all the '<em><b>Disposal Strategy</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DisposalStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Disposal Strategy</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DisposalStrategy get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DisposalStrategy result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Disposal Strategy</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DisposalStrategy getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DisposalStrategy result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Disposal Strategy</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DisposalStrategy get(int value) {
        switch (value) {
            case NEVER_VALUE: return NEVER;
            case AFTER_TRIGGERED_VALUE: return AFTER_TRIGGERED;
            case WITH_PARENT_VALUE: return WITH_PARENT;
            case CUSTOM_RULE_VALUE: return CUSTOM_RULE;
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
    private DisposalStrategy(int value, String name, String literal) {
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
    
} //DisposalStrategy
