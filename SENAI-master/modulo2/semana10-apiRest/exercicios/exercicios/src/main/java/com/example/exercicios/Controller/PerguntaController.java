package com.example.exercicios.Controller;

import com.example.exercicios.Controller.dto.AssuntoRequest;
import com.example.exercicios.Controller.dto.AssuntoResponse;
import com.example.exercicios.Controller.dto.PerguntaRequest;
import com.example.exercicios.Controller.dto.PerguntaResponse;
import com.example.exercicios.service.AssuntoService;
import com.example.exercicios.service.PerguntaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/pergunta")
public class PerguntaController {
    private final PerguntaService service;

    public PerguntaController(PerguntaService service){
            this.service = service;
        }

    @GetMapping
    public ResponseEntity<Object> retornarPerguntas(){
        List<PerguntaResponse> response = service.encontrarTodasPerguntas();
        return ResponseEntity.ok(response);
    }
    @PostMapping
    public ResponseEntity<Object> salvarPergunta(@RequestBody PerguntaRequest perguntaRequest){
        PerguntaResponse response = service.adicionarPergunta(perguntaRequest);
        return ResponseEntity.ok(response);
    }
}
