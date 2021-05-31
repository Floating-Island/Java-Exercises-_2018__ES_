package dominio;

public abstract class Animal { //'abstract' para que pueda tener metodos abstractos
	protected String especie;
	protected int energia;
	
	public abstract void comer(int cantidad);//'abstract' y el punto y coma, para que sea un metodo abstracto
	
	public abstract void hablar();//'abstract' y el punto y coma, para que sea un metodo abstracto
	
}
