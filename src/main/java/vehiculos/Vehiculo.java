package vehiculos;

public class Vehiculo {
	
	String placa;
	int puertas;
	double velocidadMaxima;
	String nombre;
	double precio;
	String traccion;
	Fabricante fabricante;
	static int cantidadVehiculos;

	
	public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, double precio, String traccion,
			Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
	}

}
