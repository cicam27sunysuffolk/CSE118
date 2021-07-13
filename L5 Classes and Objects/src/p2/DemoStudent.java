package p2;

public class DemoStudent {

	public static void main(String[] args) {
		// a class is a data type
		Student s1 = new Student("John Doe", "12345678", 4.0);
//		System.out.println(s1.getName());
		s1.setName("Jane Doe");
//		System.out.println(s1.getName());
		
		System.out.printf("%-20s%10s%10.2f%n", s1.getName(), s1.getId(), s1.getGpa());
		s1.setGpa(3.0);
		System.out.printf("%-20s%10s%10.2f%n", s1.getName(), s1.getId(), s1.getGpa());
		
		Student s2 = new Student("Joan Delgado", "02123455", 4.0);
		System.out.printf("%-20s%10s%10.2f%n", s2.getName(), s2.getId(), s2.getGpa());
		
		Student s3 = new Student("Ali Iqbal", "03155455", 3.5);
		System.out.printf("%-20s%10s%10.2f%n", s3.getName(), s3.getId(), s3.getGpa());
	}

}
