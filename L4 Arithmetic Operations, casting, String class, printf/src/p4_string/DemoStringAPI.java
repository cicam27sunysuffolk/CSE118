package p4_string;

public class DemoStringAPI {

	public static void main(String[] args) {
		String greetings = "Hello bye";
		
		System.out.println(greetings.length()); // return the length of the string
		System.out.println(greetings.charAt(2)); // return the char at the specified index location
		System.out.println(greetings.indexOf("e"));
		System.out.println(greetings.lastIndexOf("e"));
		System.out.println(greetings.substring(3, 7));
		System.out.println("CSE118 Programming".length());
	}

}
