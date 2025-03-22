package br.inatel.inatelpg_dm112.dm112_logistica.model;

public class Pedido {

	public Pedido() {
	}

	public Pedido(Long idPedido, String nmCliente, String emailContato, String foneContato, String cep, String uf,
			String nmMunicipio, String nmBairro, String nmLogradouro, String numResidencia) {
		super();
		this.idPedido = idPedido;
		this.nmCliente = nmCliente;
		this.emailContato = emailContato;
		this.foneContato = foneContato;
		this.cep = cep;
		this.uf = uf;
		this.nmMunicipio = nmMunicipio;
		this.nmBairro = nmBairro;
		this.nmLogradouro = nmLogradouro;
		this.numResidencia = numResidencia;
	}

	private Long idPedido;

	private String nmCliente;

	private String emailContato;

	private String foneContato;

	private String cep;

	private String uf;

	private String nmMunicipio;

	private String nmBairro;

	private String nmLogradouro;

	private String numResidencia;

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public String getFoneContato() {
		return foneContato;
	}

	public void setFoneContato(String foneContato) {
		this.foneContato = foneContato;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNmMunicipio() {
		return nmMunicipio;
	}

	public void setNmMunicipio(String nmMunicipio) {
		this.nmMunicipio = nmMunicipio;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public String getNumResidencia() {
		return numResidencia;
	}

	public void setNumResidencia(String numResidencia) {
		this.numResidencia = numResidencia;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nmCliente=" + nmCliente + ", emailContato=" + emailContato
				+ ", foneContato=" + foneContato + ", cep=" + cep + ", uf=" + uf + ", nmMunicipio=" + nmMunicipio
				+ ", nmBairro=" + nmBairro + ", nmLogradouro=" + nmLogradouro + ", numResidencia=" + numResidencia
				+ "]";
	}
}
