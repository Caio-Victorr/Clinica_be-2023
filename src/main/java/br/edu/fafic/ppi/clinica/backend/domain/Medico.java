package br.edu.fafic.ppi.clinica.backend.domain;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("M")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico extends Pessoa{

    private String crm;
}
