package seanca4;

import java.util.Scanner;

public class StudentiMosha {

	// therritja e metodave brenda njera tjetres CIKEL I PAFUNDEM
	static void metodaA(String param1, int param2) {
		System.out.println("metoda A para");
		metodaB();
		System.out.println("metoda A pas");
	}

	static void metodaB() {
		System.out.println("metoda B para");
		metodaA("vlera e parametrit", 78);
		System.out.println("metoda B pas");
	}

	public static void main(String[] args) {
		Scanner objektiScanner = new Scanner(System.in);

		System.out.println("Te lutem Student vendos emrin tuaj");
		String emri = objektiScanner.next();

		System.out.println("Te lutem Student vendos gjinine tuaj");
		String gjinia = objektiScanner.next();

		System.out.println("Te lutem Student vendos moshen tuaj");

		int mosha = objektiScanner.nextInt();

		if (mosha < 18) {
			System.out.println("Ju nuk keni arritur moshen per te ndjekur kursin X!");
		}

		System.out.println("**************************************************************");
		boolean isMonday = false;
		if (!isMonday) {
			System.out.println("Nuk eshte dite e hene");
		}

		if (isMonday == false) {
			System.out.println("Nuk eshte dite e hene");
		}

		System.out.println("**************************************************************");

		System.out.println("Emri eshte: " + emri + " Gjinia eshte: " + gjinia);
		System.out.println("Studioj rastet e tjera");
		/*
		 * nese gjinia e studentit eshte FEMER/F emri i studentit te shoqerohet me
		 * prefix-in 'Studentja' nese gjinia e studentit eshte MASHKULL/M emri i
		 * studentit te shoqerohet me prefix-in 'Studenti'
		 * 
		 */

		System.out.println("*************************** IF ELSE ***********************************");
		boolean eshteFemer = gjinia.equalsIgnoreCase("FEMER") || gjinia.equalsIgnoreCase("F");

		boolean eshteMashkull = !eshteFemer;

		String emriKursit = "Java";
		String vitiKursit = "2023";

		// konkatenimi mes dy stringjeve OSE bashkimi i dy teksteve
		String kursiStudent = emriKursit + emri;

		if (eshteFemer) {
			emri = "Studentja " + emri;
		} else {
			emri = "Studenti " + emri;
		}

		System.out.println("Rezultati : " + emri);

		System.out.println("*************************** IF ELSE IF ***********************************");

		String status = "STUDENT"; // i papune // i punesuar
		int zbritje = 0;

		if (status.equalsIgnoreCase("STUDENT")) {
			String qyteti = "DR";
			System.out.println("********************NESTED IF***************");
			if (qyteti.equalsIgnoreCase("DR")) {
				System.out.println("Nuk e ndjek dot kursin");
			}
			zbritje = 50;
		} else if (status.equalsIgnoreCase("PAPUNE")) {
			zbritje = 100;
		} else {
			zbritje = 0;
		}

		System.out.println("Zbritja e aplikuar eshte : " + zbritje + "%");

	}

}
