package equipo.jugador.mediocentro;

public class Mediapunta extends MedioCentro {

	private int asistencias;

	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.asistencias = asistencias;
	}

	public int getAsistencias() {
		return asistencias;
	}
	
	@Override
	public void mostrarDatos() {

		System.out.println(getDorsal());
		System.out.println(getEquipo());
		System.out.println(getNombre());
		System.out.println(getPasesCompletados());
		System.out.println(getAsistencias());
		System.out.println("Medio centro, Media punta");
	}

	@Override
	public String toString() {
		return "Mediapunta [asistencias=" + asistencias + ", getAsistencias()=" + getAsistencias()
				+ ", getPasesCompletados()=" + getPasesCompletados() + ", getNombre()=" + getNombre() + ", getDorsal()="
				+ getDorsal() + ", getEquipo()=" + getEquipo() + "]";
	}
	
	

}
