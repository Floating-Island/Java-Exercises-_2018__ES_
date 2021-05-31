package dominio;

public class Fiaca extends Estado {

	public Fiaca() {
		// TODO Auto-generated constructor stub
	}
	@Override public boolean quiereSubir(Micro bus) {
		return bus.hayAsientosLibres();
	}
}
