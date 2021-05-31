package estructura;

import dominio.Persona;
import dominio.Lobo;

public class Main {

	public static void main(String[] args) {
		
		
		Persona srRojas = new Persona(20000);
		
		Lobo frodoBobo = new Lobo(100);
		
		System.out.println("\nFrodo " + ((frodoBobo.estaGordo())? "esta ":"no esta ") + "gordo.");
		
		frodoBobo.comer(srRojas);
		
		System.out.println("\nFrodo " + ((frodoBobo.estaGordo())? "esta ":"no esta ") + "gordo.");
		
		

	}

}
