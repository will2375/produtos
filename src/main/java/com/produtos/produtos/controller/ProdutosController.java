package com.produtos.produtos.controller;

import com.produtos.produtos.model.ProdutosModel;
import com.produtos.produtos.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @GetMapping(path = "/produtos")
    public List<ProdutosModel> buscarTodosProdutos(){
        return produtosService.buscarTodos();
    }

    @PostMapping(path = "/produtos")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutosModel cadastrarProdutos(@RequestBody ProdutosModel produtosModel){
        return produtosService.cadastrar(produtosModel);
    }

}
