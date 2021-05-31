package dominio;

public class Perro extends Animal {
	public Perro(String es, int en) {
		especie = es;
		energia = en;
	}
	
	public void comer(int cantidad) {
		energia+= cantidad;
	}
	public void hablar() {
		System.out.println("\nholaquetal");
	}
}
