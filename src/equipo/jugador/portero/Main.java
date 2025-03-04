package equipo.jugador.portero;

public class Main {

	public static void main(String[] args) {

		Portero p1 = new Portero("Curro", 13, "Sevilla", 7);

		Portero p2 = new Portero("Xexu", 23, "Betis", 70);

		Portero p3 = new Portero("SANCHE", 13, "Betis", 14);

		if (!p1.equals(p2)) {
			System.out.println(p1 + " y " + p2 + "NO iguales");
		}
		if (p1.equals(p3)) {
			System.out.println("SON IGUALES");
		}

	}

}
