package equipo.jugador.delantero;

import equipo.jugador.Puesto;

public class Extremo extends Delantero {

	private Puesto puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, Puesto puesto) {
		super(nombre, dorsal, equipo, goles);
		this.puesto = puesto;
	}

}
