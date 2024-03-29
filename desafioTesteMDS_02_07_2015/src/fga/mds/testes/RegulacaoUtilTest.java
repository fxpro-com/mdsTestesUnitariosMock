package fga.mds.testes;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import fga.mds.util.RegulacaoUtil;

public class RegulacaoUtilTest {
	RegulacaoUtil regulacaoUtil;
	
	@Before
	public void setUp() throws Exception {
		regulacaoUtil = new RegulacaoUtil();
	}

	@Test
	public void testTaxaImpostoOperacaoFinanceira() throws Exception {
		assertEquals(regulacaoUtil.taxaImpostoOperacaoFinanceira(100), 6, 0.01);
		assertEquals(regulacaoUtil.taxaImpostoOperacaoFinanceira(200), 12, 0.01);
		assertEquals(regulacaoUtil.taxaImpostoOperacaoFinanceira(300), 18, 0.01);
	}
	
	@Test
	public void testTaxaImpostoOperacaoFinanceiraComExcecao() {
		try {
			assertEquals(regulacaoUtil.taxaImpostoOperacaoFinanceira(-100), -6, 0.01);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
