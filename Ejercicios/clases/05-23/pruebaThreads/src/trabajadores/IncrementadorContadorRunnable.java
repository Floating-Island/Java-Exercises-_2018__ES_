package trabajadores;

import ejercicio1.Contador;

public class IncrementadorContadorRunnable implements Runnable{
	
	private Contador cantidad = null;
	
	
	public IncrementadorContadorRunnable(Contador cont) {
		cantidad = cont;
	}
	
	public void run() {
		for(int i = 0; i< 1000; i++)
			cantidad.subirContador(); 
		// como no es una operacion atomica, no se puede saber el valor que va a tener
		//en el procesador, primero se copia el valor, se incrementa y se vuelve a guardar.
	}

}
