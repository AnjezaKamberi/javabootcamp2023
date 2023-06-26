package seanca15.akademia;

public class Main {

	public static void main(String[] args) {

		// krijo nje objekt person konstruktor pa parameter
		Person objAvdi = new Person();

		System.out.println("Emri eshte :" + objAvdi.getEmri());
		String nid = "kot";
		String emri = "kot2";
		String mbiemri = "sdbja";

		// krijo nje objekt kontruktor me parameter
		Person objektMarvis = new Person(nid, emri, mbiemri);
		System.out.println("Emri eshte :" + objektMarvis.getEmri());
		System.out.println("PERSON");
		System.out.println("METODA OVERLOAD");
		objektMarvis.lexo("PERRALLA");
		System.out.println("METODA OVERRIDE");
		objektMarvis.lexo();
		System.out.println("*******************************************");
		// krijo nje objekt te klases child

		Punonjes punonjesObj = new Punonjes();
		System.out.println("Emri eshte " + punonjesObj.getEmri());

		// objekt klasa child me konsturktor me parameter

		Punonjes punonjesSara = new Punonjes(2018, "Sara", "Deraj", "NID111");
		System.out.println("PUNONJES");
		System.out.println("Emri eshte " + punonjesSara.getEmri());
		System.out.println("METODA OVERLOAD");
		punonjesSara.lexo("PERRALLA");
		System.out.println("METODA OVERRIDE");
		punonjesSara.lexo();

		// therritja e metodes qe eshte bere override te klasa child
		//objektMarvis.lexo(2);
		punonjesSara.lexo(8);
	}

}
