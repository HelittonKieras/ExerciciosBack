package com.example.caderno.dataprovider.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="nota")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnotacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String texto;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public AnotacaoEntity(String titulo, String nota) {
        this.titulo = titulo;
        this.texto = nota;
        this.dataCriacao = LocalDateTime.now();
    }
}
