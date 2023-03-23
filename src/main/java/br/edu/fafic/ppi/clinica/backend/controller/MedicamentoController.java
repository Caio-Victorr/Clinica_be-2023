package br.edu.fafic.ppi.clinica.backend.controller;

import br.edu.fafic.ppi.clinica.backend.domain.Medicamento;
import br.edu.fafic.ppi.clinica.backend.services.MedicamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicamento")
@RequiredArgsConstructor
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    @PostMapping
    public ResponseEntity save(@RequestBody Medicamento medicamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(medicamento);
    }
}
