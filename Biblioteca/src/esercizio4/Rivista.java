package esercizio4;

public class Rivista extends Elemento{
	
		
	

	public Rivista(String codiceIsbn, String titolo,int annoPublicazione, int numeroPagine,  Periodicità periodicità) {
		super(codiceIsbn, annoPublicazione, numeroPagine, titolo);
		// TODO Auto-generated constructor stub
	this.periodicità=periodicità;
	}

	public Periodicità periodicità;

	public Periodicità getPeriodicità() {
		return periodicità;
	}
		
	
	
	public enum Periodicità {
		SETTIMANALE,MENSILE,SEMESTRALE
	}
	
	@Override
	public String toCSVString() {
		// TODO Auto-generated method stub
		return super.toCSVString()+String.format(",%s" , periodicità);
	}
	
	

	

}
