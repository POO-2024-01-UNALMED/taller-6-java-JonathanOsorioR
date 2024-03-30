package vehiculos;

public class Camioneta extends Vehiculo {

	boolean volco;
	
	public Camioneta(String placa, int puertas, String nombre, double precio, Fabricante fabricante,boolean volco) {
		super(placa, puertas, 90, nombre, precio, "4X4", fabricante);
		
		cantidadVehiculos++;
		this.volco = volco;		
		
	}

}
