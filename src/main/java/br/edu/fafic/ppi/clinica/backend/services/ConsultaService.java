package br.edu.fafic.ppi.clinica.backend.services;

import br.edu.fafic.ppi.clinica.backend.domain.Consulta;
import br.edu.fafic.ppi.clinica.backend.repositories.ConsultaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultaService {

    private final ConsultaRepository consultaRepository;

    public Consulta save(Consulta consulta){
        return consultaRepository.save(consulta);
    }

}
