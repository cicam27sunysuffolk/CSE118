package p2;

public class Student {
	// instance variables to store the state of an object (instance)
	String name;
	String id;
	double gpa;
	
	// methods
	// constructor whose name must be the class name
	public Student(String aName, String anId, double aGpa) {
		name = aName;
		id = anId;
		gpa = aGpa;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setId(String newId) {
		id = newId;
	}
	
	public void setGpa(double newGpa) {
		gpa = newGpa;
	}
}
