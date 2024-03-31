package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;
	static int cantidadCamiones = 0;

	public Camion(String placa, String nombre, double precio, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, "4X2", fabricante);
		
		cantidadVehiculos++;
		this.ejes = ejes;
		cantidadCamiones++;
		
	}
	
	public static int getCantidadCamiones() {
		return cantidadVehiculos;
	}


	public static void setCantidadCamiones(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	

}
