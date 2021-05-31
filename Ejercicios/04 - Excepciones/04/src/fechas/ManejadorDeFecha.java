package fechas;

import java.time.LocalDate;

import excepciones.FormatoInvalidoFechaException;

public class ManejadorDeFecha {
	
	public ManejadorDeFecha() {
		
	}
	
	public String formatearFecha(Fecha unaFecha) {
		return unaFecha.toString();
	}
	
	public Fecha parsearFecha(String unaFecha) throws FormatoInvalidoFechaException {
		ParseadorDeFecha parser = new ParseadorDeFecha(unaFecha);
		
		return parser.convertirAFecha();
	}
	
	public int cantidadDeAnios(Fecha unaFecha) {
		LocalDate fechaDeHoy = LocalDate.now();
		return Math.abs(unaFecha.getAnio() - fechaDeHoy.getYear());
	}
}
