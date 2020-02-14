package tests.testsUnitarios;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAprovacaoAluno.class, TestInicial.class })
public class TestUnitario {

	public static void main(String[] args) {
		Result resultado = JUnitCore.runClasses(TestUnitario.class);
		
		for(Failure f : resultado.getFailures()) {
			System.out.println(f.toString());
		}
		
		System.out.println(resultado.wasSuccessful());
	}
}
