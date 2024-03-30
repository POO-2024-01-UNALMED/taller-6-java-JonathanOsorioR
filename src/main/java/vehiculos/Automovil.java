package vehiculos;

public class Automovil extends Vehiculo {
	
	int puestos;

	public Automovil(String placa, String nombre, double precio,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, "FWD", fabricante);
		
		cantidadVehiculos++;
		this.puestos = puestos;
	}
		
	

}
