package com.example.notas.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaRequest {
    private String titulo;
    private String nota;
    private LocalDateTime dateTime;
    private Long topicoId;
}
