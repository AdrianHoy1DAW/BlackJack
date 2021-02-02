package modelo;

import java.util.Scanner;

public class Entrada {


	
	private static String obtenerCadena(String msg, int longitud) {

		Scanner sc = new Scanner(System.in);

		System.out.println(msg);
		String texto = sc.nextLine();

		if (texto.length() != longitud)
			return obtenerCadena("Solo debes introducir " + longitud + " caracteres. Prueba otra vez", longitud);

		return texto;

	}
	
	public static char obtenerConfirmacion(String msg) {
		String texto;

		do {
			texto = obtenerCadena(msg, 1).toUpperCase();
			if (!texto.equals("S") && !texto.equals("N")) {
				System.out.println("Debes introducir S o N.");
			}
		} while (!texto.equals("S") && !texto.equals("N"));
		return texto.charAt(0);
	}
	
}
