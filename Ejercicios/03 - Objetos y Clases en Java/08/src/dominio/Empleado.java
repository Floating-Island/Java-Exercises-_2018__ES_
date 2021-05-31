package dominio;

import dominio.Categoria;
import dominio.Resultados;
import dominio.Presentismo;
import dominio.SinFaltas;
import dominio.ConFaltas;
import dominio.UnaFalta;
import dominio.Neto;

public class Empleado {
	
	private Categoria cargo;
	private int faltas;
	private Resultados bonoResultados;
	private Presentismo bonoPresentismo;
	
	public Empleado(Categoria puesto) {
		cargo = puesto;
		bonoResultados = new Resultados();
		bonoPresentismo = new Presentismo();
	}
	
	public void agregarFalta() {
		faltas++;
		bonoPresentismo = new Presentismo();
	}
	
	public void cambiarCargo(Categoria nuevoPuesto) {
		cargo = nuevoPuesto;
		if(bonoResultados instanceof Neto)
			((Neto) bonoResultados).cargarNeto(cargo.neto());
	}
	
	public void recibirBono(Resultados bono){
		bonoResultados = bono;
	}
	
	public void recibirBono(Presentismo bono){
		bonoPresentismo = bono;
	}
	
	public void recibirBono(SinFaltas bono){
		if(faltas == 0)
			bonoPresentismo = bono;
	}
	
	public void recibirBono(UnaFalta bono){
		if(faltas == 1)
			bonoPresentismo = bono;
	}

	public void recibirBono(ConFaltas bono){
		if(faltas > 1)
			bonoPresentismo = bono;
	}
	
	public void recibirBono(Neto bono){
		bono.cargarNeto(cargo.neto());
		bonoResultados = bono;
	}
	
	public double sueldo() {
		return cargo.neto() + bonoPresentismo.importe() + bonoResultados.importe();
	}

}
