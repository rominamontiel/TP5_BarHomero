package ar.edu.unlam.basica2;
import java.util.*;

public class BarHomero{

	private TreeSet<Cliente> listaClientes;
	//private Cliente c;
	private Boolean abierto=false;
	
	public BarHomero(){
		
	}
	public void abrirBar(){
		listaClientes = new TreeSet<Cliente>();
		abierto=true;
	}
	
	public BarHomero(ComparePorEdad comparador){
		listaClientes = new TreeSet<Cliente>();
		abierto=true;
	}
	
	public Boolean getAbierto(){
		return abierto;
	}
	
	public void cargarCliente(Cliente persona){
		
		listaClientes.add(persona);
				
	}	
	
	public void setLista(TreeSet<Cliente> listaEdad){
		listaClientes=listaEdad;
	}
	
	public TreeSet<Cliente> getLista(){
		return listaClientes;
	}
	
} 


/*Cliente obj = new Cliente(c.getEdad(),c.getNombre());
listaClientes.add(obj);*/
