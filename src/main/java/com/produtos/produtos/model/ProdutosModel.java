package com.produtos.produtos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Produtos")
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
    private double valor;
    @Column(length = 10, nullable = false)
    private double desconto;
    @Column(length = 10, nullable = false)
    private double valorDesconto;
    @Column(length =10, nullable = false)
    private double valorTotal;
}
