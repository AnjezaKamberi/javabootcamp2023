package seanca18.oop;

import java.util.List;

public class Shofer {

	private String emri;
	private String mbiemri;
	private List<Makina> makina;

	public Shofer(String emri, String mbiemri) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
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

	@Override
	public String toString() {
		return "Shofer [emri=" + emri + ", mbiemri=" + mbiemri + "]";
	}

}
