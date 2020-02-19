package tests.testsUnitarios;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Aluno;

public class TestAprovacaoAluno {
	private Aluno aluno1, aluno2, aluno3;

	@Test
	public void testarAprovacaoAluno1() {
		aluno1 = new Aluno();
		aluno1.setNome("italo");
		aluno1.setFaltas(3);
		aluno1.setAulaMinistradas(20);
		aluno1.adicionarNota(7.5);
		aluno1.adicionarNota(8.5);
		aluno1.adicionarNota(10.0);
		
		assertEquals("aprovado", aluno1.verificarAprovacao());
		
	}
	
	@Test
	public void testarAprovacaoAluno2() {
		aluno2 = new Aluno();
		aluno2.setNome("maria");
		aluno2.setFaltas(10);
		aluno2.setAulaMinistradas(60);
		aluno2.adicionarNota(9.0);
		aluno2.adicionarNota(6.0);
		aluno2.adicionarNota(6.0);
		
		assertEquals("reprovado", aluno2.verificarAprovacao());
		
	}
	
	@Test
	public void testarQuantidadeFaltas() {
		aluno3 = new Aluno();
		aluno3.setNome("josé");
		aluno3.setFaltas(0);
		aluno3.setAulaMinistradas(20);
		aluno3.adicionarNota(10.0);
		aluno3.adicionarNota(10.0);
		aluno3.adicionarNota(10.0);
		assertEquals("aprovado", aluno3.verificarAprovacao());
	}
	
}
