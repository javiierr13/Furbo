package equipo.jugador.mediocentro;

public class Pivote extends MedioCentro {

	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.intercepciones = intercepciones;
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Pivote");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Dorsal: " + getDorsal());
		System.out.println("Equipo actual: " + getEquipo());
		System.out.println("Pases completados: " + getPasesCompletados());
		System.out.println("Intercepciones: " + getIntercepciones());
		System.out.println("------------------");

	}

	@Override
	public String toString() {
		return "Medio centro Pivote: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
				+ ", Pases completados=" + getPasesCompletados() + ", Intercepciones=" + getIntercepciones();
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Pivote Pivote = (Pivote) otro;
		boolean iguales;
		if (this.getDorsal() == (Pivote.getDorsal()) && this.getEquipo() == Pivote.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
