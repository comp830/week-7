package hw7;

import java.util.Hashtable;

public class Cow implements AnimalClass {
	
	Hashtable<String, String> cow = new Hashtable<String, String>();
	
	@Override
	public Hashtable<String,String> aboutMe() {
		cow.put("name", "Cow");
		cow.put("food", "grass, hay, and corn");
		cow.put("moreinfo", "milk and cheese");
		
		return cow;
		
		
	}
	
}
	
	