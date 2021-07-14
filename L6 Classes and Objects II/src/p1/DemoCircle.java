package p1;

public class DemoCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(); // a circle object is created using a constructor
		System.out.println(c1.getRadius());
		c1.setRadius(5);
		System.out.println(c1.getRadius());
		System.out.println("The area of c1 is " + c1.getArea());
		
		
		Circle c2 = new Circle(); // a circle object is created using a constructor
		System.out.println(c2.getRadius());
		System.out.println("The area of c2 is " + c2.getArea());
		
		Circle c3 = new Circle(20.5); // 20.5 is an argument to be stored in the parameter variable aRadius
		System.out.println(c3.getRadius());
		System.out.println("The area of c3 is " + c3.getArea());
	}

}
