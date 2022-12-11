package com.example.exercicios.Controller;

import com.example.exercicios.Controller.dto.AssuntoRequest;
import com.example.exercicios.Controller.dto.AssuntoResponse;
import com.example.exercicios.service.AssuntoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/assunto")
public class AssuntoController {
private final AssuntoService service;

public AssuntoController(AssuntoService service){
    this.service = service;
}

    @GetMapping
    public ResponseEntity<Object> retornarAssuntos(){
        List<AssuntoResponse> assuntoResponse = service.encontrarTodosAssuntos();
        return ResponseEntity.ok(assuntoResponse);
    }

    @PostMapping
    public ResponseEntity<Object> salvarAssunto(@RequestBody AssuntoRequest assuntoRequest){
    AssuntoResponse assuntoResponse = service.adicionarAssunto(assuntoRequest);
    return ResponseEntity.ok(assuntoResponse);
    }

}
