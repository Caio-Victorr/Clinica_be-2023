package br.edu.fafic.ppi.clinica.backend.domain.exceptions;

public class ObjetoNaoEncontradoException extends RuntimeException{

    public ObjetoNaoEncontradoException(String msg){
        super(msg);
    }
}
