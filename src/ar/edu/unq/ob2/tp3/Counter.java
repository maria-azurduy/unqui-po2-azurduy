package ar.edu.unq.ob2.tp3;

import java.util.ArrayList;
import java.util.List;


public class Counter {
	
	private List<Integer> numbers = new ArrayList <Integer>();

	public void addNumber(int i) {
		numbers.add(i);
		
		
	}
	
//1
	
	// 1.1: Devuelve las veces que aparecen numeros pares en la lista

	public int getEvenOcurrences() {
		
		return (int) numbers.stream().filter(number -> this.isEven(number)).count();
		
		
	}
	
	// Indica si el numero es par
	
	public boolean isEven(int i) {
	
		return i % 2 == 0;
	}
	
	// 1.2: Devuelve las veces que aparecen numeros impares en la lista

	public int getOddOcurrences() {
		
		return (int) numbers.stream().filter(number -> this.isOdd(number)).count();
		
		
	}
	
	// Indica si el numero es impar

	public boolean isOdd(int i) {
		return  i % 2 != 0; 
	}
	
	
	
	//1.3: La cantidad de múltiplos de un cierto número
	
	public int cantidadDeMultiplos(int i) {
		
		return (int) numbers.stream().filter(n-> this.isMultiple(n,i)).count();
	}
	
	private boolean isMultiple(int i, int j) {
		
		return i % j == 0;
	}

// 2: A partir de un ArrayList de números enteros, retorna el numero con mayor cantidad de numeros pares 
	
	public int mostAmountOfEvenNumbers() {
		
		List <Integer> copiaListaNumeros  = numbers;
		int maxNumberWithEvenNumbers = 0;
		
		while (!numbers.isEmpty()) {
			
			//copiaListaNumeros.getFirst().this.calcularCantidadDeDigitosPares(int num);
			copiaListaNumeros.remove(0);
			
			
		}
		
		return (maxNumberWithEvenNumbers);
			
	}
	
//	public int calcularCantidadDeDigitosPares(int num) {
//		
//		digitosParesHA= 0
//		
//				
//				
//		
//	}
	
	//Obtengo el último dígito de un numero
	
	public int ultimoDigito(int num) {
		
		return num % 10;
	}
	
	//Eliminar el último dígito de un numero
	
		public int eliminarUltimoDigito(int num) {
			
			return num / 10;
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		/*		
		//obtengo el 1er numero de mi lista
		numbers.getFirst().
		
		//cuento por cada digito del numero, si es par y lo voy sumando en un contador
		
		//paso al siguiente numero de la lista
		
		//
		
		
		
		
		
	}
	
*/
	
	
