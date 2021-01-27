package modelo;

import java.util.Scanner;

import modelo.PockerCard.Forma;
import modelo.PockerCard.Palo;

public class Juego {

	
	private Baraja baraja;
	private Jugador jugador1;
	private Jugador jugador2;
	

	
	
	public Juego(Baraja baraja, Jugador jugador1, Jugador jugador2) {
		
		this.baraja = baraja;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		
	
		
	}


	public void start() {
		
		juega(jugador1);
		juega(jugador2);
		
	}
	
	public void juega(Jugador jugador) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvendio " + jugador.getNombre());
		int eleccion = 0;
		
		while(eleccion != 2) {
			System.out.println("Quiere 1.Coger otra carta o 2.Plantarte");
			eleccion = sc.nextInt();
			
			if(eleccion == 1) {
				jugador.addCarta(baraja.dameCarta());
			}
			System.out.println(String.valueOf(jugador.getBarajaJugador()) + jugador.getPuntuacion()) ;
		}
		
	}
}
