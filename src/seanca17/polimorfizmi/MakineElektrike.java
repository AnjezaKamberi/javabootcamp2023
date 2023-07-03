package seanca17.polimorfizmi;

public class MakineElektrike extends Makine {

	@Override
	public void leviz() {
		System.out.println("leviz makine elektrike");

	}
	
	public void furnizoMakineElektrike() {
		System.out.println("furnizo makine elektrike");
	}
	
	@Override
	public String getLlojMotori() {
		return "motor elektrik";
	}
	
	public void metodePlusMakineElektrike() {
		
	}
}
