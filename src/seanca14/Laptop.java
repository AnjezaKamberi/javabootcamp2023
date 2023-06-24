package seanca14;

public class Laptop {

	private String modeli;
	private int vitProdhimi;
	private boolean aktivizuar;
	
	
	public String getModeli() {
		return modeli;
	}
	
	public void setModeli(String modeli) {
		this.modeli = modeli;
	}
	public int getVitProdhimi() {
		return vitProdhimi;
	}
	public void setVitProdhimi(int vitProdhimi) {
		this.vitProdhimi = vitProdhimi;
	}

	
	public boolean eshteAktivizuar() {
		return aktivizuar;
	}

	public void setAktivizuar(boolean aktivizuar) {
		this.aktivizuar = aktivizuar;
	}
	
	
}
