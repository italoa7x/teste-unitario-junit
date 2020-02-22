package model;

public class Livro {
	private boolean entregue;

	public Livro(boolean entregue) {
		super();
		this.entregue = entregue;
	}

	public boolean isEntregue() {
		return entregue;
	}

	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}

	
	public boolean verificarEmprestimo(Aluno aluno) {
		boolean situacao = false;
		for(Livro l : aluno.getMeusLivros()) {
			if(!l.entregue) {
				situacao = false;
			}else {
				situacao = true;
			}
		}
		if(situacao) {
			System.out.printf("O aluno %s entregou todos os livros\n",aluno.getNome());
		}else {
			System.out.printf("O aluno %s ainda falta entrega livros\n",aluno.getNome());
		}
		return situacao;
	}
}
