package vehiculos;

public class Camioneta extends Vehiculo {

	boolean volco;
	static int cantidadCamionetas = 0;
	
	public Camioneta(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante,boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		
		cantidadVehiculos++;
		this.volco = volco;	
		cantidadCamionetas++;
		
	}
	
	public static int getCantidadCamionetas() {
		return cantidadVehiculos;
	}

	public static void setCantidadCamionetas(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
}
