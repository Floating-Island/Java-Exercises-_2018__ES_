package estructura;


import java.util.Scanner;

import circulo.Circulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c = new Circulo();
		
		System.out.println("Ingrese un radio:");
		
		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	     
		c.setRadio(input);
		
		System.out.println("el area es: " + c.calcularArea());
		
		System.out.println("Ingrese un radio:");
		Circulo cir2 = new Circulo(sc.nextInt());
		System.out.println("el area es: " + cir2.calcularArea());
		
		sc.close();
	}

}
