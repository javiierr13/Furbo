package equipo.jugador.mediocentro;

import equipo.jugador.Jugador;

public abstract class MedioCentro extends Jugador {

	private int pasesCompletados;

	public MedioCentro(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

//	@Override
//	public void mostrarDatos() {
//		System.out.println("Informacion del Jugador");
//		System.out.println("Posicion: Medio centro");
//		System.out.println("Nombre: " + getNombre());
//		System.out.println("Dorsal: " + getDorsal());
//		System.out.println("Equipo actual: " + getEquipo());
//		System.out.println("------------------");
//		System.out.println(getPasesCompletados());
//	}
//
//	@Override
//	public String toString() {
//		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
//				+ ", Pases completados=" + getPasesCompletados();
//	}
//
//	@Override
//	public boolean equals(Object otro) {// compara this con otro
//		MedioCentro MedioCentro = (MedioCentro) otro;
//		boolean iguales;
//		if (this.getDorsal() == (MedioCentro.getDorsal()) && this.getEquipo() == MedioCentro.getEquipo()) {
//			iguales = true;
//		} else {
//			iguales = false;
//		}
//		return iguales;
//
//	}

}
