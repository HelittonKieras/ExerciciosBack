package com.example.caderno.dataprovider.repository;


import com.example.notas.dataprovider.model.NotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<NotaEntity, Long> {
}

