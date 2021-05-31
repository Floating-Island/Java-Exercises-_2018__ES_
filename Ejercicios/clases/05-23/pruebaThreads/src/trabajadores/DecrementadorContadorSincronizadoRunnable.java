package trabajadores;

import ejercicio1.ContadorSincronizado;

public class DecrementadorContadorSincronizadoRunnable implements Runnable{

	private ContadorSincronizado cantidad = null;
	public DecrementadorContadorSincronizadoRunnable(ContadorSincronizado cont) {
		cantidad = cont;
	}
	
	public void run() {
		for(int i = 0; i< 1000; i++)
			cantidad.bajarContador(); // como no es una operacion atomica, no se puede saber el valor que va a tener
	}
}
