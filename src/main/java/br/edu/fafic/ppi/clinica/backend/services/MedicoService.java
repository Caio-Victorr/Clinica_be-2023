package br.edu.fafic.ppi.clinica.backend.services;

import br.edu.fafic.ppi.clinica.backend.domain.Medico;
import br.edu.fafic.ppi.clinica.backend.dto.MedicoDTO;
import br.edu.fafic.ppi.clinica.backend.repositories.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public Medico save(MedicoDTO medicoDTO) {
        var medico = new Medico(
                medicoDTO.getNome(),
                medicoDTO.getCpf(),
                medicoDTO.getDataNascimento(),
                medicoDTO.getEndereco(),
                medicoDTO.getContatos(),
                medicoDTO.getLogin(),
                medicoDTO.getCrm());
        return medicoRepository.save(medico);
    }
}
