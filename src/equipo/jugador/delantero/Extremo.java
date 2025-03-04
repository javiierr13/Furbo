package equipo.jugador.delantero;

import equipo.jugador.Puesto;

public class Extremo extends Delantero {

	private Puesto puesto;

	public Extremo(String nombre, int dorsal, String equipo, int goles, Puesto puesto) {
		super(nombre, dorsal, equipo, goles);
		this.puesto = puesto;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getGoles());
		System.out.println(getPuesto());
		System.out.println("Delantero, Extremo");

	}

	@Override
	public String toString() {
		return "Extremo [puesto=" + puesto + ", getPuesto()=" + getPuesto() + ", getGoles()=" + getGoles()
				+ ", getNombre()=" + getNombre() + ", getDorsal()=" + getDorsal() + ", getEquipo()=" + getEquipo()
				+ "]";
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Extremo Extremo = (Extremo) otro;
		boolean iguales;
		if (this.getDorsal() == (Extremo.getDorsal()) && this.getEquipo() == Extremo.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
