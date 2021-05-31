package dominio;

public class Paja extends Lugar {

	public Paja(String nom, int tiempo) {
		super(nom, tiempo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cuantoResiste() {
		return pesoOcupantes();
	}

}
