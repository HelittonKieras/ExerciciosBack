package com.example.exercicios.service;

import com.example.exercicios.Controller.dto.PerguntaRequest;
import com.example.exercicios.Controller.dto.PerguntaResponse;
import com.example.exercicios.dataProvider.model.AssuntoEntity;
import com.example.exercicios.dataProvider.model.PerguntaEntity;
import com.example.exercicios.dataProvider.repository.AssuntoRepository;
import com.example.exercicios.dataProvider.repository.PerguntaRepository;
import com.example.exercicios.exception.NotFoundException;
import com.example.exercicios.exception.ServerErrorException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PerguntaService {
    private final PerguntaRepository perguntaRepository;
    private final AssuntoRepository assuntoRepository;

    public PerguntaService(PerguntaRepository perguntaRepository, AssuntoRepository assuntoRepository) {
        this.perguntaRepository = perguntaRepository;
        this.assuntoRepository = assuntoRepository;
    }

    public List<PerguntaResponse> encontrarTodasPerguntas() {
        try {
        List<PerguntaResponse> perguntasResponse = new ArrayList<>();
        List<PerguntaEntity> perguntaEntity = perguntaRepository.findAll();
//            if (perguntaEntity.size() == 0) {
//            throw new NotFoundException();
//            }
            for (PerguntaEntity pergunta: perguntaEntity) {
                perguntasResponse.add(
                        new PerguntaResponse(
                                pergunta.getTextoPerguntas(),
                                pergunta.getAssuntoEntity()
                        )
                );
            }
            return perguntasResponse;
        } catch (NotFoundException e) {
            throw new NotFoundException("Nenhuma pergunta encontrada");
        } catch (Exception e) {
            throw new ServerErrorException("Erro ao buscar pergunta");
        }
    }

    public PerguntaResponse adicionarPergunta(PerguntaRequest perguntaRequest){
        AssuntoEntity assuntoEntity = assuntoRepository.findById(perguntaRequest.getAssuntoId()).orElseThrow(
                ()-> new NotFoundException("Assunto não encontrado")
        );
        PerguntaEntity perguntaEntity = perguntaRepository.save(
                new PerguntaEntity(
                        perguntaRequest.getTextoPergunta(),
                        assuntoEntity)
        );
        return new PerguntaResponse(perguntaEntity.getTextoPerguntas(), perguntaEntity.getAssuntoEntity());
    }

}
