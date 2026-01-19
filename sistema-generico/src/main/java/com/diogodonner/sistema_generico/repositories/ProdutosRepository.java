package com.diogodonner.sistema_generico.repositories;

import com.diogodonner.sistema_generico.entities.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
}
