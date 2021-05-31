package gestores;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import animales.Gato;

public class LectorArchivoObjeto {
	
	private ObjectInputStream in = null;
	
	
	public LectorArchivoObjeto(String s) {
		
		try {
			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(s)));
		} catch(FileNotFoundException e){
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	
	public void cerrarArchivo() {
		
		try {
			if(in != null)
				in.close();
		} catch(IOException e) {
			e.getCause();
		}
	}
	
	
	private void mostrarGatos() {
		
		try {
			if(in != null) {
				while(true) {
					System.out.println((Gato)in.readObject());
				}
			}
		} catch(EOFException e) {
			e.getMessage();
		} catch(IOException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}
	}
	
	
	public void mostrarGatosYCerrar() {
		
		mostrarGatos();
		cerrarArchivo();
	}

}
