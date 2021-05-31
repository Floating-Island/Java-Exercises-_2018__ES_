package dominio;

public class Abuela extends Persona {

	public Abuela(double p) {
		super(p);
	}

	@Override
	public double cuantasCalorias() {
		return 0;
	}

}
