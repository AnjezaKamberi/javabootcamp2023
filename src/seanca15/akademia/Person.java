package seanca15.akademia;

public class Person {

	private String nid;
	private String emri;
	private String mbiemri;

	public Person() {
		this.nid = "TEST";
		this.emri = "Pamela";
		this.mbiemri = "TEST";
	}

	public Person(String nid, String emri, String mbiemri) {
		super();
		this.nid = nid;
		this.emri = emri;
		this.mbiemri = mbiemri;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

	// METODA OVERLOAD

	public void lexo() {
		System.out.println("PERSONI LEXON TEKST");
	}

	public void lexo(String emerLibri) {
		System.out.println("Po lexoj librin " + emerLibri);
	}

	public void lexo(int nrReviste) {
		System.out.println("Numer reviste klasa person " + nrReviste);
	}

	public void lexo(String texti, int rreshti) {

	}

}
