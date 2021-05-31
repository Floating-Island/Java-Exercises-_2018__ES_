package trabajadores;

public class SaludadoresRunnable implements Runnable {

	public void run() {
		
		for(int i= 0; i< 10 ; i++) {
			System.out.println("Hola, desde " + Thread.currentThread().getName() + 
					"!" + " Ya van " + i + " veces...");
			//currentThread es el que se ejecuta en este momento
			//se quiere que cada thread deje a los demas correrse.
			//Thread.yield(); //no sirve mucho porque todos los threads tienen la misma prioridad
			try {
				Thread.sleep(1);// esto si funciona porque todos tienen que esperar. Pero es más lento
				//cuanto más se espera, más asegurada se tiene la alternancia. Se tiene que asegurar la alternancia mínima
			} catch (InterruptedException e) {//puede ocurrir si algo de afuera hace que se corte la ejecucion.
				e.printStackTrace();// dice qué lo generó y en donde.
				//no se puede tirar un throw en run porque ya no se estaría redefiniendo.
				//en este espacio habría  que liberar los recursos porque el thread muere y quedan
				//con él.
			}
		}
	}
}
