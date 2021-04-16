package esercizio4;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class FileDataConnector implements DataConnector{
	private String path;
	
	public FileDataConnector (String path) {
		this.path=path;
	}
	
	// Carica 
		
	@Override
	public List<Elemento> caricaElementi() throws IOException {
		File f = new File(path);
		List<String> lines = FileUtils.readLines(f, "UTF-8");
		return lines.stream().map(l -> Elemento.parse(l))
					         .collect(Collectors.toList());
		
		
	}

	@Override
	public void salvaElementi(List<Elemento> x) throws IOException {
		File f = new File(path);
		List<String> lines = x.stream().map( Elemento::toCSVString).collect(Collectors.toList());
		FileUtils.writeLines(f, "UTF-8", lines);
	}

}
