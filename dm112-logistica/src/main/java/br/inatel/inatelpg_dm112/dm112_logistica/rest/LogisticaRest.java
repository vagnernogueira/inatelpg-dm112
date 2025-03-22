package br.inatel.inatelpg_dm112.dm112_logistica.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.inatelpg_dm112.dm112_logistica.model.Entrega;
import br.inatel.inatelpg_dm112.dm112_logistica.model.Pedido;
import br.inatel.inatelpg_dm112.dm112_logistica.service.EntregaService;
import br.inatel.inatelpg_dm112.dm112_logistica.service.PedidoService;

@RestController
@RequestMapping("/api")
public class LogisticaRest {

	@Autowired
	private PedidoService pedidoService;

	@Autowired
	private EntregaService entregaService;

	@GetMapping("/consultarPedidos")
	public List<Pedido> consultarPedidos() {
		System.out.println("consultarPedidos");
		return pedidoService.consultarPedidos();
	}

	@PostMapping("/registrarEntrega")
	public long registrarEntrega(@RequestBody Entrega entrega) {
		System.out.println("registrarEntrega");
		return entregaService.registrarEntrega(entrega);
	}
}
