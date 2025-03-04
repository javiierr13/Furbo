package equipo.jugador.defensa;

public class Central extends Defensa {

	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.entradas = entradas;
	}

	public int getEntradas() {
		return entradas;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Central");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Dorsal: " + getDorsal());
		System.out.println("Equipo actual: " + getEquipo());
		System.out.println("Disputas realizadas: " + getDisputasRealizadas());
		System.out.println("Entradas realizadas: " + getEntradas());
		System.out.println("------------------");

	}

	@Override
	public String toString() {
		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
				+ ", Disputas Realizadas=" + getDisputasRealizadas() + ", Entradas realizadas=" + getEntradas();
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Central Central = (Central) otro;
		boolean iguales;
		if (this.getDorsal() == (Central.getDorsal()) && this.getEquipo() == Central.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
