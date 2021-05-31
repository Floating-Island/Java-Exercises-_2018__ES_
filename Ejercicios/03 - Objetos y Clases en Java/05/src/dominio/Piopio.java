package dominio;

import dominio.Lugar;
import dominio.Pez;
import dominio.PostreLight;


public class Piopio {
	
	private int energia;
	private Lugar ubicacion;
	private static int costoVuelo = 10;
	
	public Piopio(int joules, Lugar ubi) {
		energia = joules;
		ubicacion = ubi;
	}
	
	public Lugar dondeEsta() {
		return ubicacion;
	}
	
	private void volar(int kilometros) {
		
		energia-= costoVuelo - kilometros;
	}
	
	public void comer(int gramos) {
		int multiplicador = 4;
		energia+= gramos*multiplicador;
	}
	
	public void comer(Pez nemo) {
		
		energia+= Math.sqrt(nemo.cuantoTiene());
	}
	
	public void comer(PostreLight danete) {
		
	}
	
	private int calcularCosto(Lugar destino) {
		return energia - destino.darDireccion() - costoVuelo;
	}
	
	public boolean puedeIr(Lugar destino) {
		return (calcularCosto(destino) > 0)? true:false;
	}
	
	public void irDestino(Lugar destino) {
		if(puedeIr(destino)) {
			System.out.println("\nPiopio se prepara para volar hacia " + destino.darCiudad());
			volar(destino.darDireccion());
			System.out.println("\nPiopio esta en camino...");
			ubicacion = destino;
			System.out.println("\nPiopio ha llegado a " + destino.darCiudad());
		}
	}
	
	public boolean estaEmpachado() {
		int mucho = 100;
		return energia > mucho;
	}
	
	public boolean estaSatisfecho() {
		int poco = 50, mucho = 100;
		return (energia > poco) && (energia < mucho);
	}
	
	public boolean tieneHambre() {
		return !estaEmpachado() && !estaSatisfecho();
	}
}
