package circulo;

public class Circulo {
	
	private double radio;
	
	public Circulo() {
		radio = 0;
	}
	public Circulo(double r) {
		if(r > 0)
			radio = r;
		else
			throw new IllegalArgumentException();
	}
	
	public void setRadio(double r) {
		if(r > 0)
			radio = r;
		else
			throw new IllegalArgumentException();
	}
	public double calcularArea() {
		if(radio == 0)
			throw new IllegalStateException();
		return (Math.PI)*(Math.pow(radio,2));
	}
}
