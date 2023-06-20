package seanca13;

public class Person {

	String emri;
	String mbiemri;
	int mosha;

	public Person() {
		// mbiemri = "XXX";
		this("Anjeza", "Kamberi");
		System.out.println("Jam brenda konstruktorit");
	}

	public Person(String emri) {
		this();
		System.out.println("Parametri i ardhur " + emri);
		System.out.println("Variabli i instances " + this.emri);
	}

	public Person(String emri, String mbiemriPerson) {
		this.emri = emri;
		this.mbiemri = mbiemriPerson;
	}

	public Person(int mosha) {
		this.mosha = mosha;
	}

	
	void metoda1() {
		metoda2();
	}
	
	void metoda2() {
		metoda1();
	}
}
