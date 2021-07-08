package p2_keyboard_input;

import java.util.Scanner;

public class DemoKeyboardInput {

	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.println("Enter your name: ");
//		String name = kb.nextLine();
//		
//		System.out.println("Enter your age: "); // provide a prompt
//		double myAge = kb.nextDouble();
//		
//		System.out.println("Hey " + name + ", next year you will be: " + (myAge + 1) + " years old");;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: "); // provide a prompt
		double myAge = input.nextDouble();
		
		input.nextLine(); // consume the enter key left from when entering the age
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Hey " + name + " you're " + myAge + " years old");
	
	}

}
