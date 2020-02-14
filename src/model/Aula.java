package model;

public class Aula {
	private int aulaMinistrada;
	private String nome;

	public Aula(int aulaMinistrada, String nome) {
		super();
		this.aulaMinistrada = aulaMinistrada;
		this.nome = nome;
	}

	public int getAulaMinistrada() {
		return aulaMinistrada;
	}

	public void setAulaMinistrada(int aulaMinistrada) {
		this.aulaMinistrada = aulaMinistrada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
