package modelo;



public class Test {

	public static void main(String[] args) {
		
		
		Jugador j1 = new Jugador(Entrada.pedirString("Introduce tu nombre"));
		Juego juego1 = new Juego(j1);
		
		
		

		juego1.start();
		

	}

}
