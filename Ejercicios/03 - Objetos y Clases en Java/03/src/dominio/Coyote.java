package dominio;

import dominio.Correcaminos;

public class Coyote extends Animal {

	public Coyote(double en, int pos) {
		super(en, pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double velocidad() {
		return 5 + super.energia/10.0;
	}
	
	public boolean puedeAtrapar(Correcaminos presa) {
		
		return this.velocidad() > presa.velocidad();
	}
	
	private int cuantaDistancia(Correcaminos presa) {
		return Math.abs(presa.darPosicion() - this.darPosicion());
	}
	
	public void correr(Correcaminos presa) {
		if(this.puedeAtrapar(presa)) {
			super.energia= super.energia - 0.5*this.velocidad()*this.cuantaDistancia(presa);
			super.energia = (super.energia > 0)? super.energia : 0; 
			posicion = presa.darPosicion();
			System.out.println("\nel coyote alcanza al correcaminos...");
		}
		else {
			super.energia = 0;
			System.out.println("\nel coyote no pudo alcanzar al correcaminos");
		}	
	}
	
	public void comer(Correcaminos presa) {
		this.correr(presa);
		if(this.darPosicion() == presa.darPosicion()) {
			energia+= 12 + presa.cuantoPesa();
			System.out.println("\nel coyote se comio al correcaminos!");
		}		
	}

}
