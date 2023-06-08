package seanca9;

public class Array2D {

	public static void main(String[] args) {

		// deklarimi i nje array 2D

		int[][] notaPerStudent;

		// krijimi i nje array 2D

		String[][] qytetePerShtet = new String[5][3];

		// inicializim i nje array2D

		String[][] punonjesPerDepartamente = new String[][] { { "vlera x", "vlera xx" }, { "vlera y" },
				{ "vlera z", "vlera zz", "vlera zzz" } };

		System.out.println("Vlera qe ndodhet te rreshti i trete dhe kolona e dyte per array2D eshte ' "
				+ punonjesPerDepartamente[2][1] + "'");

		System.out.println("Vlera qe ndodhet te rreshti i pare dhe kolona e pare per array2D eshte '"
				+ punonjesPerDepartamente[0][0] + "'");

		// modifikimi i rreshtit te pare kolona e dyte
		punonjesPerDepartamente[0][1] = "Pamela";
		System.out.println(
				"Vlera qe ndodhet te rreshti i pare dhe kolona e dyte eshte '" + punonjesPerDepartamente[0][1] + "'");

		// aksesimi i nje elementi qe nuk ekziston ne array
		/*
		 * System.out.
		 * println("Vlera qe ndodhet te rreshti i pare dhe kolona e trete eshte '" +
		 * punonjesPerDepartamente[0][2] + "'");
		 */

		int[] array1D = { 5, 4, 7, 15 };

		// numri i elementeve ne nje array 1d
		System.out.println("Numri i elementeve eshte " + array1D.length);

		int elementiPare = array1D[0];
		// wrapper
		Integer elementiPareWrapper = array1D[0];
		// error kompilimi
		// System.out.println("sdfd " + elementiPare.length);

		int[][] array2D = { { 5, 4, 7, 15 }, { 5, 5, 852, 87, 541, 0, 7 } };
		System.out.println("Numri i rreshtave te matrices eshte " + array2D.length);
		System.out.println("Numri i kolonave per rreshtin e pare " + array2D[0].length);
		System.out.println("Numri i kolonave per rreshtin e dyte " + array2D[1].length);

		// iterimi i nje matrice
		for (int numerRreshtiIndex = 0; numerRreshtiIndex < array2D.length; numerRreshtiIndex++) {

			for (int numerKoloneIndex = 0; numerKoloneIndex < array2D[numerRreshtiIndex].length; numerKoloneIndex++) {
				System.out.println("Elementi i (rreshtit " + (numerRreshtiIndex + 1) + " dhe kolones "
						+ (numerKoloneIndex + 1) + ") matrices eshte " + array2D[numerRreshtiIndex][numerKoloneIndex]);
			}
		}
	}

}
