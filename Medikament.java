package aufgabe_0_17;

public enum Medikament {
	BRONCHIKUM("Husten"), NASIC("Schnupfen"), THOMAPYRIN("Kopfschmerzen"), DOBENDAN("Halsschmerzen"),
	NEUREXAN("Schlafstörungen"), ANTACLIN("Kobritis");

	private final String symptom;

	Medikament(String symptom) {
		this.symptom = symptom;
	}

	public String getSymptom() {
		return symptom;
	}

	@Override
	public String toString() {
		String lower = name().toLowerCase();
		return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
	}

}


