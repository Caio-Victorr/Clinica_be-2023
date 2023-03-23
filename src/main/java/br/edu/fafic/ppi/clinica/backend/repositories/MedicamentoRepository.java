package br.edu.fafic.ppi.clinica.backend.repositories;

import br.edu.fafic.ppi.clinica.backend.domain.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
