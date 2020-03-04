package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Crediti {
public Button menu=new Button();

public void menureturn() throws IOException {
	Stage primaryStage = (Stage) menu.getScene().getWindow();
	Parent newRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
	primaryStage.getScene().setRoot(newRoot);
}
}
