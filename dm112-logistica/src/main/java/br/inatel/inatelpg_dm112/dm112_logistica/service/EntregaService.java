package br.inatel.inatelpg_dm112.dm112_logistica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.inatelpg_dm112.dm112_logistica.model.Entrega;
import br.inatel.inatelpg_dm112.dm112_logistica.model.dao.EntregaRepository;
import br.inatel.inatelpg_dm112.dm112_logistica.model.dao.PedidoLogisticaRepository;
import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.EntregaEntity;
import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.PedidoLogisticaEntity;
import br.inatel.inatelpg_dm112.dm112_logistica.util.Utilities;

@Service
public class EntregaService {

	@Autowired
	private PedidoLogisticaRepository pedidoLogisticaRepository;

	@Autowired
	private EntregaRepository entregaRepository;

	@Transactional
	public long registrarEntrega(Entrega entrega) {
		PedidoLogisticaEntity pedidoLogisticaEntity = pedidoLogisticaRepository.findById(entrega.getIdPedido()).get();

		System.out.println("Pedido encontrado para: " + pedidoLogisticaEntity.getNmCliente());

		EntregaEntity entregaEntity = new EntregaEntity();
		entregaEntity.setCpfRecebedor(entrega.getCpfRecebedor());
		entregaEntity.setDtMovimento(Utilities.getDate(entrega.getDtEntrega()));
		entregaEntity.setPedidoLogisticaEntity(pedidoLogisticaEntity);

		entregaRepository.save(entregaEntity);

		Long idEntrega = entregaEntity.getIdMovimentoLogistica();

		return idEntrega;
	}
}
