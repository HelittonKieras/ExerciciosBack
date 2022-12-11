package com.example.notas.service;


import com.example.notas.controller.dto.NotaRequest;
import com.example.notas.controller.dto.NotaResponse;
import com.example.notas.controller.dto.TopicoRequest;
import com.example.notas.controller.dto.TopicoResponse;
import com.example.notas.dataprovider.model.NotaEntity;
import com.example.notas.dataprovider.model.TopicoEntity;
import com.example.notas.dataprovider.repository.TopicoRespository;
import com.example.notas.exception.NotFoundException;
import com.example.notas.exception.ServerErrorException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicoService {

    private final TopicoRespository repository;

    public TopicoService(TopicoRespository respository) {
        this.repository = respository;
    }



    public List<TopicoResponse> encontraTopicos() {
        try {
            List<TopicoResponse> responses = new ArrayList<>();
            List<TopicoEntity> notaEntity = repository.findAll();
            if (notaEntity.size()==0){
                throw new NotFoundException("Nenhuma nota encontrada");
            }
            for (TopicoEntity entity : notaEntity) {
                responses.add(new TopicoResponse(
                        entity.getTitulo(),
                        entity.getDescricao()
                ));
            }

            return responses;

        } catch (Exception e) {
            throw new ServerErrorException("Erro ao buscar notas");
        }
    }

    public TopicoResponse inserirTopico(TopicoRequest topicoRequest) {
        TopicoEntity notaEntity = repository.save(new TopicoEntity(topicoRequest.getTitulo(), topicoRequest.getDescricao()));
        return new TopicoResponse(topicoRequest.getTitulo(),topicoRequest.getDescricao());
    }
}
