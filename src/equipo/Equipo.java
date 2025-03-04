package equipo;

import equipo.jugador.Jugador;

public class Equipo {
	private Jugador[] alineacion = new Jugador[11];
	
	public void addJugadorAlOnce(Jugador j1, int poscionArray) {
		alineacion[poscionArray]= j1;
	}
	
	public void mostrarOnc() {
		for (int i = 0; i < alineacion.length; i++) {
			System.out.println( alineacion[i]+ alineacion[i].getNombre()+alineacion[i].getDorsal());
		}
	}
}
