package trabajadores;

import ejercicio1.Contador;

public class DecrementadorSincronizadoContadorRunnable implements Runnable{

	private Contador cantidad = null;
	public DecrementadorSincronizadoContadorRunnable(Contador cont) {
		cantidad = cont;
	}
	
	public void run() {
		for(int i = 0; i< 1000; i++)
			synchronized(cantidad) {
				cantidad.bajarContador();
			}
	}
}
