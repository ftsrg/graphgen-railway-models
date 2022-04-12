/**
 */
package railwaypackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import railwaypackage.RailwayElement;
import railwaypackage.RailwaypackagePackage;
import railwaypackage.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.impl.SignalImpl#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends RailwayElementImpl implements Signal {
	/**
	 * The cached value of the '{@link #getConnected() <em>Connected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected RailwayElement connected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwaypackagePackage.Literals.SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailwayElement getConnected() {
		if (connected != null && connected.eIsProxy()) {
			InternalEObject oldConnected = (InternalEObject)connected;
			connected = (RailwayElement)eResolveProxy(oldConnected);
			if (connected != oldConnected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailwaypackagePackage.SIGNAL__CONNECTED, oldConnected, connected));
			}
		}
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayElement basicGetConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnected(RailwayElement newConnected) {
		RailwayElement oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.SIGNAL__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailwaypackagePackage.SIGNAL__CONNECTED:
				if (resolve) return getConnected();
				return basicGetConnected();
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
			case RailwaypackagePackage.SIGNAL__CONNECTED:
				setConnected((RailwayElement)newValue);
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
			case RailwaypackagePackage.SIGNAL__CONNECTED:
				setConnected((RailwayElement)null);
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
			case RailwaypackagePackage.SIGNAL__CONNECTED:
				return connected != null;
		}
		return super.eIsSet(featureID);
	}

} //SignalImpl
