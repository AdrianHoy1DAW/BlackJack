package modelo;

import modelo.PockerCard.Forma;
import modelo.PockerCard.Palo;

public class Test {

	public static void main(String[] args) {
		
		Baraja b = new Baraja();
		Jugador j1 = new Jugador("Hoyos");
		Jugador j2 = new Jugador("Martín");
		Juego juego1 = new Juego(b, j1,j2);
		PockerCard p = new PockerCard(Forma.A, Palo.CORAZONES);
		
		
		

		juego1.start();
		

	}

}
