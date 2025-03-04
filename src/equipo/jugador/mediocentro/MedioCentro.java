package equipo.jugador.mediocentro;

import equipo.jugador.Jugador;

public class MedioCentro extends Jugador {

	private int pasesCompletados;

	@Override
	public void mostrarDatos() {
		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println("Medio centro");
	}

}
