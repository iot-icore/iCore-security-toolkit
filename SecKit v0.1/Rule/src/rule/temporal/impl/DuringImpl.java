/**
 */
package rule.temporal.impl;

import org.eclipse.emf.ecore.EClass;

import rule.temporal.During;
import rule.temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>During</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DuringImpl extends TimeBoundedOccurrenceImpl implements During {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DuringImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemporalPackage.Literals.DURING;
    }

} //DuringImpl
