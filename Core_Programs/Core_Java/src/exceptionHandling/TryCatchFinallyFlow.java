package exceptionHandling;

public class TryCatchFinallyFlow {
	public static void main(String[] args) {
		try {
			System.out.println(" Statemenet - 1");
			System.out.println(" Statemenet - 2"+10/0);
			System.out.println(" Statemenet - 3");
		} catch (Exception exp) {

			System.out.println(" Arithmetic Exp");
			System.out.println(2/0);
			System.out.println(" Inside Catch Block ");
		} finally {
			System.out.println(" Statemenet - 5");
		}
		System.out.println(" Statemenet - 6");

	}

}