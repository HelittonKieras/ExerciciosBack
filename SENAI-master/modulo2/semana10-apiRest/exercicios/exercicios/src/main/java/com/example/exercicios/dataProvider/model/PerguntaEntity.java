package com.example.exercicios.dataProvider.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="perguntas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PerguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String textoPerguntas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_assunto")
    private AssuntoEntity assuntoEntity;

    public PerguntaEntity(String textoPerguntas, AssuntoEntity assuntoEntity){
        this.textoPerguntas = textoPerguntas;
        this.assuntoEntity = assuntoEntity;
    }
}
