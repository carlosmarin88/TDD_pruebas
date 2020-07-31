package com.arquitecturajava.escuela;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotaTest {

	Nota nota1 = null;
	Nota nota2 = null;
	Nota nota3 = null;
	Nota nota4 = null;
	Nota nota5 = null;
	
	@BeforeEach
	public void setUp() {
		nota1 = new Nota(8,"lengua");
		nota2 = new Nota(8, "lengua");
		

		nota3 = new Nota(9,"matematicas");
		nota4 = new Nota(7, "matematicas");
		nota5 = new Nota(10,"lengua");
	
	}
	
	@Test
	void testMismaAsignaturaNota() {
		
		boolean esMisma = nota1.esMismaAsignatura(nota2);
		boolean esDistinta = nota1.esMismaAsignatura(nota3);
		
		assertTrue(esMisma);
		assertFalse(esDistinta);
	}
	
	
	@Test
	void testIgualdadNota() {

		//Act
		boolean igualdad = nota1.equals(nota2);
		
		//assert
		assertTrue(igualdad);
	}
	
	@Test
	void testNoIgualdadNota() {

		//Act
		boolean noIgual = nota1.equals(nota3);
		
		//assert
		assertFalse(noIgual);
	}
	
	@Test
	void testNotaEsMayorQueOtra() {

		//Act
		boolean esMayor = nota5.esMayor(nota1);
		
		//assert
		assertTrue(esMayor);
	}
	
	@Test
	void testNotaNoEsComparable() {

		assertThrows(RuntimeException.class, ()->nota1.esMayor(nota3));
		
	}

}
 