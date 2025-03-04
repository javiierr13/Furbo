package equipo.jugador.defensa;

import equipo.jugador.Jugador;
import equipo.jugador.delantero.Extremo;

public abstract class Defensa extends Jugador {

	private int disputasRealizadas;

	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

//	@Override
//	public void mostrarDatos() {
//		System.out.println("Informacion del Jugador");
//		System.out.println("Posicion: Defensa");
//		System.out.println("Nombre: " + getNombre());
//		System.out.println("Dorsal: " + getDorsal());
//		System.out.println("Equipo actual: " + getEquipo());
//		System.out.println("------------------");
//		System.out.println("Disputas realizadas: " + getDisputasRealizadas());
//
//	}
//
//	@Override
//	public String toString() {
//		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
//				+ ", Disputas Realizadas=" + getDisputasRealizadas();
//	}
//
//	@Override
//	public boolean equals(Object otro) {// compara this con otro
//		Defensa Defensa = (Defensa) otro;
//		boolean iguales;
//		if (this.getDorsal() == (Defensa.getDorsal()) && this.getEquipo() == Defensa.getEquipo()) {
//			iguales = true;
//		} else {
//			iguales = false;
//		}
//		return iguales;
//
//	}

}
