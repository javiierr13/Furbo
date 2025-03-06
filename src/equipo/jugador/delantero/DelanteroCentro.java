package equipo.jugador.delantero;

public class DelanteroCentro extends Delantero {

	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}

	public int getGolesDePenalti() {
		return golesDePenalti;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Delantero Centro");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Dorsal: " + getDorsal());
		System.out.println("Equipo actual: " + getEquipo());
		System.out.println("Goles: " + getGoles());
		System.out.println("Goles de penalti: " + getGolesDePenalti());
		System.out.println("------------------");

	}

	@Override
	public String toString() {
		return "Delantero centro: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo() + ", Goles="
				+ getGoles() + "Goles de penalti=" + golesDePenalti;
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		DelanteroCentro DelanteroCentro = (DelanteroCentro) otro;
		boolean iguales;
		if (this.getDorsal() == (DelanteroCentro.getDorsal()) && this.getEquipo() == DelanteroCentro.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
