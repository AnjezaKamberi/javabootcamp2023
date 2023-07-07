package seanca18;

import java.util.Objects;

public class Person {

	String emri;
	String mbiemri;
	String nid;

	public Person() {
		this("Marvis", "Fufi");
	}

	public Person(String emri, String mbiemri) {
		this.emri = emri;
		this.mbiemri = mbiemri;
	}

	public Person(String emri, String mbiemri, String nid) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.nid = nid;
	}

	public String getEmri() {

		return "Kristi";
	}

	@Override
	public String toString() {
		return "Emri : " + this.emri + " Mbiemri: " + this.mbiemri;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emri, mbiemri, nid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;}
		if (obj == null) {
			return false;}
		if (getClass() != obj.getClass()) {
			return false;}
		
		if (this.nid == ((Person)obj).nid) {
			return true;
		}
		return false;
	}
	
	// dy persona jane te njejte nese kane NID-in e barabarte
	

}
