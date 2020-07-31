package com.arquitecturajava.utilidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("suma de dos numeros")
	void testSuma() {
		//Arrange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//Act (Ejecutar) 
		double sumar = calculadora.sumar(2, 2);
		
		//assert (Confirmacion)
		assertEquals(4, sumar);
		
	}
	
	
	@Test
	@DisplayName("Resta de dos números")
	void testRestar() {
		//Arrange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//Act (Ejecutar) 
		double resta = calculadora.restar(2, 2);
		
		//assert (Confirmacion)
		assertEquals(0, resta);
		
	}
	
	@Test
	@DisplayName("Multplicación de dos números")
	void testMultiplicar() {
		//Arrange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//Act (Ejecutar) 
		double multiplicar = calculadora.multicplicar(2, 3);
		
		//assert (Confirmacion)
		assertEquals(6, multiplicar);
		
	}
	
	@Test
	@DisplayName("Dividir dos números")
	void testDividir() {
		//Arrange (preparacion)
		Calculadora calculadora = new Calculadora();
		
		//Act (Ejecutar) 
		double dividir = calculadora.dividir(4, 2);
		
		//assert (Confirmacion)
		assertEquals(2, dividir);
		
	}

}
