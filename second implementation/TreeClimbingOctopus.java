package hw7;

import java.util.Hashtable;


public class TreeClimbingOctopus implements AnimalClass {
	
	Hashtable<String, String> treeclimbingoctopus = new Hashtable<String, String>();
	
	@Override
	public Hashtable<String,String> aboutMe() {
		treeclimbingoctopus.put("name", "Octopus");
		treeclimbingoctopus.put("food", "crabs and sea stars");
		treeclimbingoctopus.put("moreinfo", "i live in ocean");
		
		return treeclimbingoctopus;
		
		
	}
	
}
	
	