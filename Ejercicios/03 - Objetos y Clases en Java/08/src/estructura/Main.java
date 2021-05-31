package estructura;

import dominio.Empleado;
import dominio.Categoria;
import dominio.SinFaltas;
import dominio.ConFaltas;
import dominio.UnaFalta;
import dominio.Neto;
import dominio.Asesor;
import dominio.Cadete;
import dominio.Gerente;

public class Main {

	public static void main(String[] args) {
		
		Categoria empleo = new Asesor();
		Empleado pepe = new Empleado(empleo);
		
		Neto bono = new Neto();
		
		pepe.recibirBono(bono);
		
		SinFaltas bonoP = new SinFaltas();
		
		pepe.recibirBono(bonoP);
		
		System.out.println("\n pepe recibe un sueldo de: $" + pepe.sueldo());
		
		pepe.cambiarCargo(new Cadete());
		
		System.out.println("\n pepe recibe un sueldo de: $" + pepe.sueldo());

	}

}
