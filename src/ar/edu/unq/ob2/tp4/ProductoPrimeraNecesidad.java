package ar.edu.unq.ob2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private String nombre;
	private Double precio;
	private boolean esPrecioCuidado;
	private double montoDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidadom, double montoDescuento) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esPrecioCuidado);
		this.setMontoDescuento(montoDescuento);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return this.precio - ((this.precio * this.getMontoDescuento()) / 100);
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public double getMontoDescuento() {
		return montoDescuento;
	}

	public void setMontoDescuento(double montoDescuento) {
		this.montoDescuento = montoDescuento;
	}


}
