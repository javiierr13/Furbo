package equipo.jugador.defensa;

import equipo.jugador.Jugador;

public class Defensa extends Jugador {

	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println("Defensa");		
	}

}
