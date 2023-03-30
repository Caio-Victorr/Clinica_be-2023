package br.edu.fafic.ppi.clinica.backend.services;

import br.edu.fafic.ppi.clinica.backend.domain.Paciente;
import br.edu.fafic.ppi.clinica.backend.domain.Secretaria;
import br.edu.fafic.ppi.clinica.backend.repositories.SecretariaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecretariaService {

    private final SecretariaRepository secretariaRepository;

    public Secretaria save(Secretaria secretaria){
        return secretariaRepository.save(secretaria);
    }
}
