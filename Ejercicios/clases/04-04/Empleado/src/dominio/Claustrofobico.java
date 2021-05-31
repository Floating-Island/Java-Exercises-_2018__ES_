package dominio;

public class Claustrofobico extends Estado {

	private static int volumenMaximo = 120;
	public Claustrofobico() {
		// TODO Auto-generated constructor stub
	}
	@Override public boolean quiereSubir(Micro bus) {
		 return (bus.mostrarVolumen() > volumenMaximo)? true: false;
	}
}
