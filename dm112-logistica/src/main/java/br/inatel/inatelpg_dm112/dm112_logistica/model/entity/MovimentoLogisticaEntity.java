package br.inatel.inatelpg_dm112.dm112_logistica.model.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MOVIMENTOLOGISTICA", schema = "PUBLIC")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipoMovimento", discriminatorType = DiscriminatorType.STRING, length = 1)
public class MovimentoLogisticaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMovimentoLogistica;

	/*
	 * @Column(nullable = false, length = 1) private String tipoMovimento;
	 */

	@Column(nullable = false)
	private LocalDate dtMovimento;

	@ManyToOne
	@JoinColumn(name = "id_Pedido_Logistica", nullable = false)
	private PedidoLogisticaEntity pedidoLogisticaEntity;

	@OneToMany(mappedBy = "movimentoLogisticaEntity", cascade = CascadeType.ALL)
	private List<MovimentoLogisticaEmailEntity> listMovimentoLogisticaEmailEntity;

	public Long getIdMovimentoLogistica() {
		return idMovimentoLogistica;
	}

	public void setIdMovimentoLogistica(Long idMovimentoLogistica) {
		this.idMovimentoLogistica = idMovimentoLogistica;
	}

	/*
	 * public String getTipoMovimento() { return tipoMovimento; }
	 * 
	 * public void setTipoMovimento(String tipoMovimento) { this.tipoMovimento =
	 * tipoMovimento; }
	 */

	public LocalDate getDtMovimento() {
		return dtMovimento;
	}

	public void setDtMovimento(LocalDate dtMovimento) {
		this.dtMovimento = dtMovimento;
	}

	public PedidoLogisticaEntity getPedidoLogisticaEntity() {
		return pedidoLogisticaEntity;
	}

	public void setPedidoLogisticaEntity(PedidoLogisticaEntity pedidoLogisticaEntity) {
		this.pedidoLogisticaEntity = pedidoLogisticaEntity;
	}

	public List<MovimentoLogisticaEmailEntity> getListMovimentoLogisticaEmailEntity() {
		return listMovimentoLogisticaEmailEntity;
	}

	public void setListMovimentoLogisticaEmailEntity(
			List<MovimentoLogisticaEmailEntity> listMovimentoLogisticaEmailEntity) {
		this.listMovimentoLogisticaEmailEntity = listMovimentoLogisticaEmailEntity;
	}
}
