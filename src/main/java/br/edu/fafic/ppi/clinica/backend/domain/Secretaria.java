package br.edu.fafic.ppi.clinica.backend.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("S")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Secretaria extends Pessoa{

    private String matricula;

//    public Secretaria(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, List<Contato> contatos, Login login, String matricula) {
//        super(nome, cpf, dataNascimento, endereco, contatos, login);
//        this.matricula = matricula;
//    }
}
