package com.example.exercicios.dataProvider.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "respostas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespostaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String textoResposta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "id_pergunta")
    private PerguntaEntity perguntaEntity;

    public RespostaEntity(String textoResposta, PerguntaEntity perguntaEntity) {
    }

}
