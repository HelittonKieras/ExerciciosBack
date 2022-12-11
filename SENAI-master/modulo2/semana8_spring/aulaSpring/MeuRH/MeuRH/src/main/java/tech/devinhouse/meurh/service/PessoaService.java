package tech.devinhouse.meurh.service;

import model.PessoaModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {
    private static List<PessoaModel> pessoaModelList = new ArrayList<PessoaModel>();

    public PessoaService(){
        PessoaModel pessoa1 = new PessoaModel(1L,"Pessoa 1", "pessoa1@teste.com.br" );
        PessoaModel pessoa2 = new PessoaModel(2L,"Pessoa 2", "pessoa2@teste.com.br" );
        pessoaModelList.add(pessoa1);
        pessoaModelList.add(pessoa2);

    }

    // RETORNA TODAS AS PESSOAS
    public List<PessoaModel> getPessoas(){
        return pessoaModelList;
    }

    public void addPessoa(PessoaModel pessoa){
        pessoaModelList.add(pessoa);
    }

}
