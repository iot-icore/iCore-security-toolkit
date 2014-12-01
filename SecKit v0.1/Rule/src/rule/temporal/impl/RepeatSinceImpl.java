/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EClass;

import rule.temporal.RepeatSince;
import rule.temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Since</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RepeatSinceImpl extends CardinalityOperatorImpl implements RepeatSince {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RepeatSinceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.REPEAT_SINCE;
    }

} //RepeatSinceImpl
