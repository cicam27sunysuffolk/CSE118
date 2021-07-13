package p1_transcript;

import java.util.Scanner;

public class TranscriptMaker { // noun
	public static void main(String[] args) { // main method
		
		// upon declaration of a variable, it has a default value inline comments
		// for String, it is null
		// for double, it is 0.0
		// for int, it is 0
		// for boolean, it is false;

		// variable declarations
		
		/* block comments
		 * fdsgda gdra
		 * grg sda
		 * g dagfds
		 * gfds gs gfdsgfds
		 * gfds gfds gfsgfsgfdsg
		 */
		String schoolName = "Suffolk School"; // nouns
		String streetNumber, streetName, city, state, zip;
		String phone;

		String courseName1, courseName2, courseName3, courseName4;
		String courseName5, courseName6, courseName7, courseName8;
		double score1, score2, score3, score4;
		double score5, score6, score7, score8;

		double totalScore;

		String dashLine = "------------------------------------------------";

		// obtaining input

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter school name: ");
		schoolName = scanner.nextLine();

		System.out.println("Enter school street number : ");
		streetNumber = scanner.nextLine();

		System.out.println("Enter school street name: ");
		streetName = scanner.nextLine();

		System.out.println("Enter school city : ");
		city = scanner.nextLine();

		System.out.println("Enter school state: ");
		state = scanner.nextLine();

		System.out.println("Enter school zip : ");
		zip = scanner.nextLine();

		System.out.println("Enter school phone number : ");
		phone = scanner.nextLine();

		System.out.println("Enter course 1 : ");
		courseName1 = scanner.nextLine();

		System.out.println("Enter score for this course : ");
		score1 = scanner.nextDouble();

		scanner.nextLine();

		System.out.println("Enter course 2 : ");
		courseName2 = scanner.nextLine();

		System.out.println("Enter score for this course : ");
		score2 = scanner.nextDouble();

//		scanner.nextLine();
//		
//		System.out.println("Enter course 3 : ");
//		courseName3 = scanner.nextLine();
//		
//		System.out.println("Enter score for this course : ");
//		score3 = scanner.nextDouble();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter course 4 : ");
//		courseName4 = scanner.nextLine();
//		
//		System.out.println("Enter score for this course : ");
//		score4 = scanner.nextDouble();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter course 5 : ");
//		courseName5= scanner.nextLine();
//		
//		System.out.println("Enter score for this course : ");
//		score5 = scanner.nextDouble();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter course 6 : ");
//		courseName6 = scanner.nextLine();
//		
//		System.out.println("Enter score for this course : ");
//		score6 = scanner.nextDouble();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter course 7 : ");
//		courseName7= scanner.nextLine();
//		
//		System.out.println("Enter score for this course : ");
//		score7 = scanner.nextDouble();
//		
//		scanner.nextLine();
//		
//		System.out.println("Enter course 8 : ");
//		courseName8 = scanner.nextLine();
//		
//		System.out.println("Enter score for this course : ");
//		score8 = scanner.nextDouble();
//		
//		scanner.nextLine();

		// processing
		totalScore = score1 + score2; // + score3 + score4 + score5 + score6 + score7 + score8;
		double average = totalScore / 2;

		// output
		System.out.println(dashLine);
		System.out.println("      " + schoolName);
		System.out.println("      " + streetNumber + " " + streetName);
		System.out.println("   " + city + ", " + state + " " + zip);
		System.out.println("      " + phone);
		System.out.println(dashLine);
		System.out.printf("%-30S%10.2f%n", courseName1, +score1);
		System.out.printf("%-30S%10.2f%n", courseName2, +score2);
//		System.out.printf("%-10S%20.2f%n", courseName3,+ score3);
//		System.out.printf("%-10S%20.2f%n", courseName4,+ score4);
//		System.out.printf("%-10S%20.2f%n", courseName5,+ score5);
//		System.out.printf("%-10S%20.2f%n", courseName6,+ score6);
//		System.out.printf("%-10S%20.2f%n", courseName7,+ score7);
//		System.out.printf("%-10S%20.2f%n", courseName8,+ score8);

		System.out.println(dashLine);
		System.out.printf("%-30s%10.2f%n", "Score Average:", average);
	}

}
