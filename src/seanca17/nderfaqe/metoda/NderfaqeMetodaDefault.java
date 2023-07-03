package seanca17.nderfaqe.metoda;

public interface NderfaqeMetodaDefault {

	void metodaAbstrakte();	
	
	default void emriMetodes() {

		System.out.println("SJELLJE DEFAULT");
	}

}
