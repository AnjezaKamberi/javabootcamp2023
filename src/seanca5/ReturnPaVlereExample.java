package seanca5;

public class ReturnPaVlereExample {

	public static void main(String[] args) {
		printoNumrat();
	}

	public static void printoNumrat() {
		
		for (int numri = 0; numri < 10; numri++) {
			if (numri == 2) {
				return;
				// break;
			}
			System.out.println("Numri eshte: " + numri);
		}
		
		System.out.println("JASHTE CIKLIT FOR");
		System.out.println("JASHTE CIKLIT FOR 2");
	}
}
