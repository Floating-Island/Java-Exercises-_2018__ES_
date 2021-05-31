package editoresArchivo;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import participantes.Participante;


public class EscritorArchivo {

	private static PrintWriter out = null;
	private static volatile EscritorArchivo instance = null;
	private static final String defaultFile = "resultados.csv";
	
	private EscritorArchivo(String s) {
		try {
			out = new PrintWriter(new FileWriter(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static EscritorArchivo getInstance() {
		if(instance == null)
			synchronized(EscritorArchivo.class) {
				if(instance == null)
					instance = new EscritorArchivo(defaultFile);
			}
		return instance;
	}
	
	public static void cerrarArchivo() {
		if(out != null)
			out.close();
	}
	
	public void registrarParticipante(Participante participante) {
		
		String l = participante.getNombre() + ",";
			if(out != null)
				out.println(l);
	}
	
}
