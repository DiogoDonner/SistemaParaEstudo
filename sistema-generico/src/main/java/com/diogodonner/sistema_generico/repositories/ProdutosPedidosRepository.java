package com.diogodonner.sistema_generico.repositories;

import com.diogodonner.sistema_generico.entities.ProdutosPedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosPedidosRepository extends JpaRepository<ProdutosPedidos, Integer> {
}
