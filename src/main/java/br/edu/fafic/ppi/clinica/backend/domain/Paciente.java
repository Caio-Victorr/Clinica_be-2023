package br.edu.fafic.ppi.clinica.backend.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@DiscriminatorValue("P")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente extends Pessoa{

    private String cartaoSUS;

//    public Paciente(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, List<Contato> contatos, Login login, String cartaoSUS) {
//        super(nome, cpf, dataNascimento, endereco, contatos, login);
//        this.cartaoSUS = cartaoSUS;
//    }
}
