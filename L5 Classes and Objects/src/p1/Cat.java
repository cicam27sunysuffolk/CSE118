package p1;

// create a cat template to describe future cats, no real actual cats yet
public class Cat { // class header

	// instance variables: describe cat's state: current status
	String name; // object's name
	double weight; // object's weight

	// methods: describe cat's behavior

	// a special method called constructor. Used to create a cat object
	public Cat() { // parenthesis is an indicator of a method
		name = "My Cat";
		weight = 10;
	}

	// another constructor to allow the user to provide name and weight for a cat
	// object
	public Cat(String aName, double aWeight) {
		name = aName;
		weight = aWeight;
	}

	//getters, accessors
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	// setters, mutators
	public void setName(String newName) {
		name = newName;
	}

	public void setWeight(double newWeight) {
		weight = newWeight;
	}
}
