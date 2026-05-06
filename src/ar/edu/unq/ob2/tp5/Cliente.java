package ar.edu.unq.obj2.tp5;

import java.util.ArrayList;


public class Cliente {
	
	private String nombre;
	private Double montoAPagar;
	private ArrayList<Producto> productosAComprar = new ArrayList<Producto>();
	
	public Cliente(String nombre) {
		this();
		this.setNombre(nombre);
		this.setMontoApagar(0.0);
	}
	
	public Cliente() {
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public void setMontoApagar(Double monto) {
		this.montoAPagar = monto;
	}

	public ArrayList<Producto> getProductosAComprar() {
		return productosAComprar;
	}

	public void setProductosAComprar(ArrayList<Producto> productosAComprar) {
		this.productosAComprar = productosAComprar;
	}
	
	public Double montoTotalAPagar() {
		return productosAComprar.stream()
								.mapToDouble(p -> p.getPrecio())
								.sum();
	}
	
	
	
	

}
