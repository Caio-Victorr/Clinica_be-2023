package br.edu.fafic.ppi.clinica.backend.domain;

import br.edu.fafic.ppi.clinica.backend.enums.StatusConsulta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Medico medico;

    @OneToOne
    private Paciente paciente;

    @Enumerated(EnumType.STRING)
    private StatusConsulta statusConsulta;

    @OneToOne
    private Diagnostico diagnostico;

    private Double valorDaConsulta;
}
