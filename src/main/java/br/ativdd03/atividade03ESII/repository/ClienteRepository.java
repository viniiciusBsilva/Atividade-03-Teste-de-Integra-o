package br.ativdd03.atividade03ESII.repository;

import br.ativdd03.atividade03ESII.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
