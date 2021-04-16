package esercizio4;

import esercizio4.Rivista.Periodicità;

public abstract class Elemento {

	protected String codiceIsbn;
	protected String titolo;
	protected int annoPublicazione;
	protected int numeroPagine;

	public String getCodiceIsbn() {
		return codiceIsbn;
	}

	public int getAnnoPublicazione() {
		return annoPublicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public Elemento(String codiceIsbn, int annoPublicazione, int numeroPagine, String titolo) {
		this.codiceIsbn = codiceIsbn;
		this.annoPublicazione = annoPublicazione;
		this.numeroPagine = numeroPagine;
		this.titolo = titolo;
	}

	// Ritorna una stringa contenente gli elementi dell oggetto

	public String toCSVString() {
		return String.format("%s,%s,%s,%d,%d", this.getClass().getSimpleName(), codiceIsbn, titolo, annoPublicazione,
				numeroPagine);
		// con getsimplename andiamo a richiedere il nomedella clase che stiamo
		// trasformando in stringa in questo caso libri o riviste
	}

	// data una stringa ritorna un oggetto contente i dati passati dalla stringa

	public static Elemento parse(String line) {
		String[] token = line.split(",");
		if (token[0].equals("Libro")) {
			return new Libro(token[1], token[2], Integer.parseInt(token[3]), Integer.parseInt(token[4]), token[5],
					token[6]);

		} else {
			return new Rivista(token[1], token[2], Integer.parseInt(token[3]), Integer.parseInt(token[4]),
					Periodicità.valueOf(token[5]));
		}

	}

}
