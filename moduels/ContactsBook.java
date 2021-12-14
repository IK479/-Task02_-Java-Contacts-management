package moduels;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Vector;


import interfaces.Managable;

public class ContactsBook implements Managable {
	  
	private Vector<Contact> contactsList;
	private Map<String, Contact>contacts;
	
	public ContactsBook() {
		 contactsList = new Vector<Contact>();
		 contacts = new LinkedHashMap<>();
	}

	@Override
	public void addNewContact(Contact c) {
		for (int i = 0; i < contactsList.size(); i++) {
			if(((contactsList.get(i).getFName().equals(c.getFName()) && contactsList.get(i).getLName().equals(c.getLName())) || (contactsList.get(i).getMPhone().equals(c.getMPhone())))){
				overRideContactInMap(contactsList.get(i), c);
				contactsList.remove(contactsList.get(i));
			}		
		}
		contactsList.add(c);
		setContactToMap(c.getMPhone(), c);
		Collections.sort(contactsList, new CompartorContactByLName());;
	}
	
	public void setContactToMap(String mPhone, Contact c) {
		contacts.put(mPhone, c);
	}
	
	public void overRideContactInMap(Contact previus, Contact cNew) {
		contacts.remove(previus.getMPhone());
		contacts.put(cNew.getMPhone(), cNew);
	}
	
	@Override
	public boolean removeContact(String fName, String lName) {
		for(int i = 0; i < contactsList.size(); i++) {
			if(contactsList.get(i).getFName().equals(fName) && contactsList.get(i).getLName().equals(lName)) {
				contacts.remove(contactsList.get(i).getMPhone());
				contactsList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public String searchByFullName(String fName, String lName) {
		for(int i = 0; i < contactsList.size(); i++) {
			if(contactsList.get(i).getFName().equals(fName) && contactsList.get(i).getLName().equals(lName)) {
				return contactsList.get(i).toString();
			}
		}
		System.out.println("The Contact does Not exist.");
		return null;
	}

	@Override
	public String searchByMobileNum(String mPhone) {
		Iterator<Map.Entry<String, Contact>> itr = contacts.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Contact> entry = itr.next();
			if(entry.getKey().equals(mPhone))
				return entry.getValue().toString();
		}
		System.out.println("The Contact does Not exist.");
		return null;
	}

	@Override
	public void printAllContacts() {
		System.out.println("Contacts List: ");
	
		if(contactsList.size() == 0)
			System.out.println("There Is No Contacts!");
		else
			for(int i = 0; i < contactsList.size(); i++) {
				System.out.println((i+1) + "). " + contactsList.get(i).toString());	
			}		
	}
}
 