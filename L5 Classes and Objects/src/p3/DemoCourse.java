package p3;

public class DemoCourse {

	public static void main(String[] args) {
		Course c1 = new Course("Cse118", "Fundamentals of Programming", 3);
		Course c2 = new Course("cse148", "Object Oriented Programming", 4);
		Course c3 = new Course("mAT141", "Calculus 1", 4);
		
		Course c4 = new Course("ENG101");
		c4.setCourseTitle("English Composition");
		c4.setCredits(3);
		
		String format = "%-10S%30s%5d%n";
		
		System.out.printf(format, c1.getCourseNumber(), c1.getCourseTitle(), c1.getCredits());
		System.out.printf(format, c2.getCourseNumber(), c2.getCourseTitle(), c2.getCredits());
		System.out.printf(format, c3.getCourseNumber(), c3.getCourseTitle(), c3.getCredits());
		System.out.printf(format, c4.getCourseNumber(), c4.getCourseTitle(), c4.getCredits());
	}

}
