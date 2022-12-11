package com.example.exercicios.service;


import com.example.exercicios.Controller.dto.AssuntoRequest;
import com.example.exercicios.Controller.dto.AssuntoResponse;
import com.example.exercicios.dataProvider.model.AssuntoEntity;
import com.example.exercicios.dataProvider.repository.AssuntoRepository;
import com.example.exercicios.exception.NotFoundException;
import com.example.exercicios.exception.ServerErrorException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssuntoService {

    private final AssuntoRepository assuntoRepository;

    public AssuntoService (AssuntoRepository assuntoRepository){
        this.assuntoRepository = assuntoRepository;
    }

    public List<AssuntoResponse> encontrarTodosAssuntos(){
        List<AssuntoResponse> assuntosResponse = new ArrayList<>();
        List<AssuntoEntity> assuntoEntity = assuntoRepository.findAll();
        try{
            if (assuntoEntity.size()!=0) {
                for (int i = 0; i <= assuntoEntity.size() - 1; i++) {
                    assuntosResponse.add(
                            new AssuntoResponse(assuntoEntity.get(i).getNomeAssunto())
                    );
                }
            }
           throw new NotFoundException();

        }catch(NotFoundException e){
             if (assuntoEntity.size()==0){
                throw new NotFoundException("Nenhum assunto encontrado");           }
        }catch (Exception e){
            throw new ServerErrorException("Erro ao buscar Assunto");
        }
    return assuntosResponse;

    }

    public AssuntoResponse adicionarAssunto(AssuntoRequest assuntoRequest){
        AssuntoEntity assuntoEntity = assuntoRepository.save(
                new AssuntoEntity(assuntoRequest.getNomeAssunto())
        );
       return new AssuntoResponse(assuntoEntity.getNomeAssunto());
    }


}
