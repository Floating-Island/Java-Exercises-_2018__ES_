package estructura;

import dominio.Cafetera; //incluir("import") clase Cafetera en el paquete dominio("dominio.Cafetera").

public class Main {

	public static void main(String[] args) {
		
		int capacidad= 300;
		Cafetera volturno = new Cafetera(capacidad);
		volturno.prepararCafe();
		int cantidad=200;
		volturno.servirCafe(cantidad);
		
		cantidad=150;
		volturno.servirCafe(cantidad);
	}

}
