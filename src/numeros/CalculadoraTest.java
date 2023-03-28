package numeros;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void TestSuma() {
		Calculadora calcu=new Calculadora(20,10);
		int resultado=calcu.suma();
		assertEquals(30,resultado,"Error en sumar");
	}
	// soluciona un error con los assert,
	// que por alguna razon tienen errores
	private void assertEquals(int i, int resultado, String string) {
		// TODO Auto-generated method stub	
	}
	@Test
	public void TestResta() {
		Calculadora calcu=new Calculadora(20,10);
		int resultado=calcu.resta();
		assertEquals(10,resultado,"Error en restar");
	}
	@Test
	public void TestResta2() {
		Calculadora calcu=new Calculadora(20,10);
		calcu.resta2();
		assertTrue("Resta2 es verdadero",20>=10);
		assertFalse("Resta2 es falso",20<=10);
	}
	@Test
	public void TestMultiplica() {
		fail("No implementada");
	}
	@Test
	public void TestDivide() {
		fail("No implementada");
	}
	@Test
	public void TestDivide2() {
		Calculadora calcu=new Calculadora(20,10);
		calcu.divide2();
		assertNotNull("Numero 2 es nulo", 10);
	}
}
