package estructura;

import autos.Auto;
import fabricantes.Concesionaria;
import fabricantes.Ford;
import fabricantes.Toyota;

public class Main {

	public static void main(String[] args) {
		
		Concesionaria c = new Concesionaria();
		
		c.changeRelacion(Toyota.getInstance());
		
		Auto autoToyota = c.venderAuto("mediano");
		
		System.out.println(autoToyota);
		autoToyota.tocarBocina();
		
		c.changeRelacion(Ford.getInstance());
		
		Auto autoFord = c.venderAuto("grande");
		
		System.out.println(autoFord);
		autoFord.tocarBocina();
	}

}
