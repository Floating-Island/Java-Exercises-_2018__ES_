package dominio;

public class Correcaminos extends Animal {

	private int peso;
	public Correcaminos(double en, int pos, int pes) {
		super(en, pos);
		peso = pes;
		
	}

	@Override
	public double velocidad() {
		return 10-peso;
	}
	
	public int cuantoPesa() {
		return peso;
	}

}
