package seanca5;

public class ContinueExample {

	public static void main(String[] args) {

		for (int numri = 0; numri < 10; numri++) {
			
			if (numri == 10) {
				continue;
			}
			System.out.println("Numri eshte: " + numri);
			
		}

		System.out.println("Jashte ciklit FOR");
	}
}
