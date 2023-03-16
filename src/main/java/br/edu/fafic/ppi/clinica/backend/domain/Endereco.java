package br.edu.fafic.ppi.clinica.backend.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Data;

@Embeddable
@Data
public class Endereco {

    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

}
