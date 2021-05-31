package corredores;

import editoresArchivo.EscritorArchivo;
import participantes.Participante;

public class Corredor implements Runnable {

	private Participante participante;
	
	public Corredor(Participante participante) {
		this.participante = participante;
	}
	
	@Override
	public void run() {
		int meta = 10000;//bajar para probar
		EscritorArchivo archivo = EscritorArchivo.getInstance();
		int espera = 1000;//bajar para probar
		
		while(participante.getDistanciaRecorrida() != meta) {
			
			participante.saltar();
			
			try {
				if(participante.getDistanciaRecorrida() >= meta) {
					
					synchronized(EscritorArchivo.class) {
						archivo.registrarParticipante(participante);
						break;
					}
				}
				Thread.currentThread().sleep(espera);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}
