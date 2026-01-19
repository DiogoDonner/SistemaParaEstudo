package com.diogodonner.sistema_generico.repositories;

import com.diogodonner.sistema_generico.entities.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosInterface extends JpaRepository<Pedidos, Integer> {
}
