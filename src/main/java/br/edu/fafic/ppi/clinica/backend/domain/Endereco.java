package br.edu.fafic.ppi.clinica.backend.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
