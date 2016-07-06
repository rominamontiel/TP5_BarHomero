package ar.edu.unlam.basica2;

public class Cliente implements Comparable<Cliente> {
	
	private int edad;
	private String nombre;
	
	
	public Cliente (int ed, String nom){ 
		this.edad=ed;
		this.nombre=nom;
	}

	
	public int getEdad(){
		return edad;
	}
	
	
	public String getNombre(){
		return nombre;
	} 
			
	
	// ---- SOBREESCRIBO ----
	
	@Override
	public int compareTo(Cliente o) {
		return (this.nombre.compareTo(o.getNombre()));
	}
	
	@Override
	public String toString(){
		return "Cliente [" + nombre + "," + edad + "]";
		
	}
		
	/*
	@Override
	public boolean equals (Object obj){
		return true; // BORRAR !! 
	}
*/
	
	@Override
	public int hashCode(){
		return 1;
	}
		
} // FIN Cliente

	
	
	
	
	
	
	
	
	
	
	



	
	                     






