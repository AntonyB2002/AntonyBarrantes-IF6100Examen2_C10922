package ucr.ac.cr.TestExamen2;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {

	@org.junit.jupiter.api.Test
	void testSuma() {
		OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
		assertEquals(50, suma.procesar(35, 15));

		// Prueba sumando con cero
		assertEquals(5, suma.procesar(5, 0));
	}

	@org.junit.jupiter.api.Test
	void testResta() {
		OperacionAritmetica resta = new OperacionAritmetica(new Resta());
		assertEquals(16, resta.procesar(20, 4));

		// Prueba restando con cero
		assertEquals(10, resta.procesar(10, 0));
	}

	@org.junit.jupiter.api.Test
	void testMultiplicacion() {
		OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
		assertEquals(20, multiplicacion.procesar(5, 4));

		// Prueba multiplicando con cero
		assertEquals(0, multiplicacion.procesar(5, 0));
	}

	@org.junit.jupiter.api.Test
	void testDivision() {
		OperacionAritmetica division = new OperacionAritmetica(new Division());
		assertEquals(1, division.procesar(5, 4));

		// Prueba con cero
		assertEquals(0, division.procesar(0, 4));
	}

	@org.junit.jupiter.api.Test
	void testNumerosNegativos() {
		// Pruebas de error con números negativos
		OperacionAritmetica operacion = new OperacionAritmetica(new Resta());
		assertEquals(-1, operacion.procesar(-5, 10));
		assertEquals(-1, operacion.procesar(5, -10));
		assertEquals(-1, operacion.procesar(-5, -10));
		assertEquals(-1, operacion.procesar(0, -10));
	}

}
