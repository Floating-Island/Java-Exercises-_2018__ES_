package trabajadores;

public class SaludadorRunnable implements Runnable {
	
	public void run() {
		
		System.out.println("Hola, desde " + Thread.currentThread().getName() +
				"!");//currentThread es el que se ejecuta en este momento
	}

}

