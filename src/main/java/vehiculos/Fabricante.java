package vehiculos;

public class Fabricante {
	
	String nombre;
	Pais pais;
	int contadorF;

	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
	}
	
	static Fabricante fabricaMayorVentas() {
		
		if (Vehiculo.fabricantes.isEmpty()) { 
	        return null; 
	    }
		
		Fabricante mayorF = Vehiculo.fabricantes.get(0);
		
		for (Fabricante f : Vehiculo.fabricantes) {
			if (mayorF.contadorF < f.contadorF) {
				mayorF = f;
				
			}
		}
		return mayorF;
		
	}
	
	int getContadorF( ) {
		return this.contadorF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	} // OK get and set
	
	
}
