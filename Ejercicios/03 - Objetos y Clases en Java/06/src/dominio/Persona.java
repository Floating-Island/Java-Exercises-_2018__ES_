package dominio;

public abstract class Persona {
	
	protected double peso;
	
	public Persona(double p) {
		peso = p;
	}
	
	public abstract double cuantasCalorias();
}
