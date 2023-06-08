package seanca9;

import java.util.Scanner;

public class Punonjes {
	static Scanner skano = new Scanner(System.in);

	public static String[] ruajPunonjes(int numri) {

		String[] emriPunonjesit = new String[numri];
		System.out.println("Vendos emrat e punonjesve: ");

		for (int i = 0; i < emriPunonjesit.length; i++) {
			System.out.println("Vendosni emrin e punonjesit: " + (i + 1));
			emriPunonjesit[i] = skano.next();
		}
		printoPunonjesit(emriPunonjesit);
		return emriPunonjesit;
	}

	public static void printoPunonjesit(String[] emriPunonjesit) {
		for (int i = 0; i < emriPunonjesit.length; i++) {
			System.out.println("Emri i punonjesit " + (i + 1) + " eshte " + emriPunonjesit[i]);

		}

	}

	public static void modifikoArrayKaluarSiParameter(String[] punonjes) {
		System.out.println("HYRA ne metoden e modifikimit te elementeve");
		punonjes[0] = "test";
		System.out.println("elementi i pare " + punonjes[0]);
		System.out.println("DOLA nga metodes se modifikimit te elementeve");
	}

	public static int modifikoNumerTeKaluarSiParameter(int numerPunonjes) {
		System.out.println("HYRA ne metoden e modifikimit te numrit");
		numerPunonjes = 50;
		System.out.println("numri eshte " + numerPunonjes);
		System.out.println("DOLA nga metodes se modifikimit te numrit");
		return numerPunonjes;
	}

	public static void main(String[] args) {
		
		// System.out.println("Vendosni numrin e punonjesve: ");
		// int numriPunonjesve = skano.nextInt();
		// therritja e metodes qe ruan dhe printon listen e punonjesve
		// ruajPunonjes(numriPunonjesve);

		// therritja e metodes qe ben modifikimin e nje array te kaluar si parameter
		String[] punonjes = new String[] { "Andra", "Tes", "Lea" };
		System.out.println("Para modifikimit " + punonjes[0]);
		modifikoArrayKaluarSiParameter(punonjes);
		System.out.println("Pas modifikimit " + punonjes[0]);

		System.out.println("************************************************************");
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		
		
		// therritja e metodes qe ben modifikimin e nje numri te kaluar si parameter

		int numriPunonjes = 10;
		System.out.println("Para modifikimit " + numriPunonjes);
		numriPunonjes = modifikoNumerTeKaluarSiParameter(numriPunonjes);
		System.out.println("Pas modifikimit " + numriPunonjes);
	}

}
