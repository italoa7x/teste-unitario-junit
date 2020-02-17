package tests.testsUnitarios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Curso;

public class TestCurso {
	private Curso curso1, curso2;

	@Test
	public void testarEquivalenciaValida() {
		curso1 = new Curso(15);
		assertEquals(true, curso1.validarCurso());
	}
	
	@Test
	public void testarEquivalenciaInvalida() {
		curso2 = new Curso(10);
		assertEquals(false, curso2.validarCurso());
	}
	
}
