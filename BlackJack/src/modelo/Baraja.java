package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.PockerCard.Forma;
import modelo.PockerCard.Palo;


public class Baraja {

	List<PockerCard> baraja = new ArrayList<PockerCard>();
	private int arriba;
	

	public Baraja() {
		arriba = 0;
		
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
	
	public PockerCard dameCarta() {
		
		return baraja.get(arriba ++);
		
	}
	
	@Override
	public String toString() {
		String b = "";
		
		for(Carta c : baraja)
			b += c + " ";
		
		return b;
	}
	
}
