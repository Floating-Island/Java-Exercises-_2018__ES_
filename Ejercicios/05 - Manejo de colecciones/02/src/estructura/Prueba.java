package estructura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bebidas.Bebida;

public interface Prueba {
	
	public void iniciarPrueba(List<Bebida> bebidas);
	
	public static List<Bebida> guardarBebidas(){
		List<Bebida> bel= new ArrayList<>();
		
		Scanner scani = new Scanner(System.in);
		String marca = null;
		do {
			
			System.out.println("ingrese una marca de bebida:");
		    marca = scani.nextLine();
		    
		    if(marca.equals("quit"))
		    	break;
		    
		    bel.add(new Bebida(marca));
		    
		}while(!marca.equals("quit"));
		
		scani.close();
		
		return bel;
	}
}
