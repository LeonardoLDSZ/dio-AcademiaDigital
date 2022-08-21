package digitalinnovationone.dioAcademiaDigital.repository;

import digitalinnovationone.dioAcademiaDigital.Entity.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {
}
