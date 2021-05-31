package comparadores;

import java.util.Comparator;

import animales.Gato;

public class IdComparator implements Comparator<Gato> {

	@Override
	public int compare(Gato o1, Gato o2) {
		
		
		
		return o1.getId().compareTo(o2.getId());
	}

}
