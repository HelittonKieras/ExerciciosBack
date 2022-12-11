package tech.devinhouse.controller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.service.PessoaService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service=service;
    }

    @PostMapping
    public void save(@RequestBody PessoaEntity pessoa){
        service.insert(pessoa);

    }

    @GetMapping
    public List<PessoaEntity> buscarPessoas(){
        return service.getPessoas();
    }

    @GetMapping("/{id}")
    public PessoaEntity buscaPorID(@PathVariable("id") Long id){
        return service.findPessoaById(id);
    }

    @GetMapping ("/status-true")
    public List<PessoaEntity> buscarStatusTrue(){
        return service.buscarPessoaPorStatusTrue();
    }

    @GetMapping("/status-true-number")
    public Long findNumber(){
        return service.buscarQtdStatusTrue();
    }

    @PutMapping
    public void updatePessoa(@RequestBody PessoaEntity pessoa){
        service.insert(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletePessoaPorId(@PathVariable("id") Long id){
        service.deletePorId(id);
    }

    @GetMapping("/filter")
    public List<PessoaEntity> buscaPessoasPeloFiltro(@RequestParam ("q") String filter){
        return service.filtrarPessoas(filter);
    }
}
