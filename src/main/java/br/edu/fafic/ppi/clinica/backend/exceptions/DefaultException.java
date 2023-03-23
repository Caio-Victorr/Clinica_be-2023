package br.edu.fafic.ppi.clinica.backend.exceptions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
public class DefaultException {

        private LocalDateTime timestamp;
        private Integer status;
        private String error;
        private String message;
        private String path;

}
