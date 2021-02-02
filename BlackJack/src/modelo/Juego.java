package modelo;




public class Juego {

	

		Baraja baraja;
		Jugador jugador;
		Jugador pc;
		
		public Juego(Jugador j1) {
			jugador=j1;
			baraja=new Baraja();
			pc = new Jugador("PC");
			
		}
		

		public void start() {
			
			char opcion;
			
			do {
				System.out.println(jugador);
				opcion=Entrada.obtenerConfirmacion("Quieres carta?");
				if(opcion=='S') {
					System.out.println();
					jugador.addCarta(baraja.dameCarta());				
				}
				
			}while(jugador.getPuntuacion()<=21 && opcion!='N');
			System.out.println(jugador);
			System.out.println("La siguiente carta era un: " + baraja.siguienteCarta() + "\n");
			do {
				pc.addCarta(baraja.dameCarta());
				System.out.println(pc);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}while(jugador.getPuntuacion()<=21 && (pc.getPuntuacion()<jugador.getPuntuacion() && pc.getPuntuacion()<=21));
			
			if(jugador.getPuntuacion()>21)
				perdido();
			else if(pc.getPuntuacion()>21)
				ganado();
			else if(jugador.getPuntuacion()>pc.getPuntuacion())
				ganado();
			else 
				perdido();
			
		}

		private void ganado() {
			System.out.println("Has gando !!!");
			
		}

		private void perdido() {
			System.out.println("Has perdido !!!");
			
		}
		
	}

