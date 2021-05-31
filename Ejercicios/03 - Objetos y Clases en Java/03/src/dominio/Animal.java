package dominio;

public abstract class Animal {
	protected double energia;
	protected int posicion;
	
	public Animal(double en, int pos) {
		energia = en;
		posicion = pos;
	}
	
	public abstract double velocidad();
	
	protected int darPosicion() {
		return posicion;
	}
}
