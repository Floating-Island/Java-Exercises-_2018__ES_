package animales;

import java.io.Serializable;

public class Gato implements Serializable{/// usar la clase que redefine toString y hashcode
	
	private String nombre;
	private int id;
	private int cantVidas;
	private static final long SerialVersionUID = 1;// si no se usase, habria que mandarlo por partes al archivo 
	
	public Gato(int i, int cv, String nom){
		
		id= i;
		nombre = nom;
		cantVidas = cv;
	}
	
	public void sacarVida() {
		
		cantVidas--;
	}
	
	public int getId() {
		
		return id;
	}
	public int getCantVidas() {
		
		return cantVidas;
	}
	public String getNombre() {
		
		return nombre;
	}
	public void hablar() {
		
		System.out.println("\nCan't speak. Too busy bae");
	}
	
}
