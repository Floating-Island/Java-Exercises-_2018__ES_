package dominio;

public class Neto extends Resultados {

	private double net;
	public Neto() {
		
	}

	@Override
	public double importe() {
		// TODO Auto-generated method stub
		return net*0.5;
	}
	
	public void cargarNeto(double n) {
		net = n;
	}

}
