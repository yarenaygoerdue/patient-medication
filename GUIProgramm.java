package aufgabe_0_17;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIProgramm extends Application {

	private Patient[] patientenListe;

	public static void main(String[] args) {
		System.setProperty("prism.lcdtext", "false"); // für Linux-Schriftglättung
		launch(args); // funktioniert nur bei Application-Klasse
	}

	@Override
	public void init() {
		patientenListe = new Patient[] { new Patient("Maria", "Krachhuber", Medikament.BRONCHIKUM, Medikament.NASIC),
				new Patient("Paul", "Schüsselbier", Medikament.ANTACLIN, Medikament.DOBENDAN, Medikament.NEUREXAN),
				new Patient("Gesun", "d'Heit"), new Patient("Axeline", "Brahlmeier", Medikament.THOMAPYRIN),
				new Patient("Richard", "Mangold", Medikament.NASIC, Medikament.NEUREXAN) };
	}

	@Override
	public void start(Stage stage) {
		GridPane grid = buildGrid();
		Scene scene = new Scene(grid);
		stage.setTitle("Patientenübersicht");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane buildGrid() {
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(6);
		grid.setPadding(new Insets(15));

		int zeile = 0;
		for (Patient patient : patientenListe) {
			Label name = new Label(patient.getVorname() + " " + patient.getNachname());
			name.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
			grid.add(name, 0, zeile++);

			for (Medikament m : patient.getMedikamente()) {
				Label medikamentLabel = new Label(m.toString());
				Label symptomLabel = new Label(m.getSymptom());
				medikamentLabel.setStyle("-fx-font-size: 14px;");
				symptomLabel.setStyle("-fx-font-size: 14px;");
				grid.add(medikamentLabel, 1, zeile);
				grid.add(symptomLabel, 2, zeile++);
			}

			grid.add(new Label(""), 0, zeile++); // Leerzeile zwischen Patienten
		}

		return grid;
	}

}



