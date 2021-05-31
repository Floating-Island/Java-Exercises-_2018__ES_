package pruebas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


import animales.Gato;
import comparadores.IdComparator;

public class PruebaSet implements Prueba {

	@Override
	public void iniciarPruebas(Gato[] gatos) {
		// TODO Auto-generated method stub
		
		Set<Gato> hashSet = new HashSet<>();
		
		Set<Gato> linkedHashSet = new LinkedHashSet<>();
		
		Set<Gato> treeSet = new TreeSet<>(new IdComparator());
		
		for(Gato g : gatos) {
			hashSet.add(g);
			linkedHashSet.add(g);
			treeSet.add(g);//ordena elementos segun el criterio de compare de los objetos o de una clase que implemente comparator
		}
		
		
		System.out.println("hashSet:");
		for(Iterator<Gato> i = hashSet.iterator(); i.hasNext(); ){
			
			//cambia la forma en que muestra los elementos. es mas rapido que LinkedHashSet
			Gato g = i.next();
			System.out.println(g);
			
			
			//
		}
		
		System.out.println("linkedHashSet:");
		for(Iterator<Gato> i = linkedHashSet.iterator(); i.hasNext(); ){
			
			//siempre muestra los elementos en el mismo orden
			Gato g = i.next();
			System.out.println(g);
			
			
			//
		}
		
		System.out.println("treeSet:");
		for(Iterator<Gato> i = treeSet.iterator(); i.hasNext(); ){
			
			//necesita que los objetos que contiene implementen Comparable y redefinan compare
			
			Gato g = i.next();
			System.out.println(g);
			
			
			//
		}
		
	}

}
