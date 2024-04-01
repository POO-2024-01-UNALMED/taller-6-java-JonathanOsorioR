package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	
	String placa;
	int puertas;
	double velocidadMaxima;
	String nombre;
	double precio;
	double peso;
	String traccion;
	Fabricante fabricante;
	static int cantidadVehiculos;
	static ArrayList <Pais> paises = new ArrayList<>();
	static ArrayList <Fabricante> fabricantes = new ArrayList<>();
	
	
	public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, double precio, double peso, String traccion,
			Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		boolean encontrado = false;
				
		for (int i = 0; i < paises.size(); i++) {
			
			if (Vehiculo.paises.get(i).getNombre().equals(fabricante.getPais().getNombre())) {
				fabricante.getPais().contador++;
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			paises.add(fabricante.getPais());
		}
		
		for (int i = 0; i < fabricantes.size(); i++) {
			
			if (Vehiculo.fabricantes.get(i).getNombre().equals(fabricante.getNombre())) {
				fabricante.contadorF++;
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			fabricantes.add(fabricante);
		}
		
	}
		
	public String vehiculosPorTipos() {
		
		return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\nCamionetas: " + Camioneta.getCantidadCamionetas() + "\nCamiones: " + Camion.getCantidadCamiones();
	}


	public String getPlaca() {
		return placa;
	}
	
	


	public static ArrayList<Pais> getPaises() {
		return paises;
	}



	public static void setPaises(ArrayList<Pais> paises) {
		Vehiculo.paises = paises;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getPuertas() {
		return puertas;
	}


	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getTraccion() {
		return traccion;
	}


	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}


	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
