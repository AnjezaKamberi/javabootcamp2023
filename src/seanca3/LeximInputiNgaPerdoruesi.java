package seanca3;

// Veprimi i pare : importi
import java.util.Scanner;

public class LeximInputiNgaPerdoruesi {

	public static void main(String[] args) {

		// Veprimi i dyte : krijimi i objektit

		Scanner objektiScanner = new Scanner(System.in);

		// Veprimet pasardhese jane funksionalitete te klases Scanner

		String tipMakine;
		System.out.println("Te lutem me jep tipin e makines qe perdor:");
		// lexoj inputin nga perdoruesi
		tipMakine = objektiScanner.next();
		System.out.println("Tipi i makines eshte " + tipMakine);
	}

}
