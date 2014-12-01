/**
 */
package models.impl;

import models.Model;
import models.ModelsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.impl.ModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link models.impl.ModelImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link models.impl.ModelImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelImpl extends ElementImpl implements Model {
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected static final String FILENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected String filename = FILENAME_EDEFAULT;

    /**
     * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
    protected static final String URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUri()
     * @generated
     * @ordered
     */
    protected String uri = URI_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.MODEL__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilename(String newFilename) {
        String oldFilename = filename;
        filename = newFilename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.MODEL__FILENAME, oldFilename, filename));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUri() {
        return uri;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUri(String newUri) {
        String oldUri = uri;
        uri = newUri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.MODEL__URI, oldUri, uri));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelsPackage.MODEL__DESCRIPTION:
                return getDescription();
            case ModelsPackage.MODEL__FILENAME:
                return getFilename();
            case ModelsPackage.MODEL__URI:
                return getUri();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelsPackage.MODEL__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ModelsPackage.MODEL__FILENAME:
                setFilename((String)newValue);
                return;
            case ModelsPackage.MODEL__URI:
                setUri((String)newValue);
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
            case ModelsPackage.MODEL__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ModelsPackage.MODEL__FILENAME:
                setFilename(FILENAME_EDEFAULT);
                return;
            case ModelsPackage.MODEL__URI:
                setUri(URI_EDEFAULT);
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
            case ModelsPackage.MODEL__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ModelsPackage.MODEL__FILENAME:
                return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
            case ModelsPackage.MODEL__URI:
                return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
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
        result.append(" (description: ");
        result.append(description);
        result.append(", filename: ");
        result.append(filename);
        result.append(", uri: ");
        result.append(uri);
        result.append(')');
        return result.toString();
    }

} //ModelImpl
