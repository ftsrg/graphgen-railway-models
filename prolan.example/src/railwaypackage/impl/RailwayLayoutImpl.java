/**
 */
package railwaypackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import railwaypackage.RailwayElement;
import railwaypackage.RailwayLayout;
import railwaypackage.RailwaypackagePackage;
import railwaypackage.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Railway Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.impl.RailwayLayoutImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link railwaypackage.impl.RailwayLayoutImpl#getStart <em>Start</em>}</li>
 *   <li>{@link railwaypackage.impl.RailwayLayoutImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailwayLayoutImpl extends MinimalEObjectImpl.Container implements RailwayLayout {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RailwayElement> elements;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Signal start;
	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected Signal finish;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwaypackagePackage.Literals.RAILWAY_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RailwayElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<RailwayElement>(RailwayElement.class, this, RailwaypackagePackage.RAILWAY_LAYOUT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Signal newStart, NotificationChain msgs) {
		Signal oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.RAILWAY_LAYOUT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Signal newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailwaypackagePackage.RAILWAY_LAYOUT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailwaypackagePackage.RAILWAY_LAYOUT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.RAILWAY_LAYOUT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinish(Signal newFinish, NotificationChain msgs) {
		Signal oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.RAILWAY_LAYOUT__FINISH, oldFinish, newFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinish(Signal newFinish) {
		if (newFinish != finish) {
			NotificationChain msgs = null;
			if (finish != null)
				msgs = ((InternalEObject)finish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailwaypackagePackage.RAILWAY_LAYOUT__FINISH, null, msgs);
			if (newFinish != null)
				msgs = ((InternalEObject)newFinish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailwaypackagePackage.RAILWAY_LAYOUT__FINISH, null, msgs);
			msgs = basicSetFinish(newFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.RAILWAY_LAYOUT__FINISH, newFinish, newFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RailwaypackagePackage.RAILWAY_LAYOUT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case RailwaypackagePackage.RAILWAY_LAYOUT__START:
				return basicSetStart(null, msgs);
			case RailwaypackagePackage.RAILWAY_LAYOUT__FINISH:
				return basicSetFinish(null, msgs);
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
			case RailwaypackagePackage.RAILWAY_LAYOUT__ELEMENTS:
				return getElements();
			case RailwaypackagePackage.RAILWAY_LAYOUT__START:
				return getStart();
			case RailwaypackagePackage.RAILWAY_LAYOUT__FINISH:
				return getFinish();
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
			case RailwaypackagePackage.RAILWAY_LAYOUT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends RailwayElement>)newValue);
				return;
			case RailwaypackagePackage.RAILWAY_LAYOUT__START:
				setStart((Signal)newValue);
				return;
			case RailwaypackagePackage.RAILWAY_LAYOUT__FINISH:
				setFinish((Signal)newValue);
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
			case RailwaypackagePackage.RAILWAY_LAYOUT__ELEMENTS:
				getElements().clear();
				return;
			case RailwaypackagePackage.RAILWAY_LAYOUT__START:
				setStart((Signal)null);
				return;
			case RailwaypackagePackage.RAILWAY_LAYOUT__FINISH:
				setFinish((Signal)null);
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
			case RailwaypackagePackage.RAILWAY_LAYOUT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case RailwaypackagePackage.RAILWAY_LAYOUT__START:
				return start != null;
			case RailwaypackagePackage.RAILWAY_LAYOUT__FINISH:
				return finish != null;
		}
		return super.eIsSet(featureID);
	}

} //RailwayLayoutImpl
