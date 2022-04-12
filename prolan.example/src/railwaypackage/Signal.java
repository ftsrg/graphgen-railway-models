/**
 */
package railwaypackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.Signal#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see railwaypackage.RailwaypackagePackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends RailwayElement {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference.
	 * @see #setConnected(RailwayElement)
	 * @see railwaypackage.RailwaypackagePackage#getSignal_Connected()
	 * @model
	 * @generated
	 */
	RailwayElement getConnected();

	/**
	 * Sets the value of the '{@link railwaypackage.Signal#getConnected <em>Connected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' reference.
	 * @see #getConnected()
	 * @generated
	 */
	void setConnected(RailwayElement value);

} // Signal
