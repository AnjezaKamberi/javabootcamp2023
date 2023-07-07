package seanca18;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 * List<Person> persona = new ArrayList<>(); //persona.add(new Person());
		 * persona.add(new Student()); persona.add(new Pedagog());
		 * 
		 * List<String> emra = List.of("Klevis", "Kristi");
		 * 
		 * System.out.println(emra.get(0)); System.out.println(emra.get(1)); String
		 * emriPare = emra.get(0); for (int i = 0; i < persona.size(); i++) {
		 * 
		 * Person person = persona.get(i); if (person instanceof Student) { Student s
		 * =(Student)person;
		 * 
		 * s.printoLendaEPreferuar(); } else if( person instanceof Pedagog) { Pedagog p
		 * = (Pedagog)person; p.printoOrar(); } else {
		 * System.out.println(person.getEmri()); }
		 * 
		 * }
		 * 
		 * System.out.println("Numri i elemnteve: " + persona.size()); }
		 */

		String s = "testste";
		System.out.println(s);

		Integer i = 55;
		System.out.println(i);

		Person objMarvis = new Person("Kevi", "Java","12345");
		System.out.println(objMarvis.toString());

		Person objMarvis2 = new Person("Kevi", "Java", "12345");
		System.out.println("Jane objektet e barabarta: " + (objMarvis == objMarvis2));

		Person objMarvis3 = objMarvis;
		System.out.println("Jane objektet e barabarta: " + (objMarvis == objMarvis3));

		System.out.println("Jane objektet e barabarta: " + objMarvis.equals(objMarvis3));
		System.out.println("Jane objektet e barabarta: " + objMarvis.equals(objMarvis2));

		
	}
}
