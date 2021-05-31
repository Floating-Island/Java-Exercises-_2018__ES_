package estructura;

import dominio.Caperucita;
import dominio.Abuela;
import dominio.Lobo;
import dominio.Lugar;

public class Main {

	public static void main(String[] args) {
		
		
		Caperucita sraRojas = new Caperucita(20000, 20);
		
		Abuela vieja = new Abuela(2);
		
		Lobo frodoBobo = new Lobo(100);
		
		Lugar bosque = new Lugar("bosque", 10);
		
		Lugar casaAbuela = new Lugar("casa de la vieja", 5);
		
		frodoBobo.irHacia(bosque);
		
		sraRojas.tirarManzana();
		
		frodoBobo.irHacia(casaAbuela);
		
		frodoBobo.comer(vieja);
		
		frodoBobo.comer(sraRojas);
		
		
		System.out.println("\nFrodo " + ((frodoBobo.estaSaludable())? "esta ":"no esta ") + "saludable.");
		
		System.out.println("\nFrodo " + ((frodoBobo.estaGordo())? "esta ":"no esta ") + "gordo.");
		
		

	}

}
