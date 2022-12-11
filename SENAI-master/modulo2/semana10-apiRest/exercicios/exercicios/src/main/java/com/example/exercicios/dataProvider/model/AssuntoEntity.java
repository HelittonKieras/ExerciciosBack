package com.example.exercicios.dataProvider.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="assunto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AssuntoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private  String nomeAssunto;

    public AssuntoEntity(String nomeAssunto) {
        this.nomeAssunto=nomeAssunto;
    }
}

