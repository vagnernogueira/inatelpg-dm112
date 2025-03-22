package br.inatel.inatelpg_dm112.dm112_logistica.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENTREGA", schema = "PUBLIC")
@DiscriminatorValue(value = "E")
@PrimaryKeyJoinColumn(name = "idMovimentoLogistica")
public class EntregaEntity extends MovimentoLogisticaEntity {

	@Column(nullable = false, length = 11)
	private String cpfRecebedor;

	public String getCpfRecebedor() {
		return cpfRecebedor;
	}

	public void setCpfRecebedor(String cpfRecebedor) {
		this.cpfRecebedor = cpfRecebedor;
	}
}
