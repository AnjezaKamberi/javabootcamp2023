package seanca14;

public class MainLaptop {

	public static void main(String[] args) {

		// deklarimi i nje objekti

		Laptop laptop;

		// inicializimi i objektit te krijuar

		laptop = new Laptop();

		// inicializimi i nje objekti

		Laptop laptopAvdi = new Laptop();
		laptopAvdi.vitProdhimi = -8000;
		System.out.println("Vit prodhimi: " + laptopAvdi.vitProdhimi);

	}

}
