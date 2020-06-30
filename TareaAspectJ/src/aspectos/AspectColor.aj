package aspectos;


public aspect AspectColor {
	
	pointcut changedColor(String nombre):
		call(void cambiarColor(..,String)) && args(..,nombre);
	
	after(String nombre): 
		changedColor(nombre){
			System.out.println("Fondo cambio a color: " + nombre);
	}

}
