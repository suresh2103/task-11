package task11;

public class HandleDivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerator=2;
		int denominator=0;
		try {
			int result=numerator/denominator;
			System.out.println("Result"+result);

		}
		catch (ArithmeticException e) {
		
		System.out.println("Error:"+e.getMessage());
		System.out.println("Cannot divide by zero");
		
		}
		
		
	
	}
}
		
		
		


