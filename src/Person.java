
public class Person {

	public String lastName = "";

	public String firstName = "";

	public String email = "";

	public int phoneNum;

	public Boolean inYouthGroup;

	public Person(String lName, String fName, String email, int phoneNum, boolean inYG) {
		lastName = lName;
		firstName = fName;
		this.email = email;
		this.phoneNum = phoneNum;
		inYouthGroup = inYG;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public int getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(int newPhoneNum) {
		this.phoneNum = newPhoneNum;
	}

	public Boolean getInYouthGroup() {
		return this.inYouthGroup;
	}

	public void setInYouthGroup(Boolean newInYouthGroup) {
		this.inYouthGroup = newInYouthGroup;
	}

}
