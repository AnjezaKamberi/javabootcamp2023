package seanca8;

public class Numra {

	private static void kalimParametriArray1D(String[] emriArrayt) {

		// punoj me arrayn

	}

	public static void main(String[] args) {
		
		// therritja e nje metode qe ka si parameter nje array
		kalimParametriArray1D(new String[] {"shembull"});
		kalimParametriArray1D(new String[50]);
		
		
		int[] numra = new int[10];

		numra[1] = 5;
		numra[3] = 5;
		numra[5] = 5;
		numra[7] = 5;
		numra[9] = 5;

		// manualisht
		/*
		 * System.out.println(numra[0]); System.out.println(numra[1]);
		 * System.out.println(numra[2]); // .. // .. System.out.println(numra[9]);
		 */

		// cikel
		for (int indexElementi = 0; indexElementi < numra.length; indexElementi++) {
			System.out.println("Elementi " + (++indexElementi) + " eshte " + numra[indexElementi]);
		}

	}
}
