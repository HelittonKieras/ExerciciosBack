package com.example.notas.controller;

import com.example.notas.controller.dto.TopicoRequest;
import com.example.notas.controller.dto.TopicoResponse;
import com.example.notas.dataprovider.model.TopicoEntity;
import com.example.notas.service.TopicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/topico")
public class TopicoContoller {

    private final TopicoService service;

    public TopicoContoller(TopicoService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<Object> retornaTopicos(){
        List<TopicoResponse> response = service.encontraTopicos();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Object> salvaTopico(@RequestBody TopicoRequest topicoRequest){
        TopicoResponse response = service.inserirTopico(topicoRequest);
        return ResponseEntity.ok(topicoRequest);
    }

    @PutMapping
    public ResponseEntity<Object> atualizarTopico(@RequestBody TopicoRequest topicoRequest){
        return ResponseEntity.ok(topicoRequest);
    }

    @DeleteMapping
    public ResponseEntity<Object> deletarTopico(@RequestBody TopicoRequest topicoRequest){
        return ResponseEntity.ok(topicoRequest);
    }
}
