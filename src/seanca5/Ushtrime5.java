package seanca5;

import java.util.Scanner;

public class Ushtrime5 {
	public static Scanner lexuesi = new Scanner(System.in);

	public static void main(String[] args) {
		// kerko input 2 numra , me pas printo nese eshte e vertet
		// 1. nr1 eshte me i vogel se nr 2
		// nr1 = nr2
		// nr1 me i madhe se nr2
		// me 2 metoda njera lexon inputin tjetra ben veprimet

		// lexoInputet();

		// printoParameter("Pamela", 8, true);
		// printoParameter("Marvis", 7, false);
		// printoParameter("Mikela", 5, false);
		// printoParameter("true", 5, false);

		int numer1 = merrInput();
		int numer2 = merrInput();

		krahasoNumrat(numer1, numer2);
	}

	public static void printoParameter(String parametri1, int parametriNumer, boolean parametriBoolean) {
		System.out.println("Vlera qe me ka ardhur si input te paraemtri i pare eshte " + parametri1);
		System.out.println("TEST");
		System.out.println("X");

	}

	// Metoda e pare per leximin e inputit

	public static void lexoInputet() {

		Scanner lexuesi = new Scanner(System.in);
		System.out.println("Jep dy numra   ");
		System.out.println("nr1:   ");
		int nr1 = lexuesi.nextInt();

		System.out.println("nr2:   ");
		int nr2 = lexuesi.nextInt();

		System.out.printf("Numrat e dhene jane: %d, %d  ", nr1, nr2);
		System.out.println("Numrat e dhene jane: " + nr1 + " , " + nr2);

	}

	// metoda e dyte per leximin e inputit
	/**
	 * Metoda lexon nje vlere numerike nga perdoruesi
	 * 
	 * @return vlera e lexuar
	 */
	public static int merrInput() {
		System.out.println("Jep nje numer: ");
		int numri = lexuesi.nextInt();
		return numri;
	}

	// Metoda per krahsimet

	/**
	 * Metoda ben krahasimin mes dy numrave te dhene si input
	 * 
	 * @param numer1 - vlera e numrit te pare
	 * @param numer2 - vlera e numrit te dyte
	 */
	public static void krahasoNumrat(int numer1, int numer2) {

		if (numer1 < numer2) {
			System.out.println("Numri i pare " + numer1 + " eshte me i vogel se numri i dyte " + numer2);
		} else if (numer1 > numer2) {
			System.out.println("Numri i pare " + numer1 + " eshte me i madh se numri i dyte " + numer2);

		} else {
			System.out.println("Numri i pare " + numer1 + " eshte i barabarte me numrin e dyte " + numer2);

		}

	}
}
