package equipo.jugador.delantero;

import equipo.jugador.Jugador;
import equipo.jugador.mediocentro.MedioCentro;

public class Delantero extends Jugador {

	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		this.goles = goles;
	}
	

	public int getGoles() {
		return goles;
	}


	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getGoles());
		System.out.println("Delantero");
	
	}

	@Override
	public String toString() {
		return "Delantero [goles=" + goles + ", getNombre()=" + getNombre() + ", getDorsal()=" + getDorsal()
				+ ", getEquipo()=" + getEquipo() + "]";
	}
	
	@Override
	public boolean equals(Object otro) {// compara this con otro
		Delantero Delantero = (Delantero) otro;
		boolean iguales;
		if (this.getDorsal()==(Delantero.getDorsal()) && this.getEquipo() == Delantero.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}

}
