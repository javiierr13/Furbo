package equipo.jugador.mediocentro;

public class Mediapunta extends MedioCentro {

	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}

	public int getAsistencias() {
		return asistencias;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Mediapunta");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Dorsal: " + getDorsal());
		System.out.println("Equipo actual: " + getEquipo());
		System.out.println("Pases completados: " + getPasesCompletados());
		System.out.println("Asistencias: " + getAsistencias());
		System.out.println("------------------");

	}

	@Override
	public String toString() {
		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
				+ ", Pases completados=" + getPasesCompletados() + ", Asistencias=" + getAsistencias();
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Mediapunta Mediapunta = (Mediapunta) otro;
		boolean iguales;
		if (this.getDorsal() == (Mediapunta.getDorsal()) && this.getEquipo() == Mediapunta.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
