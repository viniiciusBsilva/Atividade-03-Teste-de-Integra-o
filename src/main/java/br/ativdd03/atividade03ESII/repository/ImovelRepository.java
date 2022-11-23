package br.ativdd03.atividade03ESII.repository;

import br.ativdd03.atividade03ESII.entity.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
