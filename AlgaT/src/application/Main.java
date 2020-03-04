package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	 public void start(Stage primaryStage) throws Exception { 
	        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
	        primaryStage.setTitle("AlgaT - Tabelle HASH");
	        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("Img\\Icon.png")));
	        primaryStage.setScene(new Scene(root, 1920, 1000));
	        primaryStage.show();
	 }	 
     
	public static void main(String[] args) {
		launch(args);
	}
}

