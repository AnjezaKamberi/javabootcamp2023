package seanca8;

public class Student {

	private static String emri;

	private String mbiemer = "Cela";

	// menyra e vjeter
	private String hobi1;
	private String hobi2;
	private String hobi3;
	private String hobi4;
	private String hobi5;
	private String hobi6;

	// menyra e re
	// deklarimi i nje array 1D
	private static String[] hobi;

	// krijimi i nje array 1D
	private int[] numraFati = new int[5];

	// deklarim, krijim, inicializim i nje array 1D => METODA PARE
	private String[] gjuheProgramimi = new String[] { "Java", "C", "Python" };

	// deklarim, krijim, inicializim i nje array 1D => METODA DYTE
	private int[] notat = { 10, 5, 8, 7 };

	private boolean[] regjistruarNeProvim = new boolean[] { false, true };

	public static void main(String[] args) {

		hobi = new String[3];

		// elementi i pare
		System.out.println("Hobi i pare(para modifikimit) eshte " + hobi[0]);

		// modifiko elementin e pare
		hobi[0] = "Programimi";

		System.out.println("Hobi i pare(pas modifikimit) eshte " + hobi[0]);
		// elementi i dyte
		System.out.println("Hobi i dyte eshte " + hobi[1]);

		// elementi i trete
		System.out.println("Hobi i trete(para modifikimit) eshte " + hobi[2]);

		// modifiko elementin e trete
		hobi[2] = "Muzika";
		System.out.println("Hobi i trete(pas modifikimit te pare) eshte " + hobi[2]);
		hobi[2] = "Kercimi";
		System.out.println("Hobi i trete(pas modifikimit te dyte) eshte " + hobi[2]);

		// per te marre numrin total te elementeve te nje array
		System.out.println("Numri total i hobive eshte " + hobi.length);
		

		// elementi i katert
		System.out.println("Hobi i trete eshte " + hobi[3]);
	}

}
