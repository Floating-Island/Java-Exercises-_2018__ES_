package estructura;

import dominio.Paja;
import dominio.Madera;
import dominio.Ladrillo;
import dominio.Lobo;
import dominio.Chanchito;

public class Main {

	public static void main(String[] args) {
		
		
		Lobo frodoBobo = new Lobo(10000);
		
		
		Paja casaPaja = new Paja("la casa de paja", 10);
		
		Madera casaMadera = new Madera("la casa de madera", 10);
		
		Ladrillo casaLadrillos = new Ladrillo("la casa de ladrillos", 10, 5);
		
		
		Chanchito porky = new Chanchito(500);
		
		Chanchito cerdi = new Chanchito(600);
		
		Chanchito mortadela = new Chanchito(900);
		
		
		casaPaja.agregarOcupante(porky);
		
		casaMadera.agregarOcupante(cerdi);
		
		casaLadrillos.agregarOcupante(mortadela);
		
		
		
		
		frodoBobo.irHacia(casaPaja);
		
		frodoBobo.soplar(casaPaja);
		
		
		casaPaja.sacarOcupante(porky);
		
		
		casaMadera.agregarOcupante(porky);
		
		
		
		frodoBobo.irHacia(casaMadera);
		
		frodoBobo.soplar(casaMadera);
		
		
		casaMadera.sacarOcupante(porky);
		casaMadera.sacarOcupante(cerdi);
		
		casaLadrillos.agregarOcupante(porky);
		casaLadrillos.agregarOcupante(cerdi);
		
		frodoBobo.irHacia(casaLadrillos);
		
		frodoBobo.soplar(casaLadrillos);	

		
		
		System.out.println("\nFrodo " + ((frodoBobo.estaSaludable())? "esta ":"no esta ") + "saludable.");
		
		System.out.println("\nFrodo " + ((frodoBobo.estaGordo())? "esta ":"no esta ") + "gordo.");
		
		

	}

}
