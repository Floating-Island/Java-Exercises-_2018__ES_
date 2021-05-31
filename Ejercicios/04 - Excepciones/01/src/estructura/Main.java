package estructura;

import calculadora.Calculadora;

public class Main {

	public static void main(String[] args) throws Exception {
		
		double dividendo = 4;
		double divisor = 0;
		
		Calculadora calcu = new Calculadora();
		
		
		System.out.println(calcu.dividir(dividendo, divisor));
	}

}
