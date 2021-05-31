package trabajadores;

import ejercicio1.Contador;

public class DecrementadorContadorRunnable implements Runnable{

	private Contador cantidad = null;
	public DecrementadorContadorRunnable(Contador cont) {
		cantidad = cont;
	}
	
	public void run() {
		for(int i = 0; i< 1000; i++)
			cantidad.bajarContador(); // como no es una operacion atomica, no se puede saber el valor que va a tener
	}
	
}
