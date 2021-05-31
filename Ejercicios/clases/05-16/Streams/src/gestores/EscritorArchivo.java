package gestores;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import animales.Gato;

public class EscritorArchivo {

	private DataOutputStream out = null;
	
	public EscritorArchivo(String s) {
		
		try {
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(s)));
		} catch(FileNotFoundException e){
			e.getMessage();
		}
	}
	
	public void cerrarArchivo() {
		try {
			if(out != null)
				out.close();
		} catch(IOException e) {
			e.getCause();
		}
	}
	
	private void registrarGatos(Gato[] gatos) {
		
		try {
			if(out != null) {
				for(Gato g : gatos) {
					out.writeInt(g.getId());
					out.writeInt(g.getCantVidas());
					out.writeUTF(g.getNombre());
				}
			}
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	public void registrarGatosYCerrar(Gato[] gatos) {
		
		registrarGatos(gatos);
		cerrarArchivo();
	}
	
	
}
