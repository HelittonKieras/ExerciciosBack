public class Aluno extends Pessoa {
    private Integer matricula;
    private String curso;

    public Aluno(String nome, Integer idade, Integer matricula,String curso ) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String obterInformacoes(){


        return "Aluna "+getNome()+", "+ getIdade() + " anos." +
                "\n Matrícula: "+ getMatricula() + " curso: " + getCurso();
    }

}
