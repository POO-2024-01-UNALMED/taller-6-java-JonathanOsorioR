package vehiculos;

public class Automovil extends Vehiculo {
	
	int puestos;
	static int cantidadAutomoviles = 0;

	public Automovil(String placa, String nombre, double precio, double peso,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		cantidadVehiculos++;
		this.puestos = puestos;
		cantidadAutomoviles++;
		
	}
	
	public static int getCantidadAutomoviles() {
		return cantidadVehiculos;
	}

	public static void setCantidadAutomoviles(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
		
	

}
