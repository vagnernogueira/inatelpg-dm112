package br.inatel.inatelpg_dm112.dm112_logistica.model;

public class Entrega {

	public Entrega() {
	}

	public Entrega(long idPedido, String dtEntrega, String cpfRecebedor) {
		super();
		this.idPedido = idPedido;
		this.dtEntrega = dtEntrega;
		this.cpfRecebedor = cpfRecebedor;
	}

	private long idPedido;

	private String dtEntrega;

	private String cpfRecebedor;

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public String getDtEntrega() {
		return dtEntrega;
	}

	public void setDtEntrega(String dtEntrega) {
		this.dtEntrega = dtEntrega;
	}

	public String getCpfRecebedor() {
		return cpfRecebedor;
	}

	public void setCpfRecebedor(String cpfRecebedor) {
		this.cpfRecebedor = cpfRecebedor;
	}

	@Override
	public String toString() {
		return "Entrega [idPedido=" + idPedido + ", dtEntrega=" + dtEntrega + ", cpfRecebedor=" + cpfRecebedor + "]";
	}
}
