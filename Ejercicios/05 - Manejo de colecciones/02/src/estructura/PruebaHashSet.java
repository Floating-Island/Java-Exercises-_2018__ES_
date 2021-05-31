package estructura;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bebidas.Bebida;

public class PruebaHashSet implements Prueba {

	public PruebaHashSet() {
		
	}
	
	@Override
	public void iniciarPrueba(List<Bebida> bebidas) {
		
		Set<Bebida> beS = new HashSet<>();
		
		for (Bebida b : bebidas) {
			beS.add(b);
		}
		
		System.out.println("el conjunto queda:");
		
		for ( Bebida bebida : beS) {
			System.out.println(bebida);
		}
		
	}

}
