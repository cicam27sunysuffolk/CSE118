package p3;

public class Dog {
	String name;
	double weight;
	String color;
	int age;

	public Dog(String name, double weight, String color, int age) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "Name: " + name + "\tWeight: " + weight + "\tColor: " + color + "\tAge: " + age;
	}
}
