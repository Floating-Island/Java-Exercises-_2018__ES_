package dominio;

public class Moderado extends Estado {
	private int x;
	
	public Moderado(int cantidad) {
		x=cantidad;
	}
	
	@Override public boolean quiereSubir(Micro bus) {
		return (x<bus.cantidadAsientosLibres())? true:false;
	}

}
