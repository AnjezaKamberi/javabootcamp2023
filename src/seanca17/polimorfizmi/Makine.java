package seanca17.polimorfizmi;

public class Makine implements MjetTransporti {

	@Override
	public void start() {
		System.out.println("start makine");
	}

	@Override
	public void leviz() {
		System.out.println("leviz makine");

	}

	@Override
	public void stop() {
		System.out.println("stop makine");

	}

	@Override
	public int getNrRrota() {
		return 4;
	}

	public String getLlojMotori() {
		return "Nafte";
	}

	public void printoDetajeQarkullimi() {
		leviz();
		System.out.println("Motor: " + getLlojMotori());
	}

}
