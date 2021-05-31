package dominio;

public class Piopio {
	
	private int energia;
	
	public Piopio(int joules) {
		energia = joules;
	}
	
	public void volar(int kilometros) {
		int costo = 10;
		energia-= costo - kilometros;
	}
	public void comer(int gramos) {
		int multiplicador = 4;
		energia+= gramos*multiplicador;
	}
}
