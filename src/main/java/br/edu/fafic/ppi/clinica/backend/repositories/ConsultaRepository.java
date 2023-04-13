package br.edu.fafic.ppi.clinica.backend.repositories;

import br.edu.fafic.ppi.clinica.backend.domain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
