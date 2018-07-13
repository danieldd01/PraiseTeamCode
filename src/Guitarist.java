
public class Guitarist extends Musician {

	public String Key = "";

	public Guitarist(String lName, String fName, String email, int phoneNum, boolean inYG) {
		super(lName, fName, email, phoneNum, inYG);
	}

	public String getKey() {
		return this.Key;
	}

	public void setKey(String newKey) {
		this.Key = newKey;
	}

}
