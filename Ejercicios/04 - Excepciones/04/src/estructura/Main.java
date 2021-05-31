package estructura;

import java.util.Scanner;

import excepciones.FormatoInvalidoFechaException;
import fechas.Fecha;
import fechas.ManejadorDeFecha;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese una fecha en el formato dd/mm/aaaa: ");
		Scanner sc = new Scanner(System.in);
		
	    String input = sc.nextLine();
	    
	    ManejadorDeFecha manejador = new ManejadorDeFecha();
	    
	    try {
			Fecha date = manejador.parsearFecha(input);
			System.out.println("Pasaron ~" + manejador.cantidadDeAnios(date) + " años.");
			System.out.println("En formato de Fecha queda: " + manejador.formatearFecha(date));
			
		} catch (FormatoInvalidoFechaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	    
	    sc.close();
	    
	    
	}

}
