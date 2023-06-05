package seanca8;

import java.util.*;

public class Punonjes {

	static Scanner skano = new Scanner(System.in);
	private static String[] emriPunonjesit;

	public static void ruajPunonjes(int numri) {
		emriPunonjesit = new String[numri];
		System.out.println("Vendosni emrat e punonjesve\n");

		for (int i = 0; i < emriPunonjesit.length; i++) {
			System.out.println("Vendosni emrin e punonjesit: " + (i + 1));
			emriPunonjesit[i] = skano.next();
		}
	}

	public static void printoPunonjesit() {
		System.out.println("\nEmrat e punonjesve");

		for (int i = 0; i < emriPunonjesit.length; i++) {
			System.out.println("Emri i punonjesit " + (i + 1) + " eshte " + emriPunonjesit[i]);
		}

		// manualisht
		System.out.println("Emri i punonjesit eshte: " + emriPunonjesit[0]);
		System.out.println("Emri i punonjesit eshte: " + emriPunonjesit[1]);
	}

	public static void main(String[] args) {
		System.out.println("Vendosni numrin e punonjesve te kompanise: ");
		int numriPunonjesve = skano.nextInt();
		ruajPunonjes(numriPunonjesve);
		printoPunonjesit();
	}

	// TODO modifikoni ushtrimin e zhvilluar(metodat ndihmese) ne klase
	// duke eleminuar variablin e instances emriPunonjesit

}
