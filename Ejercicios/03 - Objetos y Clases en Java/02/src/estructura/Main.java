package estructura;

import dominio.Piopio;
import dominio.Lugar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lugar argentina = new Lugar("Buenos Aires", 0);
		Lugar austria = new Lugar("Innsbruck", 11445);
		Lugar estadosUnidos = new Lugar("Los Angeles", 9832);
		Lugar japon = new Lugar("Kyoto", 18698);
		
		
		Piopio alber = new Piopio(999999, argentina);
		
		alber.irDestino(austria);
		alber.irDestino(estadosUnidos);
		alber.irDestino(japon);
		
		
	}

}
