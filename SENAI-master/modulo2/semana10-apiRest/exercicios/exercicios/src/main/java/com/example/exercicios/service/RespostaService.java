package com.example.exercicios.service;

import com.example.exercicios.Controller.dto.RespostaRequest;
import com.example.exercicios.Controller.dto.RespostaResponse;
import com.example.exercicios.dataProvider.model.PerguntaEntity;
import com.example.exercicios.dataProvider.model.RespostaEntity;
import com.example.exercicios.dataProvider.repository.PerguntaRepository;
import com.example.exercicios.dataProvider.repository.RespostaRepository;
import com.example.exercicios.exception.NotFoundException;
import com.example.exercicios.exception.ServerErrorException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RespostaService {
    private RespostaRepository respostaRepository;
    private PerguntaRepository perguntaRepository;

    public List<RespostaResponse> encontrarTodasRespostas(){
        try {
            List<RespostaEntity> respostasEntity = respostaRepository.findAll();
            List<RespostaResponse> respostaResponses = new ArrayList<>();

            if (respostasEntity.size() == 0) {
                String message = "Nenhuma Resposta Encontrada!";
                throw new NotFoundException(message);
            }
            for (int i = 0; i <= respostasEntity.size() - 1; i++) {
                respostaResponses.add(new RespostaResponse(
                        respostasEntity.get(i).getTextoResposta(),
                        respostasEntity.get(i).getPerguntaEntity()
                ));
            }
            return respostaResponses;
        }catch (Exception e){
            throw new ServerErrorException("Erro ao buscar Respostas");
        }
    }

        public RespostaResponse adicionarResposta(RespostaRequest respostaRequest){
            PerguntaEntity perguntaEntity = perguntaRepository.findById(respostaRequest.getPerguntaId()).orElseThrow(()-> new NotFoundException("Pergunta não Existe!"));
            RespostaEntity respostaEntity = respostaRepository.save(new RespostaEntity(respostaRequest.getTextoResposta(), perguntaEntity));
            return new RespostaResponse(respostaEntity.getTextoResposta(), respostaEntity.getPerguntaEntity());
    }




}
