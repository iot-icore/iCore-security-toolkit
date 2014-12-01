/**
 */
package structure.type.world.impl;

import org.eclipse.emf.ecore.EClass;

import structure.type.world.Room;
import structure.type.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class RoomImpl extends PhysicalContainerEntityImpl implements Room {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoomImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorldPackage.Literals.ROOM;
    }

} //RoomImpl
