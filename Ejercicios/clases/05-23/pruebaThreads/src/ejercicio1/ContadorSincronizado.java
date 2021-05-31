package ejercicio1;

public class ContadorSincronizado {
	private int contador;
	
	public ContadorSincronizado() {
		contador = 0;
	}
	
	public int getContador(){
		return contador;
	}
	public synchronized void subirContador() {
		++contador;
	}
	public synchronized void bajarContador() {
		--contador;
	}
}
