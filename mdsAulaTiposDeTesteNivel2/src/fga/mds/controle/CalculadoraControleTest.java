package fga.mds.controle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fga.mds.modelo.Calculadora;

public class CalculadoraControleTest {
	private CalculadoraControle calculadoraControle;
	private Calculadora calculadora;
	
	@Before
	public void setUp() throws Exception {
		calculadoraControle = new CalculadoraControle();
		calculadora = new Calculadora();
	}

	@Test
	public void calculoSomaTest() throws Exception {
		calculadora.setNumero1(10);
		calculadora.setNumero2(20);
		assertEquals(calculadoraControle.calculaSoma(calculadora), 30, 0.01);
	}

}
