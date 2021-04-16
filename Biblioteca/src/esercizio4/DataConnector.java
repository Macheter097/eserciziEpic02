package esercizio4;

import java.io.IOException;
import java.util.List;

public interface DataConnector {
	
	List<Elemento> caricaElementi () throws IOException;
	
	void salvaElementi (List<Elemento> x)throws IOException ;

}
