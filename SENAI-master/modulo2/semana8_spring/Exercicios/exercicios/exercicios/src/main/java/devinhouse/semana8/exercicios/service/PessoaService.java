package devinhouse.semana8.exercicios.service;

import devinhouse.semana8.exercicios.model.PessoaModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    public List<PessoaModel> getPessoas(){

            return pessoaModelList;

    }

    public PessoaModel getPessoa(Long id){
        for(int i = 0; i<=pessoaModelList.size()-1; i++){
            if(pessoaModelList.get(i).getId() == id){
                return pessoaModelList.get(i).setName();           }
        }
        return null;
    }

    public void postPessoa( PessoaModel pessoa){
        pessoaModelList.add(pessoa);
    }

    public void updatePessoa(){
        for(int i = 0; i<=pessoaModelList.size()-1; i++){
            if(pessoaModelList.get(i).getId() == id){
            pessoaModelList.get(i).
         }
        }

    }

}
