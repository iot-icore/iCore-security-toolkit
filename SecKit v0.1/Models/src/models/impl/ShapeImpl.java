/**
 */
package models.impl;

import java.util.Collection;
import models.ModelsPackage;
import models.Shape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.impl.ShapeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getX <em>X</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getY <em>Y</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getContainedShapes <em>Contained Shapes</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link models.impl.ShapeImpl#getContainerShape <em>Container Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeImpl extends VisualElementImpl implements Shape {
    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected static final long WIDTH_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWidth()
     * @generated
     * @ordered
     */
    protected long width = WIDTH_EDEFAULT;

    /**
     * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected static final long HEIGHT_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeight()
     * @generated
     * @ordered
     */
    protected long height = HEIGHT_EDEFAULT;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final long X_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected long x = X_EDEFAULT;

    /**
     * The default value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected static final long Y_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected long y = Y_EDEFAULT;

    /**
     * The cached value of the '{@link #getContainedShapes() <em>Contained Shapes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainedShapes()
     * @generated
     * @ordered
     */
    protected EList<Shape> containedShapes;

    /**
     * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected static final String COLOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected String color = COLOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getWidth() {
        return width;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWidth(long newWidth) {
        long oldWidth = width;
        width = newWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__WIDTH, oldWidth, width));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getHeight() {
        return height;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeight(long newHeight) {
        long oldHeight = height;
        height = newHeight;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__HEIGHT, oldHeight, height));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX(long newX) {
        long oldX = x;
        x = newX;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__X, oldX, x));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getY() {
        return y;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY(long newY) {
        long oldY = y;
        y = newY;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__Y, oldY, y));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Shape> getContainedShapes() {
        if (containedShapes == null) {
            containedShapes = new EObjectContainmentWithInverseEList<Shape>(Shape.class, this, ModelsPackage.SHAPE__CONTAINED_SHAPES, ModelsPackage.SHAPE__CONTAINER_SHAPE);
        }
        return containedShapes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getColor() {
        return color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(String newColor) {
        String oldColor = color;
        color = newColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__COLOR, oldColor, color));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shape getContainerShape() {
        if (eContainerFeatureID() != ModelsPackage.SHAPE__CONTAINER_SHAPE) return null;
        return (Shape)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainerShape(Shape newContainerShape, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainerShape, ModelsPackage.SHAPE__CONTAINER_SHAPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainerShape(Shape newContainerShape) {
        if (newContainerShape != eInternalContainer() || (eContainerFeatureID() != ModelsPackage.SHAPE__CONTAINER_SHAPE && newContainerShape != null)) {
            if (EcoreUtil.isAncestor(this, newContainerShape))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainerShape != null)
                msgs = ((InternalEObject)newContainerShape).eInverseAdd(this, ModelsPackage.SHAPE__CONTAINED_SHAPES, Shape.class, msgs);
            msgs = basicSetContainerShape(newContainerShape, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.SHAPE__CONTAINER_SHAPE, newContainerShape, newContainerShape));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelsPackage.SHAPE__CONTAINED_SHAPES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedShapes()).basicAdd(otherEnd, msgs);
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainerShape((Shape)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelsPackage.SHAPE__CONTAINED_SHAPES:
                return ((InternalEList<?>)getContainedShapes()).basicRemove(otherEnd, msgs);
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                return basicSetContainerShape(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                return eInternalContainer().eInverseRemove(this, ModelsPackage.SHAPE__CONTAINED_SHAPES, Shape.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelsPackage.SHAPE__LABEL:
                return getLabel();
            case ModelsPackage.SHAPE__WIDTH:
                return getWidth();
            case ModelsPackage.SHAPE__HEIGHT:
                return getHeight();
            case ModelsPackage.SHAPE__X:
                return getX();
            case ModelsPackage.SHAPE__Y:
                return getY();
            case ModelsPackage.SHAPE__CONTAINED_SHAPES:
                return getContainedShapes();
            case ModelsPackage.SHAPE__COLOR:
                return getColor();
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                return getContainerShape();
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
            case ModelsPackage.SHAPE__LABEL:
                setLabel((String)newValue);
                return;
            case ModelsPackage.SHAPE__WIDTH:
                setWidth((Long)newValue);
                return;
            case ModelsPackage.SHAPE__HEIGHT:
                setHeight((Long)newValue);
                return;
            case ModelsPackage.SHAPE__X:
                setX((Long)newValue);
                return;
            case ModelsPackage.SHAPE__Y:
                setY((Long)newValue);
                return;
            case ModelsPackage.SHAPE__CONTAINED_SHAPES:
                getContainedShapes().clear();
                getContainedShapes().addAll((Collection<? extends Shape>)newValue);
                return;
            case ModelsPackage.SHAPE__COLOR:
                setColor((String)newValue);
                return;
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                setContainerShape((Shape)newValue);
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
            case ModelsPackage.SHAPE__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case ModelsPackage.SHAPE__WIDTH:
                setWidth(WIDTH_EDEFAULT);
                return;
            case ModelsPackage.SHAPE__HEIGHT:
                setHeight(HEIGHT_EDEFAULT);
                return;
            case ModelsPackage.SHAPE__X:
                setX(X_EDEFAULT);
                return;
            case ModelsPackage.SHAPE__Y:
                setY(Y_EDEFAULT);
                return;
            case ModelsPackage.SHAPE__CONTAINED_SHAPES:
                getContainedShapes().clear();
                return;
            case ModelsPackage.SHAPE__COLOR:
                setColor(COLOR_EDEFAULT);
                return;
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                setContainerShape((Shape)null);
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
            case ModelsPackage.SHAPE__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case ModelsPackage.SHAPE__WIDTH:
                return width != WIDTH_EDEFAULT;
            case ModelsPackage.SHAPE__HEIGHT:
                return height != HEIGHT_EDEFAULT;
            case ModelsPackage.SHAPE__X:
                return x != X_EDEFAULT;
            case ModelsPackage.SHAPE__Y:
                return y != Y_EDEFAULT;
            case ModelsPackage.SHAPE__CONTAINED_SHAPES:
                return containedShapes != null && !containedShapes.isEmpty();
            case ModelsPackage.SHAPE__COLOR:
                return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
            case ModelsPackage.SHAPE__CONTAINER_SHAPE:
                return getContainerShape() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (label: ");
        result.append(label);
        result.append(", width: ");
        result.append(width);
        result.append(", height: ");
        result.append(height);
        result.append(", x: ");
        result.append(x);
        result.append(", y: ");
        result.append(y);
        result.append(", color: ");
        result.append(color);
        result.append(')');
        return result.toString();
    }

} //ShapeImpl
