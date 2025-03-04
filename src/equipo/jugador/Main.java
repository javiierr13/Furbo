package equipo.jugador;

import equipo.jugador.delantero.Delantero;
import equipo.jugador.delantero.DelanteroCentro;

public class Main {

	public static void main(String[] args) {
		
		Delantero d1 = new Delantero("Alvaro", 18, "Labarrera", 6);
		System.out.println(d1);
		
		//d1.mostrarDatos();
		DelanteroCentro d3 = new DelanteroCentro("Alvaro", 18, "Labarrera", 6,3);
		d3.mostrarDatos();

	}

}
