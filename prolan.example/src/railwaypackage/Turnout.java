/**
 */
package railwaypackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.Turnout#getFrom <em>From</em>}</li>
 *   <li>{@link railwaypackage.Turnout#getStraight <em>Straight</em>}</li>
 *   <li>{@link railwaypackage.Turnout#getDivergent <em>Divergent</em>}</li>
 * </ul>
 *
 * @see railwaypackage.RailwaypackagePackage#getTurnout()
 * @model
 * @generated
 */
public interface Turnout extends RailwayElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(RailwayElement)
	 * @see railwaypackage.RailwaypackagePackage#getTurnout_From()
	 * @model required="true"
	 * @generated
	 */
	RailwayElement getFrom();

	/**
	 * Sets the value of the '{@link railwaypackage.Turnout#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(RailwayElement value);

	/**
	 * Returns the value of the '<em><b>Straight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Straight</em>' reference.
	 * @see #setStraight(RailwayElement)
	 * @see railwaypackage.RailwaypackagePackage#getTurnout_Straight()
	 * @model required="true"
	 * @generated
	 */
	RailwayElement getStraight();

	/**
	 * Sets the value of the '{@link railwaypackage.Turnout#getStraight <em>Straight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Straight</em>' reference.
	 * @see #getStraight()
	 * @generated
	 */
	void setStraight(RailwayElement value);

	/**
	 * Returns the value of the '<em><b>Divergent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divergent</em>' reference.
	 * @see #setDivergent(RailwayElement)
	 * @see railwaypackage.RailwaypackagePackage#getTurnout_Divergent()
	 * @model required="true"
	 * @generated
	 */
	RailwayElement getDivergent();

	/**
	 * Sets the value of the '{@link railwaypackage.Turnout#getDivergent <em>Divergent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divergent</em>' reference.
	 * @see #getDivergent()
	 * @generated
	 */
	void setDivergent(RailwayElement value);

} // Turnout
