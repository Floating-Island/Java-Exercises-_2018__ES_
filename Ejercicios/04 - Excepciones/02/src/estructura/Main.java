package estructura;

import excepciones.FormatoInvalidoFechaException;
import fecha.ParseadorDeFecha;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fechaString = "02/07/1993";
		
		try {
			ParseadorDeFecha fecha = new ParseadorDeFecha(fechaString);
			System.out.println(fecha);
		} catch (FormatoInvalidoFechaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
