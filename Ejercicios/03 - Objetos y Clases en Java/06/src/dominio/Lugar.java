package dominio;

public class Lugar {
	
	private String nombre;
	private int tiempoDemora;
	
	public Lugar(String nom, int tiempo) {
		nombre = nom;
		tiempoDemora = tiempo;
	}
	
	public int cuantoTardo() {
		return tiempoDemora;
	}
	
	public String dondeEs() {
		return nombre;
	}
}
