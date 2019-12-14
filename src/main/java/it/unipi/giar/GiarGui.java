package it.unipi.giar;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GiarGui extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		 Parent root = FXMLLoader.load(getClass().getResource("/fxml/SignIn.fxml"));
	        
		 primaryStage.setTitle("GIAR");
		 primaryStage.setScene(new Scene(root));
		 primaryStage.show();
		 primaryStage.setResizable(false);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
