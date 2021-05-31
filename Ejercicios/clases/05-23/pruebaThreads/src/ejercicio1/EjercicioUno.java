package ejercicio1;

import trabajadores.SaludadorRunnable;

public class EjercicioUno {
	
	public void iniciarEjercicio() throws InterruptedException {
		
		//se definen 3 threads que hacen el mismo trabajo. Solo saludan.
		System.out.println("inicio de ejercicio...");
		Thread[] hilos = new Thread[3];
		// se recomienda tener a los threads en un arreglo y aplicar por cada elemento una tarea.
		
		hilos[0] = new Thread(new SaludadorRunnable(), "uno");
		hilos[1] = new Thread(new SaludadorRunnable(), "dos");
		hilos[2] = new Thread(new SaludadorRunnable(), "tres");
		
		for (Thread t : hilos) {
			t.start();//inicia los hilos. los pone en estado runnable. El thread principal ya estaba ejecutándose
		}
		for (Thread t : hilos) {
			t.join();//sirve para hacer que el thread que los creó, siga una vez que todos ellos terminen.
		}
		
		
		System.out.println("fin.");
		//a partir del momento en que se crean threads, compiten con la misma prioridad que el que los creó.
			
		
		
		
	}
	
}
