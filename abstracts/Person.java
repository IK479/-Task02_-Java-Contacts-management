package abstracts;

import java.io.Serializable;
import java.util.Comparator;

public abstract class Person implements Serializable{

	protected String fName;
	protected String lName;
	
	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	
	public String getFName() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}

	
	public String getLName() {
		return lName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	
	
	public String toString() {
		return fName + "   " + lName;
	}

}
