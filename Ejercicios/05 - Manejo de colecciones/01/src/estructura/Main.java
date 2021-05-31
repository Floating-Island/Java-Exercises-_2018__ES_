package estructura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bebidas.Bebida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println("las marcas que se cargaron son:");
		for (Bebida bebida : bel) {
			System.out.println(bebida);
		}
		
		System.out.println("Ingrese una marca a eliminar:");
		
		marca = scani.nextLine();
		
		
		Bebida objetivo = new Bebida(marca);
		
		if(bel.contains(objetivo))
			bel.remove(objetivo);
		else
			System.out.println("no estaba guardada esa marca en la lista.");
		
		System.out.println("la lista queda:");
		
		for (Bebida bebida : bel) {
			System.out.println(bebida);
		}
		
		scani.close();
	}

}
