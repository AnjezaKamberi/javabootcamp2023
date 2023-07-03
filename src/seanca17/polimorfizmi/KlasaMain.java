package seanca17.polimorfizmi;

public class KlasaMain {

	public static void main(String[] args) {

		KlasaBaze klaseChildObj = new KlasaChild();
		klaseChildObj = new KlasaChild2();
		
		// therritja e metodes override
		klaseChildObj.metoda();

		// metodat overload
		
		klaseChildObj.metodaOverload();
		klaseChildObj.metodaOverload("parametri");
		klaseChildObj.metodaOverload("", 0);
	}

}
