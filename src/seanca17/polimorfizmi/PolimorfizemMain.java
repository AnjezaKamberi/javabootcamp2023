package seanca17.polimorfizmi;

public class PolimorfizemMain {

	public static void main(String[] args) {

		Makine makine = new Makine();
		makine.leviz();
		MakineElektrike makineElektrike = new MakineElektrike();
		makineElektrike.leviz();
		Motorr motorr = new Motorr();
		motorr.leviz();
		Biciklete biciklete = new Biciklete();
		biciklete.leviz();

		// polimorfizmi
		MakineElektrike makineElektrike2 = new MakineElektrike();
		makineElektrike2.leviz();
		makineElektrike2.furnizoMakineElektrike();

		Makine makine2 = makineElektrike2;
		makine2.leviz();
		// ne superklase therriten metodat qe jane bere override
		makine2.printoDetajeQarkullimi();
		// problem kompilimi sepse metoda e meposhtme i perket subklases dhe jo
		// superklases
		// makine2.furnizoMakineElektrike();
		MjetTransporti mjetTransporti = makineElektrike2;
		mjetTransporti.leviz();

		// konvertimi i objekteve

		// konvertimi nga subklase ne superklase nuk kerkon cast
		MakineElektrike makineElektrike3 = new MakineElektrike();
		Makine makine3 = makineElektrike3;
		// konvertimi nga superklase ne subklase kerkon cast
		makineElektrike3 = (MakineElektrike) makine3;

		// ! cast-i i tipeve nuk funksionon nese kemi instanca te superklases
		Makine makine4 = new Makine();
		MakineElektrike makineElektrike4 = (MakineElektrike) makine4;
		makineElektrike4.furnizoMakineElektrike();

		Makine mjetTransportiObj = new MakineElektrike();
		mjetTransportiObj.leviz();
	}

	private static void printoMjetTransportiNrRrota(MjetTransporti mjetTransporti) {
		System.out.println("Numri i rrotave eshte " + mjetTransporti.getNrRrota());
	}

	// mund te kemi metoden e mesiperme 'printoMjetTransportiNrRrota' ne vend te
	// metodave te meposhtme

	private static void printoMjetTransportiNrRrota(Makine makine) {
		System.out.println("Numri i rrotave eshte " + makine.getNrRrota());
	}

	private static void printoMjetTransportiNrRrota(Biciklete biciklete) {
		System.out.println("Numri i rrotave eshte " + biciklete.getNrRrota());
	}

	private static void printoMjetTransportiNrRrota(MakineElektrike makineElektrike) {
		System.out.println("Numri i rrotave eshte " + makineElektrike.getNrRrota());
	}

	private static void printoMjetTransportiNrRrota(Motorr motorr) {
		System.out.println("Numri i rrotave eshte " + motorr.getNrRrota());
	}
}
