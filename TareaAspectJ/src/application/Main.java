package application;

import javafx.application.Application;
import javafx.stage.Stage;
import observers.Observador;
import ventanas.VentanaPrincipal;

import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Observador obs = new Observador();
		
		VentanaPrincipal vp = new VentanaPrincipal(obs);
		
		Scene scene = new Scene(vp.getRoot(),250,250);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
