package com.example.notas.controller;

import com.example.notas.controller.dto.DefaultResponse;
import com.example.notas.controller.dto.NotaRequest;
import com.example.notas.controller.dto.NotaResponse;
import com.example.notas.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nota")
public class NotaController {
    private final NotaService service;

    public NotaController(NotaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> retornaNotas(){
        List<NotaResponse> response = service.encontraTodasNotas();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Object> salvaNota(@RequestBody NotaRequest notaRequest){
        NotaResponse response = service.inserirNota(notaRequest);

        return ResponseEntity.ok(notaRequest);
    }
}

