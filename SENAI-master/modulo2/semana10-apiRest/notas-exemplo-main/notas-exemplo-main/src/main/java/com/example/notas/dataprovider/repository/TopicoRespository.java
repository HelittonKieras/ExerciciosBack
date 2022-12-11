package com.example.notas.dataprovider.repository;

import com.example.notas.dataprovider.model.TopicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRespository extends JpaRepository<TopicoEntity,Long> {
}
