package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void calcula_Venda_de_100_Retorna_5() {
		Double venda = 100.0;
		Double esperado = 5.0;
		
		Double comissao = new CalculadoraComissao().comissao(venda);  
		
		assertEquals(esperado, comissao);
	
	}
	
	@Test
	public void calcula_Venda_de_10000_Retorna_500() {
		Double venda = 10000.0;
		Double esperado = 500.0;
		
		Double comissao = new CalculadoraComissao().comissao(venda);  
		
		assertEquals(esperado, comissao);
	
	}
	
	@Test
	public void calcula_Venda_de_1_Retorna_5_Centavos() {
		Double venda = 1D;
		Double esperado = 0.05;
		
		Double comissao = new CalculadoraComissao().comissao(venda);  
	
		assertEquals(esperado, comissao);
	
	}
	
	@Test
	public void calcula_Venda_de_50_Centavos_Retorna_0025_Centavos() {
		Double venda = 0.5;
		Double esperado = 0.025;
		
		Double comissao = new CalculadoraComissao().comissao(venda);  
	
		assertEquals(esperado, comissao);
	
	}
	
}
