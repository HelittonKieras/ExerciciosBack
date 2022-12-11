package tech.devinhouse.meurh.controller;

import model.PessoaModel;
import org.springframework.web.bind.annotation.*;
import tech.devinhouse.meurh.service.PessoaService;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service){
        this.service = service;
    }

    @GetMapping()
    public List<PessoaModel> getPessoas(){
        return service.getPessoas();
    }

    @GetMapping("/dependentes")
    public String getDependentes(){
        return "Filho xpto";
    }

    @GetMapping("/{id}")
    public String getPessoaById(@PathVariable("id") String id){
        return id;
    }

    @GetMapping()
    public void postPessoa(@RequestBody PessoaModel pessoaModel){
        service.addPessoa(pessoaModel);
    }
}
