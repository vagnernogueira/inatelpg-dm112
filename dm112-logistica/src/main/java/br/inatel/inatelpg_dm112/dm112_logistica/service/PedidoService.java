package br.inatel.inatelpg_dm112.dm112_logistica.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.inatel.inatelpg_dm112.dm112_logistica.model.Pedido;
import br.inatel.inatelpg_dm112.dm112_logistica.model.dao.PedidoLogisticaRepository;
import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.PedidoLogisticaEntity;
import br.inatel.inatelpg_dm112.dm112_logistica.model.factory.ModelFactory;

@Service
public class PedidoService {

	@Autowired
	private PedidoLogisticaRepository pedidoLogisticaRepository;

	public List<PedidoLogisticaEntity> testeListarPedidos() {
		return pedidoLogisticaRepository.findAll();
	}

	public List<Pedido> consultarPedidos() {
		return pedidoLogisticaRepository.findAll().stream()
				.map(p -> ModelFactory.getPedido(p, p.getEnderecoEntregaEntity())).collect(Collectors.toList());
	}
}
