package ventanas;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.paint.*;
import javafx.scene.layout.VBox;

public class VentanaPrincipal {
	private VBox root;
	private Button btAzul;
	private Button btVerde;
	private Button btRojo;
	
	public VentanaPrincipal(){
		crearVentana();
	}
	
	public void crearVentana() {
		root = new VBox();
		btAzul = new Button("  Azul  ");
		btVerde = new Button("  Rojo  ");
		btRojo = new Button(" Verde ");
		
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		root.getChildren().addAll(btAzul, btVerde, btRojo);
		
		btRojo.setOnAction((event)->cambiarColor(Color.RED,"ROJO"));
		btAzul.setOnAction((event)->cambiarColor(Color.BLUE, "AZUL"));
		btVerde.setOnAction((event)->cambiarColor(Color.GREEN,"VERDE"));
		
	}
	
	public void cambiarColor(Color color, String nombre) {
		String codigoColor = color.toString().substring(2);
		root.setStyle("-fx-background-color: #" + codigoColor + ";");
	}
	
	public VBox getRoot() {
		return root;
	}
}
