package ar.edu.unq.ob2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.Period;

public class EmpleadoTemporario extends Empleado{
	
	private LocalDate fechaFinDesignacion;
	private Integer cantidadHorasExtra;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			Double sueldoBasico, List<ReciboHaberes> recibos, LocalDate fechaFinDesignacion, Integer cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico, recibos);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}

	public void setFechaFinDesignacion(LocalDate fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}

	public Integer getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(Integer cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}

	@Override
	public Double sueldoBruto() {
		
		return this.getSueldoBasico() + this.calculoHorasExtra();
	}

	public Double calculoHorasExtra() {
		return  (double) (40 * this.getCantidadHorasExtra());

	}
	
	@Override
	public Double retenciones() {
		return this.costoObraSocial() + this.aporteJubilatorio();
	}

	@Override
	public Double costoObraSocial() {
		return 0.1 * this.sueldoBruto() + this.montoSiSupera50();
	}
	
	public int edad() {
		
		Period periodoEdad = Period.between(getFechaDeNacimiento(), LocalDate.now());
		
		return periodoEdad.getYears();
	}
	
	public Double montoSiSupera50() {
		if (this.edad() > 50) {
			return (double) 25;
		} else {
			return (double) 0;
		}
	}
	
	public Double aporteJubilatorio() {
		return (0.1 * this.sueldoBruto()) + (this.getCantidadHorasExtra() * 5);
	}

	@Override
	public Double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
	@Override
	public List<Concepto> generarConceptos() {
		
		List<Concepto> conceptos = new ArrayList<Concepto>();
		
		conceptos.add(new Concepto("Sueldo Bruto", this.sueldoBruto()));
		conceptos.add(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		
		conceptos.add(new Concepto("Monto horas extras", this.calculoHorasExtra()));
		
		conceptos.add(new Concepto("Retenciones", this.retenciones()));
		conceptos.add(new Concepto("Monto por obra social", this.costoObraSocial()));
		conceptos.add(new Concepto("Monto por aportes jubilatorios", this.aporteJubilatorio()));
		
		conceptos.add(new Concepto("Sueldo Neto", this.sueldoNeto()));
		
		
		return conceptos;
	}

	
	
	

}
