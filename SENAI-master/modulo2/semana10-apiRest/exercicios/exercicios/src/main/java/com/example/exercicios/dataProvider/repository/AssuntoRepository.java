package com.example.exercicios.dataProvider.repository;

import com.example.exercicios.dataProvider.model.AssuntoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuntoRepository extends JpaRepository<AssuntoEntity,Long> {
}
