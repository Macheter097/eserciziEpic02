package esercizio4;

public class Rivista extends Elemento{
	
		
	

	public Rivista(String codiceIsbn, String titolo,int annoPublicazione, int numeroPagine,  Periodicit� periodicit�) {
		super(codiceIsbn, annoPublicazione, numeroPagine, titolo);
		// TODO Auto-generated constructor stub
	this.periodicit�=periodicit�;
	}

	public Periodicit� periodicit�;

	public Periodicit� getPeriodicit�() {
		return periodicit�;
	}
		
	
	
	public enum Periodicit� {
		SETTIMANALE,MENSILE,SEMESTRALE
	}
	
	@Override
	public String toCSVString() {
		// TODO Auto-generated method stub
		return super.toCSVString()+String.format(",%s" , periodicit�);
	}
	
	

	

}
