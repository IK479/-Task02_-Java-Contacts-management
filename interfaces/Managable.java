package interfaces;

import moduels.Contact;

public interface Managable {
	
	void addNewContact(Contact c);
	
	boolean removeContact(String firstName, String lastName);
	
	String searchByFullName(String firstName, String lastName);
	
	String searchByMobileNum(String mobileNumber);
	
	void printAllContacts();

}
