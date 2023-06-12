package seanca11;

import java.util.Scanner;

public class ElementeDublikuarArrayVersioniNje {
	static Scanner skanim = new Scanner(System.in);

	public static int[] krijoArray1D() {

		System.out.println("Vendos madhesine e arrayt: ");
		int madhesia = skanim.nextInt();

		int[] njeArrayMeInpute = new int[madhesia];

		for (int i = 0; i < njeArrayMeInpute.length; i++) {

			System.out.println("Elementi " + (i + 1) + ": ");

			njeArrayMeInpute[i] = skanim.nextInt();

		}
		return njeArrayMeInpute;
	}

	public static int[] gjejFrekuencat(int[] array) {
		int[] frekuencat = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					frekuencat[j] = -1;
				}
			}
			if (frekuencat[i] != -1) {
				frekuencat[i] = count;
			}
		}
		return frekuencat;
	}

	public static void main(String[] args) {

		int[] array = krijoArray1D();
		int[] frekuenca = gjejFrekuencat(array);

		for (int i = 0; i < array.length; i++) {
			if (frekuenca[i] != -1) {
				System.out.println(array[i] + " ");
			}
		}
	}
}