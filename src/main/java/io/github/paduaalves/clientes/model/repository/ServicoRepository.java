package io.github.paduaalves.clientes.model.repository;

import io.github.paduaalves.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
