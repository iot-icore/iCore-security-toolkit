/**
 */
package behavior.pattern.impl;

import behavior.pattern.InteractionContributionPattern;
import behavior.pattern.InteractionPattern;
import behavior.pattern.PatternPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.pattern.impl.InteractionPatternImpl#getContributionPatterns <em>Contribution Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionPatternImpl extends ActivityPatternImpl implements InteractionPattern {
    /**
     * The cached value of the '{@link #getContributionPatterns() <em>Contribution Patterns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContributionPatterns()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionPattern> contributionPatterns;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.INTERACTION_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionPattern> getContributionPatterns() {
        if (contributionPatterns == null) {
            contributionPatterns = new EObjectContainmentEList<InteractionContributionPattern>(InteractionContributionPattern.class, this, PatternPackage.INTERACTION_PATTERN__CONTRIBUTION_PATTERNS);
        }
        return contributionPatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.INTERACTION_PATTERN__CONTRIBUTION_PATTERNS:
                return ((InternalEList<?>)getContributionPatterns()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PatternPackage.INTERACTION_PATTERN__CONTRIBUTION_PATTERNS:
                return getContributionPatterns();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PatternPackage.INTERACTION_PATTERN__CONTRIBUTION_PATTERNS:
                getContributionPatterns().clear();
                getContributionPatterns().addAll((Collection<? extends InteractionContributionPattern>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case PatternPackage.INTERACTION_PATTERN__CONTRIBUTION_PATTERNS:
                getContributionPatterns().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case PatternPackage.INTERACTION_PATTERN__CONTRIBUTION_PATTERNS:
                return contributionPatterns != null && !contributionPatterns.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InteractionPatternImpl
