package HW7_export;

public class hw7  {

	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
		
		Tyrannosaur clarence = new Tyrannosaur();
		if (qa.allanimaltesting(clarence,"Tyranosaurus Rex","other dinosaurs","Roarrrr!")) {
			System.out.println("Tyrranosaur class passes");
		} else {
			System.out.println(">>>>Tyrranosaur class Failed!<<<<");
		}
		
		Penguin opus = new Penguin();
		if (qa.allanimaltesting(opus,"penguin", "mostly fish", "waddle and swim")) {
			System.out.println("Penguin class passes");
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
		}
		
		Cow mrsolearys = new Cow();
		if (qa.allanimaltesting(mrsolearys, "Cow","grass, hay, and corn","milk and cheese")) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}		
		
		TreeClimbingOctopus TOct = new TreeClimbingOctopus();
		if (qa.allanimaltesting(TOct,"Octopus","sea food", "eight legged sea animal")) {
			System.out.println("Octopus class passes");
		} else {
			System.out.println(">>>>Octopus class Failed!<<<<");
		}
	}

}
