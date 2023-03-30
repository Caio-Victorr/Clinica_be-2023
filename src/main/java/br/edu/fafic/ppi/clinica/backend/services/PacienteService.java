package br.edu.fafic.ppi.clinica.backend.services;

import br.edu.fafic.ppi.clinica.backend.domain.Paciente;
import br.edu.fafic.ppi.clinica.backend.repositories.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
}
