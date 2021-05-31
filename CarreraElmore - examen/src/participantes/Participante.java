package participantes;

import java.util.Random;

public class Participante{
	private String nombre;
	private int distanciaRecorrida;
	private int distanciaSalto;
	private Random r= new Random();
	
	public Participante(String nombre, int distanciaSalto) {
		super();
		this.nombre = nombre;
		this.distanciaSalto = distanciaSalto;
		this.distanciaRecorrida = 0;
	}
	
	private int darViento() {
		return r.nextInt(6); // intervalo de [0,5)
	}
	public void saltar() {
		distanciaRecorrida += darViento() + distanciaSalto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	
	
	
	

}
