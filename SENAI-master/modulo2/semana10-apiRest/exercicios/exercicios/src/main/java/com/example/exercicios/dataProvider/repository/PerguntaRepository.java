package com.example.exercicios.dataProvider.repository;

import com.example.exercicios.dataProvider.model.PerguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntaRepository extends JpaRepository<PerguntaEntity, Long> {

}
