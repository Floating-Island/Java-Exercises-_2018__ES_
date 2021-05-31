package trabajadores;

public class SaludadoresRunnableYield implements Runnable{

	
public void run() {
		
		for(int i= 0; i< 10 ; i++) {
			System.out.println("Hola, desde " + Thread.currentThread().getName() +
					"!" + " Ya van " + i + " veces...");
			

			Thread.yield();// no sirve mucho porque todos los threads tienen la misma prioridad
			try {
				Thread.sleep(1);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
				
				
			}
		}
	}

}
