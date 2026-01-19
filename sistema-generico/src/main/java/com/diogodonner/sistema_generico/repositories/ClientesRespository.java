package com.diogodonner.sistema_generico.repositories;

import com.diogodonner.sistema_generico.entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRespository extends JpaRepository<Clientes, Integer> {
}
