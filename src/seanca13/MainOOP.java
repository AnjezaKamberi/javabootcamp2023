package seanca13;

public class MainOOP {
	static Liber javaObj;

	public static void main(String[] args) {
		// deklarimi i nje objekti

		System.out.println("Libri eshte " + javaObj);

		// inicializimi i nje objekti

		Liber databazeObj = new Liber();

		System.out.println("Libri eshte " + databazeObj);

		// merr titullin e librit
		System.out.println("Titulli i librit eshte " + databazeObj.titulli);

		// merr shtepia botuese e librit
		System.out.println("Shtepia botuese e librit eshte " + databazeObj.shtepiaBotuese);

		// ndrysho titullin e librit
		databazeObj.titulli = "DATABAZE";

		System.out.println("Titulli i librit pas ndryshimit eshte " + databazeObj.titulli);

		javaObj = new Liber();

		System.out.println("Titulli i librit per objektin 'javaObj' eshte " + javaObj.titulli);

		// variablat statik
		System.out.println("PARA NDRYSHIMIT");
		System.out.println("Zhaneri i librit objekti 'javaObj' eshte  " + javaObj.zhaner);
		System.out.println("Zhaneri i librit objekti 'databazeObj' eshte  " + databazeObj.zhaner);
		System.out.println("Cmimi i librit objekti 'javaObj' eshte  " + javaObj.cmimi);
		System.out.println("Cmimi i librit objekti 'databazeObj' eshte  " + databazeObj.cmimi);
		javaObj.zhaner = "TEKNOLOGJI";
		javaObj.cmimi = 1000;
		System.out.println("PAS NDRYSHIMIT");
		System.out.println("Zhaneri i librit objekti 'javaObj' eshte  " + javaObj.zhaner);
		System.out.println("Zhaneri i librit objekti 'databazeObj' eshte  " + databazeObj.zhaner);
		System.out.println("Cmimi i librit objekti 'javaObj' eshte  " + javaObj.cmimi);
		System.out.println("Cmimi i librit objekti 'databazeObj' eshte  " + databazeObj.cmimi);

		// referenca e njejte nga objekte te ndryshme
		
		Liber databazeObjKopjaDyte = new Liber();
		
	}
}
