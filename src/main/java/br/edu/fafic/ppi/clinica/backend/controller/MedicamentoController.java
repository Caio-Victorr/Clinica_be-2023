package br.edu.fafic.ppi.clinica.backend.controller;

import br.edu.fafic.ppi.clinica.backend.domain.Medicamento;
import br.edu.fafic.ppi.clinica.backend.repositories.MedicamentoRepository;
import br.edu.fafic.ppi.clinica.backend.services.MedicamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicamento")
@RequiredArgsConstructor
public class MedicamentoController {

    private final MedicamentoService medicamentoService;
    private final MedicamentoRepository medicamentoRepository;

    @PostMapping
    public ResponseEntity saveMedicamento(@RequestBody Medicamento medicamento){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(medicamentoService.save(medicamento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicamento> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(medicamentoService.findById(id));
    }
}
