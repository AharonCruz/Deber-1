package aspectos;

import ventanas.VentanaPrincipal;

public aspect AspectColor {
	
	pointcut cambioEstado(VentanaPrincipal vp, String nombre):
		target(vp) && call(void cambiarColor(.., *)) && args(.., nombre);
	
	after(VentanaPrincipal vp, String nombre): cambioEstado(vp, nombre){
		vp.getObserver().update(vp, nombre);
	}
}
