package br.edu.fafic.ppi.clinica.backend.enums;

public enum StatusConsulta {

    AGENDADO("Agendado"),
    CONCLUIDO("Concluido"),
    CANCELADO("Cancelado");

    private String status;

    StatusConsulta(String status){
        this.status = status;
    }
}
