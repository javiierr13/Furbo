package equipo.jugador.defensa;

import equipo.jugador.Puesto;

public class Lateral extends Defensa {

	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas, String string) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(string);
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = Puesto.valueOf(puesto);
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Lateral");
		System.out.println("Nombre: " + getNombre());
		System.out.println("Dorsal: " + getDorsal());
		System.out.println("Equipo actual: " + getEquipo());
		System.out.println("Disputas realizadas: " + getDisputasRealizadas());
		System.out.println("Lateral: " + getPuesto());
		System.out.println("------------------");

	}

	@Override
	public String toString() {
		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal() + ", Equipo=" + getEquipo()
				+ ", Disputas Realizadas=" + getDisputasRealizadas() + ", Lateral=" + getPuesto();
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
