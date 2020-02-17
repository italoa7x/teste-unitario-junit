package model;

public class Curso {
	private int creditos;

	public Curso(int creditos) {
		super();
		this.creditos = creditos;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public boolean validarCurso() {
		if (validarCredito()) {
			boolean valid = verificarCreditos();
			if (valid) {
				System.out.println("possui creditos suficiente");
			} else {
				System.out.println("o curso nao possui os creditos suficiente.");
			}
			return valid;
		}else {
			throw new RuntimeException("valores inválidos");
		}
	}

	private boolean verificarCreditos() {
		boolean valid = false;
		// primeira situacao da particao de equivalencia
		if (creditos > 0 && creditos < 15) {
			return false;
		}
		// segunda situacao
		if (creditos >= 15 && creditos <= 30) {
			valid = true;
		}
		// terceira situacao
		if (creditos > 30) {
			return false;
		}
		return valid;
	}

	private boolean validarCredito() {
		return (this.creditos >= 0);
	}
}
