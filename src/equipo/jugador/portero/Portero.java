package equipo.jugador.portero;

import equipo.jugador.Jugador;

public class Portero extends Jugador {

	private int paradas;

	public Portero(String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.paradas = paradas;
	}
	

	public int getParadas() {
		return paradas;
	}


	@Override
	public void mostrarDatos() {
		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getParadas());
		System.out.println("Portero");

	}


	@Override
	public String toString() {
		return "Portero [paradas=" + paradas + ", getParadas()=" + getParadas() + ", getNombre()=" + getNombre()
				+ ", getDorsal()=" + getDorsal() + ", getEquipo()=" + getEquipo() + "]";
	}
	

}
