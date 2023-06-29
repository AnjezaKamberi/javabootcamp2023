package seanca16.komunikim;

public class Samsung extends Telefon {

	short volumi;

	@Override
	void ngrejVolumin() {
		volumi++;
		System.out.println("VOLUMI SAMSUNG " + volumi);

	}

}
