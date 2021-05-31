package dominio;

import dominio.Estado;
import dominio.Micro;


public class Empleado {
	private String nombre;
	private Empleado jefe;
	private Estado estado;
	
	public Empleado(String n, Estado e) {
		nombre = n;
		estado = e;
	}
	public Empleado(String n, Empleado j, Estado e) {
		nombre = n;
		jefe = j;
		estado = e;
	}
	public void darleJefe(Empleado j) {
		jefe=j;
	}
	public String mostrarNombre() {
		return nombre;
	}
	public boolean quiereSubir(Micro bus) {
		if(estado.quiereSubir(bus)) {
			System.out.println("\n" + nombre + " quiere subir");
			return true;
		}
		else {
			System.out.println("\n" + nombre + " no quiere subir");
			return false;
		}
	}
	
}
