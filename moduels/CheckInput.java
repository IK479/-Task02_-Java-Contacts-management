package moduels;

import java.util.Scanner;
import Exceptions.HPhoneException;
import Exceptions.MPhoneException;
import Exceptions.NameException;

public class CheckInput {
	
	static Scanner in = new Scanner(System.in);
	static boolean isTrue = false;
	

	public static String addFName() {
		String fName = null;
		
		while(!isTrue) {
			System.out.print("Enter first name: ");
			fName = in.next();
			
			try {	
				NameException.checkName(fName);		
				isTrue = true;
				
			}catch(NameException e){
				System.out.println(e.getMessage());
				tryAgain();
					
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		isTrue = false;
		return fName;
	}
	
	
	public static String addLName() {
		String lName = null;
		
		while(!isTrue) {
			System.out.print("Enter last name: ");
			lName = in.next();
			
			try {			
				NameException.checkName(lName);
				isTrue = true;
			
			}catch(NameException e){
				System.out.println(e.getMessage());
				tryAgain();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		isTrue = false;
		return lName;
	}
	
	
	public static String addHPhone() {
		String hPhone = null;
		
		while(!isTrue) {
			System.out.print("Enter home phone (If there is no phone at home Enter null): ");
			hPhone = in.next();
			
			try {
				HPhoneException.checkHPhonePattern(hPhone);
				isTrue = true;
				
			}catch (HPhoneException e){
				System.out.println(e.getMessage());
				tryAgain();
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		isTrue = false;
		return hPhone;
	}
	
	
	public static String addMPhone() {
		String mPhone = null;
		
		while(!isTrue) {
			System.out.print("Enter mobile phone: ");
			mPhone = in.next();
			
			try {
				MPhoneException.checkMPhonePattern(mPhone);
				isTrue = true;
				
			}catch (MPhoneException e){
				System.out.println(e.getMessage());
				tryAgain();	
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		isTrue = false;
		return mPhone;
	}
	
	
	public static void tryAgain() {
		System.out.println("Please Try again! ");
	}
		

}
