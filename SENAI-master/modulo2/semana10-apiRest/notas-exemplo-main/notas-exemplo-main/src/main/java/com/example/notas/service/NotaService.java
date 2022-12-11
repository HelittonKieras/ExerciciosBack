package com.example.notas.service;

import com.example.notas.controller.dto.NotaRequest;
import com.example.notas.controller.dto.NotaResponse;
import com.example.notas.dataprovider.model.NotaEntity;
import com.example.notas.dataprovider.model.TopicoEntity;
import com.example.notas.dataprovider.repository.NotaRepository;
import com.example.notas.dataprovider.repository.TopicoRespository;
import com.example.notas.exception.NotFoundException;
import com.example.notas.exception.ServerErrorException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotaService {

    private final NotaRepository repository;
    private final TopicoRespository topicoRespository;

    public NotaService(NotaRepository repository, TopicoRespository topicoRespository) {
        this.repository = repository;
        this.topicoRespository = topicoRespository;
    }

    public List<NotaResponse> encontraTodasNotas() {
        try {
            List<NotaResponse> responses = new ArrayList<>();
            List<NotaEntity> notaEntity = repository.findAll();
            if (notaEntity.size()==0){
                throw new NotFoundException("Nenhuma nota encontrada");
            }
            for (NotaEntity entity : notaEntity) {
                responses.add(new NotaResponse(
                        entity.getTitulo(),
                        entity.getNota(),
                        entity.getDateTime()
                ));
            }

            return responses;

        } catch (Exception e) {
            throw new ServerErrorException("Erro ao buscar notas");
        }
    }

    public NotaResponse inserirNota(NotaRequest notaRequest) {
        TopicoEntity topicoEntity = topicoRespository.findById(notaRequest.getTopicoId()).orElseThrow(()-> new NotFoundException("Topico não existe"));

        NotaEntity notaEntity = repository.save(new NotaEntity(notaRequest.getTitulo(), notaRequest.getNota(),notaRequest.getDateTime(),topicoEntity));

        return new NotaResponse(notaEntity.getTitulo(),notaEntity.getNota(),notaEntity.getDateTime());
    }
}
