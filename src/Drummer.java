
public class Drummer extends Musician {
	/**
	 * Description of the property Type.
	 */
	public String TypeDrum = "";

	// Start of user code (user defined attributes for Drummer)

	// End of user code

	/**
	 * The constructor.
	 */
	public Drummer(String lName, String fName, String email, int phoneNum, boolean inYG) {
		// Start of user code constructor for Drummer)
		super(lName, fName, email, phoneNum, inYG);
		// End of user code
	}

	public String getTypeOfDrum() {
		return this.TypeDrum;
	}

	/**
	 * Sets a value to attribute Type. 
	 * @param newType 
	 */
	public void setType(String newType) {
		this.TypeDrum = newType;
	}

}
