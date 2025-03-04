package equipo.jugador.portero;

import equipo.jugador.Jugador;

public class Portero extends Jugador {

	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
	}

	public int getParadas() {
		return paradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Portero");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Dorsal: " + getDorsal());
		System.out.println("Equipo actual: " + getEquipo());
		System.out.println("Numero de paradas: " + getParadas());
		System.out.println("------------------");


	}

	@Override
	public String toString() {
		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
				+ ", Numero de paradas=" + getParadas();
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Portero otroPortero = (Portero) otro;
		boolean iguales;
		if (this.getDorsal() == (otroPortero.getDorsal()) && this.getEquipo() == otroPortero.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}
}
