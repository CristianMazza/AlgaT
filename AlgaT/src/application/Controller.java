package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.control.ToggleButton;

import java.io.IOException;

public class Controller {
	public ToggleButton bintro= new ToggleButton();
	public ToggleButton bfunzioni = new ToggleButton();
	public ToggleButton bcrediti = new ToggleButton();

	public void intro() throws IOException {
		Stage primaryStage = (Stage) bintro.getScene().getWindow();
		Parent newRoot = FXMLLoader.load(getClass().getResource("Introduzione01.fxml"));
		primaryStage.getScene().setRoot(newRoot);
	}

	public void funzioni() throws IOException {
		Stage primaryStage = (Stage) bfunzioni.getScene().getWindow();
		Parent newRoot = FXMLLoader.load(getClass().getResource("Funzioni01.fxml"));
		primaryStage.getScene().setRoot(newRoot);
}
	
	public void crediti() throws IOException {
		Stage primaryStage = (Stage) bcrediti.getScene().getWindow();
		Parent newRoot = FXMLLoader.load(getClass().getResource("Crediti01.fxml"));
		primaryStage.getScene().setRoot(newRoot);
	}
}

