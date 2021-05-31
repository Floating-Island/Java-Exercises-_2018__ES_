package dominio;

public class Caballo extends Animal {

	public Caballo(String es, int en) {
		especie = es;
		energia = en;
	}
	public void comer(int cantidad) {
		energia+= cantidad*cantidad;
	}
	public void hablar() {
		System.out.println("\nImmaHorse");
	}
}
