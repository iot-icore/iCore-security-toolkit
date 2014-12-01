/**
 */
package models.impl;

import java.util.Collection;

import models.Diagram;
import models.ModelsPackage;
import models.Shape;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.impl.DiagramImpl#getShapes <em>Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends VisualElementImpl implements Diagram {
    /**
     * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShapes()
     * @generated
     * @ordered
     */
    protected EList<Shape> shapes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Shape> getShapes() {
        if (shapes == null) {
            shapes = new EObjectContainmentEList<Shape>(Shape.class, this, ModelsPackage.DIAGRAM__SHAPES);
        }
        return shapes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelsPackage.DIAGRAM__SHAPES:
                return ((InternalEList<?>)getShapes()).basicRemove(otherEnd, msgs);
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
            case ModelsPackage.DIAGRAM__SHAPES:
                return getShapes();
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
            case ModelsPackage.DIAGRAM__SHAPES:
                getShapes().clear();
                getShapes().addAll((Collection<? extends Shape>)newValue);
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
            case ModelsPackage.DIAGRAM__SHAPES:
                getShapes().clear();
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
            case ModelsPackage.DIAGRAM__SHAPES:
                return shapes != null && !shapes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DiagramImpl
