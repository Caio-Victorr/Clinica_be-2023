package br.edu.fafic.ppi.clinica.backend.controller;

import br.edu.fafic.ppi.clinica.backend.domain.Consulta;
import br.edu.fafic.ppi.clinica.backend.services.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta")
@RequiredArgsConstructor
public class ConsultaController {

    public final ConsultaService consultaService;

    @PostMapping
    public ResponseEntity<Consulta> save(@RequestBody Consulta consulta){
        return ResponseEntity.status(HttpStatus.CREATED).body(consultaService.save(consulta));
    }
}
