package ar.edu.unq.ob2.tp5;

public class ProductoCooperativa extends Producto {
	
	public Double descuentoIVA10() {
		return this.getPrecio() *0.1;
		
	}
	
	public Double getPrecio() {
		return super.getPrecio() - descuentoIVA10() ;
	}
	
	

}
