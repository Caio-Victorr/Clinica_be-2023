package br.edu.fafic.ppi.clinica.backend.dto;

import br.edu.fafic.ppi.clinica.backend.domain.Contato;
import br.edu.fafic.ppi.clinica.backend.domain.Endereco;
import br.edu.fafic.ppi.clinica.backend.domain.Login;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Data
public class MedicoDTO {

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private Endereco endereco;

    private List<Contato> contatos;

    private Login login;

    private String crm;

}