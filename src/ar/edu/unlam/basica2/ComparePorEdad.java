package ar.edu.unlam.basica2;
import java.util.Comparator;

public class ComparePorEdad implements Comparator<Cliente>{
	
	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		return cliente1.getEdad() - cliente2.getEdad();
	}

}
	
	
