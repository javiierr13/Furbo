package equipo.jugador.defensa;

public class Central extends Defensa {

	private int entradas;

	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas, int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		this.entradas = entradas;
	}
	
	public int getEntradas() {
		return entradas;
	}



	@Override
	public String toString() {
		return "Central [entradas=" + entradas + ", getNombre()=" + getNombre() + ", getDorsal()=" + getDorsal()
				+ ", getEquipo()=" + getEquipo() + "]";
	}
	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getDisputasRealizadas());
		System.out.println(getEntradas());
		System.out.println("Defensa, Central");		
	}
	
}
