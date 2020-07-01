package aspectos;

public aspect AspectColor {
	
	pointcut cambioEstado(String nombre):
		call(void cambiarColor(.., *)) && args(.., nombre);
	
	after(String nombre): cambioEstado(nombre){
		System.out.println("Fondo cambio a color: " + nombre);
	}
}
