package ar.edu.unq.ob2.tp2;

public class Concepto {

	private String nombre;
	private Double monto;
	
	public Concepto(String nombre, Double monto) {
		super();
		this.nombre = nombre;
		this.monto = monto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
	
	
	
}
