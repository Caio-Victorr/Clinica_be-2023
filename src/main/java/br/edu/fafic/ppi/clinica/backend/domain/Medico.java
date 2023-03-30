package br.edu.fafic.ppi.clinica.backend.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("M")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico extends Pessoa{

    private String crm;

    public Medico(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, List<Contato> contatos, Login login, String crm) {
        super(nome, cpf, dataNascimento, endereco, contatos, login);
        this.crm = crm;
    }
}
