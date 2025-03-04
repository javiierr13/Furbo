package equipo;

import equipo.jugador.Jugador;

public class Equipo {
	private Jugador[] alineacion = new Jugador[11];

	public void addJugadorAlOnce(Jugador pichichi, int poscionArray) {
		alineacion[poscionArray] = pichichi;
	}

	public void mostrarOnce() {
		for (int i = 0; i < alineacion.length; i++) {
			System.out.println(alineacion[i] + alineacion[i].getNombre() + alineacion[i].getDorsal());
		}
	}
}
