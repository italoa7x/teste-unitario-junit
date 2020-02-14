package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Aluno {
	private List<Double> notas = new ArrayList<>();
	private int quantidadeFaltas;

	public void adicionarNota(Double nota) {
		notas.add(nota);
	}

	public List<Double> getNotas() {
		return notas;
	}

	public int getQuantidadeFaltas() {
		return quantidadeFaltas;
	}

	public void setQuantidadeFaltas(int quantidadeFaltas) {
		this.quantidadeFaltas = quantidadeFaltas;
	}

	public String verificarAprovacao() {
		String situacaoAluno = "reprovado";
		if (validaValoresNotas()) {
			System.out.println("Faltas validadas");
			if (verificarSituacaoAluno()) {
				situacaoAluno = "aprovado";
				System.out.println("Aluno aprovado");
			}
			if(! verificarSituacaoAluno()) {
				System.out.println("Aluno reprovado");
			}
		} else {
			System.out.println("Notas inválidas!");
		}
		return situacaoAluno;
	}

	public boolean verificarSituacaoAluno() {
		Calendar calendar = new GregorianCalendar();
		int diasMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		boolean situacao = false;
		if (validarQuantidadeFaltas()) {
			
			int porcentagemFaltas = (quantidadeFaltas * 100) / diasMes;
			if (porcentagemFaltas <= 75.0 && calculaMedia() >= 8.0) {
				
				situacao = true;
			}
		} else {
			System.out.println("Data inválida");
		}
		return situacao;
	}

	// verifica se o aluno tem nenhuma ou faltou o mes inteiro.
	public boolean validarQuantidadeFaltas() {
		Calendar calendar = new GregorianCalendar();
		int diasMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return (quantidadeFaltas >= 0 && quantidadeFaltas <= diasMes ? true : false);
	}

	// verifica se cada nota é maior ou igual a zero e menor ou igual a 10.
	public boolean validaValoresNotas() {
		boolean validas = false;
		for (Double n : this.notas) {
			if (n >= 0 && n <= 10) {
				validas = true;
			} else {
				validas = false;
			}
		}
		return validas;
	}

	// calcula a media do aluno com base na quantidade de notas.
	public Double calculaMedia() {
		Double media = 0.0;
		int quantidadeNotas = notas.size();
		for (Double n : notas) {
			media += n;
		}
		return media / quantidadeNotas;
	}
}
