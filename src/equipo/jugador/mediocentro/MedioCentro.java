package equipo.jugador.mediocentro;

import equipo.jugador.Jugador;
import equipo.jugador.portero.Portero;

public class MedioCentro extends Jugador {

	private int pasesCompletados;

	public MedioCentro(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}
	

	public int getPasesCompletados() {
		return pasesCompletados;
	}


	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getPasesCompletados());
		System.out.println("Medio centro");
	}


	@Override
	public String toString() {
		return "MedioCentro [pasesCompletados=" + pasesCompletados + ", getPasesCompletados()=" + getPasesCompletados()
				+ ", getNombre()=" + getNombre() + ", getDorsal()=" + getDorsal() + ", getEquipo()=" + getEquipo()
				+ "]";
	}
	@Override
	public boolean equals(Object otro) {// compara this con otro
		MedioCentro MedioCentro = (MedioCentro) otro;
		boolean iguales;
		if (this.getDorsal()==(MedioCentro.getDorsal()) && this.getEquipo() == MedioCentro.getEquipo()) {
			iguales = true;
		} else {
			iguales = false;
		}
		return iguales;

	}
	
	

}
