package equipo.jugador.portero;

import equipo.jugador.Jugador;

public class Portero extends Jugador {
	
	private int paradas;

	@Override
	public void mostrarDatos() {
		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println("Portero");
		
	}

}
