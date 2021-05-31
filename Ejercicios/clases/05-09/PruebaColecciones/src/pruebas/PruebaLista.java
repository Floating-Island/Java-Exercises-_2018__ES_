package pruebas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import animales.Gato;

public class PruebaLista implements Prueba {

	@Override
	public void iniciarPruebas(Gato[] gatos) {
	
		List<Gato> aL= new ArrayList<>(); 
		
		for(Gato g : gatos) {
			aL.add(g);
		}
		
		for(Iterator<Gato> i = aL.iterator(); i.hasNext(); ){
			
			//se prefeiere guardar al elemento al que esta asignado el iterador con el mismo tipo.
			//si solo se quiere mostrar el elemento al que esta asignado el iterador:
			Gato g = i.next();
			System.out.println(g);
			
			
			//
		}
		
		Gato posEl = aL.get(2);
		
		System.out.println(posEl);//para sacar un elemento en el indice que se especifique.
		
		System.out.println(aL.indexOf(posEl));
		
		
		System.out.println(aL.contains(posEl));
		
		Gato felix = new Gato(3,"Felix",7);
		
		System.out.println(aL.contains(felix));//no va a andar porque no esta redefinido el equals en la clase Gato.
		
		
		
		
	}

}
