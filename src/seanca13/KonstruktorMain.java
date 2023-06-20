package seanca13;

public class KonstruktorMain {

	public static void main(String[] args) {

		Person personObj = new Person();
		System.out.println("Emri i personit eshte " + personObj.emri);

		personObj.emri = "HR";
		personObj.mbiemri = "YYY";
		System.out.println("Emri pas ndyrshimit eshte " + personObj.emri);
		System.out.println("Mbiemri pas ndyrshimit eshte " + personObj.mbiemri);

		Person anjezaObj = new Person("Anjeza");
		System.out.println("Emri pas ndyrshimit eshte " + anjezaObj.emri);
		System.out.println("Mbiemri pas ndyrshimit eshte " + anjezaObj.mbiemri);
	}
}
