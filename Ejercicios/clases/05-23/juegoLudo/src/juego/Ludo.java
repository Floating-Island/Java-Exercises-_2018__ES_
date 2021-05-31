package juego;


import trabajos.FichaRunnable;

public class Ludo {
public void iniciarJuego() throws InterruptedException {
		
		//se definen 4 threads que hacen el mismo trabajo. Solo saludan.
		System.out.println("inicio de juego...");
		Thread[] hilos = new Thread[4];
		// se recomienda tener a los threads en un arreglo y aplicar por cada elemento una tarea.
		
		
		
		hilos[0] = new Thread(new FichaRunnable(), "uno");
		hilos[1] = new Thread(new FichaRunnable(), "dos");
		hilos[2] = new Thread(new FichaRunnable(), "tres");
		hilos[3] = new Thread(new FichaRunnable(), "cuatro");
		
		
		
		//con sleep, se sigue manteniendo la alternancia
		
		for (Thread t : hilos) {
			t.start();//inicia los hilos. los pone en estado runnable. El thread principal ya estaba ejecutándose
		}
		for (Thread t : hilos) {
			t.join();//sirve para hacer que el thread que los creó, siga una vez que todos ellos terminen.
			//se puede hacer un join a un thread muerto
		}
		
		
		System.out.println("fin.");
		//a partir del momento en que se crean threads, compiten con la misma prioridad que el que los creó.
			
	}
}
