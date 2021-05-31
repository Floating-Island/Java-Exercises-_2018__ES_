package trabajadores;

import ejercicio1.Contador;

public class IncrementadorSincronizadoContadorRunnable implements Runnable{

		private Contador cantidad = null;
		
		
		public IncrementadorSincronizadoContadorRunnable(Contador cont) {
			cantidad = cont;
		}
		
		public void run() {
			for(int i = 0; i< 1000; i++)
				synchronized(cantidad) {
					cantidad.subirContador();
				}
			// como no es una operacion atomica, no se puede saber el valor que va a tener
			//en el procesador, primero se copia el valor, se incrementa y se vuelve a guardar.
		}

}
