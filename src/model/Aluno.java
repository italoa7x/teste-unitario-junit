package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

public class Aluno {
	private List<Double> notas = new ArrayList<>();
	private int faltas;
	private int aulaMinistradas;
	private String nome;
	private List<Livro> meusLivros = new ArrayList<Livro>();
	
	

	public List<Livro> getMeusLivros() {
		return meusLivros;
	}

	public void addLivro(Livro livro) {
		this.meusLivros.add(livro);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	public void adicionarNota(Double nota) {
		notas.add(nota);
	}

	public List<Double> getNotas() {
		return notas;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getAulaMinistradas() {
		return aulaMinistradas;
	}

	public void setAulaMinistradas(int aulaMinistradas) {
		this.aulaMinistradas = aulaMinistradas;
	}

	public String verificarAprovacao() {
		String situacaoAluno = "reprovado";
		if (validaValoresNotas()) {
			System.out.println("Faltas validadas");
			if (verificarSituacaoAluno()) {
				situacaoAluno = "aprovado";
			}

		}
		System.out.println("aluno " + situacaoAluno);
		return situacaoAluno;
	}

	public boolean verificarSituacaoAluno() {
		boolean situacao = false;
		double presenca = calcularPresenca();
		double media = calculaMedia();
		System.out.println("porcentagem de presenca do aluno: " + this.nome + ", " + presenca + " %");
		if (presenca >= 75 && validarMedia(media)) {
			if (media >= 8.0 && media <= 10.0) {
				situacao = true;
			}
		}
		return situacao;
	}

	// verifica se a media e maior que 0 e menor que 10.
	public boolean validarMedia(double media) {
		return (media >= 0 && media <= 10.0 ? true : false);
	}

	// calcula a presenca do aluno
	private double calcularPresenca() {
		int frequencia = this.aulaMinistradas - this.faltas;
		return (frequencia * 100) / this.aulaMinistradas;
	}

	// verifica se cada nota � maior ou igual a zero e menor ou igual a 10.
	public boolean validaValoresNotas() {
		boolean validas = false;
		for (Double n : this.notas) {
			if (n >= 0 && n <= 100) {
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
		for (Double n : notas) {
			media += n;
		}
		media = media / notas.size();
		System.out.printf("Media: %.2f\n", media);
		return media;
	}
}
