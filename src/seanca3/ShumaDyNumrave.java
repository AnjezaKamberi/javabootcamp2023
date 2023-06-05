package seanca3;

import java.util.Scanner;
public class ShumaDyNumrave {

	public static void main(String[] args) {
		Scanner skanimNumra = new Scanner(System.in);
		
		System.out.println("Vendosni numrin e pare:");
		int numriPare = skanimNumra.nextInt();
		
		System.out.println("Vendosni numrin e dyte:");
		int numriDyte = skanimNumra.nextInt();
		
		System.out.println("Numri i pare eshte me i vogel se numri i dyte: " 
		+ (numriPare<numriDyte));
	}

}
