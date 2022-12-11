package com.example.exercicios.dataProvider.repository;

import com.example.exercicios.dataProvider.model.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity, Long> {
}
