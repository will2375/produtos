package com.produtos.produtos.model.valoresProdutos;

public class CalculoDesconto {
    public Double descontoProduto(Double valor, Double porcentagemDesconto){
        Double resultado = valor * (porcentagemDesconto / 100);
        return resultado;
    }
    public Double valorFinal(Double valor, Double valorDesconto){
        Double resultadoFinal = valor - valorDesconto;
        return resultadoFinal;
    }
}
