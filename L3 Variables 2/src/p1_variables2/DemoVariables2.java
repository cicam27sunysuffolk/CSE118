package p1_variables2;

public class DemoVariables2 {

	public static void main(String[] args) {
		String number1 = "100.4";
		String number2 = "200.2";
		
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		
//		System.out.println(n1 + n2);
		
		String n1Str = String.valueOf(n1);
		String n2Str = String.valueOf(n2);
		
		System.out.println(n1Str + n2Str);
	}

}
