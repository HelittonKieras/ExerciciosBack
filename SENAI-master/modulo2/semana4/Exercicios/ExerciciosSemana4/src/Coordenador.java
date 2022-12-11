public class Coordenador extends Pessoa{
    private Integer quantidadeCursosCoord;

    public Coordenador(String nome, Integer idade, Integer quantidadeCursosCoord) {
        super(nome, idade);
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public Integer getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    public void setQuantidadeCursosCoord(Integer quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }
    @Override
    public String obterInformacoes(){
        return "Aluna "+getNome()+", "+ getIdade() + " anos." +
                "\n Qtde cursos: "+ getQuantidadeCursosCoord();
    }
}
