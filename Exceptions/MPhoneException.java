package Exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MPhoneException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MPhoneException(String mPhone) {
		super("General MobilePhoneException: Failed geting " + mPhone + "\nPattern must have xxx-xxxxxxx");
	
	}
	
	public static void checkMPhonePattern(String mPhone) throws MPhoneException {
		Pattern pat = Pattern.compile("\\d{3}[-]\\d{7}$");
		Matcher m = pat.matcher(mPhone);
		
		if(!m.matches())
			throw new MPhoneException(mPhone); 
	}

}
