package p2;

public class Rectangle {
	double length;
	double width;
	
	// constructors
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getCircumference() {
		return (length + width) * 2;
	}
}
