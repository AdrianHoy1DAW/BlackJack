package modelo;




public class Juego {

	

		Baraja baraja;
		Jugador jugador;
		Jugador pc;
		
		public Juego(Jugador j1) {
			jugador=j1;
			baraja=new Baraja();
			pc = new Jugador("PC");
			
			inicializar();
		}
		
		public void inicializar() {
			baraja.barajar();
			
		}
		public void start() {
			
			char opcion;
			
			do {
				System.out.println(jugador);
				opcion=Entrada.obtenerConfirmacion("Quieres carta?");
				if(opcion=='S') {
					jugador.addCarta(baraja.dameCarta());				
				}
				
			}while(jugador.getPuntuacion()<=21 && opcion!='N');
			
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

