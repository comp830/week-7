package hw7;

public class hw7 {

	public static void main(String[] args) {		
		
		Tyrannosaur t = new Tyrannosaur();
		Cow c = new Cow();
		Penguin p = new Penguin();
		TreeClimbingOctopus oc = new TreeClimbingOctopus();
		AnimalClassTester act = new AnimalClassTester();
		
		if(act.aboutMeTest(c, "Cow", "grass, hay, and corn", "milk and cheese")) {			
			System.out.println("Cow class passed");
			
			System.out.println("\n");
			
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
			System.out.println("\n");
		}
		
		if(act.aboutMeTest(p, "Penguin", "mostly fish", "waddle and swim")) {			
			System.out.println("Penguin class passed");	
			System.out.println("\n");
			
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
			System.out.println("\n");
		}
		
		if(act.aboutMeTest(t, "Tyranosaurus Rex", "other dinosaurs", "Roarrrr!")) {
			
			System.out.println("Tyrannosaur class passed");
			System.out.println("\n");
			
		} else {
			System.out.println(">>>>Tyrannosaur class Failed!<<<<");
			System.out.println("\n");
		}
		
		if(act.aboutMeTest(oc, "Octopus", "crabs and sea stars", "i live in ocean")) {
			
			System.out.println("Tree climbing octopus class passed");
			System.out.println("\n");
			
		} else {
			System.out.println(">>>>Tree climbing octopus class Failed!<<<<");
			System.out.println("\n");
		}
		
		
	}
}