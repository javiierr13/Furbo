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

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getPasesCompletados());
		System.out.println(getIntercepciones());
		System.out.println("Medio centro, pivote");
	}

	@Override
	public String toString() {
		return "Pivote [intercepciones=" + intercepciones + ", getIntercepciones()=" + getIntercepciones()
				+ ", getPasesCompletados()=" + getPasesCompletados() + ", getNombre()=" + getNombre() + ", getDorsal()="
				+ getDorsal() + ", getEquipo()=" + getEquipo() + "]";
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
