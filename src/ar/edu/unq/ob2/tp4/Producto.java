package ar.edu.unq.ob2.tp4;

public class Producto {
	
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio) {
		this();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
	}
	
	public Producto(String nombre, double precio, boolean unaCondicion) {
		this();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(unaCondicion);
	}
	
	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean unaCondicion) {
		this.esPrecioCuidado = unaCondicion;
	}

	public void aumentarPrecio(double cantidadAumentar) {
		
		this.setPrecio(this.getPrecio() + cantidadAumentar);
	}


}
