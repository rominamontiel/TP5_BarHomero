package ar.edu.unlam.basica2;

public class Cliente implements Comparable<Cliente> {
	
	private Integer edad;
	private String nombre;
	
	
	public Cliente (Integer ed, String nom){ 
		this.edad=ed;
		this.nombre=nom;
	}

	
	public Integer getEdad(){
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
		return "Cliente [" + nombre + "," + edad + "]\n";
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
	
	
			
} // FIN Cliente

	
	
	
	
	
	
	
	
	
	
	



	
	                     






