package ar.edu.unq.obj2.tpState;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SongTest {
	
	private Song song;
	
	private Estado estado;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testProbandoPlayEnSeleccionDeCanciones() {
		song.play();
		assertEquals(song.getEstado(),);
	}
	
	

}
