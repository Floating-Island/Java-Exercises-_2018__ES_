package animales;

public class Gato {

	private Integer id;
	private String nombre;
	private int cantidadDeVidas;
	
	public Gato(Integer i, String n, int cv) {
		id = i;
		nombre = n;
		cantidadDeVidas = cv;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer i) {
		id = i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public int getCantidadDeVidas() {
		return cantidadDeVidas;
	}

	public void setCantidadDeVidas(int cv) {
		cantidadDeVidas = cv;
	}

	@Override
	public String toString() {
		return "El id del Gato es: " + this.getId() + ". Su nombre es: " + this.getNombre() + ". La cantidad de Vidas es: " + this.getCantidadDeVidas();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadDeVidas;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Gato))
			return false;
		Gato other = (Gato) obj;
		if (cantidadDeVidas != other.cantidadDeVidas)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	
	
	
}
