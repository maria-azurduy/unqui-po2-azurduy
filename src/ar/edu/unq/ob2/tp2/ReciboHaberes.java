package ar.edu.unq.ob2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReciboHaberes {

	private String nombre;
	private String direccion;
	private LocalDate fechaEmision;
	private Double sueldoBruto;
	private Double sueldoNeto;
	
	private List<Concepto> conceptos = new ArrayList<Concepto>();

	
	public ReciboHaberes(String nombre, String direccion, LocalDate fechaEmision, Double sueldoBruto, Double sueldoNeto,
			List<Concepto> conceptos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = conceptos;
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

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(Double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public Double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public List<Concepto> getConceptos() {
		return conceptos;
	}

	public void setConceptos(List<Concepto> conceptos) {
		this.conceptos = conceptos;
	} 

	
}
