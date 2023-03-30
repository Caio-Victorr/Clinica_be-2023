package br.edu.fafic.ppi.clinica.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
@Data
@NoArgsConstructor
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2)
    private String nome;

    @CPF(message = "CPF inválido")
    @NotBlank
    private String cpf;

    private LocalDate dataNascimento;

    @Embedded
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Contato> contatos;

    @OneToOne(cascade = CascadeType.ALL)
    private Login login;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, List<Contato> contatos, Login login) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contatos = contatos;
        this.login = login;
    }
}