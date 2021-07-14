package p1;

public class Circle {
	// instance variable
	double radius; // object radius
	
	
	// overloaded constructors
	public Circle() {  // no parameters
		radius = 10000;
	}
	
	public Circle(double radius) { // has one parameter, it's a placeholder to hold future radius value
		this.radius = radius;		// aRadius is a local variable
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) { // local variable
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

// scope of variables: the visibility of a variable is limited to the block of code where the variable is declared. 