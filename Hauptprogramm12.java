package aufgabe_0_17;

public class Hauptprogramm12 {
	public static void main(String[] args) {
		Patient[] patienten = new Patient[] {
				new Patient("Maria", "Krachhuber", Medikament.BRONCHIKUM, Medikament.NASIC),
				new Patient("Paul", "Schüsselbier", Medikament.ANTACLIN, Medikament.DOBENDAN, Medikament.NEUREXAN),
				new Patient("Gesun", "d'Heit"), new Patient("Axeline", "Brahlmeier", Medikament.THOMAPYRIN),
				new Patient("Richard", "Mangold", Medikament.NASIC, Medikament.NEUREXAN) };

		for (Patient p : patienten) {
			System.out.println(p);
		}
	}

}



