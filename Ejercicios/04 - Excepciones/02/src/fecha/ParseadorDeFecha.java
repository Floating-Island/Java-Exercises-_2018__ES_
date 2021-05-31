package fecha;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.regex.Pattern;
import excepciones.FormatoInvalidoFechaException;

public class ParseadorDeFecha {
	
	private String fecha;

	
	public ParseadorDeFecha(String date) throws FormatoInvalidoFechaException{
		if(chequeoFormato(date)) {
			fecha = date;
		} else {
			throw new FormatoInvalidoFechaException();
		}
	}
	private boolean chequeoFormato(String date) {
		
		String regex = "\\d{2}/\\d{2}/\\d{4}";
		boolean chequeo = Pattern.matches(regex, date);
		if(chequeo) {
			String[] split = date.split("/");
			int dia = Integer.parseInt(split[0]);
			int mes = Integer.parseInt(split[1]);
			int anio = Integer.parseInt(split[2]);
			try
	        {
	            LocalDate.of(anio, mes, dia);
	        }
	        catch(DateTimeException e)
	        {
	            return false;
	        }
		}
		return chequeo;
	}
	
	
	public String toString() {
		return fecha;
	}
}
