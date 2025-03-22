package br.inatel.inatelpg_dm112.dm112_logistica.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.EntregaEntity;

@Repository
public interface EntregaRepository extends JpaRepository<EntregaEntity, Long> {

}
