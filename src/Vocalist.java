
public class Vocalist extends Musician {

	public boolean gender;

	public String key;

	public Vocalist(String lName, String fName, String email, int phoneNum, boolean inYG) {
		super(lName, fName, email, phoneNum, inYG);
	}


	public boolean getGender() {
		return gender;
	}

	public String getKey() {
		return key;
	}

	public void setgender(boolean gender) {
	    this.gender = gender;
	}

	public void setKey(String newKey) {
		this.key = newKey;
	}

}
