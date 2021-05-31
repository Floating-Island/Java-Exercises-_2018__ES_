package dominio;

public class Ladrillo extends Lugar {

	private int cLadrillos;
	
	public Ladrillo(String nom, int tiempo, int cl) {
		super(nom, tiempo);
		cLadrillos = cl;
	}

	@Override
	public double cuantoResiste() {

		return cLadrillos*2 + pesoOcupantes();
	}

}
