package br.inatel.inatelpg_dm112.dm112_logistica.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENDERECOENTREGA", schema = "PUBLIC")
public class EnderecoEntregaEntity {

	@Id
	private Long idEnderecoEntrega;

	@ManyToOne
	@JoinColumn(name = "id_Pedido_Logistica", nullable = false)
	private PedidoLogisticaEntity pedidoLogisticaEntity;

	@Column(nullable = false, length = 8)
	private String cep;

	@Column(nullable = false, length = 2)
	private String uf;

	@Column(nullable = false, length = 255)
	private String nmMunicipio;

	@Column(nullable = false, length = 255)
	private String nmBairro;

	@Column(nullable = false, length = 255)
	private String nmLogradouro;

	@Column(nullable = false, length = 36)
	private String numResidencia;

	public Long getIdEnderecoEntrega() {
		return idEnderecoEntrega;
	}

	public void setIdEnderecoEntrega(Long idEnderecoEntrega) {
		this.idEnderecoEntrega = idEnderecoEntrega;
	}

	public PedidoLogisticaEntity getPedidoLogisticaEntity() {
		return pedidoLogisticaEntity;
	}

	public void setPedidoLogisticaEntity(PedidoLogisticaEntity pedidoLogisticaEntity) {
		this.pedidoLogisticaEntity = pedidoLogisticaEntity;
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
}
