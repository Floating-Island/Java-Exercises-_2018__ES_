package dominio;

import dominio.Persona;
import dominio.Lugar;

public class Lobo {
	
	private double grasa;
	
	public Lobo(double g) {
		grasa = g;
	}
	
	public void comer(Persona aurelio) {
		grasa = aurelio.cuantasCalorias();
	}
	public double cuantaGrasa() {
		return grasa;
	}
	
	public boolean estaGordo() {
		double maximo = 200.0;
		return grasa > maximo;
	}
	
	public boolean estaSaludable() {
		double minimo = 20.0, maximo = 150.0;
		return (grasa > minimo) && (grasa < maximo);
	}
	
	private void correr(int minutos) {
		int quemador = 2;
		grasa-= (double)minutos*quemador;
	}
	
	public void irHacia(Lugar destino) {
		correr(destino.cuantoTardo());
		System.out.println("\nel lobo llego a " + destino.dondeEs());
	}
}
