package br.inatel.inatelpg_dm112.dm112_logistica.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.MovimentoLogisticaEmailEntity;

@Repository
public interface MovimentoLogisticaEmailRepository extends JpaRepository<MovimentoLogisticaEmailEntity, Long> {

}
