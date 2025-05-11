package aufgabe_0_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Patient {

	private String vorname;
	private String nachname;
	private List<Medikament> medikamentenListe;

	public Patient(String vorname, String nachname, Medikament... medikamente) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.medikamentenListe = new ArrayList<>(Arrays.asList(medikamente));
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public List<Medikament> getMedikamente() {
		return medikamentenListe;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(vorname + " " + nachname + "\n");
		for (Medikament med : medikamentenListe) {
			builder.append(med.toString()).append(" (").append(med.getSymptom()).append(")\n");
		}
		return builder.toString();
	}

}


