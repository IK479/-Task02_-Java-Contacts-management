package moduels;

import java.util.Map;

import abstracts.Person;

public class Contact extends Person implements Comparable<Contact>{
	
	private String hPhone;
	private String mPhone;
	
	public Contact(String fName, String lName, String hPhone, String mPhone) {
		super(fName, lName);	
		this.hPhone = hPhone;
		this.mPhone = mPhone;
	}
	
	
	public String getHPhone() {
		return hPhone;
	}
	public void setHPhone(String hPhone) {
		this.hPhone = hPhone;
	}

	
	public String getMPhone() {
		return mPhone;
	}
	public void setMPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	
	@Override
	public String toString() {
		return super.toString() + "   " + hPhone + "   " + mPhone;
	}

	@Override
	public int compareTo(Contact o){
		return (fName.compareTo(o.getFName()));
   }
	
}
