package fabricantes;

import autos.Auto;
import autos.Corolla;
import autos.Hylux;
import autos.Prius;

public class Toyota extends Fabricante {

	private Toyota() {
		
	}
	public static Fabricante getInstance() {
		if(empresa == null)
			synchronized(Toyota.class) {
				if(empresa == null)
					empresa = new Toyota();
			}
		return empresa;
	}
	@Override
	public Auto crearAuto(String tipo) {
		if(tipo.equals("chico"))
			return new Prius();
		if(tipo.equals("mediano"))
			return new Corolla();
		if(tipo.equals("grande"))
			return new Hylux();
		return null;
	}

}
