package util;

public class MensagemUtil {
	private String mensagem;

	public MensagemUtil(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String saudacao() {
		return "Olá, " + mensagem;
	}
}
