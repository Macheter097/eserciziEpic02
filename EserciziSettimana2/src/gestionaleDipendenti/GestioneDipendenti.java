package gestionaleDipendenti;

import gestionaleDipendenti.Dipendente.Dipartimento;
import gestionaleDipendenti.Dipendente.Livello;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente dip1 = new Dipendente(Dipartimento.PRODUZIONE, "123abc");
		Dipendente dip2 = new Dipendente(Dipartimento.PRODUZIONE, "456def");
		Dipendente dip3 = new Dipendente(Dipartimento.AMMINISTRAZIONE, "789ghi", 1000, 30, Livello.IMPIEGATO);
		Dipendente dip4 = new Dipendente(Dipartimento.VENDITE, "101112", 1000, 30, Livello.DIRIGENTE);

		Livello x = dip1.promuovi();
		System.out.println("Il nuovo livello è " + x);

		Livello y = dip3.promuovi();
		System.out.println("Il nuovo livello è " + y);

		dip1.stampaDatiDipendente();
		dip2.stampaDatiDipendente();
		dip3.stampaDatiDipendente();
		dip4.stampaDatiDipendente();

	//	double somma = Dipendente.calcolaPaga(dip1, 5);

	//	somma = somma + Dipendente.calcolaPaga(dip2, 5);
	//	somma = somma + Dipendente.calcolaPaga(dip3, 5);
	//	somma += Dipendente.calcolaPaga(dip4, 5);
		
		double somma = dip1.calcolaPaga(5);
		somma += dip2.calcolaPaga(5);
		somma += dip3.calcolaPaga(5);
		somma += dip4.calcolaPaga(5);
//
		System.out.println("la somma degli stipendi è:" + somma);
		
		
		
		

	}

}
