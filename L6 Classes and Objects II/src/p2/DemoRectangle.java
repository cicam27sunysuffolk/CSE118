package p2;

import java.util.Scanner;

public class DemoRectangle {

	public static void main(String[] args) {
//		Rectangle r1 = new Rectangle(10.5, 5.5);
//		System.out.println(r1.getLength() + ", " + r1.getWidth());
//		r1.setLength(100);
//		r1.setWidth(50);
//		System.out.println(r1.getLength() + ", " + r1.getWidth());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double length = scanner.nextDouble();
		System.out.println("Enter the width: ");
		double width = scanner.nextDouble();
		
		Rectangle r1 = new Rectangle(length, width);
		System.out.println(r1.getLength() + ", " + r1.getWidth());
		
		System.out.println("The area of r1 is " + r1.getArea());
		System.out.println("The circumference is " + r1.getCircumference());
		
		
	}

}
