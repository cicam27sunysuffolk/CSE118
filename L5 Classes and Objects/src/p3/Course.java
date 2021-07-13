package p3;

public class Course { // (1) class name

	// instance variables
	String courseNumber;
	String courseTitle;
	int credits;

	// methods
	// constructors
	public Course(String aCourseNumber, String aCourseTitle, int numberOfCredits) {
		courseNumber = aCourseNumber;
		courseTitle = aCourseTitle;
		credits = numberOfCredits;
	}

	public Course(String aCourseNumber) {
		courseNumber = aCourseNumber;
		courseTitle = "";
		credits = 0;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int newCredits) {
		credits = newCredits;
	}

	public void setCourseNumber(String newCourseNumber) {
		courseNumber = newCourseNumber;
	}

	public void setCourseTitle(String newCourseTitle) {
		courseTitle = newCourseTitle;
	}
}
