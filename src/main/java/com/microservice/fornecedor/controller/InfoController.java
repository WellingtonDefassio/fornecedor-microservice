package com.microservice.fornecedor.controller;

import com.microservice.fornecedor.model.InfoFornecedor;
import com.microservice.fornecedor.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class InfoController {

    private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);
    private InfoService infoService;

    public InfoController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {

        LOG.info("recebido pedido de informações do fornecedor de {}", estado);

        return infoService.getInfoPorEstado(estado);

    }

}
