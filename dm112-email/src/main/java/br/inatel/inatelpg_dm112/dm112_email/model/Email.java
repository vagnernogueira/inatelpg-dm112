package br.inatel.inatelpg_dm112.dm112_email.model;

public class Email {

	public Email() {
	}

	public Email(String para, String assunto, String texto) {
		super();
		this.para = para;
		this.assunto = assunto;
		this.texto = texto;
	}

	private String para;

	private String assunto;

	private String texto;

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Email [para=" + para + ", assunto=" + assunto + ", texto=" + texto + "]";
	}
}
