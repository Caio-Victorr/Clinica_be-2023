package br.edu.fafic.ppi.clinica.backend.controller;

import br.edu.fafic.ppi.clinica.backend.domain.Medico;
import br.edu.fafic.ppi.clinica.backend.domain.Paciente;
import br.edu.fafic.ppi.clinica.backend.domain.Secretaria;
import br.edu.fafic.ppi.clinica.backend.dto.MedicoDTO;
import br.edu.fafic.ppi.clinica.backend.services.SecretariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secretaria")
@RequiredArgsConstructor
public class SecretariaController {
    private final SecretariaService secretariaService;

    @PostMapping
    public ResponseEntity save(@RequestBody Secretaria secretaria){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(secretariaService.save(secretaria));
    }
}
