package dominio;//probar

public class Cafetera{
	private int capMax; //visibilidad tipo nombre;  //para atributos
	private int canDisp;
	private String marca;
	private String modelo;
	private int nSerie;
	//constructor:
	public Cafetera(int capacidad, String model, String brand, int numero) {
		marca = brand;
		modelo = model;
		nSerie = numero;
		capMax=capacidad;
	}
	
	public void prepararCafe(){
		System.out.println("El café se está preparando..."); //la clase system se comunica con el exterior. I/O
		//println imprime un linea de texto System.out.println(string);
		// System.out.println se puede usar un atajo: syso+ctrl+space+enter
		
		canDisp = capMax;
		
		System.out.println("El café está listo.");
	} 
	//visibilidad retorno nombre(parametros){
	//codigo
	//}; //para métodos.
	
	
	public boolean servirCafe(int cantidad) {
		if(cantidad<=canDisp) {
			canDisp-=cantidad;
			return true;
		}else {
			System.out.println("No hay cantidad suficiente de cafe...");
			return false;
		}
		
	}

	//getters y setters generados:
	public int getCapMax() {
		return capMax;
	}


	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}


	public int getCanDisp() {
		return canDisp;
	}


	public void setCanDisp(int canDisp) {
		this.canDisp = canDisp;
	}
	public int darSerie() {
		return nSerie;
	}
	
	
	public String toString () {
		return "marca: " + marca.toString() + "\nmodelo: " + modelo.toString() + "\ncapacidad: " + capMax + "\nnumero de serie: " + nSerie;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Cafetera) {
			return ((Cafetera)o).darSerie() == nSerie;
		}
		return false;
	}
	
	public int hashCode() {
		return nSerie;
	}
	
}
