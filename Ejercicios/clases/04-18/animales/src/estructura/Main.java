package estructura;

import dominio.Gato;
import dominio.Caballo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato whisky = new Gato("felinene", 45, 2);
		
		whisky.hablar();
		
		Caballo nianes = new Caballo("horsejalo", 100);
		
		nianes.hablar();
	}

}
