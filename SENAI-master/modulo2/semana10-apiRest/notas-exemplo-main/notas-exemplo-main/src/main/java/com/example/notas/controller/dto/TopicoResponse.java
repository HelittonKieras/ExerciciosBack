package com.example.notas.controller.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class TopicoResponse {
    private String titulo;
    private String nota;
}
