package dominio;

public abstract class Animal {
	
	protected double peso;
	
	public Animal(double p) {
		peso = p;
	}
	
	public abstract double cuantasCalorias();
	
	public double cuantoPeso(){
		return peso;
	}
}
