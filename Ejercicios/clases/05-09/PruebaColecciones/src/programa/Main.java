package programa;

import animales.Gato;
import pruebas.PruebaLista;
import pruebas.PruebaSet;

public class Main {

	public static void main(String[] args) {

		
		//arreglo de Java:
		
		Gato[] gatos = new Gato[5];
		
		gatos[0] = new Gato(5,"Gumball",7);
		gatos[1] = new Gato(4,"Tom",7);
		gatos[2] = new Gato(3,"Felix",7);
		gatos[3] = new Gato(2,"Garfield",7);
		gatos[4] = new Gato(1,"Silvestre",7);
		//se ponen de mayor a menor los IDs porque...
		
		
		//prueba con listas:
		//las listas no se pueden acceder de forma aleatoria, como pedir un elemento en la posicion especificada.
		//en arreglos si se puede.
		
		
		
		PruebaLista p1 = new PruebaLista();
		p1.iniciarPruebas(gatos);
		
		
		PruebaSet s1 = new PruebaSet();
		
		s1.iniciarPruebas(gatos);
		
		
	}

}
