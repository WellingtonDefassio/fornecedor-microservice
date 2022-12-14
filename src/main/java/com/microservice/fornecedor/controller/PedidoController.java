package com.microservice.fornecedor.controller;

import com.microservice.fornecedor.dto.ItemDoPedidoDTO;
import com.microservice.fornecedor.model.Pedido;
import com.microservice.fornecedor.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    private PedidoService pedidoService;

    private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
        LOG.info("pedido recebido");
        return pedidoService.realizaPedido(produtos);
    }

    @RequestMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }

}
