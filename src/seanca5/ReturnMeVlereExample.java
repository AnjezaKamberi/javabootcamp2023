package seanca5;

public class ReturnMeVlereExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int merrNumrinMeTeMadh() {
		
		int numer1 = 1;
		int numer2 = 5;
		
		if(numer1 < numer2) {
			return numer2;
		} else if(numer1 > numer2){
			return numer1;
		}
		
		System.out.println("Perfundova kontrollet");
		
		return numer1;
	}
}
