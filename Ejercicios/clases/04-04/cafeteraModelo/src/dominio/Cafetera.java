package dominio;

public class Cafetera{
	private int capMax; //visibilidad tipo nombre;  //para atributos
	private int canDisp;
	//constructor:
	public Cafetera(int capacidad) {
		
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
	
	
	
	
}
