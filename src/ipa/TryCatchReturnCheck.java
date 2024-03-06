package ipa;


public class TryCatchReturnCheck {

	@SuppressWarnings({ "finally", "unused" })
	static
	int i;
	private static int myMeth() {
		try {
			System.out.println(50/0);
			return 1;
		} 
		catch (NullPointerException |ArithmeticException de) {
			System.out.println("catch");
			return 2;
		} 
		finally {
			System.out.println("finally"+i);
			//return 3;
		}
		//System.out.println("resto fo\f");		//error line
		//return 8; //error line
	}

	public static void main(String[] args) {
		System.out.println(TryCatchReturnCheck.myMeth());
	}
}
