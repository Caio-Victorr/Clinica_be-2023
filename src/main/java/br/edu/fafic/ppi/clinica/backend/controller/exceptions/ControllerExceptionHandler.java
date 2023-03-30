package br.edu.fafic.ppi.clinica.backend.controller.exceptions;

import br.edu.fafic.ppi.clinica.backend.domain.exceptions.ObjetoNaoEncontradoException;
import br.edu.fafic.ppi.clinica.backend.exceptions.DefaultException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ObjetoNaoEncontradoException.class)
    public ResponseEntity<DefaultException> objetoNaoEncontradoException(
            ObjetoNaoEncontradoException ex, HttpServletRequest request
    ) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(DefaultException.builder()
                        .error("Objeto não encontrado")
                        .message(ex.getMessage())
                        .path(request.getRequestURI())
                        .status(HttpStatus.NO_CONTENT.value())
                        .timestamp(LocalDateTime.now())
                        .build());
    }

}
