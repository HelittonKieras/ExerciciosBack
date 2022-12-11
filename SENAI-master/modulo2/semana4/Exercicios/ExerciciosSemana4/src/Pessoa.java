
public class Pessoa {

    private String nome;
    private Integer idade;



    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String obterInformacoes(){
        try {
            return "Aluna " + getNome() + ", " + getIdade() + " anos.";
        }
        catch (Exception exception){
            return "ERRO!";
        }finally {
            return "completado!";
        }
    }
}
