package br.inatel.inatelpg_dm112.dm112_logistica.model.factory;

import br.inatel.inatelpg_dm112.dm112_logistica.model.Pedido;
import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.EnderecoEntregaEntity;
import br.inatel.inatelpg_dm112.dm112_logistica.model.entity.PedidoLogisticaEntity;

public class ModelFactory {

	public static Pedido getPedido(PedidoLogisticaEntity pedidoLogistica, EnderecoEntregaEntity enderecoEntrega)
	{
		return new Pedido(
				pedidoLogistica.getIdPedidoLogistica(),
				pedidoLogistica.getNmCliente(),
				pedidoLogistica.getEmailContato(),
				pedidoLogistica.getFoneContato(),
				enderecoEntrega.getCep(),
				enderecoEntrega.getUf(),
				enderecoEntrega.getNmMunicipio(),
				enderecoEntrega.getNmBairro(),
				enderecoEntrega.getNmLogradouro(),
				enderecoEntrega.getNumResidencia()
				);
	}
}
