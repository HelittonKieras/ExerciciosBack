package devinhouse.semana8.exercicios.controller;

import devinhouse.semana8.exercicios.model.PessoaModel;
import devinhouse.semana8.exercicios.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service=service;
    }

    @GetMapping()
    public List<PessoaModel> getPessoas(){return service.getPessoas();}

    @GetMapping("/{id}")
    public PessoaModel getPessoaById(Long id){ return service.getPessoa(id);}

    @GetMapping()
    public void postPessoa(@RequestBody PessoaModel pessoa){service.postPessoa(pessoa);}


}
