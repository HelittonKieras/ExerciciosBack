public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Camila", 32);
        System.out.println(pessoa1.obterInformacoes());

        Aluno aluno = new Aluno("Camila", 17, 2921091, "ESA");

        System.out.println(aluno.obterInformacoes());
    }
}