package Exceptions;

public class NameException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public NameException(String fName) {
		super("General NameException: Failed geting " + fName);
	}
	
	public static void checkName(String fName) throws NameException {
		if(fName.length() <= 2) 
			throw new NameException(fName);	
	}

}
