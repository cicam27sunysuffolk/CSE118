package p2_casting;

public class DemoCasting {

	public static void main(String[] args) {
		// double > float > long > int  > short
//		System.out.println(Double.MIN_VALUE + " ---  " + Double.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE + " ---  " + Integer.MAX_VALUE);
//		
//		double realNumber = 3.5;
//		int wholeNumber = (int) realNumber; // casting, narrowing a number
//		System.out.println(wholeNumber);
		
		int wholeNumber = 100;
		double realNumber = wholeNumber; // widening
		System.out.println(realNumber);
		
				
	}

}
