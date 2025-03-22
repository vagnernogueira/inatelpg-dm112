package br.inatel.inatelpg_dm112.dm112_logistica.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MOVIMENTOLOGISTICAEMAIL", schema = "PUBLIC")
public class MovimentoLogisticaEmailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMovimentoLogisticaEmail;

	@ManyToOne
	@JoinColumn(name = "id_Movimento_Logistica", nullable = false)
	private MovimentoLogisticaEntity movimentoLogisticaEntity;

	@Column(nullable = false)
	private Long idEmail;

	public Long getIdMovimentoLogisticaEmail() {
		return idMovimentoLogisticaEmail;
	}

	public void setIdMovimentoLogisticaEmail(Long idMovimentoLogisticaEmail) {
		this.idMovimentoLogisticaEmail = idMovimentoLogisticaEmail;
	}

	public MovimentoLogisticaEntity getMovimentoLogisticaEntity() {
		return movimentoLogisticaEntity;
	}

	public void setMovimentoLogisticaEntity(MovimentoLogisticaEntity movimentoLogisticaEntity) {
		this.movimentoLogisticaEntity = movimentoLogisticaEntity;
	}

	public Long getIdEmail() {
		return idEmail;
	}

	public void setIdEmail(Long idEmail) {
		this.idEmail = idEmail;
	}
}
