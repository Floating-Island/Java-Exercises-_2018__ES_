package trabajadores;

import ejercicio1.ContadorSincronizado;

public class IncrementadorContadorSincronizadoRunnable implements Runnable{

	private ContadorSincronizado cantidad = null;
	
	
	public IncrementadorContadorSincronizadoRunnable(ContadorSincronizado cont) {
		cantidad = cont;
	}
	
	public void run() {
		for(int i = 0; i< 1000; i++)
			cantidad.subirContador(); 
		// como no es una operacion atomica, no se puede saber el valor que va a tener
		//en el procesador, primero se copia el valor, se incrementa y se vuelve a guardar.
	}
}
