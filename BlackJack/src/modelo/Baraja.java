package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.PockerCard.Forma;
import modelo.PockerCard.Palo;


public class Baraja {

	List<PockerCard> baraja = new ArrayList<PockerCard>();

	public Baraja() {
		
		for(Palo p : Palo.values()) {
			for(Forma f : Forma.values()) {
				baraja.add(new PockerCard(f,p));
			}
		}
		
		barajar();
		
	}
	
	public void barajar() {
		
		Collections.shuffle(baraja);
		
	}
	
	public Carta dameCarta() {
		
		return baraja.get(1);
		
	}
	
	@Override
	public String toString() {
		String b = "";
		
		for(Carta c : baraja)
			b += c + " ";
		
		return b;
	}
	
}
