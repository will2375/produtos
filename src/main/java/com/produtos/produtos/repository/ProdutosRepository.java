package com.produtos.produtos.repository;

import com.produtos.produtos.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository  extends JpaRepository<ProdutosModel, Long> {
}
