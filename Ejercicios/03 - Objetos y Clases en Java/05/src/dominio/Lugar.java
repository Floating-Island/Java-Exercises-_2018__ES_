package dominio;

public class Lugar {
	private String nombre;
	private int kilometro;
	
	public Lugar(String n, int k) {
		nombre = n;
		kilometro = k;
	}
	public int darDireccion() {
		return kilometro;
	}
	
	public String darCiudad() {
		return nombre;
	}
}
