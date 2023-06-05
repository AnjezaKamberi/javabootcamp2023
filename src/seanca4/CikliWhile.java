package seanca4;
import java.util.Scanner;
public class CikliWhile {

	public static void main(String[] args) {

		// cikli while
		int numerStudentRregjistruar = 0;
		int numerStudentLimit = 5;
		Scanner input = new Scanner (System.in);
		
		while (numerStudentRregjistruar < numerStudentLimit) {
			
			System.out.println("Jep emrin e studentit");
			String emri = input.next();
			System.out.println("Emri eshte " + emri);
			
			if(emri.equalsIgnoreCase("Afrim")) {
				break;
			}
			numerStudentRregjistruar++; 
			
		}
		System.out.println("Studentet u rregjistruan ");

	}

}
