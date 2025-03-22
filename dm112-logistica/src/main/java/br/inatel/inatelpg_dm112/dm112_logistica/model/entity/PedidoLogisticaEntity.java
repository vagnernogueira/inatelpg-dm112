package br.inatel.inatelpg_dm112.dm112_logistica.model.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDOLOGISTICA", schema = "PUBLIC")
public class PedidoLogisticaEntity {

	@Id
	private Long idPedidoLogistica;

	@Column(nullable = false, length = 255)
	private String nmCliente;

	@Column(nullable = false, length = 255)
	private String emailContato;

	@Column(nullable = false, length = 18)
	private String foneContato;

	@OneToOne(mappedBy = "pedidoLogisticaEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private EnderecoEntregaEntity enderecoEntregaEntity;

	@OneToMany(mappedBy = "pedidoLogisticaEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MovimentoLogisticaEntity> listMovimentoLogistica;

	public Long getIdPedidoLogistica() {
		return idPedidoLogistica;
	}

	public void setIdPedidoLogistica(Long idPedidoLogistica) {
		this.idPedidoLogistica = idPedidoLogistica;
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

	public EnderecoEntregaEntity getEnderecoEntregaEntity() {
		return enderecoEntregaEntity;
	}

	public void setEnderecoEntregaEntity(EnderecoEntregaEntity enderecoEntregaEntity) {
		this.enderecoEntregaEntity = enderecoEntregaEntity;
	}

	public List<MovimentoLogisticaEntity> getListMovimentoLogistica() {
		return listMovimentoLogistica;
	}

	public void setListMovimentoLogistica(List<MovimentoLogisticaEntity> listMovimentoLogistica) {
		this.listMovimentoLogistica = listMovimentoLogistica;
	}
}
