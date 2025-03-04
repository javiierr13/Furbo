package equipo.jugador.defensa;

import equipo.jugador.Puesto;

public class Lateral extends Defensa {

	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, Puesto puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.puesto = puesto;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	@Override
	public String toString() {
		return "Lateral [puesto=" + puesto + ", getNombre()=" + getNombre() + ", getDorsal()=" + getDorsal()
				+ ", getEquipo()=" + getEquipo() + "]";
	}

	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getDisputasRealizadas());
		System.out.println(getPuesto());
		System.out.println("Defensa, Central");
	}

	@Override
	public boolean equals(Object otro) {// compara this con otro
		Lateral Lateral = (Lateral) otro;
		boolean iguales;
		if (this.getDorsal() == (Lateral.getDorsal()) && this.getEquipo() == Lateral.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
