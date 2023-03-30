package br.edu.fafic.ppi.clinica.backend.repositories;

import br.edu.fafic.ppi.clinica.backend.domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    //Medico findByName(String nome);
    //Medico findByCpf(String cpf);

}
