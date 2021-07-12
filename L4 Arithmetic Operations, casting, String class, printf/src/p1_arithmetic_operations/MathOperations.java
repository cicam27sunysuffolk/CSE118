package p1_arithmetic_operations;

public class MathOperations {

	public static void main(String[] args) {
		int n1 = 53;
		int n2 = 10;
		
		int total = n1 + n2;
		System.out.println("Total is: " + total);
		
		System.out.println();
		
		int difference = n1 - n2;
		System.out.println("Difference is: " + difference);
		
		System.out.println();
		
		int product = n1 * n2;
		System.out.println("Product is: " + product);
		
		System.out.println();
		
		double quotient = (n1 * 1.0) / n2;
		System.out.println("Quotient is: " + quotient);
		
		System.out.println();
		
		double modulus = n1 % n2;
		System.out.println("The remainder: " + modulus);
	}

}
