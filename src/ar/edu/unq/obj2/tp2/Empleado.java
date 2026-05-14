package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private Double sueldoBasico;
	private List<ReciboHaberes> recibos = new ArrayList<ReciboHaberes>(); 
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, Double sueldoBasico,
			List<ReciboHaberes> recibos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
		this.recibos = recibos;
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

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public List<ReciboHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<ReciboHaberes> recibos) {
		this.recibos = recibos;
	}

	public void generarRecibo() {
		recibos.add(new ReciboHaberes(this.getNombre(), this.getDireccion(), LocalDate.now(), this.sueldoBruto(), this.sueldoNeto(), this.generarConceptos()));
	}
	
	public abstract List<Concepto> generarConceptos();
	public abstract Double sueldoBruto();
	public abstract Double retenciones();
	public abstract Double costoObraSocial();
	public abstract Double sueldoNeto();
	public abstract Double aporteJubilatorio();
	

}
