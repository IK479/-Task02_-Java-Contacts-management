package Exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HPhoneException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public HPhoneException(String hNumber) {
		super("General HomePhoneException: Failed geting " + hNumber + "\nPattern must have xx-xxxxxxx");
	}

	
	public static void checkHPhonePattern(String hPhone) throws HPhoneException {
		
		if(!hPhone.equals("null")){
			Pattern pat = Pattern.compile("\\d{2}[-]\\d{7}$");
			Matcher m = pat.matcher(hPhone);
			
			if(!m.matches())
				throw new HPhoneException(hPhone); 
		}
	}
}
