package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;
	static int cantidadCamiones = 0;

	public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		
		this.ejes = ejes;
		cantidadCamiones++;
		
	}
	
	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}


	public static void setCantidadCamiones(int cantidadVehiculos) {
		Camion.cantidadCamiones = cantidadVehiculos;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	
	

}
