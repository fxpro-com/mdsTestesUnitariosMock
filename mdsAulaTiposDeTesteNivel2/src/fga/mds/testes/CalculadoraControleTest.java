package fga.mds.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fga.mds.controle.CalculadoraControle;
import fga.mds.modelo.Calculadora;

public class CalculadoraControleTest {

	private CalculadoraControle calculadoraControle;
	private Calculadora  calculadora;
	
	@Before
	public void setUp() throws Exception {
		calculadoraControle = new CalculadoraControle();
		calculadora = new Calculadora();
	}

	@Test
	public void testCalculaSoma(){
		calculadora.setNumero1(8);
		calculadora.setNumero2(7);
		assertEquals(15, calculadoraControle.calculaSoma(calculadora),0.001);
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testCalculaSomaComExcecao(){
		calculadora.setNumero1(-8);
		calculadora.setNumero2(-7);
		calculadoraControle.calculaSoma(calculadora);
	}

}
