package equipo.jugador;

public abstract class Jugador {
	private String nombre;
	private int dorsal;
	private String Equipo;
	
	
	public abstract void mostrarDatos();


	public String getNombre() {
		return nombre;
	}


	public int getDorsal() {
		return dorsal;
	}


	public String getEquipo() {
		return Equipo;
	}
	
}
