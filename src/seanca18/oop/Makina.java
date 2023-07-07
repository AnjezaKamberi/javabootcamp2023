package seanca18.oop;

public class Makina {

	private String targa;
	private String tipi;
	private Shofer shoferi;

	public Makina(String targa, String tipi) {
		super();
		this.targa = targa;
		this.tipi = tipi;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}

	@Override
	public String toString() {
		return "Makina [targa=" + targa + ", tipi=" + tipi + "]";
	}

}
