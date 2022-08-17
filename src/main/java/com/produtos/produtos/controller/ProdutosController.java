package com.produtos.produtos.controller;

import com.produtos.produtos.model.ProdutosModel;
import com.produtos.produtos.model.valoresProdutos.CalculoDesconto;
import com.produtos.produtos.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @GetMapping(path = "/produtos")
    public List<ProdutosModel> buscarTodosProdutos() {
        return produtosService.buscarTodos();
    }

    @GetMapping(path = "/produtos/{codigo}")
    public Optional<ProdutosModel> buscarPorId(@PathVariable Long codigo) {
        return produtosService.buscarId(codigo);
    }

    @PostMapping(path = "/produtos")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutosModel cadastrarProdutos(@RequestBody ProdutosModel produtosModel, CalculoDesconto calculoDesconto) {
        return produtosService.cadastrar(produtosModel, calculoDesconto);
    }

    @PutMapping(path = "/produtos/{codigo}")
    public ProdutosModel alterarProdutos(@RequestBody ProdutosModel produtosModel) {
        return produtosService.alterar(produtosModel);
    }

    @DeleteMapping(path = "/produtos/{codigo}")
    public void deletarProdutos(@PathVariable Long codigo) {
        produtosService.deletar(codigo);
    }
}
