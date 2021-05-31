package ejercicio1;

public class Contador {
	private int contador;
	
	public Contador() {
		contador = 0;
	}
	
	public int getContador(){
		return contador;
	}
	public void subirContador() {
		++contador;
	}
	public void bajarContador() {
		--contador;
	}
}
