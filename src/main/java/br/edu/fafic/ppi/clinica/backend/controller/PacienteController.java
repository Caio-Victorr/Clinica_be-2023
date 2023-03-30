package br.edu.fafic.ppi.clinica.backend.controller;

import br.edu.fafic.ppi.clinica.backend.domain.Paciente;
import br.edu.fafic.ppi.clinica.backend.services.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService pacienteService;

    @PostMapping
    public ResponseEntity save(@RequestBody Paciente paciente){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(pacienteService.save(paciente));
    }
}
