package moduels;

import java.util.Comparator;

public class CompartorContactByLName implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		int c1 = o1.getFName().compareTo(o2.getFName());
		if(c1 == 0) {
			int c2 = o1.getLName().compareTo(o2.getLName());
			return c2;
		}
		return c1;		
	}
}
