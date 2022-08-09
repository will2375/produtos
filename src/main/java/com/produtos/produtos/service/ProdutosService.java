package com.produtos.produtos.service;

import com.produtos.produtos.model.ProdutosModel;
import com.produtos.produtos.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<ProdutosModel> buscarTodos(){
        return produtosRepository.findAll();
    }

    public ProdutosModel cadastrar(ProdutosModel produtosModel){
        produtosModel.getCodigo();
        produtosModel.getNome();
        produtosModel.getValor();
        return produtosRepository.save(produtosModel);
    }
}
