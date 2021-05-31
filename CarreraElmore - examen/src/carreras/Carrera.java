package carreras;

import corredores.Corredor;
import participantes.Participante;

public class Carrera {
	
	public void iniciarCarrera() {
		System.out.println("inicio de la carrera!");
		Thread[] hilos = new Thread[5];
		
		
		hilos[0] = new Thread(new Corredor(new Participante("Gumball",25)), "uno");
		hilos[1] = new Thread(new Corredor(new Participante("Anais",10)), "dos");
		hilos[2] = new Thread(new Corredor(new Participante("La señorita Simian",39)), "tres");
		hilos[3] = new Thread(new Corredor(new Participante("El Señor Pequeño",42)), "cuatro");
		hilos[4] = new Thread(new Corredor(new Participante("Larry",43)), "cinco");
		
		for (Thread t : hilos) {
			t.start();
		}
		for (Thread t : hilos) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("fin de la carrera.");
	}
}
