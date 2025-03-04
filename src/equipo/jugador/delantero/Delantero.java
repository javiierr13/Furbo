package equipo.jugador.delantero;

import equipo.jugador.Jugador;

public class Delantero extends Jugador {

	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}

	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println("Delantero");
	}

}
