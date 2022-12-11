package com.example.notas.controller.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class NotaResponse {
    private String titulo;
    private String nota;
    private LocalDateTime dateTime;
}
