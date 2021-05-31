package trabajos;

import java.util.Random;

public class FichaRunnable implements Runnable{
	
	private static int cantCasillas = 44;
	private int pos = 0;
	private Random r= new Random();
	
	public FichaRunnable() {
		
	}
	public void run() {
		int avance;
		while(pos< cantCasillas) {
			avance = tirarDado();
			pos += avance;
			if(pos >= cantCasillas)// si llegó a la meta.
				System.out.println("llego la ficha " + Thread.currentThread().getName());
			else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
	}
	private int tirarDado() {
		return r.nextInt(6) + 1; // intervalo de [0,6)
	}
	
	}
	

