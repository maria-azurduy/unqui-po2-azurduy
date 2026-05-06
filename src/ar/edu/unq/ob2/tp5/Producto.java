package ar.edu.unq.obj2.tp5;

public class Producto {
	
	private String nombre;
	private int stock;
	private Double precio;
	
	public Producto(String nombre, int stock, double precio) {
		this();
		this.setNombre(nombre);
		this.setStock(stock);
		this.setPrecio(precio);
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
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
		
	}

	public void decrementarStock() {
		this.setStock(this.getStock() - 1);
	}


}
