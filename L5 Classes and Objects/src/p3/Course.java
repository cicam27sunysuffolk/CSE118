package p3;

public class Course { // (1) class name

	// instance variables
	String courseNumber;
	String courseTitle;
	int credits;

	// methods
	// constructors
	public Course(String courseNumber, String courseTitle, int credits) {
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.credits = credits;
	}

	public Course(String courseNumber) {
		this.courseNumber = courseNumber;
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
