/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EClass;

import rule.temporal.Since;
import rule.temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Since</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SinceImpl extends PastTemporalOperatorImpl implements Since {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SinceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.SINCE;
    }

} //SinceImpl
