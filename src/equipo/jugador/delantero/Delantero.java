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
		System.out.println("Informacion del Jugador");
		System.out.println("Posicion: Delantero");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Dorsal: "+getDorsal());
		System.out.println("Equipo actual: "+getEquipo());
		System.out.println("------------------");
		System.out.println("Goles: "+ getGoles());
		
	
	}

	@Override
	public String toString() {
		return "Delantero: Nombre=" + getNombre() + ", Dorsal=" + getDorsal()
				+ ", Equipo=" + getEquipo() + ", Goles=" + goles ;
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
