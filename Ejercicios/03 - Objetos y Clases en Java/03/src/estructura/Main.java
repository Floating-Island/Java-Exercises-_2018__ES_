package estructura;

import dominio.Correcaminos;
import dominio.Coyote;

public class Main {

	public static void main(String[] args) {

		Coyote coyo = new Coyote(20,0);
		
		Correcaminos bipBip = new Correcaminos(50, 34, 25);

		coyo.comer(bipBip);
	}

}
