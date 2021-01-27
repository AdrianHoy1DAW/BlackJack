package modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Jugador {

	private String nombre;
	private int puntuacion;
	private List<PockerCard> barajaJugador = new ArrayList<>();
	private int contador;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		puntuacion = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntuacion() {
	
		
		puntuacion += barajaJugador.get(contador ++).getValor();
		

			
			
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
