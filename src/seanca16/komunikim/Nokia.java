package seanca16.komunikim;

public class Nokia extends Telefon {

	long volumi;

	@Override
	void ngrejVolumin() {
		volumi++;
		System.out.println("VOLUMI NOKIA " + volumi);

	}
}
