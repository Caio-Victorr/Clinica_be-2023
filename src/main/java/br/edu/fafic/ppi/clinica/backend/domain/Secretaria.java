package br.edu.fafic.ppi.clinica.backend.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("S")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Secretaria extends Pessoa{

    private String matricula;
}
