package com.example.exercicios.Controller.dto;

import com.example.exercicios.dataProvider.model.AssuntoEntity;
import lombok.AllArgsConstructor;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PerguntaResponse {
    private String textoPergunta;
    private AssuntoEntity assuntoEntity;

    public PerguntaResponse(String textoPergunta, AssuntoEntity assuntoEntity){
        this.textoPergunta=textoPergunta;
        this.assuntoEntity = assuntoEntity;
    }
}
