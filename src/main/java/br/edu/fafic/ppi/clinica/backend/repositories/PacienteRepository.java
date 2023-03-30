package br.edu.fafic.ppi.clinica.backend.repositories;

import br.edu.fafic.ppi.clinica.backend.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {


}
