package tp1lap.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import tp1lap.Ejercicios;

/*
 * 
 */
public class Pruebas {
	
	private static Random rnd = new Random();
	
	
	@Test
	public void testSuma() {
		assertEquals(0, Ejercicios.suma(-1, 1));
		assertEquals(0, Ejercicios.suma(0, 0));
		assertEquals(2, Ejercicios.suma(1, 1));
		assertEquals(8, Ejercicios.suma(5, 3));
	}

	@Test
	public void testCantidadDias() {
		assertEquals(31, Ejercicios.cantidadDias(1));
		assertEquals(28, Ejercicios.cantidadDias(2));
		assertEquals(31, Ejercicios.cantidadDias(3));
		assertEquals(30, Ejercicios.cantidadDias(4));
		assertEquals(31, Ejercicios.cantidadDias(5));
		assertEquals(30, Ejercicios.cantidadDias(6));
		assertEquals(31, Ejercicios.cantidadDias(7));
		assertEquals(31, Ejercicios.cantidadDias(8));
		assertEquals(30, Ejercicios.cantidadDias(9));
		assertEquals(31, Ejercicios.cantidadDias(10));
		assertEquals(30, Ejercicios.cantidadDias(11));
		assertEquals(31, Ejercicios.cantidadDias(12));
	}
	
	@Test
	public void testMaximo() {
		assertEquals(0, Ejercicios.maximo(0, 0), 0.0);
		assertEquals(0, Ejercicios.maximo(0, 0, 0, 0, 0));
		
		assertEquals(8.0, Ejercicios.maximo(8.0, 8.0), 0.0);
		assertEquals(8.0, Ejercicios.maximo(8.0, 8.0, 8.0), 0.0);
		assertEquals(8.2, Ejercicios.maximo(8.1, 8.2, 8.0), 0.0);
		assertEquals(8.3, Ejercicios.maximo(8.23, 8.2, 8.3), 0.0);
		assertEquals(8.23, Ejercicios.maximo(8.23, 8.2, 8.21), 0.0);
		assertEquals(7, Ejercicios.maximo(7, -7, 0), 0.0);
		assertEquals(-1, Ejercicios.maximo(-1, -1, -7.0), 0.0);
		assertEquals(Double.MAX_VALUE, Ejercicios.maximo(Double.MAX_VALUE, Double.MIN_VALUE), 0.0);
		
		assertEquals(12, Ejercicios.maximo(7, -7, 0, 12));
		assertEquals(12, Ejercicios.maximo(7, -7, 12, 1));
		assertEquals(12, Ejercicios.maximo(7, 12, 0, 1));
		assertEquals(12, Ejercicios.maximo(12, -12, 0, 1));
		assertEquals(12, Ejercicios.maximo(-12, 12, 0, 1));
		assertEquals(12, Ejercicios.maximo(12, 12, 12, 12));
		assertEquals(-1, Ejercicios.maximo(-7, -2, -6, -1));
		assertEquals(Integer.MIN_VALUE + 3, Ejercicios.maximo(Integer.MIN_VALUE, Integer.MIN_VALUE +2 , Integer.MIN_VALUE +3 , Integer.MIN_VALUE));

		
		
	}
	
	
	
	@Test
	public void testValorAbsoluto() {
		assertEquals(2f, Ejercicios.valorAbsoluto(-2f), 0.0f);
		assertEquals(2f, Ejercicios.valorAbsoluto(2f), 0.0f);
		assertEquals(0f, Ejercicios.valorAbsoluto(0f), 0.0f);
		
		float x = rnd.nextFloat();
		assertEquals(Math.abs(x), Ejercicios.valorAbsoluto(x), 0.0f);
				
	}
	
	@Test
	public void testEsPar() {
		assertFalse(Ejercicios.esPar(1));
		assertFalse(Ejercicios.esPar(9));
		assertTrue(Ejercicios.esPar(0));
		assertTrue(Ejercicios.esPar(8));
		assertTrue(Ejercicios.esPar(-500));
		
	}

	
	
	
	@Test
	public void testEsBisiseto() {
		
		assertTrue(Ejercicios.esBisiesto(1904));
		assertTrue(Ejercicios.esBisiesto(2000));
		assertFalse(Ejercicios.esBisiesto(1900));
		assertFalse(Ejercicios.esBisiesto(1993));
		assertTrue(Ejercicios.esBisiesto(1992));
		
	}
	
	

	@Test
	public void testFahrenheitToCelsius() {
		assertEquals( 232.77, Ejercicios.fahrenheitToCelsius( 451.00f), 0.1);
		assertEquals(-273.15, Ejercicios.fahrenheitToCelsius(-459.67f), 0.1);
		assertEquals( -34.44, Ejercicios.fahrenheitToCelsius( -30.00f), 0.1);
		assertEquals( -23.33, Ejercicios.fahrenheitToCelsius( -10.00f), 0.1);
		assertEquals( -17.78, Ejercicios.fahrenheitToCelsius(   0.00f), 0.1);
		assertEquals(  87.78, Ejercicios.fahrenheitToCelsius( 190.00f), 0.1);
		assertEquals( 537.78, Ejercicios.fahrenheitToCelsius(1000.00f), 0.1);
	}
	
	@Test
	public void testCelsiusToFahrenheit() {
		assertEquals( -58.0, Ejercicios.celsiusToFahrenheit(-50), 0.1);
		assertEquals(  15.8, Ejercicios.celsiusToFahrenheit( -9), 0.1);
		assertEquals(1832.0, Ejercicios.celsiusToFahrenheit(1000), 0.1);
		
	}
	
	@Test
	public void testDiaSemana() {
		
		assertEquals("lunes", Ejercicios.diaSemana(1));
		assertEquals("martes", Ejercicios.diaSemana(2));
		assertEquals("miercoles", Ejercicios.diaSemana(3));
		assertEquals("jueves", Ejercicios.diaSemana(4));
		assertEquals("viernes", Ejercicios.diaSemana(5));
		assertEquals("sabado", Ejercicios.diaSemana(6));
		assertEquals("domingo", Ejercicios.diaSemana(7));
	}
	
	@Test
	public void testSumaAcumulada() {
		assertEquals(     0, Ejercicios.sumaAcumulada(-8));
		assertEquals(     3, Ejercicios.sumaAcumulada(2));
		assertEquals(   378, Ejercicios.sumaAcumulada(27));
		assertEquals(335790, Ejercicios.sumaAcumulada(819));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(      1, Ejercicios.factorial( 0));
		assertEquals(      1, Ejercicios.factorial( 0));
		assertEquals(      2, Ejercicios.factorial( 2));
		assertEquals(3628800, Ejercicios.factorial(10));
	}

	@Test
	public void testPromedio(){
		
		int[] a = {1,5,6,12,-23};
		int[] b = {1};
		int[] c = {0}; 
		int[] d = {4,7,9};
		
		assertEquals(0.2f, Ejercicios.promedio(a), 0.01);
		assertEquals(1f, Ejercicios.promedio(b), 0.01);
		assertEquals(0f, Ejercicios.promedio(c), 0.01);
		assertEquals(6.66f, Ejercicios.promedio(d), 0.01);
	}
	
	
	@Test
	public void testHayTaTeTi() {
		char [][] caso1 = {{' ',' ',' '},
				           {' ',' ',' '},
				           {' ',' ',' '}};
		char [][] caso2 = {{'x','o','o'},
				           {'o','x','x'},
				           {'o','o','x'}};
		
		char [][] caso3 = {{'o','o','x'},
           		           {'o','x','o'},
           		           {'o','o','x'}};
		
		char [][] caso4 = {{'o','o','x'},
		           		   {'x','x','o'},
		           		   {'o','o','x'}};
		
		char [][] caso5 = {{'x','o',' '},
        		   		   {'x','x','o'},
        		   		   {'x','o','o'}};
		
		assertFalse(Ejercicios.hayTaTeTi(caso1));
		assertTrue(Ejercicios.hayTaTeTi(caso2));
		assertTrue(Ejercicios.hayTaTeTi(caso3));
		assertFalse(Ejercicios.hayTaTeTi(caso4));
		assertTrue(Ejercicios.hayTaTeTi(caso5));
	}
	
	
	
	@Test
	public void testEsSimetrica() {
		int[][] caso1=
			{
					{1}
			};
		
		int[][] caso2=
			{
					{ 1, 2},
					{ 2, 3}
			};

		int[][] caso3=
			{
					{ 1, 2},
					{ 0, 1}
			};

		int[][] caso4=
			{
					{ 1, 0, 0, 1},
					{ 0, 2, 0, 2},
					{ 0, 0, 3, 0},
					{ 1, 2, 0, 4}
			};

		int[][] caso5=
			{
					{ 1, 0, 0, 1},
					{ 0, 2, 0, 2},
					{ 0, 0, 3, 0},
					{ 1, 0, 0, 4}
			};

		assertTrue  (Ejercicios.esSimetrica(caso1));
		assertTrue  (Ejercicios.esSimetrica(caso2));
		assertFalse (Ejercicios.esSimetrica(caso3));
		assertTrue  (Ejercicios.esSimetrica(caso4));
		assertFalse (Ejercicios.esSimetrica(caso5));
		
	}	
	

	
}
