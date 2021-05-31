package dominio;

public class Madera extends Lugar {

	public Madera(String nom, int tiempo) {
		super(nom, tiempo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cuantoResiste() {
		return 5 + pesoOcupantes();
	}

}
