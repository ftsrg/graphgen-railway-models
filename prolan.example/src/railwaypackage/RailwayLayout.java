/**
 */
package railwaypackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Railway Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.RailwayLayout#getElements <em>Elements</em>}</li>
 *   <li>{@link railwaypackage.RailwayLayout#getStart <em>Start</em>}</li>
 *   <li>{@link railwaypackage.RailwayLayout#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @see railwaypackage.RailwaypackagePackage#getRailwayLayout()
 * @model
 * @generated
 */
public interface RailwayLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link railwaypackage.RailwayElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see railwaypackage.RailwaypackagePackage#getRailwayLayout_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RailwayElement> getElements();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Signal)
	 * @see railwaypackage.RailwaypackagePackage#getRailwayLayout_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getStart();

	/**
	 * Sets the value of the '{@link railwaypackage.RailwayLayout#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Signal value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' containment reference.
	 * @see #setFinish(Signal)
	 * @see railwaypackage.RailwaypackagePackage#getRailwayLayout_Finish()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signal getFinish();

	/**
	 * Sets the value of the '{@link railwaypackage.RailwayLayout#getFinish <em>Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' containment reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(Signal value);

} // RailwayLayout
