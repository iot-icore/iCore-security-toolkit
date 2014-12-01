/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EClass;

import rule.temporal.Eventually;
import rule.temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eventually</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EventuallyImpl extends PastTemporalOperatorImpl implements Eventually {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventuallyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.EVENTUALLY;
    }

} //EventuallyImpl
