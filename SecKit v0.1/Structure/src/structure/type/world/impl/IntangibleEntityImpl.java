/**
 */
package structure.type.world.impl;

import org.eclipse.emf.ecore.EClass;

import structure.type.impl.EntityTypeImpl;

import structure.type.world.IntangibleEntity;
import structure.type.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intangible Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class IntangibleEntityImpl extends EntityTypeImpl implements IntangibleEntity {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntangibleEntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorldPackage.Literals.INTANGIBLE_ENTITY;
    }

} //IntangibleEntityImpl
