package vehiculos;

public class Pais {
	
	String nombre;
	int contador = 1;

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	static Pais paisMasVendedor() {
		return ;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	
	}// OK get and set


}
