package ejercicioTema_4;

import ejercicioTema_4.RPN;

import junit.framework.*;

public class TestResultado extends TestCase {

private RPN calculo1 = new RPN("4 5 * 7 2 / - 3 %");
	
	public void testOperacion() {
		
		calculo1.resultado();
		
		assertEquals(1.5, calculo1.resultado());
		
		
	}
}
