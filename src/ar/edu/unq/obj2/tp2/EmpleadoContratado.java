package ar.edu.unq.obj2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoContratado extends Empleado {
	
	private int numeroDeContrato;
	private String medioDePago;
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, List<ReciboHaberes> recibos, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico, recibos);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}
	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}
	public void setNumeroDeContrato(int numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	@Override
	public Double sueldoBruto() {
		return this.getSueldoBasico();
	}
	
	@Override
	public Double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	@Override
	public Double retenciones() {
		return 50.0;
	}
	

	@Override
	public List<Concepto> generarConceptos() {
		
		List<Concepto> conceptos = new ArrayList<Concepto>();
		
		conceptos.add(new Concepto("Sueldo Bruto", this.sueldoBruto()));
		
		conceptos.add(new Concepto("Gastos administrativos contractuales", this.retenciones()));
		conceptos.add(new Concepto("Sueldo Neto", this.sueldoNeto()));
		
		
		return conceptos;
	}
	
	@Override
	public Double costoObraSocial() {
		return null;
	}
	@Override
	public Double aporteJubilatorio() {
		return null;
	}
	
	
}
