package seanca17.polimorfizmi;

public class Motorr implements MjetTransporti {

	@Override
	public void start() {
		System.out.println("start motorr");

	}

	@Override
	public void leviz() {
		System.out.println("leviz motorr");
	}

	@Override
	public void stop() {
		System.out.println("stop motorr");
	}

	@Override
	public int getNrRrota() {
		return 2;
	}

}
