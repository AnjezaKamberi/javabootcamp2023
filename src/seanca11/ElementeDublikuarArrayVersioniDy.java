package seanca11;

import java.util.Scanner;

/* . Shkruaj një program që gjen elementet e dublikuara në një array 1D. */

public class ElementeDublikuarArrayVersioniDy {

	static Scanner scanner = new Scanner(System.in);

	public static int[] krijoVektor(int gjatesi) {
		System.out.println("Vendosni vlerat :  ");
		int[] v = new int[gjatesi];
		for (int i = 0; i < gjatesi; i++) {
			v[i] = scanner.nextInt();

		}
		renditVektor(v);
		lexoVektorTeThjeshtezuar(v);
		gjejNumrinEElementeve(v);
		// lexoVektor(v);
		return v;
	}

	public static void lexoVektor(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);

		}
	}

	public static void renditVektor(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[i] > v[j]) {
					int tmp = v[j];
					v[j] = v[i];
					v[i] = tmp;
				}
			}

		}
	}

	public static void lexoVektorTeThjeshtezuar(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] == v[i + 1]) {
				continue;
			}
			System.out.println(v[i]);

		}
		System.out.println(v[v.length - 1]);

	}

	public static void gjejNumrinEElementeve(int[] v) {
		int count = 1;
		int numri = 0;
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] == v[i + 1]) {
				count++;
			}

			else {
				System.out.println("Numri " + v[i] + " eshte perdorur '" + count + "' here");
				count = 1;
			}
			numri = v[i + 1];
		}
		System.out.println("Numri " + numri + " eshte perdorur '" + count + "' here ");
	}

	public static void main(String[] args) {
		krijoVektor(5);

	}

}
