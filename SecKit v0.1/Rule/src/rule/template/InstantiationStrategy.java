/**
 */
package rule.template;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instantiation Strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rule.template.TemplatePackage#getInstantiationStrategy()
 * @model
 * @generated
 */
public enum InstantiationStrategy implements Enumerator {
    /**
     * The '<em><b>NOT APPLICABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_APPLICABLE_VALUE
     * @generated
     * @ordered
     */
    NOT_APPLICABLE(0, "NOT_APPLICABLE", "NOT_APPLICABLE"),

    /**
     * The '<em><b>WHEN PARENT INSTANTIATED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WHEN_PARENT_INSTANTIATED_VALUE
     * @generated
     * @ordered
     */
    WHEN_PARENT_INSTANTIATED(1, "WHEN_PARENT_INSTANTIATED", "WHEN_PARENT_INSTANTIATED"),

    /**
     * The '<em><b>WHEN PARENT TRIGGERED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WHEN_PARENT_TRIGGERED_VALUE
     * @generated
     * @ordered
     */
    WHEN_PARENT_TRIGGERED(2, "WHEN_PARENT_TRIGGERED", "WHEN_PARENT_TRIGGERED");

    /**
     * The '<em><b>NOT APPLICABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOT APPLICABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NOT_APPLICABLE
     * @model
     * @generated
     * @ordered
     */
    public static final int NOT_APPLICABLE_VALUE = 0;

    /**
     * The '<em><b>WHEN PARENT INSTANTIATED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WHEN PARENT INSTANTIATED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WHEN_PARENT_INSTANTIATED
     * @model
     * @generated
     * @ordered
     */
    public static final int WHEN_PARENT_INSTANTIATED_VALUE = 1;

    /**
     * The '<em><b>WHEN PARENT TRIGGERED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WHEN PARENT TRIGGERED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WHEN_PARENT_TRIGGERED
     * @model
     * @generated
     * @ordered
     */
    public static final int WHEN_PARENT_TRIGGERED_VALUE = 2;

    /**
     * An array of all the '<em><b>Instantiation Strategy</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final InstantiationStrategy[] VALUES_ARRAY =
        new InstantiationStrategy[] {
            NOT_APPLICABLE,
            WHEN_PARENT_INSTANTIATED,
            WHEN_PARENT_TRIGGERED,
        };

    /**
     * A public read-only list of all the '<em><b>Instantiation Strategy</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<InstantiationStrategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Instantiation Strategy</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstantiationStrategy get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InstantiationStrategy result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Instantiation Strategy</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstantiationStrategy getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            InstantiationStrategy result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Instantiation Strategy</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstantiationStrategy get(int value) {
        switch (value) {
            case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
            case WHEN_PARENT_INSTANTIATED_VALUE: return WHEN_PARENT_INSTANTIATED;
            case WHEN_PARENT_TRIGGERED_VALUE: return WHEN_PARENT_TRIGGERED;
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
    private InstantiationStrategy(int value, String name, String literal) {
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
    
} //InstantiationStrategy
