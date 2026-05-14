package ar.edu.unq.obj2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	public Empresa(String nombre, String cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	public Double totalSueldoNeto() {
		return empleados.stream()
						.mapToDouble((empleado) -> empleado.sueldoNeto())
						.sum();
	}
	
	public Double totalSueldoBruto() {
		return empleados.stream()
						.mapToDouble((empleado) -> empleado.sueldoBruto())
						.sum();
	}
	
	public Double totalRetenciones() {
		return empleados.stream()
						.mapToDouble((empleado) -> empleado.retenciones())
						.sum();
	}
	
	public void liquidacionDeSueldos() {
		empleados.stream().forEach((empleado) -> empleado.generarRecibo());
	}
	
}
