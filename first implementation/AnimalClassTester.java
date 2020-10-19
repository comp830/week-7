package HW7_export;

public class AnimalClassTester implements AnimalTesting {
	
	
	@Override
	public boolean allanimaltesting(animal obj, String A, String B, String C) {
		if(obj.animalName().equalsIgnoreCase(A) ) 
		{
			System.out.println(A);
			if(obj.animalFood().equalsIgnoreCase(B) )
				{
				System.out.println(B);
				}
				if(obj.animalInfo().equalsIgnoreCase(C))
					{System.out.println(C);
					return true;
					}
		
		
		
	}
		return false;
}
}
