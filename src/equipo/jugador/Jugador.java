package equipo.jugador;

public abstract class Jugador {
	private String nombre;
	private int dorsal;
	private String equipo;

	// contructor
	public Jugador(String nombre, int dorsal, String equipo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
	}

	public abstract void mostrarDatos();

	public String getNombre() {
		return nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

}
