package gestores;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import animales.Gato;

public class LectorArchivo {
	
	private DataInputStream in = null;
	
	
	public LectorArchivo(String s) {
		
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
		} catch(FileNotFoundException e){
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
		
		Gato g = null;
		try {
			if(in != null) {
				while(true) {
					g = new Gato(in.readInt(),in.readInt(),in.readUTF());
					System.out.println(g);
				}
			}
		} catch(EOFException e) {
			e.getMessage();
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	
	public void mostrarGatosYCerrar() {
		
		mostrarGatos();
		cerrarArchivo();
	}
	
}
