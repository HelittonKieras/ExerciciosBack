package com.example.exercicios.Controller;

import com.example.exercicios.Controller.dto.RespostaRequest;
import com.example.exercicios.Controller.dto.RespostaResponse;
import com.example.exercicios.dataProvider.model.PerguntaEntity;
import com.example.exercicios.service.RespostaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/resposta")
@AllArgsConstructor
public class RespostaController {

    private final RespostaService service;

    @GetMapping
    public ResponseEntity<Object> retornarPerguntas(){
        List<RespostaResponse> respostaResponse = service.encontrarTodasRespostas();
        return ResponseEntity.ok(respostaResponse);
    }
    @PostMapping
    public ResponseEntity<Object> adicionarResposta(@RequestBody RespostaRequest respostaRequest){
        RespostaResponse response = service.adicionarResposta(respostaRequest);
        return ResponseEntity.ok(response);
    }
}
