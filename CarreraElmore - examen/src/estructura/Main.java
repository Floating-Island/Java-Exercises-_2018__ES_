package estructura;

import carreras.Carrera;
import editoresArchivo.EscritorArchivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EscritorArchivo general = EscritorArchivo.getInstance();
		
		Carrera carreraAnual = new Carrera();
		carreraAnual.iniciarCarrera();
		
		EscritorArchivo.cerrarArchivo();
	}

}
