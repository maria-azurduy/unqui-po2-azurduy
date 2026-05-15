package ar.edu.unq.obj2.tpState;

public class Song {
	
	private Estado estado;

	public void play() {}
	public void pause() {}
	public void stop() {}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}


}
