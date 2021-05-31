package estructura;

import trabajadores.ContadorRunnable;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ContadorRunnable());
		t.start();
		Thread.currentThread().sleep(5000);
		t.interrupt();
		System.out.println("se interrumpio el otro thread.");
		t.join();
		System.out.println("Fin del main");
	}

}
