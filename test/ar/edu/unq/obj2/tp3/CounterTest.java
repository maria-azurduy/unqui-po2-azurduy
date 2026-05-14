package ar.edu.unq.obj2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	private Counter counter;
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		
	}
	
	@Test
	void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		assertEquals(amount, 1);
	}
	
	@Test 
	void testOddNumbers() {
		int amount = counter.getOddOcurrences();
		assertEquals(amount, 9);
	}
	
	@Test
	void testDivisibility() {
		//TODO
	}
	@Test //yay fallo
	void testCantidadDeDigitosPares() {
		assertEquals(counter.cantidadDigitosPares(22), 2);
		assertEquals(counter.cantidadDigitosPares(4789), 3);
		assertEquals(counter.cantidadDigitosPares(888888888), 9);
		//deberia fallar el ultimo e.e 
		}

}
