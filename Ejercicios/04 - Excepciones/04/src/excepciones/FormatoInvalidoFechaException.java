package excepciones;

public class FormatoInvalidoFechaException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "formato de fecha invalido";
	}

}
