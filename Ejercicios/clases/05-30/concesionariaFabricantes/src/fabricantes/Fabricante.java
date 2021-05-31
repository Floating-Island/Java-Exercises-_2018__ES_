package fabricantes;

import autos.Auto;

public abstract class Fabricante {
	protected static volatile Fabricante empresa = null;
	
	public static Fabricante getInstance() {
		return empresa;
	}
	public abstract Auto crearAuto(String tipo);
}
