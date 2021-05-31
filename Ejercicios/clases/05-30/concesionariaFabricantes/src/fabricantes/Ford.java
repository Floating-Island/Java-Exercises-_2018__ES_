package fabricantes;

import autos.Auto;
import autos.F100;
import autos.Fiesta;
import autos.Mustang;


public class Ford extends Fabricante {

	private Ford() {
		
	}
	public static Fabricante getInstance() {
		if(empresa == null)
			synchronized(Toyota.class) {
				if(empresa == null)
					empresa = new Ford();
			}
		return empresa;
	}
	@Override
	public Auto crearAuto(String tipo) {
		if(tipo.equals("chico"))
			return new Fiesta();
		if(tipo.equals("mediano"))
			return new Mustang();
		if(tipo.equals("grande"))
			return new F100();
		return null;
	}

}
