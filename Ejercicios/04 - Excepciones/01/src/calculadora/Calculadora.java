package calculadora;

public class Calculadora{
	
	public Calculadora() {
		
	}
	
	public double dividir(double dividendo, double divisor) throws Exception{
		if(divisor == 0) {
			throw new Exception("no se puede dividir por cero.");
		}
		return dividendo/divisor;
	}
}
