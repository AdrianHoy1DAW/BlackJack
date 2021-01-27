package modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Jugador {

	private String nombre;
	private int puntuacion;
	private List<PockerCard> barajaJugador = new ArrayList<>();
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntuacion() {
		puntuacion = 0; 
		int i = 0;
		
		if(barajaJugador.isEmpty() == true) {
			return puntuacion;
		} else {
			while(barajaJugador.isEmpty() == false) {
				puntuacion += barajaJugador.get(i).getValor();
				i ++;
			}
		}

			
			
		return puntuacion;
		
		
	
	}
	
	public void addCarta(PockerCard c) {
		
		barajaJugador.add(c);
		
	}
	
	
	
	public List<PockerCard> getBarajaJugador() {
		return barajaJugador;
	}

	public String toString() {
		
		return "Nombre: " + nombre + "\n" +
				"Baraja: " + barajaJugador + "\n" +
				"Puntuacion: " + puntuacion;
		
	}
	
	
	
}
