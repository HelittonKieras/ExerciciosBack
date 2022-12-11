package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Clinica{
    String donoDaClinica;
    private List<Cliente> listaDeClientes = new ArrayList<>();

    public Clinica(String donoDaClinica) {
        this.donoDaClinica = donoDaClinica;
    }

    public Clinica(String donoDaClinica, List<Cliente> listaDeClientes) {
        this.donoDaClinica = donoDaClinica;
        this.listaDeClientes = listaDeClientes;
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public void adicionarCliente(Cliente clienteLista){

        this.listaDeClientes.add(clienteLista);
        System.out.println(clienteLista.nome);
    }

    public void categorizaCliente(){

    List<Cliente> muitoMagro = new ArrayList<>();
    List<Cliente> normal = new ArrayList<>();
    List<Cliente> sobrePeso = new ArrayList<>();
    List<Cliente> obesoGrauI = new ArrayList<>();
    List<Cliente> obesoGrauII = new ArrayList<>();
    List<Cliente> obesoGrauIII = new ArrayList<>();


        for (Cliente cliente : listaDeClientes){
            switch (cliente.calcularImc()){
                case "Muito magro":
                    muitoMagro.add(cliente);
                    break;
                case "Normal":
                    normal.add(cliente);
                    break;
                case "Sobrepeso":
                    sobrePeso.add(cliente);
                    break;
                case "Obeso grau I":
                    obesoGrauI.add(cliente);
                    break;
                case "Obeso grau II":
                    obesoGrauII.add(cliente);
                    break;
                case "Obeso grau III ou Mórbido":
                    obesoGrauIII.add(cliente);
                    break;
                default:
                    break;
            }
        }
        muitoMagro.forEach(c -> System.out.println("Muito magro:"+c.nome));
        normal.forEach(c -> System.out.println("Normal:"+c.nome));
        sobrePeso.forEach(c -> System.out.println("Sobre peso:"+c.nome));
        obesoGrauI.forEach(c -> System.out.println("Obeso grau I:"+c.nome));
        obesoGrauII.forEach(c -> System.out.println("Obeso grau II:"+c.nome));
        obesoGrauIII.forEach(c -> System.out.println("Obeso grau III:"+c.nome));

    }

}
