package com.example.caderno.controller;

import com.example.caderno.controller.dto.AnotacaoRequest;
import com.example.caderno.controller.dto.AnotacaoResponse;
import com.example.caderno.controller.dto.TagRequest;
import com.example.caderno.controller.dto.TagResponse;
import com.example.caderno.dataprovider.entity.AnotacaoEntity;

import com.example.caderno.dataprovider.entity.TagEntity;
import com.example.caderno.dataprovider.repository.AnotacaoRepository;
import com.example.caderno.dataprovider.repository.TagRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// locahost:8080/nota
@RestController
@RequestMapping("/nota")
public class AnotacaoController {

    private final AnotacaoRepository anotacaoRepository;
    private final TagRepository tagRepository;

    public AnotacaoController(AnotacaoRepository repository, TagRepository tagRepository) {
        this.anotacaoRepository = repository;
        this.tagRepository = tagRepository;
    }

    @GetMapping
    public ResponseEntity<List<AnotacaoResponse>> encontraNotas(){

        List<AnotacaoEntity> entityList = anotacaoRepository.findAll();

        List<AnotacaoResponse> responseList = new ArrayList<>();
        for (AnotacaoEntity entity: entityList) {
            responseList.add(
                    new AnotacaoResponse(entity.getTitulo(), entity.getTexto())
            );
        }

        return ResponseEntity.ok(responseList);
    }


    @PostMapping
    public ResponseEntity<AnotacaoResponse> salvarNota(@RequestBody AnotacaoRequest anotacaoRequest){
        AnotacaoEntity entity = anotacaoRepository.save(new AnotacaoEntity(anotacaoRequest.getTitulo()
                , anotacaoRequest.getTexto()));

        return new ResponseEntity<AnotacaoResponse>(
                new AnotacaoResponse(entity.getTitulo(), entity.getTexto()),
                HttpStatus.CREATED
        );
    }

    // /nota/1
    @GetMapping("/{id}")
    public ResponseEntity<AnotacaoResponse> encontrarNotaPorId(@PathVariable Long id) {
        AnotacaoEntity entity = anotacaoRepository.findById(id).get();
        return new ResponseEntity<AnotacaoResponse>(
                new AnotacaoResponse(entity.getTitulo(), entity.getTexto()),
                HttpStatus.OK
        );
    }



        @PutMapping("/{id}")
    public ResponseEntity<AnotacaoResponse> atualizarNotaPorId(
            @PathVariable Long id,
            @RequestBody AnotacaoRequest request
    ){
            AnotacaoEntity entity = anotacaoRepository.findById(id).get();
        entity.setTitulo(request.getTitulo());
        entity.setTexto(request.getTexto());
        anotacaoRepository.save(entity);

        return new ResponseEntity<AnotacaoResponse>(
                new AnotacaoResponse(entity.getTitulo(), entity.getTexto()),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarNotaPorId(
            @PathVariable Long id
    ){
        anotacaoRepository.deleteById((id));
        return ResponseEntity.ok().build();

    }

    @PostMapping("/{id}/tag")
    public ResponseEntity<TagResponse> adicionarTagPorNotaId(
            @PathVariable Long id,
            @RequestBody TagRequest request
    ){
        AnotacaoEntity anotacaoEntity = anotacaoRepository.findById(id).get();
        TagEntity tagEntity = tagRepository.save(
                new TagEntity(request.getTag(), anotacaoEntity)
        ); // Salvar uma TagEntity com os dados da Requisição
        return ResponseEntity.ok(
                new TagResponse(
                        tagEntity.getTag(),
                        tagEntity.getAnotacaoEntity().getId()
                )
        );
    }

    @GetMapping("/{id}/tag")
    public ResponseEntity procurarTagPorNotaId(
            @PathVariable Long id
    ){
        AnotacaoEntity anotacaoEntity = AnotacaoRepository.findById(id).get();
        List<TagEntity> tagEntity = tagRepository.findAll();

        return ResponseEntity.ok(tagEntity);
    }



}
