package dominio;

import java.util.HashSet;
import java.util.Set;

import dominio.Empleado;

public class Micro {
	private int cSentados;
	private int cParados;
	private int volumen;
	private Set<Empleado> pasajerosParados;
	private Set<Empleado> pasajerosSentados;
	
	public Micro(int vol,int sentados, int parados) {
		volumen= vol;
		cSentados=sentados;
		cParados=parados;
		pasajerosParados = new HashSet<>();
		pasajerosSentados = new HashSet<>();
	}
	
	private boolean hayLugar() {
		return hayAsientosLibres() || hayLugarParados();
	}
	
	public boolean hayAsientosLibres() {
		return (pasajerosSentados.size()<cSentados || pasajerosSentados.isEmpty() )? true:false;
	}
	
	private boolean hayLugarParados() {
		return (pasajerosParados.size()<cParados || pasajerosParados.isEmpty() )? true:false;
	}
	
	private boolean subirSentado(Empleado pasajero) {
		if(hayAsientosLibres()) {
			pasajerosSentados.add(pasajero);
			System.out.println("\n" + pasajero.mostrarNombre() +" se queda sentado.");
			return true;
		}
			
		else {
			System.out.println("\nNo hay lugar para que " + pasajero.mostrarNombre() + " vaya sentado.");
			return false;
		}
	}
	
	private boolean subirParado(Empleado pasajero) {
		if(hayLugarParados()) {
			pasajerosParados.add(pasajero);
			System.out.println("\n" + pasajero.mostrarNombre() + " se queda parado.");
			return true;
		}
		else {
			System.out.println("\nNo hay lugar para que " + pasajero.mostrarNombre() + " vaya parado.");
			return false;
		}	
	}
	
	public boolean puedeSubir(Empleado pasajero) {
		if(pasajero.quiereSubir(this) && hayLugar() )
			return true;
		return false;
	}
	
	public void subir(Empleado pasajero) {
		if(puedeSubir(pasajero)) {
			if(!subirSentado(pasajero))
				subirParado(pasajero);
		}
		else {
			System.out.println("\n" + pasajero.mostrarNombre() + " no pudo subir.");
		}
	}
	
	public void bajar(Empleado pasajero) {
		if(!pasajerosParados.remove(pasajero))
			pasajerosSentados.remove(pasajero);
	}	
	
	public int mostrarVolumen() {
		return volumen;
	}
	public int cantidadAsientosLibres() {
		return cSentados-pasajerosSentados.size();
	}
	public boolean estaEnBus(Empleado pasajero) {
		return pasajerosSentados.contains(pasajero) || pasajerosParados.contains(pasajero);
	}
	
}
