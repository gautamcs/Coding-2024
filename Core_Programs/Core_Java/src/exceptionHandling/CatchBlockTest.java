package exceptionHandling;


public class CatchBlockTest {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(" Exception Caught");
			e.printStackTrace();
			System.out.println(" Message Printed");
			
		} 
		catch(NullPointerException npe) {
			System.out.println(" Exception Class ");
		}

	}

}