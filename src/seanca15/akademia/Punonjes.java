package seanca15.akademia;

public class Punonjes extends Person {

	private int vitPunesimi;
	// ZGJIDHJA NJE: deklaro konsturktor pa parameter te klasa parent
	/*
	 * public Punonjes() { super(); }
	 */

	// ZGJIDHJA DY: therrit konstruktorin me parameter te klases parent
	public Punonjes() {
		super("NID xxx", "Emri xxxx", "Mbiemri xxxx");
		this.vitPunesimi = 2015;

	}

	public Punonjes(int vitPunesimi, String emri, String mbiemri, String nid) {
		super(nid, emri, mbiemri);
		this.vitPunesimi = vitPunesimi;
	}

	public int getVitPunesimi() {
		return vitPunesimi;
	}

	public void setVitPunesimi(int vitPunesimi) {
		this.vitPunesimi = vitPunesimi;
	}

	// override - mbivendosja e nje sjellje te klases parent
	@Override
	public void lexo() {
		System.out.println("PUNONJES LEXON TEKST");
	}

	// override - shtimi i elementeve per nje sjellje te klases parent

	public void lexo(int nrReviste) {
		super.lexo(nrReviste);
		nrReviste = nrReviste + 1;
		System.out.println("Numer reviste te klasa punonjes eshte " + nrReviste);
	}

}
