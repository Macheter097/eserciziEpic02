package gestionaleDipendenti;

public class Cerchio {
	// visto che raggio massimo è una ostante la andremo a creare come static in modo che ne esista solo una copia 
	private static final int raggioMassimo = 1000;
	// Questa è una variabile di istanza cioè una variabile che appartiene agli oggetti cioè ogni cerchio avrà il suo raggio
	private  double raggio ;
	// questa è una variabile statica cioè ne esistera solo una che appartiene alla classe condivisa da tutti gli oggetti.
	private static int numeroCerchi;
	public Cerchio () {
		numeroCerchi++;
	}
	public double calcolaPerimetro() {
		return 2*Math.PI*raggio;
		
		
	}
	public static void main(String[] args) {
		Cerchio c = new Cerchio ();
		Cerchio c2 = new Cerchio ();
		Cerchio c3 = new Cerchio ();
		c.raggio=10;
		c.calcolaPerimetro();
		
		// le variabili statiche devono essere raggiunte dicendo nome classe.variabile statica.
		System.out.println(Cerchio.numeroCerchi);
	}

}
