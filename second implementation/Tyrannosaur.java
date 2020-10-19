package hw7;

import java.util.Hashtable;

public class Tyrannosaur implements AnimalClass {	
	
	Hashtable<String, String> tyrannosaur = new Hashtable<String, String>();
	
	@Override
	public Hashtable<String,String> aboutMe() {
		tyrannosaur.put("name", "Tyranosaurus Rex");
		tyrannosaur.put("food", "other dinosaurs");
		tyrannosaur.put("moreinfo", "Roarrrr!");
		
		return tyrannosaur;		
		
	}
	
}