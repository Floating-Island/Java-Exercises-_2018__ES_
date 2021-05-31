package fabricantes;

import autos.Auto;

public class Concesionaria {
	private Fabricante relacionFabricante;
	public Concesionaria(){
		relacionFabricante = null;
	}
	public Concesionaria(Fabricante empresa) {
		relacionFabricante = empresa;
	}
	public void changeRelacion(Fabricante empresa) {
		relacionFabricante = empresa;
	}
	public Auto venderAuto(String tipo) {
		return relacionFabricante.crearAuto(tipo);
	}
}
