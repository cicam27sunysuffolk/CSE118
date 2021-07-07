package variables_1;

public class DemoVariables1 {
	
	// Reference data types:
	// String *

	// seven primitive data types:
	// char *
	// double *
	// float
	// short
	// int *
	// long
	// boolean *
	
	public static void main(String[] args) {
		
		String dashLine = "-------------------------------------------";// variable of String type
		String restaurantName = "\\t\\tABC Restaurant";
		String address = "\t\t123 Main Street" + "\n\t     Stony Brook, NY 11790";
		String phoneNumber = "\t       PH: (631) 123-4567";
		
		double priceSalad = 9.99;
		double priceIceCream = 4.99;
		
		float smallRealNumber = 3.5f;
		
//		double dishNumber = 1;
		
		int numberOfDishes = 2;
		
		char letter = 'a';
		char number = '5';
		
		boolean isOpen = false;
		boolean hasAC = false;
		
		System.out.println(dashLine);
		System.out.println(restaurantName);
		System.out.println(address);
		
		System.out.println(phoneNumber);
		System.out.println(dashLine);
		System.out.println("\tSalad\t\t\t$" + priceSalad);
		System.out.println("\tIce Cream\t\t$" + priceIceCream);
		System.out.println(dashLine);
		System.out.println("There are " + numberOfDishes + " dishes");
		
		System.out.println(String.valueOf(letter) + String.valueOf(number));
		System.out.println("" + letter + number);
		
		System.out.println("Is the restaurant open? " + isOpen);
		
		System.out.println(Long.MIN_VALUE + "---" + Long.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "---" + Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "---" + Short.MAX_VALUE);
		
		System.out.println("Double Range:");
		System.out.println(Double.MIN_VALUE + "---" + Double.MAX_VALUE);
	}

}
