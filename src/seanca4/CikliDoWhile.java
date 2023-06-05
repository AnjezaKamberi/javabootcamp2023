package seanca4;

public class CikliDoWhile {

	public static void main(String[] args) {

		// do while

		double balanca = 100;
		
		do {
			System.out.println("Mire se erdhet ne OTP bank");
			System.out.println("Dua te terheq 20L");
			balanca = balanca - 20;

		} while (balanca > 0);

		/*
		 * while(balanca > 0) { System.out.println("Mire se erdhet ne OTP bank");
		 * System.out.println("Dua te terheq 1000L"); }
		 */
	}
}
