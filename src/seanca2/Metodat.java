package seanca2;

public class Metodat {

	private static String variabliInstance;
	private static char c;
	private static int numer;
	private static final float numerFloat = 5;
	
	public static void emriMetodesNukKthenRezultat() {
		System.out.println("Do bej veprime te ndryshme");
	}

	void emriMetodesMeParam(String param1, String param2) {

	}

	protected String merrDitenSot() {
		
		String dita = "E enjte";
		System.out.println("Dita eshte " + dita);
		return dita;
	}

	private static int merrNumrinDitesPerJave() {
		return 4;
	}

	public static void main(String[] args) {
		emriMetodesNukKthenRezultat();

		int numriDites = merrNumrinDitesPerJave();
		// menyra pare
		System.out.println("Numri i dites eshte " + numriDites);

		// menyra dyte
		System.out.println("Numri i dites eshte " + merrNumrinDitesPerJave());
	
		System.out.println("Vlera 1 eshte " + variabliInstance);
		System.out.println("Vlera 2 eshte " + c);
		System.out.println("Vlera 3 eshte " + numer);
		System.out.println("Vlera 4 eshte " + numerFloat);
		
	
	}
}
