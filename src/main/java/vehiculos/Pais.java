package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	String nombre;
	int contador;

	public Pais(String nombre) {
		this.nombre = nombre;
		contador = 1;
	}
	
	public static Pais paisMasVendedor() {
		
		
		if (Vehiculo.paises.isEmpty()) { 
	        return null; 
	    }
		
		Pais mayor = Vehiculo.paises.get(0);
		
		for (Pais pais : Vehiculo.paises) {
			if (pais.getContador()>mayor.getContador()) {
				mayor = pais;		
			}
		
		}
		return mayor;
	
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	// OK get and set


}
