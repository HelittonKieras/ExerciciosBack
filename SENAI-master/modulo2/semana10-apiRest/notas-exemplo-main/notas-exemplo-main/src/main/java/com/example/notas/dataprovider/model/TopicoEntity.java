package com.example.notas.dataprovider.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TopicoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String descricao;

    public TopicoEntity(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
}
