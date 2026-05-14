package ar.edu.unq.obj2.tp3;

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
		
		return (int) numbers.stream()
				.filter(number -> this.isEven(number))
				.count();
		
		
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
	
	
	//Obtengo el último dígito de un numero
	
	public int ultimoDigito(int num) {
		
		return num % 10;
	}
	
	//Eliminar el último dígito de un numero
	
	public int eliminarUltimoDigito(int num) {
			
		return num / 10;
	}
	
	public int cantidadDigitosPares(int unNumero) {
		
		int cantPares=0;
		int numero = unNumero;
		int digito;
		
		while(numero > 0){
			digito = numero % 10;
			
			if (this.isEven(digito)) {
				cantPares += 1;
			}
			
			numero = numero / 10;
		}
		
		return cantPares;
		
	}
	
}
		
	
		
		
	
	

	
	
