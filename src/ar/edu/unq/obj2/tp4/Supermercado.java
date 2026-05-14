package ar.edu.unq.obj2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this();
		this.setNombre(nombre);
		this.setDireccion(direccion);
		
	}

	public Supermercado() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public Integer cantidadDeProductos() {
		return (int) productos.stream().count();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public Double precioTotal() {
		
		return productos.stream()
						.mapToDouble(producto -> producto. getPrecio())
						.sum();
	}
	

}