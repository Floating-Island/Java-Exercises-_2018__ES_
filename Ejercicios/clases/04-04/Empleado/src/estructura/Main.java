package estructura;

import dominio.Micro;
import dominio.Apurado;
import dominio.Claustrofobico;
import dominio.Fiaca;
import dominio.Moderado;
import dominio.Obsecuente;
import dominio.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Empleado boss = new Empleado("Charles Xavier", new Fiaca());
		boss.darleJefe(boss);
		Empleado ap = new Empleado("Storm", boss, new Apurado());
		
		Empleado obs = new Empleado("Wolverine", boss, new Obsecuente(boss));
		
		Empleado claus = new Empleado("Jean", boss, new Claustrofobico());
		
		Empleado otroAp = new Empleado("Magneto", boss, new Apurado());
		
		Empleado ultraAp = new Empleado("Quicksilver", boss, new Apurado());
		
		
		Micro mini = new Micro(100, 2, 1);
		
		Micro combi = new Micro(400, 8, 0);
		
		System.out.println("\n Mini: \n");
		
		mini.subir(boss);
		
		mini.subir(obs);
		
		mini.subir(claus);
		
		mini.subir(ap);
		
		mini.subir(otroAp);
		
		mini.subir(ultraAp);
		
		System.out.println("\n combi: \n");
		
		combi.subir(obs);
		
		combi.subir(claus);
		
		combi.subir(ap);
		
		combi.subir(boss);
		
		combi.subir(obs);
		
		combi.subir(otroAp);
		
		combi.subir(ultraAp);
		
		
		
		
		

	}

}
