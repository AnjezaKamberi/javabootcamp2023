package seanca17;

public class KlaseImplShumeNderfaqe implements NderfaqeA, NderfaqeB {

	@Override
	public void metodaPareNderfaqeB() {
		System.out.println("Implementim i metodes se definuar te nderfaqe B");

	}

	@Override
	public void metodaPare() {
		System.out.println("Implementim i metodes se definuar te nderfaqe A");

	}

	@Override
	public String metodaDyte(String emerParametri) {
		System.out.println("Implementim i metodes 2 se definuar te nderfaqe A");
		return emerParametri;
	}

}
