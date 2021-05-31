package ejercicio1;

import trabajadores.DecrementadorSincronizadoContadorRunnable;
import trabajadores.IncrementadorSincronizadoContadorRunnable;

public class EjercicioSeis {

public void iniciarEjercicio() throws InterruptedException {
		
		//se definen 3 threads que hacen el mismo trabajo. Solo saludan.
		System.out.println("inicio de ejercicio...");
		Thread[] hilos = new Thread[6];
		// se recomienda tener a los threads en un arreglo y aplicar por cada elemento una tarea.
		
		Contador c = new Contador();
		
		
		hilos[0] = new Thread(new DecrementadorSincronizadoContadorRunnable(c), "uno");
		hilos[1] = new Thread(new DecrementadorSincronizadoContadorRunnable(c), "dos");
		hilos[2] = new Thread(new DecrementadorSincronizadoContadorRunnable(c), "tres");
		
		hilos[3] = new Thread(new IncrementadorSincronizadoContadorRunnable(c), "cuatro");
		hilos[4] = new Thread(new IncrementadorSincronizadoContadorRunnable(c), "cinco");
		hilos[5] = new Thread(new IncrementadorSincronizadoContadorRunnable(c), "seis");
		
		
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
