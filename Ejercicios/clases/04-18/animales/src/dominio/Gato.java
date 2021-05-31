package dominio;

public class Gato extends Animal {
	private int canBigotes;
	
	public Gato(String es, int en, int cb){
		especie = es;
		energia = en;
		canBigotes = cb;
	}
	
	public void sacarBigote() {
		canBigotes--;
	}
	
	public void comer(int cantidad) {
		energia+= cantidad-canBigotes;
	}
	public void hablar() {
		System.out.println("\nCan't speak. Too busy bae");
	}
	
}
