package equipo.jugador.defensa;

import equipo.jugador.Jugador;
import equipo.jugador.delantero.Extremo;

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
		System.out.println(getDisputasRealizadas());
		System.out.println("Defensa");
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	@Override
	public String toString() {
		return "Defensa [disputasRealizadas=" + disputasRealizadas + ", getNombre()=" + getNombre() + ", getDorsal()="
				+ getDorsal() + ", getEquipo()=" + getEquipo() + "]";
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Defensa Defensa = (Defensa) otro;
		boolean iguales;
		if (this.getDorsal() == (Defensa.getDorsal()) && this.getEquipo() == Defensa.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
