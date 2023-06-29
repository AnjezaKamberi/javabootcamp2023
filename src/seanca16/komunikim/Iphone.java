package seanca16.komunikim;

public class Iphone extends Telefon {

	int volumi;

	@Override
	void ngrejVolumin() {
		volumi++;
		System.out.println("VOLUMI IPHONE " + volumi);

	}
	

}
