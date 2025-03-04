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
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Delantero Centro");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Dorsal: "+getDorsal());
		System.out.println("Equipo actual: "+getEquipo());
		System.out.println("------------------");
		System.out.println("Goles: "+ getGoles());
		System.out.println( "Puesto: "+ puesto);
		
	
	}

	@Override
	public String toString() {
		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal()
				+ ", Equipo=" + getEquipo() + ", Goles=" + getGoles() + "Puesto" + puesto;
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
