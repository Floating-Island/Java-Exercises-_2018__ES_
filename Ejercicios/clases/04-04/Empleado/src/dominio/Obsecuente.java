package dominio;

public class Obsecuente extends Estado {
	
	private Empleado jefe;
	
	public Obsecuente(Empleado lider) {
		jefe = lider; 
	}
	public boolean quiereSubir(Micro bus) {
		return bus.estaEnBus(jefe);
	}

}
