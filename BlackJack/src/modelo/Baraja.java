package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import modelo.PockerCard.Forma;
import modelo.PockerCard.Palo;


public class Baraja {

	List<PockerCard> barajar = new ArrayList<PockerCard>();
	Deque<PockerCard> baraja; 

	

	public Baraja() {
		
		
		for(Palo p : Palo.values()) {
			for(Forma f : Forma.values()) {
				baraja.add(new PockerCard(f,p));
			}
		}
		
		barajar();
		baraja = new LinkedList<>(barajar);
		
	}
	
	public void barajar() {
		
		Collections.shuffle(barajar);
		
	}
	
	public PockerCard dameCarta() {
		
		
		
		return baraja.poll();
		
	}
	
	@Override
	public String toString() {
		String b = "";
		
		for(Carta c : baraja)
			b += c + " ";
		
		return b;
	}
	
}
