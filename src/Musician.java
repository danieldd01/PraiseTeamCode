
public class Musician extends Person {

	public SkillLevel skillLevel = null;

	public String InstrumentType ="";

	public int PhoneNum = 0;

	public Musician(String lName, String fName, String email, int phoneNum, boolean inYG) {
		super(lName, fName, email, phoneNum, inYG);

	}

	public SkillLevel getSkillLevel() {
		return this.skillLevel;
	}

	public String getInstrumentType() {
		return this.InstrumentType;
	}

	public void setInstrumentType(String newInstrumentType) {
	    this.InstrumentType = newInstrumentType;
	}

	public int getPhoneNum() {
		return this.PhoneNum;
	}

	public void setPhoneNum(int newPhoneNum) {
		this.PhoneNum = newPhoneNum;
	}

}
