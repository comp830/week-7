package hw7;

import java.util.Hashtable;

public class Penguin implements AnimalClass {
	
	Hashtable<String, String> penguin = new Hashtable<String, String>();
	
	@Override
	public Hashtable<String,String> aboutMe() {
		penguin.put("name", "Penguin");
		penguin.put("food", "mostly fish");
		penguin.put("moreinfo", "waddle and swim");
		
		return penguin;
		
		
	}
	
}