package tech.devinhouse.service;

import org.springframework.stereotype.Service;
import tech.devinhouse.entity.PessoaEntity;
import tech.devinhouse.repository.PessoaRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository repository;

    public PessoaService( PessoaRepository repository){
        this.repository = repository;
    }

    public void insert(PessoaEntity pessoa)
    {
        repository.save(pessoa);
    }

    public List<PessoaEntity> getPessoas(){
        return repository.findAll();
    }

    public PessoaEntity findPessoaById(Long id){
        Optional<PessoaEntity> byId = repository.findById(id);
        if(byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    public List<PessoaEntity> buscarPessoaPorStatusTrue(){
        return this.repository.findByStatus(true);
    }

    public Long buscarQtdStatusTrue(){
        return this.repository.countByStatus(true);
    }

    public void deletePorId(Long id){
        this.repository.deleteById(id);
    }

    public List<PessoaEntity> filtrarPessoas (String filter){
        return this.repository.buscarPessoaPorNomeOuEmail(filter);

    }

}
