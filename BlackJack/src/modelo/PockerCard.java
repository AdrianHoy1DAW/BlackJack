package modelo;



public class PockerCard extends Carta {

	private Palo palo;
	private String forma;
	
	private final String ANSI_RESET = "\u001B[0m";

	
	public PockerCard(Forma forma, Palo palo) {
		super(forma.getValor());
		this.forma = forma.getForma();
		this.palo = palo;
		
	}
	

	
	public int getValor() {
		return valor;
	}
	
	
	
	
	@Override
	public String toString() {
		return palo.getColor() + this.forma + palo + this.ANSI_RESET;
	}
	
	public static enum Forma {
		A("A" , 1),
		DOS("2", 2),
		TRES("3", 3),
		CUATRO("4", 4),
		CINCO("5", 5),
		SEIS("6", 6),
		SIETE("7", 7),
		OCHO("8", 8),
		NUEVE("9" , 9),
		DIEZ("10" , 10),
		J("J" ,10),
		Q("Q" , 10),
		K("K" , 10);
		
		private String Forma;
		private int Valor;
		
		
		Forma(String Forma ,int valor) {
			this.Forma = Forma;
			this.Valor = valor;
		}
		
		
		public String getForma() {
			return Forma;
		}


		public int getValor() {
			return Valor;
		}


		
	}
	
	public static enum Color {
		ROJO("\u001B[31m"),
		NEGRO("\u001B[30m");
		
		private String codigoColor;
		
		Color(String codigoColor) {
			this.codigoColor = codigoColor;
		}
		
		public String toString() {
			return this.codigoColor;
		}
		
		
	}
	
	
	public static enum Palo {
		CORAZONES("♥", Color.ROJO),
		PICAS("♠", Color.NEGRO), 
		TREBOLES("♣", Color.NEGRO), 
		DIAMANTES("♦", Color.ROJO);
		
		private  final String forma;
		private final Color color;
		
		Palo(String forma, Color color){
			this.forma = forma;
			this.color = color;
		}
	
		
		public String getForma() {
			return forma;
		}

		
		public Color getColor() {
			return color;
		}

		@Override
		public String toString() {
			return forma;
		}
	}




	
}
