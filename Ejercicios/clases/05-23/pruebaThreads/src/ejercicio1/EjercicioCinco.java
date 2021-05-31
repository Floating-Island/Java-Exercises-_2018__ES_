package ejercicio1;

import trabajadores.DecrementadorContadorSincronizadoRunnable;
import trabajadores.IncrementadorContadorSincronizadoRunnable;

public class EjercicioCinco {//usa locks para sincronizar

	public void iniciarEjercicio() throws InterruptedException {
		
		//se definen 3 threads que hacen el mismo trabajo. Solo saludan.
		System.out.println("inicio de ejercicio...");
		Thread[] hilos = new Thread[6];
		// se recomienda tener a los threads en un arreglo y aplicar por cada elemento una tarea.
		
		ContadorSincronizado c = new ContadorSincronizado();
		
		
		hilos[0] = new Thread(new DecrementadorContadorSincronizadoRunnable(c), "uno");
		hilos[1] = new Thread(new DecrementadorContadorSincronizadoRunnable(c), "dos");
		hilos[2] = new Thread(new DecrementadorContadorSincronizadoRunnable(c), "tres");
		
		hilos[3] = new Thread(new IncrementadorContadorSincronizadoRunnable(c), "cuatro");
		hilos[4] = new Thread(new IncrementadorContadorSincronizadoRunnable(c), "cinco");
		hilos[5] = new Thread(new IncrementadorContadorSincronizadoRunnable(c), "seis");
		
		
		//con sleep, se sigue manteniendo la alternancia
		
		for (Thread t : hilos) {
			t.start();//inicia los hilos. los pone en estado runnable. El thread principal ya estaba ejecutándose
		}
		for (Thread t : hilos) {
			t.join();//sirve para hacer que el thread que los creó, siga una vez que todos ellos terminen.
			//se puede hacer un join a un thread muerto
		}
		
		
		System.out.println("fin. el contador queda en: " + c.getContador());
		//a partir del momento en que se crean threads, compiten con la misma prioridad que el que los creó.
			
	}
}
