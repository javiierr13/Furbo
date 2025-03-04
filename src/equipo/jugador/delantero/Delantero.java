package equipo.jugador.delantero;

import equipo.jugador.Jugador;

public class Delantero extends Jugador {

	private int goles;

	@Override
	public void mostrarDatos() {
		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println("Delantero");		
	}

}
