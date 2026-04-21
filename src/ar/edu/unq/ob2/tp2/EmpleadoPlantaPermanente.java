package ar.edu.unq.ob2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoPlantaPermanente extends Empleado{
	
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, List<ReciboHaberes> recibos, Integer cantidadDeHijos, Integer antiguedad) {
			super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico, recibos);
			this.setCantidadDeHijos(cantidadDeHijos);
			this.setAntiguedad(antiguedad);
	}
	
	
	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}


	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	
	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public Double sueldoBruto() {
		return this.salarioFamiliar() + this.getSueldoBasico() ;
	}
	@Override
	public Double retenciones() {
		return this.costoObraSocial() + this.aporteJubilatorio();
	}
	@Override
	public Double costoObraSocial() {
		return (0.1 * this.sueldoBruto()) + (20 * this.getCantidadDeHijos());
	}
	@Override
	public Double sueldoNeto() {
		return this.getSueldoBasico() - this.retenciones();
	}
	
	public Double salarioFamiliar() {
		return this.asignacionPorHijo() + this.beneficioConyuge() + this.montoAntiguedad();
	}
	
	public Double asignacionPorHijo() {
		return (double) (150 * this.getCantidadDeHijos());
	}
	
	public Double beneficioConyuge() {
		if (this.getEstadoCivil() == "Casado") {
			return (double) 100;
		} else {
			return (double) 0;
		}
	}
	
	public Double montoAntiguedad() {
		return (double) (this.getAntiguedad() * 50);
	}
	
	public Double aporteJubilatorio() {
		return 0.15 * this.sueldoBruto();
	}
	
	@Override
	public List<Concepto> generarConceptos() {
		
		List<Concepto> conceptos = new ArrayList<Concepto>();
		
		conceptos.add(new Concepto("Sueldo Bruto", this.sueldoBruto()));
		conceptos.add(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		conceptos.add(new Concepto("Salario Familiar", this.salarioFamiliar()));
		
		conceptos.add(new Concepto("Asignacion por hijo", this.asignacionPorHijo()));
		conceptos.add(new Concepto("Asignacion por conyuge", this.beneficioConyuge()));

		conceptos.add(new Concepto("Retenciones", this.retenciones()));
		conceptos.add(new Concepto("Monto por obra social", this.costoObraSocial()));
		conceptos.add(new Concepto("Monto por aportes jubilatorios", this.aporteJubilatorio()));
		
		conceptos.add(new Concepto("Sueldo Neto", this.sueldoNeto()));
		
		
		return conceptos;
	}

}
