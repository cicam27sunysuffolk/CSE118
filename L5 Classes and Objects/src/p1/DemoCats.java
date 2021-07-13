package p1;

public class DemoCats {

	public static void main(String[] args) {
		System.out.println("\nCat 1: ");
		// Build a Cat object using the first constructor
		Cat cat1 = new Cat(); // reference variable. 
		String cat1Name = cat1.getName();
		double cat1Weight = cat1.getWeight();
		System.out.println("Cat 1's name is: " + cat1Name);
		System.out.println("Cat 1's weight is: " + cat1Weight);
		
		System.out.println("\nCat 2: ");
		// Build a Cat object using the second constructor with data provided
		Cat cat2 = new Cat("Joe", 15); 
		System.out.println(cat2.getName());
		System.out.println(cat2.getWeight());
		
		System.out.println("\nCat 3: ");
		// Build a Cat object using the second constructor with data provided
		Cat cat3 = new Cat("Jo", 12); 
		System.out.println(cat3.getName());
		System.out.println(cat3.getWeight());
	}

}
