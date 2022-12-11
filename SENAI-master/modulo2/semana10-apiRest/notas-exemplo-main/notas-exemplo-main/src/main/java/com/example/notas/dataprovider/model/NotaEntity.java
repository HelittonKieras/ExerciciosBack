package com.example.notas.dataprovider.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="nota")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String titulo;

    @Column
    private String nota;

    @Column
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topico_id")
    private TopicoEntity topicoEntity;

    public NotaEntity(String titulo, String nota, LocalDateTime dateTime, TopicoEntity topicoEntity) {
        this.titulo = titulo;
        this.nota = nota;
        this.dateTime = dateTime;
        this.topicoEntity = topicoEntity;
    }
}
