package com.microservice.fornecedor.service;

import com.microservice.fornecedor.model.Produto;
import com.microservice.fornecedor.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getProdutosPorEstado(String estado) {

        return produtoRepository.findByEstado(estado);

    }
}
