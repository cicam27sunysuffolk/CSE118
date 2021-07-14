package p3;

public class DemoDog {

	public static void main(String[] args) {
		Dog d1 = new Dog("Joey", 100.0, "Black", 5);
		System.out.println(d1);
		d1.setAge(10);
		System.out.println(d1);
		d1.setWeight(80);
		System.out.println(d1);
//		System.out.println(d1.getName());
//		System.out.println(d1.getColor());
//		System.out.println(d1.getAge());
//		System.out.println(d1.getWeight());
	}

}
