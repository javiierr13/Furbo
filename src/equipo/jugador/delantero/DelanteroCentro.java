package equipo.jugador.delantero;

public class DelanteroCentro extends Delantero {

	private int golesDePenalti;

	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		this.golesDePenalti = golesDePenalti;
	}
	
	
	public int getGolesDePenalti() {
		return golesDePenalti;
	}


	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getGoles());
		System.out.println(getGolesDePenalti());
		System.out.println("Delantero, Centro");
	
	}


	@Override
	public String toString() {
		return "DelanteroCentro [golesDePenalti=" + golesDePenalti + ", getGoles()=" + getGoles() + ", toString()="
				+ super.toString() + ", getNombre()=" + getNombre() + ", getDorsal()=" + getDorsal() + "]";
	}
	
	

}
