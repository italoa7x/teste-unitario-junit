package tests.testsUnitarios;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import util.MensagemUtil;

public class TestInicial {
	private String nome = "Olá, Italo";
	private MensagemUtil mensagem;
	@Before
	public void setUp() {
		mensagem = new MensagemUtil("Italo");
	}
	
	@Test
	public void testarSaudacao() {
		System.out.println(mensagem.saudacao());
		assertEquals(nome, mensagem.saudacao());
	}
}
