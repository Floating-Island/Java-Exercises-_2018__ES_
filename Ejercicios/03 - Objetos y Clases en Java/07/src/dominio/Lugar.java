package dominio;

import java.util.HashSet;
import java.util.Set;

import dominio.Animal;

public abstract class Lugar {
	
	private String nombre;
	private int tiempoDemora;
	protected Set<Animal> ocupantes;
	
	public Lugar(String nom, int tiempo) {
		nombre = nom;
		tiempoDemora = tiempo;
		ocupantes = new HashSet<>();
	}
	
	public int cuantoTardo() {
		return tiempoDemora;
	}
	
	public String dondeEs() {
		return nombre;
	}
	
	public abstract double cuantoResiste();
	
	public void agregarOcupante(Animal okupa) {
		ocupantes.add(okupa);
		System.out.println("el chanchito entro en " + dondeEs() + "...");
	}
	
	public void sacarOcupante(Animal okupa) {
		if(ocupantes.contains(okupa)) {
			ocupantes.remove(okupa);
			System.out.println("el chanchito salio de " + dondeEs() + "...");
		}
	}
	
	protected double pesoOcupantes() {
		double pesoTotal = 0;
		for(Animal a : ocupantes) {
			pesoTotal += a.cuantoPeso();
		}
		return pesoTotal;
	}
}
