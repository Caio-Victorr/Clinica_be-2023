package br.edu.fafic.ppi.clinica.backend.controller;

import br.edu.fafic.ppi.clinica.backend.domain.Medico;
import br.edu.fafic.ppi.clinica.backend.dto.MedicoDTO;
import br.edu.fafic.ppi.clinica.backend.services.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
@RequiredArgsConstructor
public class MedicoController {

    private final MedicoService medicoService;

    @PostMapping()
    public ResponseEntity<Medico> save (@RequestBody MedicoDTO medicoDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoService.save(medicoDTO));
    }
}
