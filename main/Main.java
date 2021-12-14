package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.MPhoneException;
import Exceptions.NameException;
import Exceptions.HPhoneException;
import moduels.CheckInput;
import moduels.Contact;
import moduels.ContactsBook;

public class Main {
	
	static String fName, lName, hPhone, mPhone; 
    static ContactsBook cb = new ContactsBook();
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		char choose = 0;
	    
		do {
			System.out.println("- - - - - - - - - - - - - - -\r\n"
					+ "- - - Contact Editor: - - -\r\n"
					+ "- - - - - - - - - - - - - - -");
			System.out.println("1. Add contact");
			System.out.println("2. Delete contact");
			System.out.println("3. Search Contact By Full Name: ");
			System.out.println("4. Search Contact By Mobile: ");
			System.out.println("5. Print All Contacts: ");
			System.out.println("Choose your option or any other key to EXIT.\r\n\n" + "Your Option:");
			
			choose = in.next().charAt(0);
		   
			switch(choose) {
			
			case '1':			
				addContact();
				break;
				
			case '2': 			
				removeContact();
				break;
				
			case '3':		
				searchContactByFullName();
				break;
				
			case '4': 
				searchContactByMobilePhone();
				break;
				
			case '5': 
				printContacts();
				break;		
		}
			
			System.out.println("\n");
			
		}while(((int)choose)-48 <= 5 && ((int)choose)-48 >= 1);
			System.out.println("The program has been ended.");							
	}
	
	
	public static void addContact() {
		fName = CheckInput.addFName();
		lName = CheckInput.addLName();
		hPhone = CheckInput.addHPhone();
		mPhone = CheckInput.addMPhone();
		
		//Object Creation
		cb.addNewContact(new Contact(fName, lName, hPhone, mPhone));
	}
	
	
	public static void removeContact() {
		fName = CheckInput.addFName();
		lName = CheckInput.addLName();

		if(!cb.removeContact(fName, lName))
			System.out.println("This contact does Not Exists");
		else
			System.out.println("The contact has removed successfuly!");
	}
	
	
	public static void searchContactByFullName() {	
		System.out.println("Enter first name: ");
		fName = in.next();
		
		System.out.println("Enter last name: ");
		lName = in.next();
		
		System.out.println(cb.searchByFullName(fName,lName));
	}
	
	
	public static void searchContactByMobilePhone() {	
		mPhone = CheckInput.addMPhone();
		System.out.println(cb.searchByMobileNum(mPhone));
	}
	
	
	public static void printContacts() {	
		cb.printAllContacts();
	}
		
}
