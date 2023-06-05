package seanca3;

public class Operatoret {

	public static void main(String[] args) {

		// operatori NOT

		boolean isMonday = false;
		boolean isTuesday = !isMonday;

		System.out.println("Sot eshte dite e hene " + isMonday);
		System.out.println("Sot eshte dite e marte " + isTuesday);

		int numer = 10;
		System.out.println("vlera e variablit numer eshte " + numer);
		// operatori PRE-inkrementim
		int rezultatPreInkrement = ++numer;
		System.out.println("vlera e variablit numer eshte " + numer);
		System.out.println("vlera e variablit rezultatPreInkrement eshte " + rezultatPreInkrement);
		// operatori POST-inkrementim
		int rezultatPostInkrement = numer++;
		System.out.println("vlera e variablit numer eshte " + numer);
		System.out.println("vlera e variablit rezultatPostInkrement eshte " + rezultatPostInkrement);
		// operatori PRE-dekrementim
		// numer = 12
		int rezultatPreDekrement = --numer;
		System.out.println("vlera e variablit numer eshte " + numer);
		System.out.println("vlera e variablit rezultatPreDekrement eshte " + rezultatPreDekrement);
		// operatori POST-dekrementim
		int rezultatPostDekrement = numer - 1;
		System.out.println("vlera e variablit numer eshte " + numer);
		System.out.println("vlera e variablit rezultatPostDekrement eshte " + rezultatPostDekrement);

		int mosha = 5;
		mosha = 10;
		System.out.println("Vlera e variablit mosha eshte " + mosha);

		// operatori (BARAZIE) KRAHASIM
		boolean moshaPerson10 = (mosha == 10);
		System.out.println("****************************************************************");
		// OPERATORI AND

		boolean isRaining = true;
		boolean isSchoolDay = true;

		System.out.println("Operatori AND " + (isRaining && isSchoolDay)); // TRUE
		System.out.println("Nuk bie shi DHE eshte dite shkolle " + (!isRaining && isSchoolDay)); // FALSE
		System.out.println("Bie shi DHE nuk eshte dite shkolle " + (isRaining && !isSchoolDay)); // FALSE
		System.out.println("Nuk bie shi DHE nuk eshte dite shkolle " + !(isRaining && isSchoolDay)); // FALSE
		// OPERATORI OR
		System.out.println("****************************************************************");
		System.out.println("Bie shi OSE eshte dite shkolle " + (isRaining || isSchoolDay)); // TRUE
		System.out.println("Nuk bie shi OSE nuk eshte dite shkolle " + !(isRaining || isSchoolDay)); // FALSE
		System.out.println("Bie shi OSE nuk eshte dite shkolle " + (isRaining || !isSchoolDay)); // TRUE
		System.out.println("Nuk bie shi OSE eshte dite shkolle " + (!isRaining || isSchoolDay)); // TRUE
	}

}
