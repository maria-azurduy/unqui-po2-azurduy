package ar.edu.unq.obj2.tp5;

import java.util.ArrayList;



public class Caja {
	
	private int id;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Caja(int id) {
		this();
		this.id = id;
	}

	public Caja() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void registroDeProductos() {
		clientes.stream().forEach(c -> c.setMontoApagar(c.montoTotalAPagar()));
		
	}
	
	

}
