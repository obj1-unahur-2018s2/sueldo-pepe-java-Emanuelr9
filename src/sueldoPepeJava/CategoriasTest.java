package sueldoPepeJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class CategoriasTest {

	@Test
	public void losGerentesGanan15Mil() {
		Gerente gerente = new Gerente();
		assertEquals(15000, gerente.sueldoNeto());
	}

	@Test
	public void losCadetesGanan20Mil() {
		Cadete cadete = new Cadete();
		assertEquals(20000, cadete.sueldoNeto());
	}
	
	@Test
	public void pepeCobraSuSueldo() {
		Empleado pepe = new Empleado(new Cadete());
		assertEquals(20000, pepe.sueldo());
	}
	
}
