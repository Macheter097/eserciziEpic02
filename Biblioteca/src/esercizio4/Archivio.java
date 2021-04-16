package esercizio4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Archivio {

	private Map<String, Elemento> archivio;
	private DataConnector sorgente = new FileDataConnector("data.txt");

	public Archivio() throws IOException {
		List<Elemento> pubblicazioni = sorgente.caricaElementi();
		// for (Elemento e : pubblicazioni) {
		// archivio.put(e.getCodiceIsbn(), e);		
//	}
		archivio=pubblicazioni.stream().collect(Collectors.toMap(Elemento::getCodiceIsbn, e -> e));

	}

	public void aggiungiInArchivio(Elemento x) {
		archivio.put(x.getCodiceIsbn(), x);

	}

	public void rimuoviDaArchivioTramiteIsbn(String x) {
		archivio.remove(x);

	}

	public Elemento ricercaPerIsbn(String x) {
		return archivio.get(x);

	}

	// con questo metodo andiamo a ricercare l'elemento contenuto nella lista
	// tramite una variabile dell'oggetto
	// in questo caso l'anno, Dichiariamo una funzione che ritorna una lista di
	// elementi poiche cercando per l'anno
	// di publicazione non ci ritornerà un singolo elemento dopodichè cicliamo sulla
	// lista dell'archivio che andrà
	// a controllare se è presente un oggetto con l'anno uguale all'anno per cui
	// andiamo a fare una ricerca
	// e se presente andrà ad inserirlo nella lista che ci verrà ritornata dal
	// metodo.
	public List<Elemento> ricercaPerAnno(int anno) {
		List<Elemento> result = new ArrayList<Elemento>();
		for (Elemento mitem : archivio.values()) {
			if (mitem.getAnnoPublicazione() == anno) {
				result.add(mitem);
			}

		}
		return result;
	}

	public List<Elemento> ricercaPerAnnoJ8(int anno) {
		return archivio.values().stream().filter(p -> p.getAnnoPublicazione() == anno).collect(Collectors.toList());

	}

	public List<Elemento> ricercaPerAutore(String x) {
		List<Elemento> result = new ArrayList<Elemento>();
		for (Elemento myitem : archivio.values()) {
			if (myitem instanceof Libro && ((Libro) myitem).getAutore().equals(x)) {
				result.add(myitem);

			}
		}
		return result;
	}
	// stream è un flusso di dati che possono leggere una serie di dati con degli
	// operatori
	// lo stream ha una sorgente come una collection
	// lo stream avrà una destinazione come il massimo di una serie di numeri,oppure
	// un altra collection come
	// collection .tolist che significa che i dati generati andranno in nuova
	// collection per esempio una list

	public List<Elemento> ricercaPerAutorej8(String x) {
		List<Elemento> result = new ArrayList<Elemento>();
		return archivio.values().stream().filter(p -> p instanceof Libro && ((Libro) p).getAutore().equals(x))
				.collect(Collectors.toList());

	}

	// il metodo .map mappare vuol dire trasformare gli elementi che sono nella in
	// altri elementi.
	// data una pubblicazione permette di salvarla su file
	// %s paramentro che si sostituira a una stringa, %d paramentro che verrà
	// rimepito da un intero
	
	public void save () throws IOException {
		List<Elemento> pubblicazioni = new ArrayList<>(archivio.values());
		sorgente.salvaElementi(pubblicazioni);
	}
	
	public void stampaPubblicazioni () {
		for (Elemento e : archivio.values()) {
			System.out.printf("Tipo: %s, Isbn: %s, Titolo: %s%n" , e.getClass().getSimpleName(), e.getCodiceIsbn(), e.getTitolo());
		}
	}

}
