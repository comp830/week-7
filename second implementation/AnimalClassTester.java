package hw7;


public class AnimalClassTester implements AnimalTesting {
	
	
	@Override
	public boolean aboutMeTest(AnimalClass ac, String A, String B, String C) {	
		
		
		if(((ac.aboutMe()).get("name")==(A))) {	
			System.out.println(A);} else {return false;}
			
		
			
		if(((ac.aboutMe()).get("food")==(B))) {
			System.out.println(B);} else {return false;}
					
		
		
		if(((ac.aboutMe()).get("moreinfo")==(C)))
			{System.out.println(C);} else { return false;}
		
		
		
		return true; 
		
		
	}

}
