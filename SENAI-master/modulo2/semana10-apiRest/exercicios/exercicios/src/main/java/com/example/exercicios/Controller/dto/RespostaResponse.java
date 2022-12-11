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
public class RespostaResponse {
    private String textoResposta;
    private PerguntaEntity perguntaEntity;
}
