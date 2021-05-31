package trabajadores;

import contadores.Contador;

public class ContadorRunnable implements Runnable{

	private Contador cantidad = null;
	public ContadorRunnable(Contador cont) {
		cantidad = cont;
	}
	public ContadorRunnable() {
		cantidad = new Contador();
	}
	
	public void run() {
		for(int i = 0; i< 10000000 && !Thread.currentThread().isInterrupted(); i++) {
			System.out.println("Contador en: " + cantidad.getContador());
			cantidad.subirContador(); // como no es una operacion atomica, no se puede saber el valor que va a tener
			Thread.currentThread().yield();
		}
			
	}
	
}
