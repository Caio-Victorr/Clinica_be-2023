package br.edu.fafic.ppi.clinica.backend.services;

import br.edu.fafic.ppi.clinica.backend.domain.Medicamento;
import br.edu.fafic.ppi.clinica.backend.repositories.MedicamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicamentoService {

    private final MedicamentoRepository medicamentoRepository;

    public Medicamento save(Medicamento medicamento){
        return medicamentoRepository.save(medicamento);
    }
}
