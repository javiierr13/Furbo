package equipo.jugador.mediocentro;

import equipo.jugador.Jugador;

public class MedioCentro extends Jugador {

	private int pasesCompletados;

	public MedioCentro(String nombre, int dorsal, String equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public void mostrarDatos() {
<<<<<<< HEAD
		// TODO Auto-generated method stub

=======
		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println("Medio centro");
>>>>>>> de353b85d7439edd1b8df8e4e1db1377084d0e43
	}

}
