package esercizio4;

import java.io.IOException;
import java.util.List;

public class Start {
	public static void main(String[] args) {
		
		try {
			Archivio arr = new Archivio();
			arr.stampaPubblicazioni();
			Elemento e= arr.ricercaPerIsbn("abc12");
			System.out.println(e.getTitolo());
			List<Elemento> pubPerAutore = arr.ricercaPerAutore("Catello");
			for (Elemento b : pubPerAutore) {
				System.out.println(b.getTitolo());			
			}
			List<Elemento> pubPerAnno = arr.ricercaPerAnno(1970);
			for (Elemento b : pubPerAnno) {
				System.out.println(b.getTitolo());
			}
			Libro l1=new Libro("123bv","java234",1965,80,"Peppe","info");
			arr.aggiungiInArchivio(l1);
			arr.save();
		} catch (IOException e) {
			System.out.println("c'è un problema con la sorgente dati riprovate piu tardi");
			e.printStackTrace();
		}
		
		

	
	
	}
}
