package io.github.paduaalves.clientes.model.repository;

import io.github.paduaalves.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {
}
