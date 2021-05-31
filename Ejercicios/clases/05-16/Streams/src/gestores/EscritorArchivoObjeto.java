package gestores;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import animales.Gato;

public class EscritorArchivoObjeto {
	
	private ObjectOutputStream out = null;
	
	public EscritorArchivoObjeto(String s) {
		
		try {
			out =  new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(s)));
		} catch(FileNotFoundException e){
			e.getMessage();
		} catch (IOException e) {
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
					out.writeObject(g);
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
