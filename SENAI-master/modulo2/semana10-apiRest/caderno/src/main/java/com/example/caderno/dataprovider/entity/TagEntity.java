package com.example.caderno.dataprovider.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.xml.crypto.dsig.Manifest;

@Entity
@Table(name="tag")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String tag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nota_id")
    private AnotacaoEntity notaEntity;

    public TagEntity(String tag, AnotacaoEntity notaEntity) {
        this.tag = tag;
        this.notaEntity = notaEntity;
    }


    public Manifest getAnotacaoEntity() {
        return null;
    }
}