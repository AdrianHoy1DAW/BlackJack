package modelo;

import modelo.PockerCard.Forma;
import modelo.PockerCard.Palo;

public class Test {

	public static void main(String[] args) {
		
		
		Jugador j1 = new Jugador("Hoyos");
		Juego juego1 = new Juego(j1);
		PockerCard p = new PockerCard(Forma.A, Palo.CORAZONES);
		
		
		

		juego1.start();
		

	}

}
