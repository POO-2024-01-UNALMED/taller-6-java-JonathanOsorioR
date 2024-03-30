package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;

	public Camion(String placa, String nombre, double precio, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, "4X2", fabricante);
		
		cantidadVehiculos++;
		this.ejes = ejes;
	}

}
