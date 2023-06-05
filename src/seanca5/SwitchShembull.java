package seanca5;

public class SwitchShembull {

	public static void main(String[] args) {

		int numriDites = 6;
		
		String emriDites;

		// IF ELSE IF
		/*
		 * if (numriDites == 1) { emriDites = "E HENE"; } else if (numriDites == 2) {
		 * emriDites = "E MARTE"; } else { emriDites = "NUK E DI"; }
		 * 
		 * System.out.println("Emri i dites eshte " + emriDites);
		 */

		// SWITCH
		switch (numriDites) {

		case 1:
			emriDites = "E HENE";
			break;

		case 2:
			emriDites = "E MARTE";

		case 3:
			emriDites = "E MERKURE";

		case 4:
			emriDites = "E ENJTE";
		case 5:
			emriDites = "E PREMTE";

		case 6:
		case 7:
			emriDites = "FUNDJAVE";
			break;
		default:
			emriDites = "NUK E DI";

		}

		System.out.println("Emri i dites eshte " + emriDites);

	}

}
