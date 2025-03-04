package equipo;

import equipo.jugador.defensa.Central;
import equipo.jugador.defensa.Lateral;
import equipo.jugador.delantero.DelanteroCentro;
import equipo.jugador.delantero.Extremo;
import equipo.jugador.mediocentro.Mediapunta;
import equipo.jugador.mediocentro.Pivote;
import equipo.jugador.portero.Portero;

public class Main {

	public static void main(String[] args) {

		System.out.println("<---Portero--->");
		Portero p1 = new Portero("Adrian", 13, "Betis", 71);
		p1.mostrarDatos();

		System.out.println("<---Defensas--->");

		Central c1 = new Central("Bartra", 5, "Betis", 70, 30);
		c1.mostrarDatos();

		Central c2 = new Central("Diego Llorente", 3, "Betis", 70, 30);
		c2.mostrarDatos();

		Lateral l1 = new Lateral("Sabaly", 23, "Betis", 100, "DERECHO");
		l1.mostrarDatos();

		Lateral l2 = new Lateral("Vladi", 12, "Betis", 100, "IZQUIERDO");
		l2.mostrarDatos();

		System.out.println("<---MedioCentros--->");

		Pivote pi1 = new Pivote("Johnny", 4, "Betis", 200, 124);
		pi1.mostrarDatos();

		Pivote pi2 = new Pivote("Altimira", 16, "Betis", 200, 154);
		pi2.mostrarDatos();

		Mediapunta mp1 = new Mediapunta("ISCO", 22, "Betis", 700, 13);
		mp1.mostrarDatos();

		System.out.println("<---Delanteros--->");

		Extremo e1 = new Extremo("Antony o", 7, "Betis", 4, "DERECHO");
		e1.mostrarDatos();

		Extremo e2 = new Extremo("Jesus", 36, "Betis", 2, "IZQUIERDO");
		e2.mostrarDatos();

		DelanteroCentro d1 = new DelanteroCentro("Cucho", 19, "Betis", 0, 0);
		d1.mostrarDatos();

	}

}
