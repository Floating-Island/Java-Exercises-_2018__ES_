package dominio;

public class Canasta {
	private int manzanas;
	
	public Canasta(int cantidad) {
		manzanas = cantidad;
	}
	
	public int cuantasCalorias() {
		return manzanas*2;
	}
	
	public void sacarManzana() {
		manzanas--;
	}
}
