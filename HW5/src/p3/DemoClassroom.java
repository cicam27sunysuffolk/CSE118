package p3;

import java.util.Scanner;

public class DemoClassroom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ask user information to create the first Classroom object
		System.out.println("Enter the room number for the first classroom: ");
		String roomNumber1 = scanner.nextLine();
		Classroom classroom1 = new Classroom(roomNumber1);

		// ask user information to create the second Classroom object
		System.out.println("Enter the room number for the second classroom: ");
		String roomNumber2 = scanner.nextLine();
		System.out.println("Enter the room capacity for the second classroom: ");
		int roomCapacity2 = scanner.nextInt();
		Classroom classroom2 = new Classroom(roomNumber2, roomCapacity2);
		
		scanner.nextLine();

		// ask user information to create the third Classroom object
		System.out.println("Enter the room number for the third classroom: ");
		String roomNumber3 = scanner.nextLine();
		System.out.println("Enter the room capacity for the third classroom: ");
		int roomCapacity3 = scanner.nextInt();
		System.out.println("Enter the room projector for the third classroom: ");
		boolean hasProjector3 = scanner.nextBoolean();
		Classroom classroom3 = new Classroom(roomNumber3, roomCapacity3, hasProjector3);

		System.out.printf("%-10S%5d%10b%n", classroom1.getRoomNumber(), classroom1.getRoomCapacity(),
				classroom1.getProjector());
		System.out.printf("%-10S%5d%10b%n", classroom2.getRoomNumber(), classroom2.getRoomCapacity(),
				classroom2.getProjector());
		System.out.printf("%-10S%5d%10b%n", classroom3.getRoomNumber(), classroom3.getRoomCapacity(),
				classroom3.getProjector());
		
		classroom1.setProjector(true);
		classroom1.setRoomCapacity(1000);
		
		System.out.printf("%-10S%5d%10b%n", classroom1.getRoomNumber(), classroom1.getRoomCapacity(),
				classroom1.getProjector());

	}

}
