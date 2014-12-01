/**
 */
package structure.type.world.impl;

import org.eclipse.emf.ecore.EClass;

import structure.type.impl.EntityTypeImpl;

import structure.type.world.TangibleEntity;
import structure.type.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tangible Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TangibleEntityImpl extends EntityTypeImpl implements TangibleEntity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TangibleEntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorldPackage.Literals.TANGIBLE_ENTITY;
    }

} //TangibleEntityImpl
