package dominio;

import dominio.Canasta;

public class Caperucita extends Persona {

	private Canasta canastita;
	
	public Caperucita(double p, int manzanas) {
		super(p);
		canastita = new Canasta(manzanas);
	}

	@Override
	public double cuantasCalorias() {
		// TODO Auto-generated method stub
		return peso/10.0 + canastita.cuantasCalorias();
	}
	
	public void tirarManzana() {
		
		canastita.sacarManzana();
		System.out.println("\nCaperucita tira una manzana...");
	}

}
