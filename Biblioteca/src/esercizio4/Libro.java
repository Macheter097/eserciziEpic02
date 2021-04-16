package esercizio4;

public class Libro extends Elemento{
	
	
	


	public Libro(String codiceIsbn, String titolo,int annoPublicazione, int numeroPagine , String autore, String genere) {
		super(codiceIsbn, annoPublicazione, numeroPagine, titolo);
		this.genere=genere;
		this.autore=autore;
		// TODO Auto-generated constructor stub
	}


	private String genere;
	private String autore;

	

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}

	
	@Override
	public String toCSVString() {
		// TODO Auto-generated method stub
		return super.toCSVString() + String.format(",%s,%s" ,autore, genere);
	}
	

}
