package com.microservice.fornecedor.service;

import com.microservice.fornecedor.model.InfoFornecedor;
import com.microservice.fornecedor.repository.InfoRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private InfoRepository infoRepository;

    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public InfoFornecedor getInfoPorEstado(String estado) {

        InfoFornecedor fornecedor = infoRepository.findByEstado(estado);

        return fornecedor;
    }
}
