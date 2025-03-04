package equipo.jugador.defensa;

import equipo.jugador.Jugador;

public class Defensa extends Jugador {
	private int disputasRealizadas;

	@Override
	public void mostrarDatos() {
		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println("Defensa");		
	}

}
