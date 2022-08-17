package com.produtos.produtos.service;

import com.produtos.produtos.model.ProdutosModel;
import com.produtos.produtos.model.valoresProdutos.CalculoDesconto;
import com.produtos.produtos.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<ProdutosModel> buscarTodos() {
        return produtosRepository.findAll();
    }

    public Optional<ProdutosModel> buscarId(Long codigo) {
        return produtosRepository.findById(codigo);
    }

    public ProdutosModel cadastrar(ProdutosModel produtosModel, CalculoDesconto calculoDesconto) {
        Double resultado = calculoDesconto.descontoProduto(produtosModel.getValor(), produtosModel.getDesconto());
        Double valorFinal = calculoDesconto.valorFinal(produtosModel.getValor(), resultado);
        produtosModel.getCodigo();
        produtosModel.getNome();
        produtosModel.getValor();
        produtosModel.getDesconto();
        produtosModel.setValorDesconto(resultado);
        produtosModel.setValorTotal(valorFinal);
        return produtosRepository.save(produtosModel);
    }

    public ProdutosModel alterar(ProdutosModel produtosModel) {
        produtosModel.getCodigo();
        produtosModel.getNome();
        produtosModel.getValor();
        produtosModel.getDesconto();
        produtosModel.getValorDesconto();

        return produtosRepository.save(produtosModel);
    }

    public void deletar(Long codigo) {
        produtosRepository.deleteById(codigo);
    }

}
