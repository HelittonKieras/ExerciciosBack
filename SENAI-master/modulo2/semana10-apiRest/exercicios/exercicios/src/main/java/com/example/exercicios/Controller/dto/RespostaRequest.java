package com.example.exercicios.Controller.dto;

import com.example.exercicios.dataProvider.model.PerguntaEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RespostaRequest {
    private String textoResposta;
    private Long perguntaId;
}
