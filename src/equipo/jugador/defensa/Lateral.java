package equipo.jugador.defensa;

import equipo.jugador.Puesto;

public class Lateral extends Defensa {

	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, Puesto puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.puesto = puesto;
	}

}
